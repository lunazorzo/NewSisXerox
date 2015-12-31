/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Tabelas;

import NewSisXerox.Classes.ModeloTabela;
import NewSisXerox.Entity.Produto;

/**
 *
 * @author Nobre Sistemas
 */
public class tabProduto extends ModeloTabela {

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (dados != null && rowIndex < dados.size()) {
            Produto e = (Produto) dados.get(rowIndex);
            if (columnIndex == 0) {
                return e.getNmProduto();
            }
            if (columnIndex == 1) {
                return e.getCdMarca();
            }
            if (columnIndex == 2) {
                return e.getCdModelo();
            }
            if (columnIndex == 3) {
                return e.getCdUnidade();
            }
            if (columnIndex == 4) {
                return e.getFgAtivo();
            }
            if (columnIndex == 5) {
                return e.getVlCompra();
            }
            if (columnIndex == 6) {
                return e.getVlVenda();
            }
            if (columnIndex == 7) {
                return e.getDtCadastro();
            }
        }
        return null;
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Descrição";
            case 1:
                return "Marca";
            case 2:
                return "Modelo";
            case 3:
                return "Unidade de Medida";
            case 4:
                return "Produto Ativo";
            case 5:
                return "Vl Compra";
            case 6:
                return "Vl Venda";
            case 7:
                return "Data Cadastro";
            default:
                return "";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return new String().getClass();
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }
}
