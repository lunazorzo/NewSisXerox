package NewSisXerox.Tabelas;

import NewSisXerox.Classes.ModeloTabela;
import NewSisXerox.Entity.Aluno;

public class tabBuscaAlunoVenda extends ModeloTabela {

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (dados != null && rowIndex < dados.size()) {
            Aluno e = (Aluno) dados.get(rowIndex);
            if (columnIndex == 0) {
                return e.getNmAluno();
            }
            if (columnIndex == 1) {
                return e.getRaAluno();
            }            
            if (columnIndex == 2) {
                return e.getVlSaldo();
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
                return "Aluno";
            case 1:
                return "RA";
            case 2:
                return "Saldo";
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
