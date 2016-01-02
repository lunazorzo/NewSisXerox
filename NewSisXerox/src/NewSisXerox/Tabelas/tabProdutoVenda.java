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
public class tabProdutoVenda extends ModeloTabela {

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (dados != null && rowIndex < dados.size()) {
            Produto e = (Produto) dados.get(rowIndex);
            if (columnIndex == 0) {
                return e.getNmProduto();
            }
            if (columnIndex == 1) {
                return e.getVlVenda();
            }
        }
        return null;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Descrição";
            case 1:
                return "Vl Venda";
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
