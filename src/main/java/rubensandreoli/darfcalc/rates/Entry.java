/*
 * Copyright (C) 2020 Morus
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
package rubensandreoli.darfcalc.rates;

import rubensandreoli.commons.utils.NumberUtils;

public class Entry {

    public final double startValue;
    public final double endValue;
    public final double tax;
    public final double deduction;

    public Entry(String startValue, String endValue, String tax, String isention) {
        this.startValue = NumberUtils.parseDouble(startValue);
        this.endValue = NumberUtils.parseDouble(endValue);
        this.tax = NumberUtils.parseDouble(tax);
        this.deduction = NumberUtils.parseDouble(isention);
    }

    public Entry(double startValue, double endValue, double tax, double deduction) {
        this.startValue = startValue;
        this.endValue = endValue;
        this.tax = tax;
        this.deduction = deduction;
    }

    @Override
    public String toString() {
        return "Entry{" + "startValue=" + startValue + ", endValue=" + endValue + ", tax=" + tax + ", deduction=" + deduction + '}';
    }

}
