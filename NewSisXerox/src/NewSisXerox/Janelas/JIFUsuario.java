/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Janelas;

import NewSisXerox.Classes.Validador;
import NewSisXerox.Classes.UpperCaseField;
import NewSisXerox.DAO.GenericDAO;
import NewSisXerox.Entity.Usuario;
import NewSisXerox.Tabelas.tabUsuario;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public class JIFUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFUsuario
     */
    private Usuario usuario;
    private tabUsuario tabusuario;
    Icon alerta = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Warning-48.png")));
    Icon erro = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Error-48.png")));
    Icon sucesso = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Default-48.png")));

    public JIFUsuario() {
        initComponents();
        tabusuario = new tabUsuario();
        jtBusca.setModel(tabusuario);
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

    public void limparDados() {
        jtfNome.setText("");
        jtfSenha.setText("");
    }

    public void carregaTabela() {
        try {
            List l = GenericDAO.getInstance().getList(Usuario.class,
                    "FROM Usuario usuario");  // consulta no banco
            tabusuario.setDados(l);
            jtBusca.updateUI();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar a tabela de Usuários!"  + "\n" + ex.getClass().getSimpleName() + "\n" + ex.getMessage(), "ATENÇÃO", JOptionPane.ERROR_MESSAGE, erro);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Busca = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBusca = new javax.swing.JTable();
        jbSelecionar = new javax.swing.JButton();
        jlnome = new javax.swing.JLabel();
        jtfNome = new UpperCaseField();
        jlSenha = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JPasswordField();
        jbGravar = new javax.swing.JButton();
        ativo = new javax.swing.JCheckBox();

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

        setClosable(true);
        setTitle("Cadastro de Usuário");

        jlnome.setText("Nome:");

        jtfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfNomeKeyPressed(evt);
            }
        });

        jlSenha.setText("Senha:");

        jbGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/Salvar - 16.png"))); // NOI18N
        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        ativo.setSelected(true);
        ativo.setText("Usuário Ativo");
        ativo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlnome)
                    .addComponent(jlSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ativo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbGravar)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSenha)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGravar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed

        if (Validador.vldStringMinMax(jtfNome.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe o nome do usuário!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, alerta);
            jtfNome.requestFocus();
            return;
        }
        if (Validador.vldStringMinMax(jtfSenha.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe a senha do usuário!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, alerta);
            jtfSenha.requestFocus();
            return;
        }
        try {
            if (usuario == null) {
                usuario = new Usuario();
            }
            usuario.setUsuario(jtfNome.getText());
            usuario.setSenha(jtfSenha.getText());
            usuario.setFgAtivo(ativo.isSelected());
            GenericDAO.getInstance().persist(usuario);
            GenericDAO.getInstance().startTransaction();
            GenericDAO.getInstance().commit();
            JOptionPane.showMessageDialog(null, "Usuário " + jtfNome.getText() + " cadastrado com Sucesso!", "ATENÇÃO", JOptionPane.PLAIN_MESSAGE, sucesso);
            limparDados();
        } catch (Exception ex) {
            GenericDAO.getInstance().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Usuário!" + "\n" + ex.getClass().getSimpleName() + "\n" + ex.getMessage(), "ATENÇÃO", JOptionPane.ERROR_MESSAGE, erro);
        }
    }//GEN-LAST:event_jbGravarActionPerformed

    private void jbSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarActionPerformed
        try {
            //pegando a opção selecionada na grade
            usuario = (Usuario) tabusuario.getDadoAt(jtBusca.getSelectedRow());
            if (usuario != null) {
                jtfNome.setText(usuario.getUsuario());
                jtfSenha.setText(usuario.getSenha());
                Busca.dispose();
                jtBusca.clearSelection();
            }
        } catch (Throwable ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Usuário!" + "\n" + ex.getClass().getSimpleName() + "\n" + ex.getMessage(), "ATENÇÃO", JOptionPane.ERROR_MESSAGE, erro);
            limparDados();
        }
    }//GEN-LAST:event_jbSelecionarActionPerformed

    private void jtfNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carregaTabela();
            Busca.show();
            Busca.setLocationRelativeTo(this);//seta a posição da tela 
    }//GEN-LAST:event_jtfNomeKeyPressed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Busca;
    private javax.swing.JCheckBox ativo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGravar;
    private javax.swing.JButton jbSelecionar;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlnome;
    private javax.swing.JTable jtBusca;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
}
