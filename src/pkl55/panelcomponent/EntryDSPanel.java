/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.panelcomponent;

/**
 *
 * @author _muh.shamad
 */
public class EntryDSPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntryKues
     */
    
    public EntryDSPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entryKuesBg1 = new pkl55.background.EntryKuesBg();
        logout21 = new pkl55.component2.Logout2();
        save1 = new pkl55.component2.Save();
        ds21 = new pkl55.component2.Ds2();
        next1 = new pkl55.component2.Next();
        prev1 = new pkl55.component2.Prev();
        jScrollPane1 = new javax.swing.JScrollPane();
        listError = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        perlakuan = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        timeLabel1 = new pkl55.panel2.TimeLabel();
        jLabel3 = new javax.swing.JLabel();

        logout21.setText("");

        save1.setText("");

        ds21.setText("");

        next1.setText("");

        prev1.setText("");

        listError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listError.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listError.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(listError);

        perlakuan.setColumns(20);
        perlakuan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        perlakuan.setRows(5);
        jScrollPane2.setViewportView(perlakuan);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ABDURRAHMAN IZZI");

        timeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listing :");

        javax.swing.GroupLayout entryKuesBg1Layout = new javax.swing.GroupLayout(entryKuesBg1);
        entryKuesBg1.setLayout(entryKuesBg1Layout);
        entryKuesBg1Layout.setHorizontalGroup(
            entryKuesBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryKuesBg1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(entryKuesBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(prev1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(next1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(418, 418, 418)
                .addComponent(ds21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(logout21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entryKuesBg1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(entryKuesBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(entryKuesBg1Layout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        entryKuesBg1Layout.setVerticalGroup(
            entryKuesBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryKuesBg1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addGroup(entryKuesBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entryKuesBg1Layout.createSequentialGroup()
                        .addGroup(entryKuesBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(next1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prev1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entryKuesBg1Layout.createSequentialGroup()
                        .addGroup(entryKuesBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ds21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entryKuesBg1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(entryKuesBg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(entryKuesBg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl55.component2.Ds2 ds21;
    private pkl55.background.EntryKuesBg entryKuesBg1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listError;
    private pkl55.component2.Logout2 logout21;
    private pkl55.component2.Next next1;
    private javax.swing.JTextArea perlakuan;
    private pkl55.component2.Prev prev1;
    private pkl55.component2.Save save1;
    private pkl55.panel2.TimeLabel timeLabel1;
    // End of variables declaration//GEN-END:variables

    public pkl55.component2.Ds2 getDs21() {
        return ds21;
    }

    public void setDs21(pkl55.component2.Ds2 ds21) {
        this.ds21 = ds21;
    }

    public pkl55.background.EntryKuesBg getEntryKuesBg1() {
        return entryKuesBg1;
    }

    public void setEntryKuesBg1(pkl55.background.EntryKuesBg entryKuesBg1) {
        this.entryKuesBg1 = entryKuesBg1;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public javax.swing.JList getListError() {
        return listError;
    }

    public void setListError(javax.swing.JList listError) {
        this.listError = listError;
    }

    public pkl55.component2.Logout2 getLogout21() {
        return logout21;
    }

    public void setLogout21(pkl55.component2.Logout2 logout21) {
        this.logout21 = logout21;
    }

    public pkl55.component2.Next getNext1() {
        return next1;
    }

    public void setNext1(pkl55.component2.Next next1) {
        this.next1 = next1;
    }

    public javax.swing.JTextArea getPerlakuan() {
        return perlakuan;
    }

    public void setPerlakuan(javax.swing.JTextArea perlakuan) {
        this.perlakuan = perlakuan;
    }

    public pkl55.component2.Prev getPrev1() {
        return prev1;
    }

    public void setPrev1(pkl55.component2.Prev prev1) {
        this.prev1 = prev1;
    }

    public pkl55.component2.Save getSave1() {
        return save1;
    }

    public void setSave1(pkl55.component2.Save save1) {
        this.save1 = save1;
    }

    public pkl55.panel2.TimeLabel getTimeLabel1() {
        return timeLabel1;
    }

    public void setTimeLabel1(pkl55.panel2.TimeLabel timeLabel1) {
        this.timeLabel1 = timeLabel1;
    }
}
