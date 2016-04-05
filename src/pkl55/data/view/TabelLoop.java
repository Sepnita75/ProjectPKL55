package pkl55.data.view;

import pkl55.data.controller.Loop;
import pkl55.data.controller.VariabelMap;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TabelLoop extends JTable {

    JPopupMenu update;
    private Loop loop;
    private int start;
    private int end;

    public TabelLoop() {
    }

    public void init(String... colNames) {
        String[] colName = new String[colNames.length + 2];
        for (int i = 0; i < colNames.length; i++) {
            colName[i] = colNames[i];
        }
        colName[colNames.length] = "";
        colName[colNames.length + 1] = "";
        DefaultTableModel model = new DefaultTableModel(null, colName) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }

        };
        setModel(model);
        getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
//                int length = getModel().getColumnCount();
//                int row = getSelectedRow();
//                int pointer = start;
//                for (int i = 0; i < length; i++) {
//                    String cell = (String) ((DefaultTableModel) getModel()).getValueAt(row, i);
//                    View.get(pointer).setText(cell);
//                    pointer++;
//                }
//                loop.setActive(row);
            }
        });

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (getSelectedColumn() == (getColumnCount() - 1)) {
                    delete(getSelectedRow());
                } else if (getSelectedColumn() == (getColumnCount() - 2)) {
                    edit(getSelectedRow());
                }
            }

        });

        getColumnModel().getColumn(colNames.length).setPreferredWidth(40);
        getColumnModel().getColumn(colNames.length + 1).setPreferredWidth(60);

        setDefaultRenderer(Object.class, new CustomRenderer());
        getTableHeader().setBackground(new Color(238, 238, 238));
        getTableHeader().setReorderingAllowed(false);
    }

    public void delete(int pos) {
        ((DefaultTableModel) getModel()).removeRow(pos);
        loop.delete(pos);
    }

    public void edit(int pos) {
        String row[][] = loop.edit(pos);
        for(int i=0;i<row[0].length;i++){
            find(row[0][i]).setText(row[1][i]);
        }
        loop.setActive(pos);
        System.out.println("Active 1\t"+loop.getActive());
    }

    public TextFieldLoop find(String key) {
        TextFieldLoop res = null;
        for (int i = start; i <= end; i++) {
            TextFieldLoop a = ((TextFieldLoop)View.get(i));
            if(a.getVarName().equals(key)){
                res = a;
                break;
            }
        }
        return res;
    }

    public void insert(String... colNames) {
        System.out.println("Active 2\t"+loop.getActive());
        String[] colName = new String[colNames.length + 2];
        for (int i = 0; i < colNames.length; i++) {
            colName[i] = colNames[i];
        }
        colName[colNames.length] = "EDIT";
        colName[colNames.length + 1] = "DELETE";
        if (!loop.isActiveEnd()) {
            int length = getModel().getColumnCount();
            int row = loop.getActive();
            System.out.print("The valu:\t");
            for (int i = 0; i < length; i++) {
                System.out.print(colName[i] + " ;");
                ((DefaultTableModel) getModel()).setValueAt(colName[i], row, i);
            }
        } else {
            ((DefaultTableModel) getModel()).addRow(colName);
        }
    }

    /**
     * @return the loop
     */
    public Loop getLoop() {
        return loop;
    }

    /**
     * @param loop the loop to set
     */
    public void setLoop(String loopName) {
        this.loop = VariabelMap.getLoop(loopName);
        View.addTabelLoop(loopName, this);
    }

    /**
     * @return the start
     */
    public int getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * @return the end
     */
    public int getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(int end) {
        this.end = end;
    }
}

class CustomRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus,
            int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (column == table.getModel().getColumnCount() - 1) {
            c.setBackground(new java.awt.Color(207, 30, 24));
            c.setForeground(Color.WHITE);
        } else if (column == table.getModel().getColumnCount() - 2) {
            c.setBackground(new java.awt.Color(65, 131, 215));
            c.setForeground(Color.WHITE);
        } else {
            c.setBackground(Color.WHITE);
            c.setForeground(Color.BLACK);
        }

        return c;
    }
}
