/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author M Arif Rosyanto
 */
public class CleanErrorRenderer extends DefaultTableCellRenderer {

    public CleanErrorRenderer() {

    }

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
        Boolean b = (Boolean) o;
        if (bln) {
            label.setBackground(new Color(45, 79, 123));
        } else {
            if (i % 2 == 0) {
                label.setBackground(new Color(125, 175, 204));
            } else {
                label.setBackground(new Color(228, 241, 254));
            }
        }
        
        if ((boolean) jtable.getValueAt(i, 3)) {
            if (b) {
                label.setText("CLEAN");
            } else {
                label.setForeground(Color.black);
                label.setBackground(Color.red);
                label.setText("ERROR");
            }
        }else{
            label.setText("-");
        }

        return label;

    }
}
