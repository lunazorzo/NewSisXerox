/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Janelas;

import NewSisXerox.Classes.Conexao;
import NewSisXerox.Classes.Util;
import java.awt.Dimension;
import java.io.InputStream;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Allan
 */
public class JIFRelTeste extends javax.swing.JInternalFrame {

    Icon alerta = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Warning-48.png")));
    Icon erro = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Error-48.png")));
    Icon sucesso = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Default-48.png")));

    /**
     * Creates new form JIFRelTeste
     */
    public JIFRelTeste() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jdinicio = new com.toedter.calendar.JDateChooser();
        jdFinal = new com.toedter.calendar.JDateChooser();

        jButton1.setText("Recarga");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Venda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jdinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jdFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        try {
//            String s = getClass().getResource("/relatorios/Chamados.jasper").toString();
//            s = new Util().formatarURL(s);
//
//            HashMap parametros = new HashMap();
//            parametros.put("DataInicial", jdinicio.getDate());
//            parametros.put("DataFinal", jdFinal.getDate());
//
//            Conexao c = new Conexao();
//            InputStream is = JRLoader.getFileInputStream(s);
//            JasperPrint jp = JasperFillManager.fillReport(is, parametros, c.getCon());
//
//            JasperViewer jv = new JasperViewer(jp, false);
//            jv.setDefaultCloseOperation(jv.DISPOSE_ON_CLOSE);
//
////        limparDados();
//            jv.setVisible(true);
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", 0);
//        }

        try {
            String s = getClass().getResource("/teste/relProduto2.jasper").toString();
            System.out.println(s);
            s = new Util().formatarURL(s);

            HashMap parametros = new HashMap();
            Conexao c = new Conexao();
            InputStream is = JRLoader.getFileInputStream(s);
            System.out.println(s);
            JasperPrint jp = JasperFillManager.fillReport(is, parametros);

            JasperViewer jv = new JasperViewer(jp, false);
            jv.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);

            jv.setVisible(true);
        } catch (Exception ex) {
            //     JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro ao abrir relatório de Regarca.", 0);
            JOptionPane.showMessageDialog(null, "Erro ao abrir relatório de Regarca!"
                    + "\n" + ex.getClass().getSimpleName()
                    + "\n" + ex.getMessage(), "ATENÇÃO", JOptionPane.ERROR_MESSAGE, erro);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jdFinal;
    private com.toedter.calendar.JDateChooser jdinicio;
    // End of variables declaration//GEN-END:variables
}
