/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.panelcomponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import pkl55.util.CleanErrorRenderer;
import pkl55.util.StatusEntryRenderer;
import pkl55.util.TableColorRender;

public class TableSubKues extends javax.swing.JPanel {

    private KuesionerTableModel tableModel;
    private TableModel model;
    private TableRowSorter<KuesionerTableModel> sorter;
    private static int row;

    public TableSubKues() {
        initComponents();
        initView();

        inisialisasi();
    }

    private void initView() {
        jScrollPane1.getViewport().setOpaque(false);
        setOpaque(false);
        table1.setOpaque(false);
        setPreferredSize(new Dimension(563, 474));
    }

    private void inisialisasi() {
        tableModel = new KuesionerTableModel();
        table1.setModel(tableModel);
        table1.setRowSelectionAllowed(true);
        table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table1.getColumnModel().getColumn(0).setCellRenderer(new TableColorRender());
        table1.getColumnModel().getColumn(1).setCellRenderer(new TableColorRender());
        table1.getColumnModel().getColumn(2).setCellRenderer(new CleanErrorRenderer());
        table1.getColumnModel().getColumn(3).setCellRenderer(new StatusEntryRenderer());
        sorter = new TableRowSorter<>(tableModel);
        table1.setRowSorter(sorter);
        table1.getColumnModel().getColumn(2).setWidth(5);
    }

    private void initListener() {
        table1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboKab = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        comboKec = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        comboDesa = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboNBS = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new pkl55.panelcomponent.Table();
        textFilter = new javax.swing.JTextField();

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Provinsi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel3, gridBagConstraints);

        comboKab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboKab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboKab.setPreferredSize(new java.awt.Dimension(329, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 89);
        jPanel1.add(comboKab, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Kabupaten");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 2;
        jPanel1.add(jLabel4, gridBagConstraints);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setPreferredSize(new java.awt.Dimension(329, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 89);
        jPanel1.add(jComboBox2, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Kecamatan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(jLabel5, gridBagConstraints);

        comboKec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboKec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboKec.setPreferredSize(new java.awt.Dimension(329, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 89);
        jPanel1.add(comboKec, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Desa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel6, gridBagConstraints);

        comboDesa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboDesa.setPreferredSize(new java.awt.Dimension(329, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 89);
        jPanel1.add(comboDesa, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("NBS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel7, gridBagConstraints);

        comboNBS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboNBS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboNBS.setPreferredSize(new java.awt.Dimension(329, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 89);
        jPanel1.add(comboNBS, gridBagConstraints);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table1);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 65, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(textFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
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
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private pkl55.panelcomponent.Table table1;
    private javax.swing.JTextField textFilter;
    // End of variables declaration//GEN-END:variables
}
