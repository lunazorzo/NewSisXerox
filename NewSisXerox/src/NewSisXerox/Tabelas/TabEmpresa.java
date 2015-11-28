/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Tabelas;

import NewSisXerox.Classes.ModeloTabela;
import NewSisXerox.Entity.Empresa;

/**
 *
 * @author Allan
 */
public class TabEmpresa extends ModeloTabela {

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (dados != null && rowIndex < dados.size()) {
            Empresa e = (Empresa) dados.get(rowIndex);
            if (columnIndex == 0) {
                return e.getNmEmpresa();
            }
            if (columnIndex == 1) {
                return e.getEndereco();
            }
            if (columnIndex == 2) {
                return e.getBairro();
            }
            if (columnIndex == 3) {
                return e.getCep();
            }
            if (columnIndex == 4) {
                return e.getCidade();
            }
            if (columnIndex == 5) {
                return e.getCdEstado();
            }
            if (columnIndex == 6) {
                return e.getNumTelefone();
            }
            if (columnIndex == 7) {
                return e.getEmail();
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
                return "Empresa";
            case 1:
                return "Endereço";
            case 2:
                return "Bairro";
            case 3:
                return "CEP";
            case 4:
                return "Cidade";
            case 5:
                return "Estado";
            case 6:
                return "Telefone";
            case 7:
                return "Email";           
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
