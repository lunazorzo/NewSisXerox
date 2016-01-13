/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Paines;

import java.awt.event.KeyEvent;
import NewSisXerox.Classes.UpperCaseField;
import NewSisXerox.Classes.JtextFieldSomenteLetras;
import NewSisXerox.Classes.Validador;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public class JPModeloPainel extends javax.swing.JPanel {

    /**
     * Creates new form JPCurso
     */
    Icon alerta = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Warning-48.png")));
    Icon erro = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Error-48.png")));
    Icon sucesso = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Default-48.png")));

    public JPModeloPainel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Busca = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBusca = new javax.swing.JTable();
        jbSelecionar = new javax.swing.JButton();
        jlModeloPaine = new javax.swing.JLabel();
        jtfModeloPaine = new UpperCaseField();
        jbGravarModeloPaine = new javax.swing.JButton();

        Busca.setTitle("Busca");
        Busca.setMinimumSize(new java.awt.Dimension(500, 335));

        jtBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtBusca);

        jbSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/selecionar - 16.png"))); // NOI18N
        jbSelecionar.setText("Selecionar");

        javax.swing.GroupLayout BuscaLayout = new javax.swing.GroupLayout(Busca.getContentPane());
        Busca.getContentPane().setLayout(BuscaLayout);
        BuscaLayout.setHorizontalGroup(
            BuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSelecionar)
                .addContainerGap())
        );
        BuscaLayout.setVerticalGroup(
            BuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSelecionar)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        setLayout(null);

        jlModeloPaine.setText("Modelo:");
        add(jlModeloPaine);
        jlModeloPaine.setBounds(10, 22, 40, 14);

        jtfModeloPaine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfModeloPaineKeyPressed(evt);
            }
        });
        add(jtfModeloPaine);
        jtfModeloPaine.setBounds(50, 19, 300, 20);

        jbGravarModeloPaine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/Salvar - 16.png"))); // NOI18N
        jbGravarModeloPaine.setText("Gravar");
        jbGravarModeloPaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarModeloPaineActionPerformed(evt);
            }
        });
        add(jbGravarModeloPaine);
        jbGravarModeloPaine.setBounds(265, 45, 85, 25);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfModeloPaineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfModeloPaineKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Busca.show();
            Busca.setLocationRelativeTo(this);//seta a posição da tela 
        }
    }//GEN-LAST:event_jtfModeloPaineKeyPressed

    private void jbGravarModeloPaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarModeloPaineActionPerformed
        if (Validador.vldStringMinMax(jtfModeloPaine.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe o nome do modelo!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, alerta);
            jtfModeloPaine.requestFocus();
            return;
        }
    }//GEN-LAST:event_jbGravarModeloPaineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Busca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGravarModeloPaine;
    private javax.swing.JButton jbSelecionar;
    private javax.swing.JLabel jlModeloPaine;
    private javax.swing.JTable jtBusca;
    private javax.swing.JTextField jtfModeloPaine;
    // End of variables declaration//GEN-END:variables
}
