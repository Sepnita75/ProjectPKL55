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
public class ruleValidasiPanel extends javax.swing.JPanel {

    /**
     * Creates new form ruleValidasiPanel
     */
    public ruleValidasiPanel() {
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

        ruleValidasiBg1 = new pkl55.background3.ruleValidasiBg();
        kuesCacahBt1 = new pkl55.component3.kuesCacahBt();
        kuesDSBt1 = new pkl55.component3.kuesDSBt();
        backBt1 = new pkl55.component3.backBt();

        ruleValidasiBg1.setLayout(null);

        kuesCacahBt1.setText("");
        kuesCacahBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuesCacahBt1ActionPerformed(evt);
            }
        });
        ruleValidasiBg1.add(kuesCacahBt1);
        kuesCacahBt1.setBounds(280, 230, 700, 50);

        kuesDSBt1.setText("");
        kuesDSBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuesDSBt1ActionPerformed(evt);
            }
        });
        ruleValidasiBg1.add(kuesDSBt1);
        kuesDSBt1.setBounds(280, 330, 700, 50);

        backBt1.setText("");
        backBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBt1ActionPerformed(evt);
            }
        });
        ruleValidasiBg1.add(backBt1);
        backBt1.setBounds(1000, 530, 200, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ruleValidasiBg1, javax.swing.GroupLayout.PREFERRED_SIZE, 1262, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ruleValidasiBg1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void kuesCacahBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuesCacahBt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kuesCacahBt1ActionPerformed

    private void kuesDSBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuesDSBt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kuesDSBt1ActionPerformed

    private void backBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl55.component3.backBt backBt1;
    private pkl55.component3.kuesCacahBt kuesCacahBt1;
    private pkl55.component3.kuesDSBt kuesDSBt1;
    private pkl55.background3.ruleValidasiBg ruleValidasiBg1;
    // End of variables declaration//GEN-END:variables

    public pkl55.component3.backBt getBackBt1() {
        return backBt1;
    }

    public void setBackBt1(pkl55.component3.backBt backBt1) {
        this.backBt1 = backBt1;
    }

    public pkl55.component3.kuesCacahBt getKuesCacahBt1() {
        return kuesCacahBt1;
    }

    public void setKuesCacahBt1(pkl55.component3.kuesCacahBt kuesCacahBt1) {
        this.kuesCacahBt1 = kuesCacahBt1;
    }

    public pkl55.component3.kuesDSBt getKuesDSBt1() {
        return kuesDSBt1;
    }

    public void setKuesDSBt1(pkl55.component3.kuesDSBt kuesDSBt1) {
        this.kuesDSBt1 = kuesDSBt1;
    }

    public pkl55.background3.ruleValidasiBg getRuleValidasiBg1() {
        return ruleValidasiBg1;
    }

    public void setRuleValidasiBg1(pkl55.background3.ruleValidasiBg ruleValidasiBg1) {
        this.ruleValidasiBg1 = ruleValidasiBg1;
    }
}
