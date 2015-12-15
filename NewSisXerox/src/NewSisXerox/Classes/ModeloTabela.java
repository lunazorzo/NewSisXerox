package NewSisXerox.Classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

public abstract class ModeloTabela implements TableModel {

    // Dados da Tabela

    protected ArrayList<Object> dados;

    public ModeloTabela() {
    }

    public void removeTableModelListener(TableModelListener l) {
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public int getRowCount() {
        if (dados != null) {
            return dados.size();
        }
        return 0;
    }

    public void ModeloDefaul(DefaultListModel d){}

    public void addTableModelListener(TableModelListener l) {
    }

    public List<Object> getDados() {
        return dados;
    }

    public void setDados(List<Object> dados) {
        this.dados = new ArrayList(dados);
    }

    public void adicionarEntidade(Object obj) {
        if (dados == null) {
            dados = new ArrayList<>();
        }
        dados.add(0, obj);
    }

    public void getDados(String string) {
        this.dados = new ArrayList(dados);
    }

    public Object getDadoAt(int pos) {
        if (dados != null && pos >= 0 && pos < dados.size()) {
            return dados.get(pos);
        }
        return null;
    }
   
}
