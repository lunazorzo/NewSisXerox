/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Janelas;

import NewSisXerox.Classes.Validador;
import NewSisXerox.DAO.GenericDAO;
import NewSisXerox.Entity.Aluno;
import NewSisXerox.Entity.Formpgto;
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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public final class JIFRecarga extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFRecarga1
     */
    private Recarga recarga;
    private Aluno aluno;
    private final tabRecarga tabrecarga;

    public JIFRecarga() {
        initComponents();
        carregaComboUsuario();
        carregaComboFormaPgto();
        jtfAluno.requestFocus();
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
        jcFgtoPagamento.setSelectedItem(null);
        jcUsuario.setSelectedItem(null);
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
            JOptionPane.showMessageDialog(null, "Erro ao carregar Usuários!" + "\n" + e.getMessage());
        }
    }

    public void carregaComboFormaPgto() {
        jcFgtoPagamento.removeAllItems();//removendo tds os itens da combo
        jcFgtoPagamento.addItem(null);
        try {
            List<Formpgto> lstist = GenericDAO.getInstance().getList(Formpgto.class,
                    "FROM Formpgto c order by c.nmFormpgto");
            for (Formpgto a : lstist) {
                jcFgtoPagamento.addItem(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar as Formas de Pagamento!" + "\n" + e.getMessage());
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
        jcFgtoPagamento = new javax.swing.JComboBox();
        jbGravarRecarga = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcUsuario = new javax.swing.JComboBox();

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
        setTitle("Recarga");
        setPreferredSize(new java.awt.Dimension(425, 256));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Aluno:");

        jtfAluno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfAlunoKeyPressed(evt);
            }
        });

        jlSaldoAtual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlSaldoAtual.setText("Saldo Atua R$:");

        jtfSaldoAtual.setEditable(false);
        jtfSaldoAtual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfSaldoAtual.setOpaque(false);

        jlDTRecarga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlDTRecarga.setText("Data Recarga:");

        jdDTRecarga.setEnabled(false);

        jlRecarga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlRecarga.setText("Recarga R$:");

        jtfRecarga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jlSaldoFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlSaldoFinal.setText("Saldo Final R$:");

        jtfSaldoFinal.setEditable(false);
        jtfSaldoFinal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfSaldoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSaldoFinalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Fgto Pagamento:");

        jcFgtoPagamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcFgtoPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbGravarRecarga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbGravarRecarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/Salvar - 16.png"))); // NOI18N
        jbGravarRecarga.setText("Gravar");
        jbGravarRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarRecargaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Usuario Sistema:");

        jcUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14))
                                .addComponent(jbGravarRecarga))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlSaldoFinal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfSaldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jlRecarga)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtfRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jlSaldoAtual)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtfSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlDTRecarga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdDTRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(jcUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(7, 7, 7)
                                .addComponent(jcFgtoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSaldoAtual)
                            .addComponent(jtfSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDTRecarga)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jdDTRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlRecarga)
                    .addComponent(jtfRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSaldoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSaldoFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jcFgtoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jcUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbGravarRecarga)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//class textFocusListener implements FocusListener {
//
//        public void focusGained(FocusEvent e) {
//            jtfRecarga.setBackground(Color.red);
//        }
//
//        public void focusLost(FocusEvent e) {
//            jtfRecarga.setBackground(Color.white);
//        }
//    }
//
//    class jcFocusListener implements FocusListener {
//        @Override
//        public void focusGained(FocusEvent e) {  
//            jcFgtoPagamento.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 99, 71)));
//        }
//        @Override
//        public void focusLost(FocusEvent e) {             
//            jcFgtoPagamento.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
//        }
//    }


    private void jbGravarRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarRecargaActionPerformed

        Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Warning-48.png")));
        if (Validador.vldStringMinMax(jtfAluno.getText(), 1, 50) == false) {
            //http://www.guj.com.br/t/icone-em-joptionpane/54164/3               
            JOptionPane.showMessageDialog(this, "Informe o aluno para efetuar a recarga!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, figura);
            jtfAluno.requestFocus();
            //jtfAluno.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 99, 71)));
            return;
        }
        if (Validador.vldStringMinMax(jtfRecarga.getText(), 1, 50) == false) {
            JOptionPane.showMessageDialog(null, "Informe o valor da recarga!", "Alerta", JOptionPane.PLAIN_MESSAGE, figura);
            jtfRecarga.requestFocus();
//            jtfRecarga.addFocusListener(new textFocusListener());//inicia a opção de alteração do foco do jtfrecarga
            return;
        }
        if (jcFgtoPagamento.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione a Forma de Pagamento !", "Alerta", JOptionPane.PLAIN_MESSAGE, figura);
            jcFgtoPagamento.requestFocus();
//            jcFgtoPagamento.addFocusListener(new jcFocusListener());//inicia a opção de

            return;
        }
        if (jcUsuario.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione o usuário!", "Alerta", JOptionPane.PLAIN_MESSAGE, figura);
            jcUsuario.requestFocus();
//            jcUsuario.addFocusListener(new jcFocusListener());//inicia a opção de
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
                recarga.setCdFormpgto((Formpgto) jcFgtoPagamento.getSelectedItem());
                recarga.setCdUsuario((Usuario) jcUsuario.getSelectedItem());
                GenericDAO.getInstance().startTransaction();
                GenericDAO.getInstance().persist(recarga);
                GenericDAO.getInstance().commit();
                JOptionPane.showMessageDialog(null, "A recarga de " + jtfSaldoFinal.getText() + " para o aluno(a) " + jtfAluno.getText() + ", foi realizada com Sucesso!");
                limparDados();
                jtfAluno.requestFocus();
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

    private void jtfSaldoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSaldoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSaldoFinalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Busca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGravarRecarga;
    private javax.swing.JButton jbSelecionar;
    private javax.swing.JComboBox jcFgtoPagamento;
    private javax.swing.JComboBox jcUsuario;
    private com.toedter.calendar.JDateChooser jdDTRecarga;
    private javax.swing.JLabel jlDTRecarga;
    private javax.swing.JLabel jlRecarga;
    private javax.swing.JLabel jlSaldoAtual;
    private javax.swing.JLabel jlSaldoFinal;
    private javax.swing.JTable jtBusca;
    private javax.swing.JTextField jtfAluno;
    private javax.swing.JTextField jtfRecarga;
    private javax.swing.JTextField jtfSaldoAtual;
    private javax.swing.JTextField jtfSaldoFinal;
    // End of variables declaration//GEN-END:variables
}
