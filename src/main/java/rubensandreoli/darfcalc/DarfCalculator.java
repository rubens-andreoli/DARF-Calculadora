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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTextField;
import rubensandreoli.commons.swing.AboutDialog;
import rubensandreoli.commons.utils.FileUtils;
import rubensandreoli.darfcalc.Rates.Entry;

public class DarfCalculator extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    
    // <editor-fold defaultstate="collapsed" desc=" STATIC FIELDS "> 
    private static final String PROGRAM_NAME = "DARF Calculadora";
    private static final String PROGRAM_ICON = "images/icon.png";
    private static final String PROGRAM_VERSION = "1.0.0";
    private static final String PROGRAM_YEAR = "2020";
    
    private static final String ERROR_MSG = "ERRO";
    // </editor-fold>
    
    private final Font txfFont = new java.awt.Font("Tahoma", 0, 12);
    private final Dimension txfDimension = new Dimension(75, 20);
    private final List<JTextField> incomeFields = new LinkedList<>();
    private final List<JTextField> expensesFields = new LinkedList<>();
    private Rates taxes;
    
    public DarfCalculator() {
	initComponents();
	postInitComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIncome = new javax.swing.JPanel();
        spnlIncome = new javax.swing.JScrollPane();
        pnlIncomeFields = new javax.swing.JPanel();
        btnPlusIncome = new javax.swing.JButton();
        btnMinusIncome = new javax.swing.JButton();
        pnlExpenses = new javax.swing.JPanel();
        spnlExpenses = new javax.swing.JScrollPane();
        pnlExpensesFields = new javax.swing.JPanel();
        btnPlusExpenses = new javax.swing.JButton();
        btnMinusExpenses = new javax.swing.JButton();
        pnlCalc = new javax.swing.JPanel();
        lblBase = new javax.swing.JLabel();
        lblAbout = new javax.swing.JLabel();
        txfBase = new javax.swing.JTextField();
        txfPercent = new javax.swing.JTextField();
        lblPercent = new javax.swing.JLabel();
        lblDeduction = new javax.swing.JLabel();
        txfDeduction = new javax.swing.JTextField();
        lblResult = new javax.swing.JLabel();
        txfResult = new javax.swing.JTextField();
        btnCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(PROGRAM_NAME);
        setIconImage(FileUtils.loadIcon(PROGRAM_ICON).getImage());
        setResizable(false);

        spnlIncome.setBorder(javax.swing.BorderFactory.createTitledBorder("Receitas"));
        spnlIncome.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlIncomeFields.setName("income"); // NOI18N
        pnlIncomeFields.setPreferredSize(new java.awt.Dimension(120, 30));
        pnlIncomeFields.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        spnlIncome.setViewportView(pnlIncomeFields);

        btnPlusIncome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPlusIncome.setText("+");
        btnPlusIncome.setToolTipText("Adiciona um campo de reiceta");
        btnPlusIncome.setActionCommand("plusIncome");
        btnPlusIncome.setFocusable(false);
        btnPlusIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusIncomeActionPerformed(evt);
            }
        });

        btnMinusIncome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMinusIncome.setText("-");
        btnMinusIncome.setToolTipText("Remove um campo de receita");
        btnMinusIncome.setActionCommand("minusRent");
        btnMinusIncome.setFocusable(false);
        btnMinusIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusIncomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIncomeLayout = new javax.swing.GroupLayout(pnlIncome);
        pnlIncome.setLayout(pnlIncomeLayout);
        pnlIncomeLayout.setHorizontalGroup(
            pnlIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIncomeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(spnlIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlIncomeLayout.createSequentialGroup()
                        .addComponent(btnPlusIncome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinusIncome)))
                .addGap(0, 0, 0))
        );
        pnlIncomeLayout.setVerticalGroup(
            pnlIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIncomeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(spnlIncome)
                .addGap(7, 7, 7)
                .addGroup(pnlIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusIncome)
                    .addComponent(btnPlusIncome))
                .addGap(0, 0, 0))
        );

        spnlExpenses.setBorder(javax.swing.BorderFactory.createTitledBorder("Despesas"));
        spnlExpenses.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlExpensesFields.setAlignmentX(0.0F);
        pnlExpensesFields.setAlignmentY(0.0F);
        pnlExpensesFields.setName("spent"); // NOI18N
        pnlExpensesFields.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        spnlExpenses.setViewportView(pnlExpensesFields);

        btnPlusExpenses.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPlusExpenses.setText("+");
        btnPlusExpenses.setToolTipText("Adiciona um campo de receitas");
        btnPlusExpenses.setActionCommand("plusSpent");
        btnPlusExpenses.setFocusable(false);
        btnPlusExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusExpensesActionPerformed(evt);
            }
        });

        btnMinusExpenses.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMinusExpenses.setText("-");
        btnMinusExpenses.setToolTipText("Remove um campo de despesas");
        btnMinusExpenses.setActionCommand("minusDeduction");
        btnMinusExpenses.setFocusable(false);
        btnMinusExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusExpensesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlExpensesLayout = new javax.swing.GroupLayout(pnlExpenses);
        pnlExpenses.setLayout(pnlExpensesLayout);
        pnlExpensesLayout.setHorizontalGroup(
            pnlExpensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExpensesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlExpensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(spnlExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlExpensesLayout.createSequentialGroup()
                        .addComponent(btnPlusExpenses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinusExpenses)))
                .addGap(0, 0, 0))
        );
        pnlExpensesLayout.setVerticalGroup(
            pnlExpensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExpensesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(spnlExpenses)
                .addGap(7, 7, 7)
                .addGroup(pnlExpensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusExpenses)
                    .addComponent(btnPlusExpenses))
                .addGap(0, 0, 0))
        );

        lblBase.setLabelFor(txfBase);
        lblBase.setText("Base:");

        lblAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png"))); // NOI18N
        lblAbout.setToolTipText("Sobre");
        lblAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAboutMouseClicked(evt);
            }
        });

        txfBase.setEditable(false);
        txfBase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfBase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBase.setToolTipText("Receita líquida");
        txfBase.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txfBase.setEnabled(false);

        txfPercent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfPercent.setToolTipText("Verifique a tabela IRPF");

        lblPercent.setLabelFor(txfPercent);
        lblPercent.setText("Alíquota:");

        lblDeduction.setLabelFor(txfDeduction);
        lblDeduction.setText("Dedução:");

        txfDeduction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfDeduction.setToolTipText("Verifique a tabela IRPF");

        lblResult.setLabelFor(txfResult);
        lblResult.setText("Resultado:");

        txfResult.setEditable(false);
        txfResult.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfResult.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txfResult.setEnabled(false);

        btnCalc.setText("Calcular");
        btnCalc.setToolTipText("((base x alíquota) / 100) - dedução");
        btnCalc.setFocusable(false);
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCalcLayout = new javax.swing.GroupLayout(pnlCalc);
        pnlCalc.setLayout(pnlCalcLayout);
        pnlCalcLayout.setHorizontalGroup(
            pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalcLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfResult)
                    .addComponent(txfBase)
                    .addComponent(btnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCalcLayout.createSequentialGroup()
                        .addComponent(lblBase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAbout))
                    .addGroup(pnlCalcLayout.createSequentialGroup()
                        .addGroup(pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPercent)
                            .addComponent(lblDeduction))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfPercent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfDeduction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblResult))
                .addGap(0, 0, 0))
        );
        pnlCalcLayout.setVerticalGroup(
            pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalcLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBase)
                    .addComponent(lblAbout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfPercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPercent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfDeduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeduction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txfResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnCalc)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnlExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlExpenses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlusIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusIncomeActionPerformed
        addTxf(pnlIncomeFields, incomeFields);
    }//GEN-LAST:event_btnPlusIncomeActionPerformed

    private void btnPlusExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusExpensesActionPerformed
        addTxf(pnlExpensesFields, expensesFields);
    }//GEN-LAST:event_btnPlusExpensesActionPerformed

    private void btnMinusIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusIncomeActionPerformed
        if(removeTxf(pnlIncomeFields, incomeFields)) calculateBase();
    }//GEN-LAST:event_btnMinusIncomeActionPerformed

    private void btnMinusExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusExpensesActionPerformed
        if(removeTxf(pnlExpensesFields, expensesFields)) calculateBase();
    }//GEN-LAST:event_btnMinusExpensesActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
	double total = 0;
	try{
	    total = NumberFormat.getCurrencyInstance().parse(txfBase.getText()).doubleValue();
	} catch (ParseException ex) {}
	
	JTextField currentTxf = txfPercent;
	
	try{
	    total *= (Double.parseDouble(txfPercent.getText().replace(',', '.')))/100;
	    txfPercent.setBackground(Color.white);

	    currentTxf = txfDeduction;
	    total -= Double.parseDouble(txfDeduction.getText().replace(',', '.'));
	    txfDeduction.setBackground(Color.white);

	    txfResult.setText(NumberFormat.getCurrencyInstance().format(total));
	} catch (NumberFormatException ex) {
	    currentTxf.setBackground(Color.red);
	    txfResult.setText(ERROR_MSG);
	}
    }//GEN-LAST:event_btnCalcActionPerformed

    private void lblAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseClicked
	new AboutDialog(this, PROGRAM_NAME, PROGRAM_VERSION, PROGRAM_YEAR)
                .addAtribution("Program icon", "Icons8", "https://icons8.com/web-app/33035/Lion")
                .addAtribution("About icon", "Gregor Cresnar", "https://www.flaticon.com/authors/gregor-cresnar")
                .setVisible(true);
    }//GEN-LAST:event_lblAboutMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnMinusExpenses;
    private javax.swing.JButton btnMinusIncome;
    private javax.swing.JButton btnPlusExpenses;
    private javax.swing.JButton btnPlusIncome;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblDeduction;
    private javax.swing.JLabel lblPercent;
    private javax.swing.JLabel lblResult;
    private javax.swing.JPanel pnlCalc;
    private javax.swing.JPanel pnlExpenses;
    private javax.swing.JPanel pnlExpensesFields;
    private javax.swing.JPanel pnlIncome;
    private javax.swing.JPanel pnlIncomeFields;
    private javax.swing.JScrollPane spnlExpenses;
    private javax.swing.JScrollPane spnlIncome;
    private javax.swing.JTextField txfBase;
    private javax.swing.JTextField txfDeduction;
    private javax.swing.JTextField txfPercent;
    private javax.swing.JTextField txfResult;
    // End of variables declaration//GEN-END:variables

   private void addTxf(JPanel panel, List<JTextField> fieldList) {
	final JTextField txf = createTxf();
	fieldList.add(txf);
	panel.add(txf);
	panel.validate();
	if(fieldList.size() > 5){
	    panel.setPreferredSize(new Dimension(panel.getWidth(), panel.getHeight()+25));
	    panel.getParent().validate();
	}
   }
   
   private boolean removeTxf(JPanel panel, List<JTextField> fieldList){
       if(fieldList.size() == 1) return false;
       fieldList.remove(fieldList.size()-1);
       panel.remove(panel.getComponent(panel.getComponentCount()-1));
       panel.repaint();
       if(fieldList.size() >= 5){
            panel.setPreferredSize(new Dimension(panel.getWidth(), panel.getHeight()-25));
            panel.getParent().validate();
       }
       return true;
   }
    
    private JTextField createTxf() {
	final JTextField txf = new JTextField();
	txf.setFont(txfFont);
	txf.addKeyListener(new KeyAdapter(){
	    @Override
	    public void keyReleased(KeyEvent e) {
		calculateBase();
	    }
	});
	txf.setMaximumSize(txfDimension);
	txf.setMinimumSize(txfDimension);
	txf.setPreferredSize(txfDimension);
	return txf;
    }

    private double addFields(List<JTextField> fields) {
        double total = 0;
        for(JTextField txf : fields) {
	    if(!txf.getText().isEmpty()){
		try{
		    total += Double.parseDouble(txf.getText().replace(',', '.'));
		}catch (NumberFormatException ex){
		    txf.setBackground(Color.red);
                    throw new NumberFormatException();
		}
	    }
            txf.setBackground(Color.white);
	}
        return total;
    }
    
    private void calculateBase() {
	double total = 0;
	boolean noError = true;
	
        try{
            total += addFields(incomeFields);
        }catch(NumberFormatException ex){
            noError = false;
        }
        
        try{
            total -= addFields(expensesFields);
        }catch(NumberFormatException ex){
            noError = false;
        }

	txfResult.setText(NumberFormat.getCurrencyInstance().format(0));
	if(noError){
            txfBase.setText(NumberFormat.getCurrencyInstance().format(total));
            getTax(total);
        }else {
            txfBase.setText(ERROR_MSG);
            txfPercent.setText("0");
            txfDeduction.setText("0");
        }
    }
    
    private void getTax(double val){
        Entry e = taxes.getEntryFor(val);
        System.out.println(e);
        txfPercent.setText(String.valueOf(e.tax));
        txfDeduction.setText(String.valueOf(e.deduction));
    }

    private void postInitComponents() {
	setLocationRelativeTo(null);
	addTxf(pnlIncomeFields, incomeFields);
	addTxf(pnlExpensesFields, expensesFields);
	txfBase.setText(NumberFormat.getCurrencyInstance().format(0));
	txfResult.setText(NumberFormat.getCurrencyInstance().format(0));

	KeyListener k = new KeyListener(){
	    @Override
	    public void keyTyped(KeyEvent e) {}

	    @Override
	    public void keyPressed(KeyEvent e) {}

	    @Override
	    public void keyReleased(KeyEvent e) {
		txfResult.setText(NumberFormat.getCurrencyInstance().format(0));
	    }
	
	};
	txfPercent.addKeyListener(k);
	txfDeduction.addKeyListener(k);
        
        txfPercent.setText("0");
        txfDeduction.setText("0");
        
        taxes = new Rates();
        try {
            taxes.load();
        } catch (IOException ex) {
            //TODO: alert
        }
    }
    
}
