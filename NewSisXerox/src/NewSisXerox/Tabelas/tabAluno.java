package NewSisXerox.Tabelas;

import NewSisXerox.Classes.ModeloTabela;
import NewSisXerox.Entity.Aluno;

public class tabAluno extends ModeloTabela {

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (dados != null && rowIndex < dados.size()) {
            Aluno e = (Aluno) dados.get(rowIndex);
            if (columnIndex == 0) {
                return e.getRaAluno();
            }
            if (columnIndex == 1) {
                return e.getNmAluno();
            }
            if (columnIndex == 2) {
                return e.getCdCurso();
            }
            if (columnIndex == 3) {
                return e.getRgAluno();
            }
            if (columnIndex == 4) {
                return e.getVlSaldo();
            }
            if (columnIndex == 5) {
                return e.getDtCadastro();
            }
        }
        return null;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "RA";
            case 1:
                return "Aluno";
            case 2:
                return "Curso";
            case 3:
                return "RG";
            case 4:
                return "Saldo";
            case 5:
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
