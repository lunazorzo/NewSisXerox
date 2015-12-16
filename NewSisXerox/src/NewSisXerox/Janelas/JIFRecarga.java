/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Janelas;

import NewSisXerox.Classes.Validador;
import NewSisXerox.DAO.GenericDAO;
import NewSisXerox.Entity.Aluno;
import NewSisXerox.Entity.Recarga;
import NewSisXerox.Entity.Usuario;
import NewSisXerox.Tabelas.tabRecarga;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public class JIFRecarga extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFRecarga1
     */
    private Recarga recarga;
    private Aluno aluno;
    private tabRecarga tabrecarga;

    public JIFRecarga() {
        initComponents();
        carregaComboUsuario();
        tabrecarga = new tabRecarga();
        jtBusca.setModel(tabrecarga);
        jdDTRecarga.setDate(new java.util.Date());//carrega a data atual

    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void limparDados() {
        jtfAluno.setText("");
        jtfRecarga.setText("");
        jtfSaldoAtual.setText("");
        jtfSaldoFinal.setText("");
    }

    public void carregaTabela() {
        try {
            List l = GenericDAO.getInstance().getList(Aluno.class,
                    "FROM Aluno i order by i.raAluno");  // consulta no banco
            tabrecarga.setDados(l);
            jtBusca.updateUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar a tabela de Alunos!" + e.getMessage());
        }
    }

    public void carregaComboUsuario() {
        jcUsuario.removeAllItems();//removendo tds os itens da combo
        jcUsuario.addItem(null);
        try {
            List<Usuario> lstist = GenericDAO.getInstance().getList(Usuario.class,
                    "FROM Usuario c order by c.usuario"); //tem q ta = o nome da classe criada
            for (Usuario a : lstist) {
                jcUsuario.addItem(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar Curso!" + "\n" + e.getMessage());
        }
    }

    private BigDecimal casasDecimais(int casas, BigDecimal valor) {
        //http://www.guj.com.br/java/52052-o-que-faco-para-fomatar-um-bigdecimal-com-apenas-duas-casas-decimais-
        String quantCasas = "%." + casas + "f", textoValor = "0";
        try {
            textoValor = String.format(Locale.getDefault(), quantCasas, valor);
        } catch (java.lang.IllegalArgumentException e) {
            // Quando os digitos com 2 casas decimais forem Zeros, exemplo: 0.000001233888.  
            // Nao existe valor 0,00 , logo entra na java.lang.IllegalArgumentException.  
            if (e.getMessage().equals("Digits < 0")) {
                textoValor = "0";
            }
            System.out.println(e.getMessage());
        }
        return new BigDecimal(textoValor.replace(",", "."));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Busca = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBusca = new javax.swing.JTable();
        jbSelecionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfAluno = new javax.swing.JTextField();
        jlSaldoAtual = new javax.swing.JLabel();
        jtfSaldoAtual = new javax.swing.JTextField();
        jlDTRecarga = new javax.swing.JLabel();
        jdDTRecarga = new com.toedter.calendar.JDateChooser();
        jlRecarga = new javax.swing.JLabel();
        jtfRecarga = new javax.swing.JTextField();
        jlSaldoFinal = new javax.swing.JLabel();
        jtfSaldoFinal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtFgtoPagamento = new javax.swing.JComboBox();
        jbGravarRecarga = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcUsuario = new javax.swing.JComboBox();

        Busca.setTitle("Busca Aluno");
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
                .addGap(0, 14, Short.MAX_VALUE))
        );

        setClosable(true);
        setTitle("Recarga");

        jLabel1.setText("Aluno:");

        jtfAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfAlunoKeyPressed(evt);
            }
        });

        jlSaldoAtual.setText("Saldo Atua R$l:");

        jtfSaldoAtual.setOpaque(false);

        jlDTRecarga.setText("Data Recarga:");

        jdDTRecarga.setEnabled(false);

        jlRecarga.setText("Recarga R$:");

        jlSaldoFinal.setText("Saldo Final R$:");

        jtfSaldoFinal.setOpaque(false);

        jLabel2.setText("Fgto Pagamento:");

        jtFgtoPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbGravarRecarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/Salvar - 16.png"))); // NOI18N
        jbGravarRecarga.setText("Gravar");
        jbGravarRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarRecargaActionPerformed(evt);
            }
        });

        jLabel3.setText("Usuario Sistema:");

        jcUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlSaldoAtual)
                        .addGap(18, 18, 18)
                        .addComponent(jtfSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlDTRecarga)
                        .addGap(4, 4, 4)
                        .addComponent(jdDTRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlRecarga)
                        .addGap(30, 30, 30)
                        .addComponent(jtfRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlSaldoFinal)
                        .addGap(19, 19, 19)
                        .addComponent(jtfSaldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(10, 10, 10)
                            .addComponent(jcUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(7, 7, 7)
                                .addComponent(jtFgtoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jbGravarRecarga)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(jtfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSaldoAtual)
                            .addComponent(jtfSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jlDTRecarga))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jdDTRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlRecarga))
                    .addComponent(jtfRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlSaldoFinal))
                    .addComponent(jtfSaldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jtFgtoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jcUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jbGravarRecarga))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGravarRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarRecargaActionPerformed
        if (Validador.vldStringMinMax(jtfRecarga.getText(), 1, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe o valor da recarga!", "Erro", 0);
            jtfRecarga.requestFocus();
            return;
        }
        if (jtFgtoPagamento.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Selecione o tipo !", "Erro", 0);
            jtFgtoPagamento.requestFocus();
            return;
        }
        if (jcUsuario.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Selecione o usuário!", "Erro", 0);
            jcUsuario.requestFocus();
            return;
        }
        try {
            if (recarga == null) {
                recarga = new Recarga();
                //Somando os valores http://www.guj.com.br/java/125547-somar-2-jtextfield-e-mostra-em-um-3-jtextfield
                recarga.setCdAluno(aluno);
                recarga.setDtRecarga(jdDTRecarga.getDate());
                BigDecimal valor1 = new BigDecimal(jtfSaldoAtual.getText().replaceAll(",", "."));
                BigDecimal valor2 = new BigDecimal(jtfRecarga.getText().replaceAll(",", "."));
                BigDecimal bigResult = casasDecimais(2, valor1.add(valor2, MathContext.DECIMAL32));
                jtfSaldoFinal.setText(String.valueOf(bigResult).replace(".", ","));
                recarga.setVlRecarga(bigResult);
                recarga.setCdUsuario((Usuario) jcUsuario.getSelectedItem());
                GenericDAO.getInstance().startTransaction();
                GenericDAO.getInstance().persist(recarga);
                GenericDAO.getInstance().commit();
                JOptionPane.showMessageDialog(null, "A regarga de " + jtfSaldoFinal.getText() + " para o aluno(a) " + jtfAluno.getText() + ", foi realizada com Sucesso!");
                limparDados();
            }
        } catch (NumberFormatException | HeadlessException e) {
            GenericDAO.getInstance().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao efetuar a Regarga!" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jbGravarRecargaActionPerformed

    private void jbSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarActionPerformed
        try {
            //pegando a opção selecionada na grade
            aluno = (Aluno) tabrecarga.getDadoAt(jtBusca.getSelectedRow());
            if (aluno != null) {
                jtfAluno.setText(aluno.getNmAluno());
                jtfSaldoAtual.setText(aluno.getVlSaldo().toString());
                Busca.dispose();
            }
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar o Aluno!" + "\n" + t.getMessage());
        }
    }//GEN-LAST:event_jbSelecionarActionPerformed

    private void jtfAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAlunoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carregaTabela();
            Busca.show();
            Busca.setLocationRelativeTo(this);//seta a posição da tela 
        }
    }//GEN-LAST:event_jtfAlunoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Busca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGravarRecarga;
    private javax.swing.JButton jbSelecionar;
    private javax.swing.JComboBox jcUsuario;
    private com.toedter.calendar.JDateChooser jdDTRecarga;
    private javax.swing.JLabel jlDTRecarga;
    private javax.swing.JLabel jlRecarga;
    private javax.swing.JLabel jlSaldoAtual;
    private javax.swing.JLabel jlSaldoFinal;
    private javax.swing.JTable jtBusca;
    private javax.swing.JComboBox jtFgtoPagamento;
    private javax.swing.JTextField jtfAluno;
    private javax.swing.JTextField jtfRecarga;
    private javax.swing.JTextField jtfSaldoAtual;
    private javax.swing.JTextField jtfSaldoFinal;
    // End of variables declaration//GEN-END:variables
}
