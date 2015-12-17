/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Janelas;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import NewSisXerox.Classes.ClasseImagem;

/**
 *
 * @author Allan
 */
public class JFPrincipal extends javax.swing.JFrame {

    JIFEmpresa empresa;
    JIFInstituicao instituicao;
    JIFUnidade unidade;
    JIFMarcaModelo marca;
    JIFUsuario usuario;
    JIFAluno aluno;
    JIFRecarga recarga;
    JIFFormaTipoPagto pgto;

    public JFPrincipal() {
        try {
//            Pega o padrao do windows
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//            UIManager.setLookAndFeel("org.jvnet.substance.SubstanceLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        URL url = this.getClass().getResource("/NewSisXerox/Imagens/Icone-64.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);

        //deixando na cheia
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new ClasseImagem("/NewSisXerox/Imagens/Brazil_Flag.jpg");
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastros = new javax.swing.JMenu();
        jmEmpresa = new javax.swing.JMenuItem();
        jmAluno = new javax.swing.JMenuItem();
        jmUsuarios = new javax.swing.JMenuItem();
        jmCursoInstituicao = new javax.swing.JMenuItem();
        jmUnidadeMedida = new javax.swing.JMenuItem();
        jmMarcaModelo = new javax.swing.JMenuItem();
        jmRecarga = new javax.swing.JMenuItem();
        Utilitarios = new javax.swing.JMenu();
        jmFormTPPgto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Xerox");

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        Cadastros.setText("Cadastros");

        jmEmpresa.setText("Empresa");
        jmEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEmpresaActionPerformed(evt);
            }
        });
        Cadastros.add(jmEmpresa);

        jmAluno.setText("Aluno");
        jmAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlunoActionPerformed(evt);
            }
        });
        Cadastros.add(jmAluno);

        jmUsuarios.setText("Usuários");
        jmUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuariosActionPerformed(evt);
            }
        });
        Cadastros.add(jmUsuarios);

        jmCursoInstituicao.setText("Curso/Instituição");
        jmCursoInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCursoInstituicaoActionPerformed(evt);
            }
        });
        Cadastros.add(jmCursoInstituicao);

        jmUnidadeMedida.setText("Unidade de Medida");
        jmUnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUnidadeMedidaActionPerformed(evt);
            }
        });
        Cadastros.add(jmUnidadeMedida);

        jmMarcaModelo.setText("Marca/Modelo");
        jmMarcaModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMarcaModeloActionPerformed(evt);
            }
        });
        Cadastros.add(jmMarcaModelo);

        jmRecarga.setText("Recarga");
        jmRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRecargaActionPerformed(evt);
            }
        });
        Cadastros.add(jmRecarga);

        jMenuBar1.add(Cadastros);

        Utilitarios.setText("Utilitários");

        jmFormTPPgto.setText("Forma / Tipo Pgto");
        jmFormTPPgto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormTPPgtoActionPerformed(evt);
            }
        });
        Utilitarios.add(jmFormTPPgto);

        jMenuBar1.add(Utilitarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEmpresaActionPerformed
        try {
            if (evt.getSource() == jmEmpresa) {
                if (empresa == null) {
                    empresa = new JIFEmpresa();
                    Desktop.add(empresa);
                    empresa.setVisible(true);
                    empresa.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(empresa);
            }
            if (empresa.isClosed()) {
                empresa = new JIFEmpresa();
                Desktop.add(empresa);
                empresa.setVisible(true);
                empresa.setPosicao();//Seta centralizado
                Desktop.moveToFront(empresa);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir tela de Configurações" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmEmpresaActionPerformed

    private void jmCursoInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCursoInstituicaoActionPerformed
        try {
            if (evt.getSource() == jmCursoInstituicao) {
                if (instituicao == null) {
                    instituicao = new JIFInstituicao();
                    Desktop.add(instituicao);
                    instituicao.setVisible(true);
                    instituicao.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(instituicao);
            }
            if (instituicao.isClosed()) {
                instituicao = new JIFInstituicao();
                Desktop.add(instituicao);
                instituicao.setVisible(true);
                instituicao.setPosicao();//Seta centralizado
                Desktop.moveToFront(instituicao);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir tela da Instituição" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmCursoInstituicaoActionPerformed

    private void jmUnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUnidadeMedidaActionPerformed
        try {
            if (evt.getSource() == jmUnidadeMedida) {
                if (unidade == null) {
                    unidade = new JIFUnidade();
                    Desktop.add(unidade);
                    unidade.setVisible(true);
                    unidade.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(unidade);
            }
            if (unidade.isClosed()) {
                unidade = new JIFUnidade();
                Desktop.add(unidade);
                unidade.setVisible(true);
                unidade.setPosicao();//Seta centralizado
                Desktop.moveToFront(unidade);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela Unidade Medida" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmUnidadeMedidaActionPerformed

    private void jmMarcaModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMarcaModeloActionPerformed
        try {
            if (evt.getSource() == jmMarcaModelo) {
                if (marca == null) {
                    marca = new JIFMarcaModelo();
                    Desktop.add(marca);
                    marca.setVisible(true);
                    marca.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(unidade);
            }
            if (marca.isClosed()) {
                marca = new JIFMarcaModelo();
                Desktop.add(marca);
                marca.setVisible(true);
                marca.setPosicao();//Seta centralizado
                Desktop.moveToFront(marca);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela Marca/Modelo" + "\n" + e.getMessage());
        }

    }//GEN-LAST:event_jmMarcaModeloActionPerformed

    private void jmUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuariosActionPerformed
        try {
            if (evt.getSource() == jmUsuarios) {
                if (usuario == null) {
                    usuario = new JIFUsuario();
                    Desktop.add(usuario);
                    usuario.setVisible(true);
                    usuario.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(usuario);
            }
            if (usuario.isClosed()) {
                usuario = new JIFUsuario();
                Desktop.add(usuario);
                usuario.setVisible(true);
                usuario.setPosicao();//Seta centralizado
                Desktop.moveToFront(usuario);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela de Usuários" + "\n" + e.getMessage());
        }
//        JIFUsuario a = null;
//        try {
//            a = new JIFUsuario();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Não foi possível abrir Cadastro Aluno" + "/n" + e.getMessage());
//        }
//        Desktop.add(a);
//        a.setPosicao();
//        a.setVisible(true);
    }//GEN-LAST:event_jmUsuariosActionPerformed

    private void jmAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlunoActionPerformed
        try {
            if (evt.getSource() == jmAluno) {
                if (aluno == null) {
                    aluno = new JIFAluno();
                    Desktop.add(aluno);
                    aluno.setVisible(true);
                    aluno.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(aluno);
            }
            if (aluno.isClosed()) {
                aluno = new JIFAluno();
                Desktop.add(aluno);
                aluno.setVisible(true);
                aluno.setPosicao();//Seta centralizado
                Desktop.moveToFront(aluno);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela de Usuários" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmAlunoActionPerformed

    private void jmRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRecargaActionPerformed
        try {
            if (evt.getSource() == jmRecarga) {
                if (recarga == null) {
                    recarga = new JIFRecarga();
                    Desktop.add(recarga);
                    recarga.setVisible(true);
                    recarga.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(recarga);
            }
            if (recarga.isClosed()) {
                recarga = new JIFRecarga();
                Desktop.add(recarga);
                recarga.setVisible(true);
                recarga.setPosicao();//Seta centralizado
                Desktop.moveToFront(recarga);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela de Recarga" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmRecargaActionPerformed

    private void jmFormTPPgtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormTPPgtoActionPerformed
        try {
            if (evt.getSource() == jmFormTPPgto) {
                if (pgto == null) {
                    pgto = new JIFFormaTipoPagto();
                    Desktop.add(pgto);
                    pgto.setVisible(true);
                    pgto.setPosicao();//Seta centralizado
                }
                Desktop.moveToFront(pgto);
            }
            if (pgto.isClosed()) {
                pgto = new JIFFormaTipoPagto();
                Desktop.add(pgto);
                pgto.setVisible(true);
                pgto.setPosicao();//Seta centralizado
                Desktop.moveToFront(pgto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir janela da Forma / Tipo Pagamento" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmFormTPPgtoActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastros;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu Utilitarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAluno;
    private javax.swing.JMenuItem jmCursoInstituicao;
    private javax.swing.JMenuItem jmEmpresa;
    private javax.swing.JMenuItem jmFormTPPgto;
    private javax.swing.JMenuItem jmMarcaModelo;
    private javax.swing.JMenuItem jmRecarga;
    private javax.swing.JMenuItem jmUnidadeMedida;
    private javax.swing.JMenuItem jmUsuarios;
    // End of variables declaration//GEN-END:variables
}
