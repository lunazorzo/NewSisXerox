/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Janelas;

import NewSisXerox.Classes.Validador;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import NewSisXerox.Classes.UpperCaseField;
import NewSisXerox.DAO.GenericDAO;
import NewSisXerox.Entity.Usuario;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author Allan
 */
public class JFLogin extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Icon alerta = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Warning-48.png")));
    Icon erro = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Error-48.png")));
    Icon sucesso = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Default-48.png")));
    Usuario usuario;
    
    private static GenericDAO instance = null;
    private EntityManager em;
    private EntityTransaction tx;

    public JFLogin() {
//Tamanho da fonte das mensagens
        UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.BOLD, 14));
        //Tamanho da fonte na mensagem quanto utilizar botões
        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 14)));
         UIManager.put("InternalFrame.paletteTitleFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 14)));

        try {
//            Pega o padrao do windows
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        URL url = this.getClass().getResource("/NewSisXerox/Imagens/Icone-64.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        //conexãobanco

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlIcone = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jtfUsuario = new UpperCaseField();
        jtfSenha = new javax.swing.JLabel();
        jpSenha = new javax.swing.JPasswordField();
        jbAcessar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        jlIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/Password-64.png"))); // NOI18N

        jlUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlUsuario.setText("Usuário:");

        jtfUsuario.setText("ADMIN");

        jtfSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfSenha.setText("Senha:");

        jpSenha.setText("123");
        jpSenha.setToolTipText("");

        jbAcessar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/selecionar - 16.png"))); // NOI18N
        jbAcessar.setText("Acessar");
        jbAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAcessarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/Cancelar - 16.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlIcone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAcessar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSenha)
                            .addComponent(jlUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfUsuario)
                            .addComponent(jpSenha))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlIcone)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlUsuario)
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfSenha)
                            .addComponent(jpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAcessar)
                            .addComponent(jbCancelar))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbCancelarActionPerformed

    public void logar() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

//        String url = "jdbc:postgresql://localhost:5432/newxerox";
//        String usuario = "postgres";
//        String senha = "xtz7qr87";
//        Class.forName("org.postgresql.Driver");
//        Connection con;
//        con = DriverManager.getConnection(url, usuario, senha);
//        System.out.println("Conexão realizada com sucesso.");
//        String SQL = "SELECT *FROM Usuario WHERE usuario = ? and senha = ?";
//        try {
//
//            pst = con.prepareStatement(SQL);
//            pst.setString(1, jtfUsuario.getText());
//            pst.setString(2, jpSenha.getText());
//            rs = pst.executeQuery();
//            System.err.println(SQL);
//            //if (jtfUsuario.getText().equals("ADMIN") && jpSenha.getText().equals("123")) {
//            if (rs.next()) {
//                System.err.println(rs);
//                JFPrincipal p = new JFPrincipal(); //instancia da tela principal
//                p.show(); //abre a tela principal
//                this.dispose(); //fecha a tela de login
//            } else {
//                JOptionPane.showMessageDialog(null, "Usuário e senha inválidos!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE, erro);
//            }
//        } catch (SQLException | HeadlessException e) {
//        }
 
        usuario = (Usuario) GenericDAO.getInstance().getObject(
                " select s from Usuario s "
                + "  where upper(s.usuario) like upper('" + jtfUsuario.getText() + "') "
                + "    and s.senha = '" + (jpSenha.getText()) + "' ");
        if (usuario == null) {
            JOptionPane.showMessageDialog(this, "Usuario não Encontrado!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE, alerta);
        } else {
            JFPrincipal p = new JFPrincipal(); //instancia da tela principal
            p.show(); //abre a tela principal
            this.dispose(); //fecha a tela de login
        }
    }
    private void jbAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAcessarActionPerformed
        if (Validador.vldStringMinMax(jtfUsuario.getText(), 3, 15) == false) {
            JOptionPane.showMessageDialog(this, "Informe o usuário!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE, alerta);
            jtfUsuario.requestFocus();
            return;
        }
        if (Validador.vldStringMinMax(jpSenha.getText(), 3, 15) == false) {
            JOptionPane.showMessageDialog(this, "Informe a senha!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE, alerta);
            jpSenha.requestFocus();
            return;
        }
        try {
            logar();
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JFLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAcessarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAcessar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JLabel jlIcone;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpSenha;
    private javax.swing.JLabel jtfSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
