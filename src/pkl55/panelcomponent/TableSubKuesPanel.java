/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.panelcomponent;

import java.awt.Color;
import javax.swing.ListSelectionModel;

/**
 *
 * @author _muh.shamad
 */
public class TableSubKuesPanel extends javax.swing.JPanel {

    /**
     * Creates new form TableSubKuesPanel
     */
    
    private TableKuesModel tableModel; 
            
    public TableSubKuesPanel() {
        initComponents();
        inisialisasi();
        
        String[][] data = new String[5][4];
        data[0][0]="7862814628142";
        data[0][1]="Pak Jarwo";
        data[0][2]="clean";
        data[0][3]="Sudah dientry";
        
        data[1][0]="7862345328142";
        data[1][1]="Bu Ani";
        data[1][2]="unclean";
        data[1][3]="Belum dientry";
        
        data[2][0]="7862453628142";
        data[2][1]="Pak Udin";
        data[2][2]="clean";
        data[2][3]="Sudah dientry";
        
        data[3][0]="78625435354142";
        data[3][1]="Pak Imin";
        data[3][2]="clean";
        data[3][3]="Sudah dientry";
        
        data[4][0]="5432814628142";
        data[4][1]="Bu Inem";
        data[4][2]="unclean";
        data[4][3]="Belum dientry";
        ((TableKuesModel) table1.getModel()).update(data);
    }    
    
    private void inisialisasi() {
        tableModel = new TableKuesModel();
        table1.setModel(tableModel);
        table1.setRowSelectionAllowed(true);
        table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        table1.getColumnModel().getColumn(2).setCellRenderer(new CleanErrorRenderer());
//        table1.getColumnModel().getColumn(3).setCellRenderer(new StatusEntryRenderer());
//        sorter = new TableRowSorter<>(tableModel);
//        table1.setRowSorter(sorter);
//        table1.getColumnModel().getColumn(2).setWidth(5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        comboKab = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        comboProv = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        comboKec = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        comboDesa = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboNBS = new javax.swing.JComboBox();
        textFilter = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(700, 504));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Provinsi");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 14, 162, -1));

        comboKab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboKab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboKab.setPreferredSize(new java.awt.Dimension(329, 29));
        add(comboKab, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 48, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Kabupaten");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 50, 162, 24));

        comboProv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboProv.setPreferredSize(new java.awt.Dimension(329, 29));
        add(comboProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 11, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Kecamatan");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 88, 162, -1));

        comboKec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboKec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboKec.setPreferredSize(new java.awt.Dimension(329, 29));
        add(comboKec, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 85, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Desa");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 123, 162, -1));

        comboDesa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboDesa.setPreferredSize(new java.awt.Dimension(329, 29));
        add(comboDesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("NBS");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 160, 162, -1));

        comboNBS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboNBS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboNBS.setPreferredSize(new java.awt.Dimension(329, 29));
        add(comboNBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 157, -1, -1));

        textFilter.setForeground(new java.awt.Color(204, 204, 204));
        textFilter.setText("Ketikkan NKS di sini...");
        textFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFilter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFilterFocusLost(evt);
            }
        });
        textFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFilterMouseClicked(evt);
            }
        });
        add(textFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 192, 189, -1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 690, -1));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void textFilterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFilterFocusLost
        // TODO add your handling code here:
        String value = textFilter.getText();
        if (value.equalsIgnoreCase("") || value.equalsIgnoreCase("Ketikkan NKS di sini...")) {
            textFilter.setForeground(Color.DARK_GRAY);
            textFilter.setText("Ketikkan NKS di sini...");
        }
    }//GEN-LAST:event_textFilterFocusLost

    private void textFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFilterMouseClicked
        // TODO add your handling code here:
        textFilter.setText("");
        textFilter.setForeground(Color.black);
    }//GEN-LAST:event_textFilterMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboDesa;
    private javax.swing.JComboBox comboKab;
    private javax.swing.JComboBox comboKec;
    private javax.swing.JComboBox comboNBS;
    private javax.swing.JComboBox comboProv;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table1;
    private javax.swing.JTextField textFilter;
    // End of variables declaration//GEN-END:variables
}
