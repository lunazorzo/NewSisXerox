package NewSisXerox.Tabelas;

import NewSisXerox.Classes.ModeloTabela;
import NewSisXerox.Entity.Curso;

public class tabCurso extends ModeloTabela {

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (dados != null && rowIndex < dados.size()) {
            Curso e = (Curso) dados.get(rowIndex);
            if (columnIndex == 0) {
                return e.getNmCurso();
            }
            if (columnIndex == 1) {
                return e.getCdInstituicao();
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
                return "Curso";
            case 1:
                return "Instituição";
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
