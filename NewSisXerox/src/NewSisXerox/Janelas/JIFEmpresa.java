package NewSisXerox.Janelas;

import NewSisXerox.Classes.Validador;
import NewSisXerox.Classes.UpperCaseField;
import NewSisXerox.DAO.GenericDAO;
import NewSisXerox.Entity.Empresa;
import NewSisXerox.Entity.Estado;
import NewSisXerox.Tabelas.tabEmpresa;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Allan
 */
public class JIFEmpresa extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFEmpresa
     */
    private Empresa empresa;
    private tabEmpresa tabempresa;

    public JIFEmpresa() {
        initComponents();
        carregaCombo();
        tabempresa = new tabEmpresa();
        jtBusca.setModel(tabempresa);

    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public void carregaCombo() {
        jcEstado.removeAllItems();//removendo tds os itens da combo
        jcEstado.addItem(null);
        try {
            List<Estado> lstEstado = GenericDAO.getInstance().getList(Estado.class,
                    "SELECT f FROM Estado f order by f.sglEstado"); //tem q ta = o nome da classe criada
            for (Estado a : lstEstado) {
                jcEstado.addItem(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar Estado!" + "\n" + e.getMessage());
        }
    }

    public void carregaTabela() {
        try {
            List l = GenericDAO.getInstance().getList(Empresa.class,
                    "SELECT i FROM Empresa i order by i.nmEmpresa");  // consulta no banco
            tabempresa.setDados(l);
            jtBusca.updateUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar a grade Empresa!" + e.getMessage());
        }
    }

    public void limparDados() {
        jtfEmpresa.setText("");
        jtfEndereco.setText("");
        jtfBairro.setText("");
        jtfCEP.setText("");
        jtfCidade.setText("");
        jcEstado.setSelectedItem(null);
        jtfTelefone1.setText("");
        jtfEmail.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Busca = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBusca = new javax.swing.JTable();
        jbSelecionar = new javax.swing.JButton();
        Fantasia = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        Bairro = new javax.swing.JLabel();
        CEP = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        jtfTelefone1 = new javax.swing.JFormattedTextField();
        jtfEmail = new UpperCaseField();
        jtfCEP = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JComboBox();
        jbGravar = new javax.swing.JButton();
        jtfBairro = new UpperCaseField();
        jtfEndereco = new UpperCaseField();
        jtfEmpresa = new UpperCaseField();
        Bairro1 = new javax.swing.JLabel();
        jtfCidade = new UpperCaseField();

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
        setTitle("Cadastro Empresa");
        setPreferredSize(new java.awt.Dimension(399, 230));

        Fantasia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Fantasia.setText("Fantasia:");

        Endereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Endereco.setText("Endereço:");

        Bairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bairro.setText("Bairro:");

        CEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CEP.setText("CEP:");

        Email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Email.setText("E-mail:");

        Telefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Telefone.setText("Telefone:");

        try {
            jtfTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtfCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Estado:");

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UF" }));

        jbGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/Salvar - 16.png"))); // NOI18N
        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        jtfEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfEmpresaKeyPressed(evt);
            }
        });

        Bairro1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bairro1.setText("Cidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Fantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jtfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Telefone)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(jbGravar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jtfTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Endereco)
                            .addComponent(Bairro)
                            .addComponent(Bairro1)
                            .addComponent(Email))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Fantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bairro1)
                            .addComponent(jLabel7))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jbGravar))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarActionPerformed
        try {
            //pegando a opção selecionada na grade
            empresa = (Empresa) tabempresa.getDadoAt(jtBusca.getSelectedRow());
            if (empresa != null) {
                jtfEmpresa.setText(empresa.getNmEmpresa());
                jtfEndereco.setText(empresa.getEndereco());
                jtfBairro.setText(empresa.getBairro());
                jtfCEP.setText(empresa.getCep());
                jtfCidade.setText(empresa.getCidade());
                jcEstado.setSelectedItem(empresa.getCdEstado());
                jtfTelefone1.setText(empresa.getNumTelefone());
                jtfEmail.setText(empresa.getEmail());
                Busca.dispose();
            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar a Empresa!" + "\n" + t.getMessage());
            limparDados();
        }
    }//GEN-LAST:event_jbSelecionarActionPerformed

    private void jtfEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEmpresaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carregaTabela();
            Busca.show();
            Busca.setLocationRelativeTo(this);//seta a posição da tela 
        }
    }//GEN-LAST:event_jtfEmpresaKeyPressed

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed
        if (Validador.vldStringMinMax(jtfEmpresa.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe a descrição da Fantasia!", "Erro", 0);
            jtfEmpresa.requestFocus();
            return;
        }
        if (Validador.vldStringMinMax(jtfEndereco.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe a descrição do Endereço!", "Erro", 0);
            jtfEndereco.requestFocus();
            return;
        }
        if (Validador.vldStringMinMax(jtfBairro.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe a descrição do Bairro!", "Erro", 0);
            jtfBairro.requestFocus();
            return;
        }
        if (Validador.vldCep(jtfCEP.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Informe o CEP!", "Erro", 0);
            jtfCEP.requestFocus();
            return;
        }
        if (Validador.vldStringMinMax(jtfCidade.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(this, "Informe a Cidade!", "Erro", 0);
            jtfCidade.requestFocus();
            return;
        }
        if (jcEstado.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Selecione um Estado!", "Erro", 0);
            jcEstado.requestFocus();
            return;
        }
        if (Validador.isEmailValid(jtfEmail.getText()) == false) {
            JOptionPane.showMessageDialog(this, "E-mail inválido!", "Erro", 0);
            jtfEmail.requestFocus();
            return;
        }
        if (Validador.vldFone(jtfTelefone1.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Telefone inválido!", "Erro", 0);
            jtfTelefone1.requestFocus();
            return;
        }
        try {
            if (empresa == null) {
                empresa = new Empresa();
            }
            empresa.setNmEmpresa(jtfEmpresa.getText());
            empresa.setEndereco(jtfEndereco.getText());
            empresa.setBairro(jtfBairro.getText());
            empresa.setCep(jtfCEP.getText());
            empresa.setCidade(jtfCidade.getText());
            empresa.setCdEstado((Estado) jcEstado.getSelectedItem());//pega o que foi selecionado
            empresa.setNumTelefone(jtfTelefone1.getText());
            empresa.setEmail(jtfEmail.getText());
            GenericDAO.getInstance().startTransaction();
            GenericDAO.getInstance().persist(empresa);
            GenericDAO.getInstance().commit();
            JOptionPane.showMessageDialog(null, "Empresa " + jtfEmpresa.getText() + " gravada com Sucesso!");
            limparDados();
        } catch (Exception e) {
            GenericDAO.getInstance().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao Gravar Empresa!" + "/n" + e.getMessage());
        }
    }//GEN-LAST:event_jbGravarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JLabel Bairro1;
    private javax.swing.JDialog Busca;
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Fantasia;
    private javax.swing.JLabel Telefone;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGravar;
    private javax.swing.JButton jbSelecionar;
    private javax.swing.JComboBox jcEstado;
    private javax.swing.JTable jtBusca;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JFormattedTextField jtfCEP;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfEmpresa;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JFormattedTextField jtfTelefone1;
    // End of variables declaration//GEN-END:variables
}
