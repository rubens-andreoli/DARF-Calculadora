/*
 * Copyright (C) 2020 Rubens A. Andreoli Jr.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package rubensandreoli.darfcalc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.imageio.IIOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import rubensandreoli.commons.utils.IntegerUtils;

/** References:
 * https://stackoverflow.com/questions/136419/get-integer-startValue-of-the-current-year-in-java
 *
 * @author Rubens A. Andreoli Jr.
 */
public class Rates {

    // <editor-fold defaultstate="collapsed" desc=" STATIC FIELDS "> 
    private static final String URL = "https://www.debit.com.br/tabelas/tabelas-irrf.php";
    private static final String CARD_MARKER_ATTR = "class";
    private static final String CARD_MARKER = "mdl-card m";
    private static final String DATE_MARKER_ATTR = "class";
    private static final String DATE_MARKER = "mdl-card__title";
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" ENTRY "> 
    public class Entry {

        public final double startValue;
        public final double endValue;
        public final double tax;
        public final double deduction;

        public Entry(String startValue, String endValue, String tax, String isention) {
            this.startValue = parseDouble(startValue);
            this.endValue = parseDouble(endValue);
            this.tax = parseDouble(tax);
            this.deduction = parseDouble(isention);
        }

        public Entry(double startValue, double endValue, double tax, double deduction) {
            this.startValue = startValue;
            this.endValue = endValue;
            this.tax = tax;
            this.deduction = deduction;
        }

        private double parseDouble(String s) {
            s = s.replaceAll("\\.", "").replaceAll(",", ".").replaceAll("%", "");
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException ex) {
                return 0;
            }
        }

        @Override
        public String toString() {
            return "Entry{" + "startValue=" + startValue + ", endValue=" + endValue + ", tax=" + tax + ", deduction=" + deduction + '}';
        }

    }
    // </editor-fold>

    private final List<Entry> entries = new ArrayList<>();

    public void load() throws IOException {
        final Elements cards = Jsoup.connect(URL).get().getElementsByAttributeValueStarting(CARD_MARKER_ATTR, CARD_MARKER);

        final int year = Calendar.getInstance().get(Calendar.YEAR);
        Elements currentTableRows = null;
        int cardYear = 0;
        for (Element card : cards) {
            //get title
            final Elements cardTitles = card.getElementsByAttributeValue(DATE_MARKER_ATTR, DATE_MARKER);
            if (!cardTitles.isEmpty()) {
                //get title text
                final Elements h2s = cardTitles.get(0).getElementsByTag("h2");
                if (!h2s.isEmpty()) {
                    final String[] tokens = h2s.get(0).text().split(" ");
                    //gets first date; check if bigger than last checked and smaller than current 
                    for (String token : tokens) {
                        if (token.contains("/")) {
                            final int cardYearTmp = IntegerUtils.parseInteger(token.substring(token.length()-4));
                            if (cardYearTmp < year && cardYearTmp > cardYear) {
                                cardYear = cardYearTmp;
                                currentTableRows = card.getElementsByTag("tr");
                            }
                            break;
                        }
                    }
                }

            }
        }

        if(currentTableRows == null) throw new IIOException("no valid year found");
        
        for (int i = 1; i < currentTableRows.size() - 1; i++) {
            Elements tds = currentTableRows.get(i).getElementsByTag("td");
            String[] tokens = tds.text().split(" ");
            Entry e;
            if (i != currentTableRows.size() - 2) {
                e = new Entry(tokens[1], tokens[3], tokens[4], tokens[5]);
            } else {
                e = new Entry(tokens[3], tokens[1], tokens[4], tokens[5]);
            }
            entries.add(e);
        }

    }

    public Entry getEntryFor(double value) {
        for (Entry entry : entries) {
            if (value >= entry.startValue && (entry.endValue == 0 || value <= entry.endValue)) {
                return entry;
            }
        }
        return new Entry(0, 0, 0, 0);
    }

}
