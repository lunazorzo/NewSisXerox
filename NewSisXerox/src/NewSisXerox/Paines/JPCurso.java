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
import NewSisXerox.Entity.Curso;
import javax.swing.JOptionPane;
import NewSisXerox.Entity.Instituicao;
import NewSisXerox.Tabelas.tabCurso;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Allan
 */
public class JPCurso extends javax.swing.JPanel {

    /**
     * Creates new form JPInstituica
     */
    private Curso curso;
    private final tabCurso tabCurso;
    Icon alerta = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Warning-48.png")));
    Icon erro = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Error-48.png")));
    Icon sucesso = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Default-48.png")));

    public JPCurso() {
        initComponents();
        carregaCombo();
        tabCurso = new tabCurso();
        jtBusca.setModel(tabCurso);
    }

    public void limparDados() {
        jtfCurso.setText("");
        jcInstituicao.setSelectedItem(null);
    }

    public void carregaCombo() {
        jcInstituicao.removeAllItems();//removendo tds os itens da combo
        jcInstituicao.addItem(null);
        try {
            List<Instituicao> lstInstituicao = GenericDAO.getInstance().getList(Instituicao.class,
                    "FROM Instituicao nmInstituicao"); //tem q ta = o nome da classe criada
            for (Instituicao a : lstInstituicao) {
                jcInstituicao.addItem(a);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar Instituição!" + "\n" + ex.getClass().getSimpleName() + "\n" + ex.getMessage(), "ATENÇÃO", JOptionPane.ERROR_MESSAGE, erro);
        }
    }

    public void carregaTabela() {
        try {
            List l = GenericDAO.getInstance().getList(Curso.class,
                    "FROM Curso nmCurso");  // consulta no banco
            tabCurso.setDados(l);
            jtBusca.updateUI();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar tabela de Cursos!" + "\n" + ex.getClass().getSimpleName() + "\n" + ex.getMessage(), "ATENÇÃO", JOptionPane.ERROR_MESSAGE, erro);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Busca = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBusca = new javax.swing.JTable();
        jbSelecionar = new javax.swing.JButton();
        jlCurso = new javax.swing.JLabel();
        jtfCurso = new UpperCaseField();
        jbGravar = new javax.swing.JButton();
        jlInstituicao = new javax.swing.JLabel();
        jcInstituicao = new javax.swing.JComboBox();

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

        jlCurso.setText("Curso:");

        jtfCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCursoKeyPressed(evt);
            }
        });

        jbGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/Salvar - 16.png"))); // NOI18N
        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        jlInstituicao.setText("Instiuição:");

        jcInstituicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbGravar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlCurso)
                        .addGap(22, 22, 22)
                        .addComponent(jtfCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlInstituicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcInstituicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCurso)
                    .addComponent(jtfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlInstituicao)
                    .addComponent(jcInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbGravar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed
        if (Validador.vldStringMinMax(jtfCurso.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe o nome do Curso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, alerta);
            jtfCurso.requestFocus();
            return;
        }
        if (jcInstituicao.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma Instituição!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, alerta);
            jcInstituicao.requestFocus();
            return;
        }
        try {
            if (curso == null) {
                curso = new Curso();
            }
            curso.setNmCurso(jtfCurso.getText());
            curso.setCdInstituicao((Instituicao) jcInstituicao.getSelectedItem());
            GenericDAO.getInstance().startTransaction();
            GenericDAO.getInstance().persist(curso);
            GenericDAO.getInstance().commit();
            JOptionPane.showMessageDialog(null, "Curso " + jtfCurso.getText() + " gravada com Sucesso!",
                    "ATENÇÃO", JOptionPane.PLAIN_MESSAGE, sucesso);
            limparDados();

        } catch (Exception ex) {
            GenericDAO.getInstance().rollback();
            JOptionPane.showMessageDialog(null, "Curso já existente!" + "\n" + ex.getClass().getSimpleName() + "\n" + ex.getMessage(), "ATENÇÃO", JOptionPane.ERROR_MESSAGE, erro);
            limparDados();
        }
        jtfCurso.requestFocus();
    }//GEN-LAST:event_jbGravarActionPerformed

    private void jbSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarActionPerformed
        try {
            //pegando a opção selecionada na grade
            curso = (Curso) tabCurso.getDadoAt(jtBusca.getSelectedRow());
            if (curso != null) {
                jtfCurso.setText(curso.getNmCurso());
                jcInstituicao.setSelectedItem(curso.getCdInstituicao());
                Busca.dispose();
                jtBusca.clearSelection();
            }
        } catch (Throwable ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar a Curso/Instituição!" + "\n" + ex.getClass().getSimpleName() + "\n" + ex.getMessage(), "ATENÇÃO", JOptionPane.ERROR_MESSAGE, erro);
            limparDados();
        }
    }//GEN-LAST:event_jbSelecionarActionPerformed

    private void jtfCursoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCursoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carregaTabela();
            Busca.show();
            Busca.setLocationRelativeTo(this);//seta a posição da tela 
        }
    }//GEN-LAST:event_jtfCursoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Busca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGravar;
    private javax.swing.JButton jbSelecionar;
    private javax.swing.JComboBox jcInstituicao;
    private javax.swing.JLabel jlCurso;
    private javax.swing.JLabel jlInstituicao;
    private javax.swing.JTable jtBusca;
    private javax.swing.JTextField jtfCurso;
    // End of variables declaration//GEN-END:variables
}
