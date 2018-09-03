package rubensandreoli.darfcalc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTextField;

//icon.png: https://icons8.com/web-app/33035/Lion
//about.png: http://www.flaticon.com/authors/gregor-cresnar

public class MainFrame extends javax.swing.JFrame {

    private final List<JTextField> incomeFields = new LinkedList<>();
    private final List<JTextField> spentFields = new LinkedList<>();
    
    public MainFrame() {
	initComponents();
	config();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlusIncome = new javax.swing.JButton();
        btnPlusSpent = new javax.swing.JButton();
        btnMinusIncome = new javax.swing.JButton();
        btnMinusSpent = new javax.swing.JButton();
        spnlIncome = new javax.swing.JScrollPane();
        pnlIncome = new javax.swing.JPanel();
        spnlSpent = new javax.swing.JScrollPane();
        pnlSpent = new javax.swing.JPanel();
        lblPercent = new javax.swing.JLabel();
        txfPercent = new javax.swing.JTextField();
        lblDeduction = new javax.swing.JLabel();
        txfDeduction = new javax.swing.JTextField();
        txfResult = new javax.swing.JTextField();
        lblResult = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        txfBase = new javax.swing.JTextField();
        lblBase = new javax.swing.JLabel();
        lblAbout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DARF Calculadora");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/icon.png")));
        setResizable(false);

        btnPlusIncome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPlusIncome.setText("+");
        btnPlusIncome.setToolTipText("adiciona um campo de reiceta");
        btnPlusIncome.setActionCommand("plusIncome");
        btnPlusIncome.setFocusable(false);
        btnPlusIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusIncomeActionPerformed(evt);
            }
        });

        btnPlusSpent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPlusSpent.setText("+");
        btnPlusSpent.setToolTipText("adiciona um campo de receitas");
        btnPlusSpent.setActionCommand("plusSpent");
        btnPlusSpent.setFocusable(false);
        btnPlusSpent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusSpentActionPerformed(evt);
            }
        });

        btnMinusIncome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMinusIncome.setText("-");
        btnMinusIncome.setToolTipText("remove um campo de receita");
        btnMinusIncome.setActionCommand("minusRent");
        btnMinusIncome.setFocusable(false);
        btnMinusIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusIncomeActionPerformed(evt);
            }
        });

        btnMinusSpent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMinusSpent.setText("-");
        btnMinusSpent.setToolTipText("remove um campo de despesas");
        btnMinusSpent.setActionCommand("minusDeduction");
        btnMinusSpent.setFocusable(false);
        btnMinusSpent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusSpentActionPerformed(evt);
            }
        });

        spnlIncome.setBorder(javax.swing.BorderFactory.createTitledBorder("Receitas"));
        spnlIncome.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spnlIncome.setToolTipText("");

        pnlIncome.setName("income"); // NOI18N
        pnlIncome.setPreferredSize(new java.awt.Dimension(120, 30));
        pnlIncome.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        spnlIncome.setViewportView(pnlIncome);

        spnlSpent.setBorder(javax.swing.BorderFactory.createTitledBorder("Despesas"));
        spnlSpent.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlSpent.setAlignmentX(0.0F);
        pnlSpent.setAlignmentY(0.0F);
        pnlSpent.setName("spent"); // NOI18N
        pnlSpent.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        spnlSpent.setViewportView(pnlSpent);

        lblPercent.setText("Alíquota:");
        lblPercent.setToolTipText("");

        txfPercent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfPercent.setToolTipText("verifique a tabela IRPF");

        lblDeduction.setText("Dedução:");
        lblDeduction.setToolTipText("");

        txfDeduction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfDeduction.setToolTipText("verifique a tabela IRPF");

        txfResult.setEditable(false);
        txfResult.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfResult.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txfResult.setEnabled(false);

        lblResult.setText("Resultado:");

        btnCalc.setText("Calcular");
        btnCalc.setToolTipText("((base x alíquota) / 100) - dedução");
        btnCalc.setFocusable(false);
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        txfBase.setEditable(false);
        txfBase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txfBase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBase.setToolTipText("receita líquida");
        txfBase.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txfBase.setEnabled(false);

        lblBase.setText("Base:");

        lblAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubensandreoli/darfcalc/images/about.png"))); // NOI18N
        lblAbout.setToolTipText("sobre");
        lblAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAboutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(spnlIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlusIncome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinusIncome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(spnlSpent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlusSpent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinusSpent)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfResult)
                    .addComponent(txfBase)
                    .addComponent(btnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAbout))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPercent)
                                    .addComponent(lblDeduction))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfPercent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfDeduction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblResult))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnlSpent)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBase)
                            .addComponent(lblAbout))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfPercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPercent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfDeduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDeduction))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblResult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(txfResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnlIncome))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalc)
                    .addComponent(btnMinusSpent)
                    .addComponent(btnPlusSpent)
                    .addComponent(btnMinusIncome)
                    .addComponent(btnPlusIncome))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlusIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusIncomeActionPerformed
        this.addTxf(pnlIncome, incomeFields);
    }//GEN-LAST:event_btnPlusIncomeActionPerformed

    private void btnPlusSpentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusSpentActionPerformed
        this.addTxf(pnlSpent, spentFields);
    }//GEN-LAST:event_btnPlusSpentActionPerformed

    private void btnMinusIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusIncomeActionPerformed
        if(this.removeTxf(pnlIncome, incomeFields))
	    this.doBase();
    }//GEN-LAST:event_btnMinusIncomeActionPerformed

    private void btnMinusSpentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusSpentActionPerformed
        if(this.removeTxf(pnlSpent, spentFields))
	    this.doBase();
    }//GEN-LAST:event_btnMinusSpentActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
	double total = 0;
	try{
	    total = NumberFormat.getCurrencyInstance().parse(txfBase.getText()).doubleValue();
	} catch (ParseException ex) {}
	
	JTextField tempTxf = txfPercent;
	
	try{
	    total *= (Double.parseDouble(txfPercent.getText().replace(',', '.')))/100;
	    txfPercent.setBackground(Color.white);

	    tempTxf = txfDeduction;
	    total -= Double.parseDouble(txfDeduction.getText().replace(',', '.'));
	    txfDeduction.setBackground(Color.white);

	    txfResult.setText(NumberFormat.getCurrencyInstance().format(total));
	} catch (NumberFormatException ex) {
	    tempTxf.setBackground(Color.red);
	    txfResult.setText("ERRO");
	}
    }//GEN-LAST:event_btnCalcActionPerformed

    private void lblAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseClicked
	new AboutDialog(this, "DARF Calculadora", "1.0.1", "2017").setVisible(true);
    }//GEN-LAST:event_lblAboutMouseClicked
  
   private void addTxf(JPanel panel, List<JTextField> fieldList) {
	JTextField txf = this.createTxf();
//	if(fieldList.isEmpty()) txf.setToolTipText("utilize ponto para os centavos");
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
	JTextField txf = new JTextField();
	txf.setFont(new java.awt.Font("Tahoma", 0, 12));
	Dimension d = new Dimension(75, 20);
	txf.addKeyListener(new KeyListener() {
	    @Override
	    public void keyTyped(KeyEvent e) {}
	    @Override
	    public void keyPressed(KeyEvent e) {}

	    @Override
	    public void keyReleased(KeyEvent e) {
		doBase();
	    }
	});
	txf.setMaximumSize(d);
	txf.setMinimumSize(d);
	txf.setPreferredSize(d);
	return txf;
    }
    
    private void doBase() {
	double total = 0;
	boolean isOk = true;
	
	for(JTextField txfIn : incomeFields) {
	    if(!txfIn.getText().isEmpty()){
		try{
		    total += Double.parseDouble(txfIn.getText().replace(',', '.'));
		    txfIn.setBackground(Color.white);
		}catch (NumberFormatException ex){
		    isOk = false;
		    txfIn.setBackground(Color.red);
		}
	    }
	}
	
	for(JTextField txfOut : spentFields) {
	    if(!txfOut.getText().isEmpty()){
		try{
		    total -= Double.parseDouble(txfOut.getText().replace(',', '.'));
		    txfOut.setBackground(Color.white);
		}catch (NumberFormatException ex){
		    isOk = false;
		    txfOut.setBackground(Color.red);
		}
	    }
	}
	txfResult.setText(NumberFormat.getCurrencyInstance().format(0));
	if(isOk) txfBase.setText(NumberFormat.getCurrencyInstance().format(total));
	else txfBase.setText("ERRO");
    }

    private void config() {
	this.addTxf(pnlIncome, incomeFields);
	this.addTxf(pnlSpent, spentFields);
	this.setLocationRelativeTo(null);
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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnMinusIncome;
    private javax.swing.JButton btnMinusSpent;
    private javax.swing.JButton btnPlusIncome;
    private javax.swing.JButton btnPlusSpent;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblDeduction;
    private javax.swing.JLabel lblPercent;
    private javax.swing.JLabel lblResult;
    private javax.swing.JPanel pnlIncome;
    private javax.swing.JPanel pnlSpent;
    private javax.swing.JScrollPane spnlIncome;
    private javax.swing.JScrollPane spnlSpent;
    private javax.swing.JTextField txfBase;
    private javax.swing.JTextField txfDeduction;
    private javax.swing.JTextField txfPercent;
    private javax.swing.JTextField txfResult;
    // End of variables declaration//GEN-END:variables
}
