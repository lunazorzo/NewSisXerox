/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Janelas;

import NewSisXerox.Classes.Validador;
import NewSisXerox.Classes.UpperCaseField;
import NewSisXerox.DAO.GenericDAO;
import NewSisXerox.Entity.Aluno;
import NewSisXerox.Entity.Curso;
import NewSisXerox.Tabelas.tabAluno;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public class JIFAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFAluno
     */
    private Aluno aluno;
    private tabAluno tabaluno;

    public JIFAluno() {
        initComponents();
        carregaCombo();
        tabaluno = new tabAluno();
        jtBusca.setModel(tabaluno);
        jdData.setDate(new java.util.Date());
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public void carregaTabela() {
        try {
            List l = GenericDAO.getInstance().getList(Aluno.class,
                    "FROM Aluno i order by i.nmAluno");  // consulta no banco
            tabaluno.setDados(l);
            jtBusca.updateUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar a tabela de Alunos!" + e.getMessage());
        }
    }

    public void carregaCombo() {
        jcCurso.removeAllItems();//removendo tds os itens da combo
        jcCurso.addItem(null);
        try {
            List<Curso> lstCurso = GenericDAO.getInstance().getList(Curso.class,
                    "FROM Curso nmCurso"); //tem q ta = o nome da classe criada
            for (Curso a : lstCurso) {
                jcCurso.addItem(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar Curso!" + "\n" + e.getMessage());
        }
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
        jlRA = new javax.swing.JLabel();
        jlAluno = new javax.swing.JLabel();
        jlCurso = new javax.swing.JLabel();
        jlRG = new javax.swing.JLabel();
        jlSaldo = new javax.swing.JLabel();
        jtfRG = new UpperCaseField();
        jcCurso = new javax.swing.JComboBox();
        jtfAluno = new UpperCaseField();
        jtfRA = new UpperCaseField();
        jbGravar = new javax.swing.JButton();
        jtfSaldo = new javax.swing.JTextField();
        jdData = new com.toedter.calendar.JDateChooser();
        jlData = new javax.swing.JLabel();

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
            .addComponent(jScrollPane1)
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
        setTitle("Cadastro Aluno");

        jlRA.setText("RA:");

        jlAluno.setText("Aluno:");

        jlCurso.setText("Curso:");

        jlRG.setText("RG:");

        jlSaldo.setText("Saldo:");

        jcCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jtfRA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfRAKeyPressed(evt);
            }
        });

        jbGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/Salvar - 16.png"))); // NOI18N
        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        jtfSaldo.setEnabled(false);
        jtfSaldo.setPreferredSize(new java.awt.Dimension(59, 20));

        jdData.setEnabled(false);

        jlData.setText("Data Cadastro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlAluno)
                            .addComponent(jlRA))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfAluno)
                            .addComponent(jtfRA)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbGravar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCurso)
                            .addComponent(jlRG)
                            .addComponent(jlSaldo))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdData, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfRG)
                            .addComponent(jcCurso, 0, 309, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlRA)
                            .addComponent(jtfRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAluno)
                            .addComponent(jtfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCurso)
                            .addComponent(jcCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlRG)
                            .addComponent(jtfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSaldo)
                            .addComponent(jtfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlData)))
                    .addComponent(jdData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGravar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void limparDados() {
        jtfRA.setText("");
        jtfAluno.setText("");
        jcCurso.setSelectedItem(null);
        jtfRG.setText("");
        jtfSaldo.setText("");
    }
    private void jtfRAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfRAKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carregaTabela();
            Busca.show();
            Busca.setLocationRelativeTo(this);//seta a posição da tela
        }
    }//GEN-LAST:event_jtfRAKeyPressed

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed

        if (Validador.vldStringMinMax(jtfRA.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe a RA!", "Erro", 0);
            jtfRA.requestFocus();
            return;
        }
        if (Validador.vldStringMinMax(jtfAluno.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe o nome do Aluno!", "Erro", 0);
            jtfAluno.requestFocus();
            return;
        }
        if (jcCurso.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Selecione um Curso!", "Erro", 0);
            jcCurso.requestFocus();
            return;
        }
        if (Validador.vldStringMinMax(jtfRG.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe o RG!", "Erro", 0);
            jtfRG.requestFocus();
            return;
        }
        try {
            if (aluno == null) {
                aluno = new Aluno();
            }
            aluno.setRaAluno(jtfRA.getText());
            aluno.setNmAluno(jtfAluno.getText());
            aluno.setCdCurso((Curso) jcCurso.getSelectedItem());//pega o que foi selecionado
            aluno.setRgAluno(jtfRG.getText());
            aluno.setVlSaldo(BigDecimal.ZERO);
            aluno.setDtCadastro(jdData.getDate());
            GenericDAO.getInstance().startTransaction();
            GenericDAO.getInstance().persist(aluno);
            GenericDAO.getInstance().commit();
            JOptionPane.showMessageDialog(null, "Aluno " + jtfRA.getText() + " cadastrado com Sucesso!");
            limparDados();
        } catch (Exception e) {
            GenericDAO.getInstance().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Aluno!" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jbGravarActionPerformed

    private void jbSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarActionPerformed
        try {
            //pegando a opção selecionada na grade
            aluno = (Aluno) tabaluno.getDadoAt(jtBusca.getSelectedRow());
            if (aluno != null) {
                jtfAluno.setText(aluno.getNmAluno());
                jtfRA.setText(aluno.getRaAluno());
                jtfRG.setText(aluno.getRgAluno());
                jcCurso.setSelectedItem(aluno.getCdCurso());
                jtfSaldo.setText(aluno.getVlSaldo().toString());
                jdData.setDate(aluno.getDtCadastro());
                Busca.dispose();
            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar a Empresa!" + "\n" + t.getMessage());
            limparDados();
        }
    }//GEN-LAST:event_jbSelecionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Busca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGravar;
    private javax.swing.JButton jbSelecionar;
    private javax.swing.JComboBox jcCurso;
    private com.toedter.calendar.JDateChooser jdData;
    private javax.swing.JLabel jlAluno;
    private javax.swing.JLabel jlCurso;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlRA;
    private javax.swing.JLabel jlRG;
    private javax.swing.JLabel jlSaldo;
    private javax.swing.JTable jtBusca;
    private javax.swing.JTextField jtfAluno;
    private javax.swing.JTextField jtfRA;
    private javax.swing.JTextField jtfRG;
    private javax.swing.JTextField jtfSaldo;
    // End of variables declaration//GEN-END:variables
}