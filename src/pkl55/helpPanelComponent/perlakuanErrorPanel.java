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
public class perlakuanErrorPanel extends javax.swing.JPanel {

    /**
     * Creates new form perlakuanErrorPanel
     */
    public perlakuanErrorPanel() {
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

        perlakuanErrorBg1 = new pkl55.background3.perlakuanErrorBg();
        missingValueBt1 = new pkl55.component3.missingValueBt();
        errorPenyimpananBt1 = new pkl55.component3.errorPenyimpananBt();
        errorKuesBt1 = new pkl55.component3.errorKuesBt();
        backBt1 = new pkl55.component3.backBt();

        perlakuanErrorBg1.setLayout(null);

        missingValueBt1.setText("");
        missingValueBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missingValueBt1ActionPerformed(evt);
            }
        });
        perlakuanErrorBg1.add(missingValueBt1);
        missingValueBt1.setBounds(240, 210, 700, 50);

        errorPenyimpananBt1.setText("");
        errorPenyimpananBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorPenyimpananBt1ActionPerformed(evt);
            }
        });
        perlakuanErrorBg1.add(errorPenyimpananBt1);
        errorPenyimpananBt1.setBounds(240, 290, 700, 50);

        errorKuesBt1.setText("");
        errorKuesBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorKuesBt1ActionPerformed(evt);
            }
        });
        perlakuanErrorBg1.add(errorKuesBt1);
        errorKuesBt1.setBounds(240, 370, 700, 50);

        backBt1.setText("");
        backBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBt1ActionPerformed(evt);
            }
        });
        perlakuanErrorBg1.add(backBt1);
        backBt1.setBounds(1000, 530, 200, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(perlakuanErrorBg1, javax.swing.GroupLayout.PREFERRED_SIZE, 1262, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(perlakuanErrorBg1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void missingValueBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missingValueBt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_missingValueBt1ActionPerformed

    private void errorPenyimpananBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorPenyimpananBt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorPenyimpananBt1ActionPerformed

    private void errorKuesBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorKuesBt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorKuesBt1ActionPerformed

    private void backBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl55.component3.backBt backBt1;
    private pkl55.component3.errorKuesBt errorKuesBt1;
    private pkl55.component3.errorPenyimpananBt errorPenyimpananBt1;
    private pkl55.component3.missingValueBt missingValueBt1;
    private pkl55.background3.perlakuanErrorBg perlakuanErrorBg1;
    // End of variables declaration//GEN-END:variables

    public pkl55.component3.backBt getBackBt1() {
        return backBt1;
    }

    public void setBackBt1(pkl55.component3.backBt backBt1) {
        this.backBt1 = backBt1;
    }

    public pkl55.component3.errorKuesBt getErrorKuesBt1() {
        return errorKuesBt1;
    }

    public void setErrorKuesBt1(pkl55.component3.errorKuesBt errorKuesBt1) {
        this.errorKuesBt1 = errorKuesBt1;
    }

    public pkl55.component3.errorPenyimpananBt getErrorPenyimpananBt1() {
        return errorPenyimpananBt1;
    }

    public void setErrorPenyimpananBt1(pkl55.component3.errorPenyimpananBt errorPenyimpananBt1) {
        this.errorPenyimpananBt1 = errorPenyimpananBt1;
    }

    public pkl55.component3.missingValueBt getMissingValueBt1() {
        return missingValueBt1;
    }

    public void setMissingValueBt1(pkl55.component3.missingValueBt missingValueBt1) {
        this.missingValueBt1 = missingValueBt1;
    }

    public pkl55.background3.perlakuanErrorBg getPerlakuanErrorBg1() {
        return perlakuanErrorBg1;
    }

    public void setPerlakuanErrorBg1(pkl55.background3.perlakuanErrorBg perlakuanErrorBg1) {
        this.perlakuanErrorBg1 = perlakuanErrorBg1;
    }
}
