/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Paines;

import NewSisXerox.Classes.Validador;
import NewSisXerox.Classes.UpperCaseField;
import NewSisXerox.Classes.JtextFieldSomenteLetras;
import NewSisXerox.DAO.GenericDAO;
import NewSisXerox.Entity.Formpgto;
import NewSisXerox.Tabelas.tabFormaPgto;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Allan
 */
public class JPFormaPgto extends javax.swing.JPanel {

    /**
     * Creates new form JPInstituica
     */
    private Formpgto formpgto;
    private tabFormaPgto tabformapgto;
    Icon alerta = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Warning-48.png")));
    Icon erro = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Error-48.png")));
    Icon sucesso = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Default-48.png")));

    public JPFormaPgto() {
        initComponents();
        tabformapgto = new tabFormaPgto();
        jtBusca.setModel(tabformapgto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void limparDados() {
        jtfFormaPgto.setText("");
    }

    public void carregaTabela() {
        try {
            List l = GenericDAO.getInstance().getList(Formpgto.class,
                    "FROM Formpgto nmFormpgto");  // consulta no banco
            tabformapgto.setDados(l);
            jtBusca.updateUI();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar busca!" + "\n" + ex.getClass().getSimpleName() + "\n" + ex.getMessage(), "ATENÇÃO", JOptionPane.ERROR_MESSAGE, erro);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Busca = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBusca = new javax.swing.JTable();
        jbSelecionar = new javax.swing.JButton();
        jlFormaPgto = new javax.swing.JLabel();
        jtfFormaPgto = new UpperCaseField();
        jbGravar = new javax.swing.JButton();

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
        jbSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecionarActionPerformed(evt);
            }
        });

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

        jlFormaPgto.setText("Forma Pgto:");

        jtfFormaPgto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfFormaPgtoKeyPressed(evt);
            }
        });

        jbGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/Salvar - 16.png"))); // NOI18N
        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbGravar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlFormaPgto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfFormaPgto, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFormaPgto)
                    .addComponent(jtfFormaPgto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGravar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed
        if (Validador.vldStringMinMax(jtfFormaPgto.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe a Forma de Pagamento!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, alerta);
            jtfFormaPgto.requestFocus();
            return;
        }
        try {
            if (formpgto == null) {
                formpgto = new Formpgto();
            }
            formpgto.setNmFormpgto(jtfFormaPgto.getText());
            GenericDAO.getInstance().startTransaction();
            GenericDAO.getInstance().persist(formpgto);
            GenericDAO.getInstance().commit();
            JOptionPane.showMessageDialog(null, "Forma de Pagamento " + jtfFormaPgto.getText() + " gravada com Sucesso!",
                    "ATENÇÃO", JOptionPane.PLAIN_MESSAGE, sucesso);
            limparDados();

        } catch (Exception ex) {
            GenericDAO.getInstance().rollback();
            JOptionPane.showMessageDialog(null, "Forma de Pagamento já existente!" + "\n" + ex.getClass().getSimpleName() + "\n" + ex.getMessage(), "ATENÇÃO", JOptionPane.ERROR_MESSAGE, erro);
            limparDados();
        }
        jtfFormaPgto.requestFocus();
    }//GEN-LAST:event_jbGravarActionPerformed

    private void jbSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarActionPerformed
        try {
            //pegando a opção selecionada na grade
            formpgto = (Formpgto) tabformapgto.getDadoAt(jtBusca.getSelectedRow());
            if (formpgto != null) {
                jtfFormaPgto.setText(formpgto.getNmFormpgto());
                Busca.dispose();
                jtBusca.clearSelection();
            }
        } catch (Throwable ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar a Forma de Pagamento!" + "\n" + ex.getClass().getSimpleName() + "\n" + ex.getMessage(), "ATENÇÃO", JOptionPane.ERROR_MESSAGE, erro);
            limparDados();
        }
    }//GEN-LAST:event_jbSelecionarActionPerformed

    private void jtfFormaPgtoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFormaPgtoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carregaTabela();
            Busca.show();
            Busca.setLocationRelativeTo(this);//seta a posição da tela 
        }
    }//GEN-LAST:event_jtfFormaPgtoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Busca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGravar;
    private javax.swing.JButton jbSelecionar;
    private javax.swing.JLabel jlFormaPgto;
    private javax.swing.JTable jtBusca;
    private javax.swing.JTextField jtfFormaPgto;
    // End of variables declaration//GEN-END:variables
}
