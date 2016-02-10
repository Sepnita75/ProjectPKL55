/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.kuesioner.SectionPane;

import pkl55.kuesioner.Field;
import pkl55.kuesioner.Hal;
import java.awt.Component;

/**
 *
 * @author ItsFadrur
 */
public class Section1 extends Hal {
    
    public Section1() {
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1r1 = new pkl55.kuesioner.InputTextField();
        b1r2 = new pkl55.kuesioner.InputTextField();
        b1r3 = new pkl55.kuesioner.InputTextField();
        b1r4 = new pkl55.kuesioner.InputTextField();
        b1r5 = new pkl55.kuesioner.InputTextField();
        b1r6 = new pkl55.kuesioner.InputTextField();
        b1r7 = new pkl55.kuesioner.InputTextField();
        b1r8 = new pkl55.kuesioner.InputTextField();
        b1r9 = new pkl55.kuesioner.InputTextField();
        b1r10 = new pkl55.kuesioner.InputTextField();
        b1r11 = new pkl55.kuesioner.InputTextField();
        b1r12 = new pkl55.kuesioner.InputTextField();
        b1r13 = new pkl55.kuesioner.InputTextField();
        b2r1s1 = new pkl55.kuesioner.InputTextField();
        b2r1s2 = new pkl55.kuesioner.InputTextField();
        b2r2s1 = new pkl55.kuesioner.InputTextField();
        b2r2s2 = new pkl55.kuesioner.InputTextField();
        b2r3s1 = new pkl55.kuesioner.InputTextField();
        b2r3s2 = new pkl55.kuesioner.InputTextField();
        b2r5 = new pkl55.kuesioner.InputTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1r1.setPosition(0);
        System.out.print("OK\t");
        System.out.println(errorList);
        b1r1.setErrorlist(errorList);
        b1r1.setPanel(this);
        b1r1.setVarName("b1r1");
        add(b1r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 30, -1));

        b1r2.setErrorlist(errorList);
        b1r2.setPosition(1);
        b1r2.setPanel(this);
        b1r2.setVarName("b1r2");
        add(b1r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 30, -1));

        b1r3.setErrorlist(errorList);
        b1r3.setPosition(2);
        b1r3.setPanel(this);
        b1r3.setVarName("b1r3");
        add(b1r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 333, 30, -1));

        b1r4.setErrorlist(errorList);
        b1r4.setPanel(this);
        b1r4.setPosition(3);
        b1r4.setVarName("b1r4");
        add(b1r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 365, 30, -1));

        b1r5.setErrorlist(errorList);
        b1r5.setPanel(this);
        b1r5.setPosition(4);
        b1r5.setVarName("b1r5");
        add(b1r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 396, 30, -1));

        b1r6.setErrorlist(errorList);
        b1r6.setPanel(this);
        b1r6.setPosition(5);
        b1r6.setVarName("b1r6");
        add(b1r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 30, -1));

        b1r7.setErrorlist(errorList);
        b1r7.setPanel(this);
        b1r7.setPosition(6);
        b1r7.setVarName("b1r7");
        add(b1r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 462, 30, -1));

        b1r8.setErrorlist(errorList);
        b1r8.setPanel(this);
        b1r8.setPosition(7);
        b1r8.setVarName("b1r8");
        add(b1r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 493, 30, -1));

        b1r9.setErrorlist(errorList);
        b1r9.setPanel(this);
        b1r9.setPosition(8);
        b1r9.setVarName("b1r9");
        add(b1r9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 525, 30, -1));

        b1r10.setErrorlist(errorList);
        b1r10.setPanel(this);
        b1r10.setPosition(9);
        b1r10.setVarName("b1r10");
        add(b1r10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 557, 30, -1));

        b1r11.setErrorlist(errorList);
        b1r11.setPanel(this);
        b1r11.setPosition(10);
        b1r11.setVarName("b1r11");
        add(b1r11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 585, 430, -1));

        b1r12.setErrorlist(errorList);
        b1r12.setPanel(this);
        b1r12.setPosition(11);
        b1r12.setVarName("b1r12");
        add(b1r12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 619, 430, -1));

        b1r13.setErrorlist(errorList);
        b1r13.setPanel(this);
        b1r13.setPosition(12);
        b1r13.setVarName("b1r13");
        add(b1r13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 430, -1));

        b2r1s1.setErrorlist(errorList);
        b2r1s1.setNextFocusableComponent(b2r2s1);
        b2r1s1.setPanel(this);
        b2r1s1.setPosition(13);
        b2r1s1.setVarName("b2r1s1");
        add(b2r1s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 781, 230, 20));

        b2r1s2.setErrorlist(errorList);
        b2r1s2.setNextFocusableComponent(b2r2s2);
        b2r1s2.setPanel(this);
        b2r1s2.setPosition(14);
        b2r1s2.setVarName("b2r1s2");
        b2r1s2.setVerifyInputWhenFocusTarget(false);
        add(b2r1s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 781, 230, 20));

        b2r2s1.setErrorlist(errorList);
        b2r2s1.setNextFocusableComponent(b2r3s1);
        b2r2s1.setPanel(this);
        b2r2s1.setPosition(15);
        b2r2s1.setVarName("b2r2s1");
        add(b2r2s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 808, 90, 20));

        b2r2s2.setErrorlist(errorList);
        b2r2s2.setNextFocusableComponent(b2r3s2);
        b2r2s2.setPanel(this);
        b2r2s2.setPosition(16);
        b2r2s2.setVarName("b2r2s2");
        add(b2r2s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 808, 90, 20));

        b2r3s1.setErrorlist(errorList);
        b2r3s1.setNextFocusableComponent(b2r1s2);
        b2r3s1.setPanel(this);
        b2r3s1.setPosition(17);
        b2r3s1.setVarName("b2r3s1");
        add(b2r3s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 838, 50, 20));

        b2r3s2.setErrorlist(errorList);
        b2r3s2.setPanel(this);
        b2r3s2.setPosition(18);
        b2r3s2.setVarName("b2r3s2");
        add(b2r3s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 838, 50, 20));

        b2r5.setErrorlist(errorList);
        b2r5.setPanel(this);
        b2r5.setPosition(19);
        b2r5.setVarName("b2r5");
        b2r5.setNextpage(true);
        add(b2r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 970, 30, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 835, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("3");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 835, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/SourceOfPicture/1.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl55.kuesioner.InputTextField b1r1;
    private pkl55.kuesioner.InputTextField b1r10;
    private pkl55.kuesioner.InputTextField b1r11;
    private pkl55.kuesioner.InputTextField b1r12;
    private pkl55.kuesioner.InputTextField b1r13;
    private pkl55.kuesioner.InputTextField b1r2;
    private pkl55.kuesioner.InputTextField b1r3;
    private pkl55.kuesioner.InputTextField b1r4;
    private pkl55.kuesioner.InputTextField b1r5;
    private pkl55.kuesioner.InputTextField b1r6;
    private pkl55.kuesioner.InputTextField b1r7;
    private pkl55.kuesioner.InputTextField b1r8;
    private pkl55.kuesioner.InputTextField b1r9;
    private pkl55.kuesioner.InputTextField b2r1s1;
    private pkl55.kuesioner.InputTextField b2r1s2;
    private pkl55.kuesioner.InputTextField b2r2s1;
    private pkl55.kuesioner.InputTextField b2r2s2;
    private pkl55.kuesioner.InputTextField b2r3s1;
    private pkl55.kuesioner.InputTextField b2r3s2;
    private pkl55.kuesioner.InputTextField b2r5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
