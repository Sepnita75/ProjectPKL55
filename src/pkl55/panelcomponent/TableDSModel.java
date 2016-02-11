package pkl55.panelcomponent;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

public class TableDSModel extends AbstractTableModel {

    private Vector<String> column;
    private String data[][];

    TableDSModel() {
        column = new Vector<>();
        column.add("No.");
        column.add("Kecamatan");
        column.add("Desa/Kelurahan");
        column.add("NKS");
        data = null;
    }
    
    public void update(String data[][]) {
        this.data = data;
        fireTableDataChanged();
    }

    public void addElement(String data[][]) {
        this.data = data;
//        list.add(e);
        fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int column) {
        return this.column.get(column);
    }

}