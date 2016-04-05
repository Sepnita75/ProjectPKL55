/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.gui.panel;

import java.util.Random;
import pkl55.gui.component.Alert;
import pkl55.gui.component.Called;

/**
 *
 * @author faqih_
 */
public class AlertPanel extends javax.swing.JPanel {

    public static final int OK_CANCEL = new Random().nextInt();
    public static final int OK = new Random().nextInt();
    private pkl55.gui.component.Alert dialog;

    public AlertPanel(String message, int type) {
        initComponents();
        this.message.setText(message);
        if (type == OK) {
            cancel.setVisible(false);
        }
        dialog = null;
    }

    public void setDialog(Alert dialog) {
        this.dialog = dialog;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        message = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ok = new pkl55.gui.component.Button();
        cancel = new pkl55.gui.component.Button();
        exit_App1 = new pkl55.gui.component.Exit_App();
        background_image = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/warning.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 70));

        message.setEditable(false);
        message.setColumns(20);
        message.setFont(new java.awt.Font("Lobster Two", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(51, 51, 51));
        message.setRows(5);
        message.setText("Passwornya Salah\n");
        add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cancel");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 50, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OK");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 146, 20, 20));

        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });
        add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        exit_App1.setClick(new Called() {
            @Override
            public void click() {
                dialog.close_(false);
            }
        });
        add(exit_App1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/alert_box.png"))); // NOI18N
        add(background_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        if (dialog != null) {
            dialog.close_(false);
        }else{
            dialog.dispose();
        }
    }//GEN-LAST:event_cancelMouseClicked

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
        if (dialog != null) {
            dialog.close_(true);
        }else{
            dialog.dispose();
        }
    }//GEN-LAST:event_okMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_image;
    private pkl55.gui.component.Button cancel;
    private pkl55.gui.component.Exit_App exit_App1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextArea message;
    private pkl55.gui.component.Button ok;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the isOk
     */
}
