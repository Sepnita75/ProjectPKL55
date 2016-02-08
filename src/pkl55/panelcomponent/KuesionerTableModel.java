/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.panelcomponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Habib
 */
public class KuesionerTableModel extends AbstractTableModel {

    private Vector<String> column;
    private List<B1> row;

    public KuesionerTableModel() {
        super();
        column = new Vector<>();
        column.add("NKS");
        column.add("Responden");
        column.add("Flag");
        column.add("Status Entry");
        column.add("Status Kirim");
        row = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return row.size();
    }

    @Override
    public String getColumnName(int column) {
        return this.column.get(column);
    }
    @Override
    public int getColumnCount() {
        return 4;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Object toReturn = null;
        return toReturn;
    }
    
}
