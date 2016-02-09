/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.panelcomponent;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author _muh.shamad
 */
public class KuesTable extends javax.swing.JPanel {

    /**
     * Creates new form KuesTable
     */
    private List<Object> kab;
    private List<Object> tableData;

    public KuesTable() {
        initComponents();
        initKab();
        initialization();
    }

    void initialization() {
        table1.setRowSelectionAllowed(true);
        table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public List<Object> temp(String table, String column, String value) throws MalformedURLException, UnsupportedEncodingException, IOException, ParseException {
        URL url = new URL("http://localhost/stisbook/public/pkl55");
        //http://izziweb.net/ServerPKL/Server.php?type=login
        Map<String, Object> params = new LinkedHashMap<>();
        params.put("table", table);
        params.put("column", column);
        params.put("value", value);

        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String, Object> param : params.entrySet()) {
            if (postData.length() != 0) {
                postData.append('&');
            }
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);

        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        String json1 = "";
        for (int c = in.read(); c != -1; c = in.read()) {
            json1 += (char) c;
        }
        System.out.println(json1);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(json1);
        JSONArray array = new JSONArray();
        array = (JSONArray) obj;
        List list = new ArrayList();
        int size = array.size();
        for (Object json : array.toArray()) {
            list.add(json);
        }
        return list;
    }

    void initKab() {
        if (kab == null) {
            try {
                kab = temp("kabupaten", "", "");
                for (Object kab : kab) {
                    comboKab.addItem(kab);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            try {
                for (Object kab : kab) {
                    comboKab.addItem(kab);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    void initKec() throws UnsupportedEncodingException, IOException, MalformedURLException, ParseException {
        comboKec.removeAllItems();
        String selected = ((JSONObject) comboKab.getSelectedItem()).get("id").toString();
        try {
            for (Object kec : temp("kecamatan", "id_kabupaten", selected)) {
                comboKec.addItem(kec);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    void initDesa() {
        comboDesa.removeAllItems();
        JSONObject js = ((JSONObject) comboKec.getSelectedItem());
        if (js != null) {
            String selected = js.get("id").toString();
            try {
                for (Object desa : temp("desa", "id_kecamatan", selected)) {
                    comboDesa.addItem(desa);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    void initNBS() {
        comboNBS.removeAllItems();
        JSONObject js = ((JSONObject) comboDesa.getSelectedItem());
        if (js != null) {
            String selected = js.get("id").toString();
            try {
                for (Object nbs : temp("bs", "KODEDESA", selected)) {
                    comboNBS.addItem(nbs);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    void refreshTable() throws UnsupportedEncodingException, IOException, MalformedURLException, ParseException{
        JSONObject js = ((JSONObject) comboNBS.getSelectedItem());
        if(js!=null){
            tableData = temp("b1", "where",js.get("KODEDESA").toString());
            System.out.println(tableData);
            for (Object jo : tableData) {
                JSONObject data = (JSONObject)jo;
                ((DefaultTableModel)table1.getModel()).addRow(new Object[]{data.get("nks"),
                            data.get("b1r11"),data.get("cleanFlag"),data.get("statusEntry")});
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        comboKab = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboKec = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        comboDesa = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboNBS = new javax.swing.JComboBox();
        textFilter = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(706, 495));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NKS", "Responden", "Flag", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(table1);
        table1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 680, 260));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Provinsi");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lombok Tengah", "Lombok Timur" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setPreferredSize(new java.awt.Dimension(329, 29));
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        comboKab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboKab.setPreferredSize(new java.awt.Dimension(329, 29));
        comboKab.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboKabItemStateChanged(evt);
            }
        });
        comboKab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboKabMouseReleased(evt);
            }
        });
        add(comboKab, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Kabupaten");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Kecamatan");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        comboKec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboKec.setPreferredSize(new java.awt.Dimension(329, 29));
        comboKec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboKecItemStateChanged(evt);
            }
        });
        comboKec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboKecMouseReleased(evt);
            }
        });
        add(comboKec, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Desa");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        comboDesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboDesa.setPreferredSize(new java.awt.Dimension(329, 29));
        comboDesa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboDesaItemStateChanged(evt);
            }
        });
        comboDesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboDesaMouseReleased(evt);
            }
        });
        add(comboDesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("NBS");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        comboNBS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboNBS.setPreferredSize(new java.awt.Dimension(329, 29));
        comboNBS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboNBSItemStateChanged(evt);
            }
        });
        add(comboNBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

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
        add(textFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 200, 200, -1));
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

    private void comboKabItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboKabItemStateChanged
        try {
            // TODO add your handling code here:
            initKec();
        } catch (IOException ex) {
            Logger.getLogger(KuesTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(KuesTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboKabItemStateChanged

    private void comboKecItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboKecItemStateChanged
        initDesa();

    }//GEN-LAST:event_comboKecItemStateChanged

    private void comboNBSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboNBSItemStateChanged
        ((DefaultTableModel)table1.getModel()).setRowCount(0);
        try {
            refreshTable();
        } catch (IOException ex) {
            Logger.getLogger(KuesTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(KuesTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboNBSItemStateChanged

    private void comboDesaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboDesaItemStateChanged
        initNBS();
    }//GEN-LAST:event_comboDesaItemStateChanged

    private void comboKecMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboKecMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_comboKecMouseReleased

    private void comboDesaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboDesaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDesaMouseReleased

    private void comboKabMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboKabMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_comboKabMouseReleased

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2MouseClicked


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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    private javax.swing.JTextField textFilter;
    // End of variables declaration//GEN-END:variables
}
