package pkl55.kuesioner;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TabelLoop extends JTable {
    
    public TabelLoop() {
        
    }
    public void init(String ... colName){
        setModel(new DefaultTableModel(null, colName));
    }
    public void insert(String ... colName){
        ((DefaultTableModel)getModel()).addRow(colName);
    }
    
}
