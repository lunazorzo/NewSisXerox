package NewSisXerox.Libs;

import javax.swing.*;

/**
 * @author  Rui Rossi dos Santos
 */
public class JLook extends javax.swing.JDialog {
   private int acao;
   
   public JLook(java.awt.Frame parent, boolean modal) {
      super(parent, modal);
      acao = -1;
      initComponents();
   }
   
   public int getAcao() {return acao;}
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgLook = new javax.swing.ButtonGroup();
        pnCentro = new javax.swing.JPanel();
        rbCross = new javax.swing.JRadioButton();
        rbWindows = new javax.swing.JRadioButton();
        rbMotif = new javax.swing.JRadioButton();
        rbSubstance = new javax.swing.JRadioButton();
        rbMac = new javax.swing.JRadioButton();
        rbNimrod = new javax.swing.JRadioButton();
        pnSul = new javax.swing.JPanel();
        btOk = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Look And Feel");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnCentro.setLayout(new java.awt.GridLayout(6, 1));

        bgLook.add(rbCross);
        rbCross.setText("Cross Platform");
        rbCross.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbCross.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pnCentro.add(rbCross);

        bgLook.add(rbWindows);
        rbWindows.setText("Windows");
        rbWindows.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbWindows.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pnCentro.add(rbWindows);

        bgLook.add(rbMotif);
        rbMotif.setText("Motif");
        rbMotif.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbMotif.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pnCentro.add(rbMotif);

        bgLook.add(rbSubstance);
        rbSubstance.setText("Substance");
        rbSubstance.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbSubstance.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pnCentro.add(rbSubstance);

        bgLook.add(rbMac);
        rbMac.setText("Macintosh");
        rbMac.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbMac.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pnCentro.add(rbMac);

        bgLook.add(rbNimrod);
        rbNimrod.setText("NimROD");
        rbNimrod.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rbNimrod.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pnCentro.add(rbNimrod);

        getContentPane().add(pnCentro, java.awt.BorderLayout.CENTER);

        pnSul.setLayout(new java.awt.GridLayout(1, 2));

        btOk.setMnemonic('O');
        btOk.setText("Ok");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });
        pnSul.add(btOk);

        btCancelar.setMnemonic('C');
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        pnSul.add(btCancelar);

        getContentPane().add(pnSul, java.awt.BorderLayout.SOUTH);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/ruirossi/sisescola/img/grande/Look.png"))); // NOI18N
        getContentPane().add(jLabel1, java.awt.BorderLayout.WEST);

        setSize(new java.awt.Dimension(237, 224));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
      acao = 1;
      dispose();
   }//GEN-LAST:event_btCancelarActionPerformed

   private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
      if (rbCross.isSelected()) setLook("javax.swing.plaf.metal.MetalLookAndFeel");
      else if (rbWindows.isSelected()) setLook("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
      else if (rbMotif.isSelected()) setLook("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
      else if (rbSubstance.isSelected()) setLook("org.jvnet.substance.SubstanceLookAndFeel");
      else if (rbMac.isSelected()) setLook("ch.randelshofer.quaqua.QuaquaLookAndFeel");
      else if (rbNimrod.isSelected()) setLook("com.nilo.plaf.nimrod.NimRODLookAndFeel");
      acao = 0;
      dispose();
   }//GEN-LAST:event_btOkActionPerformed

   private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      String classe = UIManager.getLookAndFeel().getClass().toString();
      classe = classe.substring(6,classe.length());
      
      if (classe.equals("javax.swing.plaf.metal.MetalLookAndFeel")) {
         rbCross.setSelected(true);
      }
      else if (classe.equals("com.sun.java.swing.plaf.windows.WindowsLookAndFeel")) {
         rbWindows.setSelected(true);
      }
      else if (classe.equals("com.sun.java.swing.plaf.motif.MotifLookAndFeel")) {
         rbMotif.setSelected(true);
      }
      else if (classe.equals("org.jvnet.substance.SubstanceLookAndFeel")) {
         rbSubstance.setSelected(true);
      }
      else if (classe.equals("ch.randelshofer.quaqua.QuaquaLookAndFeel")) {
         rbMac.setSelected(true);
      }
      else if (classe.equals("com.nilo.plaf.nimrod.NimRODLookAndFeel")) {
         rbNimrod.setSelected(true);
      }
   }//GEN-LAST:event_formWindowOpened
   
   public void setLook(String lafName) {
      try {UIManager.setLookAndFeel(lafName);}
      catch (Exception ex) {}
   }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgLook;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnCentro;
    private javax.swing.JPanel pnSul;
    private javax.swing.JRadioButton rbCross;
    private javax.swing.JRadioButton rbMac;
    private javax.swing.JRadioButton rbMotif;
    private javax.swing.JRadioButton rbNimrod;
    private javax.swing.JRadioButton rbSubstance;
    private javax.swing.JRadioButton rbWindows;
    // End of variables declaration//GEN-END:variables
}