package pkl55.panelcomponent;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableStatusColorRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {

        //Cells are by default rendered as a JLabel.
        JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

        //Get the status for the current row.
        TableKuesModel tableModel = (TableKuesModel) table.getModel();
        if (tableModel.getValueAt(row, col) == "Sudah dientry") {
            l.setBackground(Color.GREEN);
        } else {
            l.setBackground(Color.RED);
        }
        //Return the JLabel which renders the cell.
        return l;
    }
}
