/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.helpPanelComponent;

/**
 *
 * @author nurilmi
 */
public class updatingCacahPanel extends javax.swing.JPanel {

    /**
     * Creates new form updatingCacahPanel
     */
    public updatingCacahPanel() {
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

        petunjukBg1 = new pkl55.background3.petunjukBg();
        jScrollPane1 = new javax.swing.JScrollPane();
        updatingCacahIsi1 = new pkl55.background3.updatingCacahIsi();
        backBt1 = new pkl55.component3.backBt();

        petunjukBg1.setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout updatingCacahIsi1Layout = new javax.swing.GroupLayout(updatingCacahIsi1);
        updatingCacahIsi1.setLayout(updatingCacahIsi1Layout);
        updatingCacahIsi1Layout.setHorizontalGroup(
            updatingCacahIsi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        updatingCacahIsi1Layout.setVerticalGroup(
            updatingCacahIsi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1700, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(updatingCacahIsi1);

        petunjukBg1.add(jScrollPane1);
        jScrollPane1.setBounds(190, 140, 880, 370);

        backBt1.setText("");
        backBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBt1ActionPerformed(evt);
            }
        });
        petunjukBg1.add(backBt1);
        backBt1.setBounds(1000, 530, 200, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(petunjukBg1, javax.swing.GroupLayout.PREFERRED_SIZE, 1261, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(petunjukBg1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl55.component3.backBt backBt1;
    private javax.swing.JScrollPane jScrollPane1;
    private pkl55.background3.petunjukBg petunjukBg1;
    private pkl55.background3.updatingCacahIsi updatingCacahIsi1;
    // End of variables declaration//GEN-END:variables

    public pkl55.component3.backBt getBackBt1() {
        return backBt1;
    }

    public void setBackBt1(pkl55.component3.backBt backBt1) {
        this.backBt1 = backBt1;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public pkl55.background3.petunjukBg getPetunjukBg1() {
        return petunjukBg1;
    }

    public void setPetunjukBg1(pkl55.background3.petunjukBg petunjukBg1) {
        this.petunjukBg1 = petunjukBg1;
    }

    public pkl55.background3.updatingCacahIsi getUpdatingCacahIsi1() {
        return updatingCacahIsi1;
    }

    public void setUpdatingCacahIsi1(pkl55.background3.updatingCacahIsi updatingCacahIsi1) {
        this.updatingCacahIsi1 = updatingCacahIsi1;
    }
}
