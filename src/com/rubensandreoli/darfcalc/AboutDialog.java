package com.rubensandreoli.darfcalc;

public class AboutDialog extends javax.swing.JDialog {

    private final String programName;
    private final String programDesc;
    private final String version;
    
    public AboutDialog(java.awt.Frame parent, final String programName, final String programDesc, final String version) {
	super(parent);
	initComponents();
	this.programName = programName;
	this.programDesc = programDesc;
	this.version = version;
	configComponents();
    }
    
    public AboutDialog(java.awt.Frame parent, final String programName, final String version) {
	this(parent, programName, null, version);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblProgram = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        spnlLicense = new javax.swing.JScrollPane();
        txpLicense = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setModalityType(java.awt.Dialog.ModalityType.DOCUMENT_MODAL);
        setResizable(false);

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rubensandreoli/darfcalc/images/logo.png"))); // NOI18N

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        txpLicense.setEditable(false);
        txpLicense.setContentType("text/html"); // NOI18N
        spnlLicense.setViewportView(txpLicense);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 251, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(spnlLicense)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(btnClose)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnlLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void configComponents() {
	this.setLocationRelativeTo(this.getOwner());

	lblProgram.setText(
	    "<html><body style=\"text-align:justify, font-size:10px;\"><b>"+programName+"</b><br/>"
	    + (programDesc != null ? programDesc+"<br/>":"")
	    + "Versão: "+version+"<br/><br/><br/>"
	    + "<p style=\"font-size:8px;\">Copyright (C) 2017  Rubens A. Andreoli Júnior</p></body></html>"
	    );   

	txpLicense.setText(
	    "<html><body style=\"text-align:justify, font-size:10px;\">"
	    + "This program is free software: you can redistribute it and/or modify "
	    + "it under the terms of the GNU General Public License as published by "
	    + "the Free Software Foundation, either version 3 of the License, or "
	    + "any later version."
	    + "<p>This program is distributed in the hope that it will be useful, "
	    + "but WITHOUT ANY WARRANTY; without even the implied warranty of "
	    + "MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the "
	    + "GNU General Public License for more details.</p>"
	    + "<p>You should have received a copy of the GNU General Public License "
	    + "along with this program.  If not, see http://www.gnu.org/licenses.</p></body></html>"
	    );
	txpLicense.setCaretPosition(0);
	
	btnClose.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblProgram;
    private javax.swing.JScrollPane spnlLicense;
    private javax.swing.JTextPane txpLicense;
    // End of variables declaration//GEN-END:variables
}
