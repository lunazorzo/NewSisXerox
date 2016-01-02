/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Paines;

import NewSisXerox.Classes.UpperCaseField;
import NewSisXerox.Classes.Validador;
import NewSisXerox.DAO.GenericDAO;
import NewSisXerox.Entity.Marca;
import NewSisXerox.Entity.Modelo;
import NewSisXerox.Entity.Produto;
import NewSisXerox.Entity.Unidade;
import NewSisXerox.Tabelas.tabProduto;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Nobre Sistemas
 */
public final class JPCadProduto extends javax.swing.JPanel {

    /**
     * Creates new form JPCadProduto
     */
    private Produto produto;
    private final tabProduto tabproduto;

    public JPCadProduto() {
        initComponents();
        jtfDescricao.requestFocus();
        carregaComboMarca();
        carregaComboModelo();
        carregaUnidadeMedida();        
        jdData.setDate(new java.util.Date());//carrega a data atual
        tabproduto = new tabProduto();
        jtBusca.setModel(tabproduto);
    }

    public void carregaTabela() {
        try {
            List l = GenericDAO.getInstance().getList(Produto.class,
                    "FROM Produto nmProduto");  // consulta no banco
            tabproduto.setDados(l);
            jtBusca.updateUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os Produtos!" + "\n" + e.getMessage());
        }
    }

    public void carregaComboMarca() {
        jcMarca.removeAllItems();//removendo tds os itens da combo
        jcMarca.addItem(null);
        try {
            List<Marca> lstMarca = GenericDAO.getInstance().getList(Marca.class,
                    "FROM Marca nmMarca"); //tem q ta = o nome da classe criada
            for (Marca a : lstMarca) {
                jcMarca.addItem(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar as Marcas!" + "\n" + e.getMessage());
        }
    }

    public void carregaComboModelo() {
        jcModelo.removeAllItems();//removendo tds os itens da combo
        jcModelo.addItem(null);
        try {
            List<Modelo> lst = GenericDAO.getInstance().getList(Modelo.class,
                    "FROM Modelo nmModelo"); //tem q ta = o nome da classe criada
            for (Modelo a : lst) {
                jcModelo.addItem(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os Modelos!" + "\n" + e.getMessage());
        }
    }

    public void carregaUnidadeMedida() {
        jcUnidadeMedida.removeAllItems();//removendo tds os itens da combo
        jcUnidadeMedida.addItem(null);
        try {
            List<Unidade> lst = GenericDAO.getInstance().getList(Unidade.class,
                    "FROM Unidade nmUnidade"); //tem q ta = o nome da classe criada
            for (Unidade a : lst) {
                jcUnidadeMedida.addItem(a);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar as Unidades de Medida!" + "\n" + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Busca = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBusca = new javax.swing.JTable();
        jbSelecionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfDescricao = new UpperCaseField();
        jtfVlCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfVlVenda = new javax.swing.JTextField();
        Ativo = new javax.swing.JCheckBox();
        jbGravar = new javax.swing.JButton();
        jlData = new javax.swing.JLabel();
        jdData = new com.toedter.calendar.JDateChooser();
        jcMarca = new javax.swing.JComboBox();
        jcModelo = new javax.swing.JComboBox();
        jcUnidadeMedida = new javax.swing.JComboBox();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Descrição:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Marca:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Modelo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Unidade de Medida: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("VL Compra:");

        jtfDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfDescricaoKeyPressed(evt);
            }
        });

        jtfVlCompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("VL Venda:");

        jtfVlVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Ativo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ativo.setSelected(true);
        Ativo.setText("Ativo");
        Ativo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jbGravar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewSisXerox/Imagens/Salvar - 16.png"))); // NOI18N
        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        jlData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlData.setText("Data Cadastro:");

        jdData.setEnabled(false);

        jcMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcUnidadeMedida.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcUnidadeMedida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jcModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfDescricao))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jlData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbGravar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jdData, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfVlCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfVlVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ativo)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfVlCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtfVlVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGravar)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents
     public void limparDados() {
        jcMarca.setSelectedItem(null);
        jcModelo.setSelectedItem(null);
        jcUnidadeMedida.setSelectedItem(null);
        jtfDescricao.setText("");
        jtfVlCompra.setText("");
        jtfVlVenda.setText("");
    }

    private void jtfDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDescricaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            carregaTabela();
            Busca.show();
            Busca.setLocationRelativeTo(this);//seta a posição da tela 
        }
    }//GEN-LAST:event_jtfDescricaoKeyPressed

    private void jbSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarActionPerformed
        try {
            //pegando a opção selecionada na grade
            produto = (Produto) tabproduto.getDadoAt(jtBusca.getSelectedRow());
            if (produto != null) {
                jtfDescricao.setText(produto.getNmProduto());
                jcMarca.setSelectedItem(produto.getCdMarca());
                jcModelo.setSelectedItem(produto.getCdModelo());
                jcUnidadeMedida.setSelectedItem(produto.getCdUnidade());
                jtfVlCompra.setText(produto.getVlCompra().toString().replace(".", ","));
                jtfVlVenda.setText(produto.getVlVenda().toString().replace(".", ","));
                jdData.setDate(produto.getDtCadastro());
                Busca.dispose();
            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar Produto!" + "\n" + t.getMessage());
            limparDados();
        }
    }//GEN-LAST:event_jbSelecionarActionPerformed

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed
        Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/NewSisXerox/Imagens/Warning-48.png")));
        if (Validador.vldStringMinMax(jtfDescricao.getText(), 3, 50) == false) {
            JOptionPane.showMessageDialog(null, "Informe a descrição do Produto!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, figura);
            jtfDescricao.requestFocus();
            return;
        }
        if (jcMarca.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione a Forma de Pagamento !", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, figura);
            jcMarca.requestFocus();
            return;
        }
        if (jcModelo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione o Modelo!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, figura);
            jcModelo.requestFocus();
            return;
        }
        if (jcUnidadeMedida.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione a Unidade de Medida !", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, figura);
            jcUnidadeMedida.requestFocus();
            return;
        }
        if (Validador.vldStringMinMax(jtfVlCompra.getText(), 2, 50) == false) {
            JOptionPane.showMessageDialog(null, "Informe o Valor da Compra do Produto!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, figura);
            jtfVlCompra.requestFocus();
            return;
        }
        if (Validador.vldStringMinMax(jtfVlVenda.getText(), 2, 50) == false) {
            JOptionPane.showMessageDialog(null, "Informe o Valor da Venda do Produto!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE, figura);
            jtfVlVenda.requestFocus();
            return;
        }
        try {
            if (produto == null) {
                produto = new Produto();
            }
            produto.setNmProduto(jtfDescricao.getText());
            produto.setCdMarca((Marca) jcMarca.getSelectedItem());
            produto.setCdModelo((Modelo) jcModelo.getSelectedItem());
            produto.setCdUnidade((Unidade) jcUnidadeMedida.getSelectedItem());
            BigDecimal valor1 = new BigDecimal(jtfVlCompra.getText().replaceAll(",", "."));
            BigDecimal valor2 = new BigDecimal(jtfVlVenda.getText().replaceAll(",", "."));
            produto.setVlCompra(valor1);
            produto.setVlVenda(valor2);
            produto.setDtCadastro(jdData.getDate());
            produto.setFgAtivo(Ativo.isSelected());
            GenericDAO.getInstance().persist(produto);
            GenericDAO.getInstance().startTransaction();
            GenericDAO.getInstance().commit();
            JOptionPane.showMessageDialog(null, "Produto " + jtfDescricao.getText() + " cadastrado com Sucesso!");
            limparDados();
            jtfDescricao.requestFocus();
        } catch (Exception e) {
            GenericDAO.getInstance().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Produto!" + "\n" + e.getMessage());
        }
    }//GEN-LAST:event_jbGravarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Ativo;
    private javax.swing.JDialog Busca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGravar;
    private javax.swing.JButton jbSelecionar;
    private javax.swing.JComboBox jcMarca;
    private javax.swing.JComboBox jcModelo;
    private javax.swing.JComboBox jcUnidadeMedida;
    private com.toedter.calendar.JDateChooser jdData;
    private javax.swing.JLabel jlData;
    private javax.swing.JTable jtBusca;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfVlCompra;
    private javax.swing.JTextField jtfVlVenda;
    // End of variables declaration//GEN-END:variables
}
