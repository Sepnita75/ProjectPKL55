/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.panelcomponent;

import java.awt.Component;
import javax.swing.JOptionPane;
import pkl55.about.aboutBg;
import pkl55.controller.GeneralPanelController;
import pkl55.helpPanelComponent.aHelpCard;
import pkl55.maintest.DataEntry55;

/**
 *
 * @author User
 */
public class GeneralPanel extends javax.swing.JPanel {

    /**
     * Creates new form About
     */
    private GeneralPanelController controller;

    public GeneralPanel() {
        initComponents();

        controller = new GeneralPanelController(getMainPanel(), getIcontemp1(), getdSSubPanel1(), getKuesSubPanel1(), getHelpSubPanel1());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgfull1 = new pkl55.background.Bgfull();
        icontemp1 = new pkl55.panelcomponent.AllMenuButton();
        exitBt1 = new pkl55.component.ExitBt();
        minBt1 = new pkl55.component.MinBt();
        timeLabel1 = new pkl55.panel2.TimeLabel();
        mainPanel = new pkl55.background.Panelkanan();
        dSSubPanel1 = new pkl55.panelcomponent.DSSubPanel();
        kuesSubPanel1 = new pkl55.panelcomponent.KuesSubPanel();
        aHelpCard1 = new pkl55.helpPanelComponent.aHelpCard();
        aboutBg1 = new pkl55.about.aboutBg();
        userLabel = new javax.swing.JLabel();

        bgfull1.setLayout(null);
        bgfull1.add(icontemp1);
        icontemp1.setBounds(0, 137, 106, 631);

        exitBt1.setText("");
        exitBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBt1ActionPerformed(evt);
            }
        });
        bgfull1.add(exitBt1);
        exitBt1.setBounds(1301, 0, 70, 44);

        minBt1.setText("");
        minBt1.setOpaque(true);
        minBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minBt1ActionPerformed(evt);
            }
        });
        bgfull1.add(minBt1);
        minBt1.setBounds(1240, 0, 64, 44);

        timeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        bgfull1.add(timeLabel1);
        timeLabel1.setBounds(1129, 88, 204, 31);

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(dSSubPanel1, "dssubpanel");
        mainPanel.add(kuesSubPanel1, "kuessubpanel");
        mainPanel.add(aHelpCard1, "helpsubpanel");

        javax.swing.GroupLayout aboutBg1Layout = new javax.swing.GroupLayout(aboutBg1);
        aboutBg1.setLayout(aboutBg1Layout);
        aboutBg1Layout.setHorizontalGroup(
            aboutBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1261, Short.MAX_VALUE)
        );
        aboutBg1Layout.setVerticalGroup(
            aboutBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );

        mainPanel.add(aboutBg1, "aboutsubpanel");

        bgfull1.add(mainPanel);
        mainPanel.setBounds(112, 137, 1261, 631);

        userLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("ABDURRAHMAN IZZI");
        bgfull1.add(userLabel);
        userLabel.setBounds(1119, 50, 214, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgfull1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgfull1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exitBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBt1ActionPerformed
        // TODO add your handling code here:
        if (getController().getLoginPanelModel().isLoginStatus()) {
            int t = JOptionPane.showConfirmDialog((Component) null, "Log out dan Keluar?",
                    "Perhatian", JOptionPane.OK_CANCEL_OPTION);
            if (t == 0) {
                System.exit(0);
            }
        } else{
            int t = JOptionPane.showConfirmDialog((Component) null, "Keluar?",
                    "Perhatian", JOptionPane.OK_CANCEL_OPTION);
            if (t == 0) {
                System.exit(0);
            }
        }

    }//GEN-LAST:event_exitBt1ActionPerformed

    private void minBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minBt1ActionPerformed
        // TODO add your handling code here:
        DataEntry55.getInstance().minim();
    }//GEN-LAST:event_minBt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl55.helpPanelComponent.aHelpCard aHelpCard1;
    private pkl55.about.aboutBg aboutBg1;
    private pkl55.background.Bgfull bgfull1;
    private pkl55.panelcomponent.DSSubPanel dSSubPanel1;
    private pkl55.component.ExitBt exitBt1;
    private pkl55.panelcomponent.AllMenuButton icontemp1;
    private pkl55.panelcomponent.KuesSubPanel kuesSubPanel1;
    private pkl55.background.Panelkanan mainPanel;
    private pkl55.component.MinBt minBt1;
    private pkl55.panel2.TimeLabel timeLabel1;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables

    public GeneralPanelController getController() {
        return controller;
    }

    public void setController(GeneralPanelController controller) {
        this.controller = controller;
    }

    public aboutBg getAboutSubPanel1() {
        return aboutBg1;
    }

    public void setAboutSubPanel1(aboutBg aboutSubPanel1) {
        this.aboutBg1 = aboutSubPanel1;
    }

    public pkl55.background.Bgfull getBgfull1() {
        return bgfull1;
    }

    public void setBgfull1(pkl55.background.Bgfull bgfull1) {
        this.bgfull1 = bgfull1;
    }

    public pkl55.panelcomponent.DSSubPanel getdSSubPanel1() {
        return dSSubPanel1;
    }

    public void setdSSubPanel1(pkl55.panelcomponent.DSSubPanel dSSubPanel1) {
        this.dSSubPanel1 = dSSubPanel1;
    }

    public pkl55.component.ExitBt getExitBt1() {
        return exitBt1;
    }

    public void setExitBt1(pkl55.component.ExitBt exitBt1) {
        this.exitBt1 = exitBt1;
    }

    public aHelpCard getHelpSubPanel1() {
        return aHelpCard1;
    }

    public void setHelpSubPanel1(aHelpCard aHelpCard1) {
        this.aHelpCard1 = aHelpCard1;
    }

    public pkl55.panelcomponent.AllMenuButton getIcontemp1() {
        return icontemp1;
    }

    public void setIcontemp1(pkl55.panelcomponent.AllMenuButton icontemp1) {
        this.icontemp1 = icontemp1;
    }

    public pkl55.panelcomponent.KuesSubPanel getKuesSubPanel1() {
        return kuesSubPanel1;
    }

    public void setKuesSubPanel1(pkl55.panelcomponent.KuesSubPanel kuesSubPanel1) {
        this.kuesSubPanel1 = kuesSubPanel1;
    }

    public pkl55.background.Panelkanan getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(pkl55.background.Panelkanan mainPanel) {
        this.mainPanel = mainPanel;
    }

    public pkl55.component.MinBt getMinBt1() {
        return minBt1;
    }

    public void setMinBt1(pkl55.component.MinBt minBt1) {
        this.minBt1 = minBt1;
    }

    public pkl55.panel2.TimeLabel getTimeLabel1() {
        return timeLabel1;
    }

    public void setTimeLabel1(pkl55.panel2.TimeLabel timeLabel1) {
        this.timeLabel1 = timeLabel1;
    }

    public javax.swing.JLabel getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(javax.swing.JLabel jLabel1) {
        this.userLabel = jLabel1;
    }
}
