/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.kuesioner.view;

import java.awt.Component;
import pkl55.data.view.Field;
import pkl55.data.view.Hal;

/**
 *
 * @author nurilmi
 */
public class UUHal1 extends Hal {

    /**
     * Creates new form Hal1
     */
    public UUHal1() {
        initComponents();
    }

     public void addToView(){
        for (Component comp : getComponents()) {
            if (comp.isVisible()) {
                if (comp instanceof Field) {
                    ((Field) comp).addToView();
                    ((Field) comp).setErrorlist(errorList);
                }
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

        b1r1 = new pkl55.data.view.InputTextField();
        b1r2 = new pkl55.data.view.InputTextField();
        b1r3 = new pkl55.data.view.InputTextField();
        b1r4 = new pkl55.data.view.InputTextField();
        b1r5 = new pkl55.data.view.InputTextField();
        b1r6 = new pkl55.data.view.InputTextField();
        b1r7 = new pkl55.data.view.InputTextField();
        b1r8 = new pkl55.data.view.InputTextField();
        b1r9s1 = new pkl55.data.view.InputTextField();
        b1r9s2 = new pkl55.data.view.InputTextField();
        b1r9s3 = new pkl55.data.view.InputTextField();
        b1r9s4 = new pkl55.data.view.InputTextField();
        b1r9s5 = new pkl55.data.view.InputTextField();
        b1r9s6 = new pkl55.data.view.InputTextField();
        b1r10 = new pkl55.data.view.InputTextField();
        b2r1s1 = new pkl55.data.view.InputTextField();
        b2r1s2 = new pkl55.data.view.InputTextField();
        b2r2s1 = new pkl55.data.view.InputTextField();
        b2r2s2 = new pkl55.data.view.InputTextField();
        b2r3s1 = new pkl55.data.view.InputTextField();
        b2r3s2 = new pkl55.data.view.InputTextField();
        b2r5 = new pkl55.data.view.InputTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1r1.setErrorlist(errorList);
        b1r1.setNextFocusableComponent(b1r2);
        b1r1.setPanel(this);
        b1r1.setVarName("b1r1");
        add(b1r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 218, 45, 24));

        b1r2.setErrorlist(errorList);
        b1r2.setNextFocusableComponent(b1r3);
        b1r2.setPanel(this);
        b1r2.setPosition(1);
        b1r2.setVarName("b1r2");
        add(b1r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 247, 45, 24));

        b1r3.setErrorlist(errorList);
        b1r3.setNextFocusableComponent(b1r4);
        b1r3.setPanel(this);
        b1r3.setPosition(2);
        b1r3.setVarName("b1r3");
        add(b1r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 276, 66, 23));

        b1r4.setErrorlist(errorList);
        b1r4.setNextFocusableComponent(b1r5);
        b1r4.setPanel(this);
        b1r4.setPosition(3);
        b1r4.setVarName("b1r4");
        add(b1r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 305, 66, 23));

        b1r5.setErrorlist(errorList);
        b1r5.setNextFocusableComponent(b1r6);
        b1r5.setPanel(this);
        b1r5.setPosition(4);
        b1r5.setVarName("b1r5");
        add(b1r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 334, 23, 23));

        b1r6.setErrorlist(errorList);
        b1r6.setNextFocusableComponent(b1r7);
        b1r6.setPanel(this);
        b1r6.setPosition(5);
        b1r6.setVarName("b1r6");
        add(b1r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 363, 88, 23));

        b1r7.setErrorlist(errorList);
        b1r7.setNextFocusableComponent(b1r8);
        b1r7.setPanel(this);
        b1r7.setPosition(6);
        b1r7.setVarName("b1r7");
        add(b1r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 391, 45, 24));

        b1r8.setErrorlist(errorList);
        b1r8.setNextFocusableComponent(b1r9s1);
        b1r8.setPanel(this);
        b1r8.setPosition(7);
        b1r8.setVarName("b1r8");
        add(b1r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 429, 24));

        b1r9s1.setErrorlist(errorList);
        b1r9s1.setNextFocusableComponent(b1r9s2);
        b1r9s1.setPanel(this);
        b1r9s1.setPosition(8);
        b1r9s1.setVarName("b1r9s1");
        add(b1r9s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 429, 24));

        b1r9s2.setErrorlist(errorList);
        b1r9s2.setNextFocusableComponent(b1r9s3);
        b1r9s2.setPanel(this);
        b1r9s2.setPosition(9);
        b1r9s2.setVarName("b1r9s2");
        add(b1r9s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 514, 110, 23));

        b1r9s3.setErrorlist(errorList);
        b1r9s3.setNextFocusableComponent(b1r9s4);
        b1r9s3.setPanel(this);
        b1r9s3.setPosition(10);
        b1r9s3.setVarName("b1r9s3");
        add(b1r9s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 545, 130, 24));

        b1r9s4.setErrorlist(errorList);
        b1r9s4.setNextFocusableComponent(b1r9s5);
        b1r9s4.setPanel(this);
        b1r9s4.setPosition(11);
        b1r9s4.setVarName("b1r9s4");
        add(b1r9s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 575, 130, 24));

        b1r9s5.setErrorlist(errorList);
        b1r9s5.setNextFocusableComponent(b1r9s6);
        b1r9s5.setPanel(this);
        b1r9s5.setPosition(12);
        b1r9s5.setVarName("b1r9s5");
        add(b1r9s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 545, 130, 24));

        b1r9s6.setErrorlist(errorList);
        b1r9s6.setNextFocusableComponent(b1r10);
        b1r9s6.setPanel(this);
        b1r9s6.setPosition(13);
        b1r9s6.setVarName("b1r9s6");
        add(b1r9s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 575, 130, 24));

        b1r10.setErrorlist(errorList);
        b1r10.setNextFocusableComponent(b2r1s1);
        b1r10.setPanel(this);
        b1r10.setPosition(14);
        b1r10.setVarName("b1r10");
        add(b1r10, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 618, 23, 24));

        b2r1s1.setErrorlist(errorList);
        b2r1s1.setNextFocusableComponent(b2r2s1);
        b2r1s1.setPanel(this);
        b2r1s1.setPosition(15);
        b2r1s1.setVarName("b2r1s1");
        b2r1s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2r1s1ActionPerformed(evt);
            }
        });
        add(b2r1s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 750, 252, 23));

        b2r1s2.setErrorlist(errorList);
        b2r1s2.setNextFocusableComponent(b2r2s2);
        b2r1s2.setPanel(this);
        b2r1s2.setPosition(18);
        b2r1s2.setVarName("b2r1s2");
        add(b2r1s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 750, 246, 23));

        b2r2s1.setErrorlist(errorList);
        b2r2s1.setNextFocusableComponent(b2r3s1);
        b2r2s1.setPanel(this);
        b2r2s1.setPosition(16);
        b2r2s1.setVarName("b2r2s1");
        add(b2r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 775, 140, 23));

        b2r2s2.setErrorlist(errorList);
        b2r2s2.setNextFocusableComponent(b2r3s2);
        b2r2s2.setPanel(this);
        b2r2s2.setPosition(19);
        b2r2s2.setVarName("b2r2s2");
        add(b2r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 775, 140, 23));

        b2r3s1.setErrorlist(errorList);
        b2r3s1.setNextFocusableComponent(b2r1s2);
        b2r3s1.setPanel(this);
        b2r3s1.setPosition(17);
        b2r3s1.setVarName("b2r3s1");
        add(b2r3s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 802, 45, 23));

        b2r3s2.setErrorlist(errorList);
        b2r3s2.setNextFocusableComponent(b2r5);
        b2r3s2.setPanel(this);
        b2r3s2.setPosition(20);
        b2r3s2.setVarName("b2r3s2");
        add(b2r3s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 802, 45, 23));

        b2r5.setErrorlist(errorList);
        b2r5.setNextpage(true);
        b2r5.setPanel(this);
        b2r5.setPosition(21);
        b2r5.setVarName("b2r5");
        add(b2r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 921, 24, 23));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/kuesioner/picture/u1.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void b2r1s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2r1s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b2r1s1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl55.data.view.InputTextField b1r1;
    private pkl55.data.view.InputTextField b1r10;
    private pkl55.data.view.InputTextField b1r2;
    private pkl55.data.view.InputTextField b1r3;
    private pkl55.data.view.InputTextField b1r4;
    private pkl55.data.view.InputTextField b1r5;
    private pkl55.data.view.InputTextField b1r6;
    private pkl55.data.view.InputTextField b1r7;
    private pkl55.data.view.InputTextField b1r8;
    private pkl55.data.view.InputTextField b1r9s1;
    private pkl55.data.view.InputTextField b1r9s2;
    private pkl55.data.view.InputTextField b1r9s3;
    private pkl55.data.view.InputTextField b1r9s4;
    private pkl55.data.view.InputTextField b1r9s5;
    private pkl55.data.view.InputTextField b1r9s6;
    private pkl55.data.view.InputTextField b2r1s1;
    private pkl55.data.view.InputTextField b2r1s2;
    private pkl55.data.view.InputTextField b2r2s1;
    private pkl55.data.view.InputTextField b2r2s2;
    private pkl55.data.view.InputTextField b2r3s1;
    private pkl55.data.view.InputTextField b2r3s2;
    private pkl55.data.view.InputTextField b2r5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}