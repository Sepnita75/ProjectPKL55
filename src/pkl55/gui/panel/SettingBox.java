/*
 * To change this license header, choose License Headers in Projec    @Override
    publi    @Override
    public void click() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
c void click() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
t Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.gui.panel;

import javax.swing.JComponent;
import javax.swing.JFrame;
import pkl55.data.model.Config;
import pkl55.data.model.HttpRequest;
import pkl55.gui.component.Called;

/**
 *
 * @author faqih_
 */
public class SettingBox extends javax.swing.JPanel {

    private TestWorker testWorker;

    public SettingBox() {
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

        url1 = new javax.swing.JTextField();
        url2 = new javax.swing.JTextField();
        toggle_automove = new pkl55.gui.component.Toggle();
        save_setting = new pkl55.gui.component.SaveSetting();
        exit = new pkl55.gui.component.Exit_App();
        tick1 = new pkl55.gui.component.TrueOrFalse();
        tick2 = new pkl55.gui.component.TrueOrFalse();
        jTextField1 = new javax.swing.JTextField();
        background_image = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        url1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        url1.setForeground(new java.awt.Color(2, 113, 76));
        url1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        url1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url1ActionPerformed(evt);
            }
        });
        url1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                url1FocusLost(evt);
            }
        });
        add(url1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 97, 270, 30));

        url2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        url2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        url2.setForeground(new java.awt.Color(2, 113, 76));
        url2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                url2ActionPerformed(evt);
            }
        });
        url2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                url2FocusLost(evt);
            }
        });
        add(url2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 136, 270, 30));
        add(toggle_automove, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        save_setting.setClick(new Called(){
            @Override
            public void click(){
                Config.setURL(url1.getText(), url2.getText(), toggle_automove.isYes());
                Config.setURLToConfig();
                save_setting.setEnabled(false);
                System.out.println("THIS URL\t"+Config.url1);
                System.out.println("THIS URL\t"+Config.url2);
                System.out.println("THIS URL\t"+Config.automove);
            }
        });
        add(save_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        exit.setClick(new Called() {
            @Override
            public void click(){
                setVisible(false);
            }
        });
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));
        add(tick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));
        add(tick2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 80, 20));

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/setting_background.png"))); // NOI18N
        background_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                background_imageMouseClicked(evt);
            }
        });
        add(background_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked

    }//GEN-LAST:event_exitMouseClicked

    private void url1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_url1FocusLost
        Thread run = new Thread(new Runnable() {
            @Override
            public void run() {
                testWorker = new TestWorker();
                testWorker.connect(1);
            }
        });
        run.start();
    }//GEN-LAST:event_url1FocusLost

    private void background_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_background_imageMouseClicked
        background_image.requestFocus();
    }//GEN-LAST:event_background_imageMouseClicked

    private void url2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_url2FocusLost
        Thread run = new Thread(new Runnable() {
            @Override
            public void run() {
                testWorker = new TestWorker();
                testWorker.connect(2);
            }
        });
        run.start();
    }//GEN-LAST:event_url2FocusLost

    private void url1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url1ActionPerformed
        Thread run = new Thread(new Runnable() {
            @Override
            public void run() {
                testWorker = new TestWorker();
                testWorker.connect(1);
            }
        });
        run.start();
    }//GEN-LAST:event_url1ActionPerformed

    private void url2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_url2ActionPerformed
        Thread run = new Thread(new Runnable() {
            @Override
            public void run() {
                testWorker = new TestWorker();
                testWorker.connect(2);
            }
        });
        run.start();
    }//GEN-LAST:event_url2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_image;
    private pkl55.gui.component.Exit_App exit;
    private javax.swing.JTextField jTextField1;
    private pkl55.gui.component.SaveSetting save_setting;
    private pkl55.gui.component.TrueOrFalse tick1;
    private pkl55.gui.component.TrueOrFalse tick2;
    private pkl55.gui.component.Toggle toggle_automove;
    private javax.swing.JTextField url1;
    private javax.swing.JTextField url2;
    // End of variables declaration//GEN-END:variables

    class TestWorker {

        public void connect(int tick) {
            try {

                if (tick == 1) {
                    HttpRequest.sendGet(url1.getText());
                    tick1.setTrue();
                }
            } catch (Exception ex) {
                if (tick == 1) {
                    tick1.setFalse();
                }
            }
            try {
                if (tick == 2) {
                    HttpRequest.sendGet(url2.getText());
                    tick2.setTrue();
                }
            } catch (Exception ex) {
                if (tick == 2) {
                    tick2.setFalse();
                }
            }
        }

    }
}
