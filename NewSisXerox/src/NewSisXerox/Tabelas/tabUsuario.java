/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Tabelas;

import NewSisXerox.Classes.ModeloTabela;
import NewSisXerox.Entity.Usuario;

/**
 *
 * @author Allan
 */
public class tabUsuario extends ModeloTabela {

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (dados != null && rowIndex < dados.size()) {
            Usuario e = (Usuario) dados.get(rowIndex);
            if (columnIndex == 0) {
                return e.getUsuario();
            }
            if (columnIndex == 1) {
                return e.getSenha();
            }
            if (columnIndex == 2) {
                return e.getFgAtivo();
            }
        }
        return null;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Nome/Usuário";
            case 1:
                return "Senha";
            case 2:
                return "Usário Ativo/Inativo";
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
