/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.panelcomponent;

//import java.awt.Color;
//import java.awt.event.KeyEvent;
//import javax.swing.JDialog;
//import javax.swing.JOptionPane;
//import pkl55.maintest.DataEntry55;

/**
 *
 * @author _muh.shamad
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    //private boolean flag = false;
    //private DBConfigPanel dBConfigPanel;

    public LoginPanel() {
        initComponents();
//        settingBt1.setVisible(false);
//        helpBt2.setVisible(false);
    }

//    public void close() {
//        setFlag(false);
//        getSettingBt1().setVisible(false);
//        getHelpBt2().setVisible(false);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPageBg1 = new pkl55.background.LoginPageBg();
        exitBt1 = new pkl55.component.ExitBt();
        minBt1 = new pkl55.component.MinBt();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        loginBt1 = new pkl55.component.LoginBt();
        loginTextField1 = new pkl55.component.LoginTextField();
        passwordTextField1 = new pkl55.component.PasswordTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        settingBt1 = new pkl55.component.SettingBt();
        helpBt2 = new pkl55.component.HelpBt();
        menuAwalBt2 = new pkl55.component.MenuAwalBt();

        setLayout(new java.awt.BorderLayout());

        loginPageBg1.setOpaque(false);
        loginPageBg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginPageBg1MouseClicked(evt);
            }
        });
        loginPageBg1.setLayout(null);

        exitBt1.setText("");
        exitBt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBt1MouseClicked(evt);
            }
        });
        exitBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBt1ActionPerformed(evt);
            }
        });
        loginPageBg1.add(exitBt1);
        exitBt1.setBounds(1300, 0, 70, 50);

        minBt1.setText("");
        minBt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minBt1MouseClicked(evt);
            }
        });
        minBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minBt1ActionPerformed(evt);
            }
        });
        loginPageBg1.add(minBt1);
        minBt1.setBounds(1240, 0, 64, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lupa Password?");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        loginBt1.setText("");
        loginBt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBt1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBt1MouseExited(evt);
            }
        });
        loginBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBt1ActionPerformed(evt);
            }
        });

        loginTextField1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        loginTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginTextField1MouseClicked(evt);
            }
        });
        loginTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextField1ActionPerformed(evt);
            }
        });

        passwordTextField1.setText("Masukkan Password");
        passwordTextField1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        passwordTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTextField1FocusGained(evt);
            }
        });
        passwordTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTextField1MouseClicked(evt);
            }
        });
        passwordTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(passwordTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(loginTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(passwordTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginBt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(loginBt1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(loginTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(passwordTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        loginPageBg1.add(jLayeredPane1);
        jLayeredPane1.setBounds(470, 240, 420, 490);

        settingBt1.setText("");
        settingBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingBt1ActionPerformed(evt);
            }
        });

        helpBt2.setText("");

        menuAwalBt2.setText("");
        menuAwalBt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAwalBt2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 81, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingBt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpBt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuAwalBt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 61, Short.MAX_VALUE)
                .addComponent(settingBt1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(helpBt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(menuAwalBt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane2.setLayer(settingBt1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(helpBt2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(menuAwalBt2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        loginPageBg1.add(jLayeredPane2);
        jLayeredPane2.setBounds(1110, 540, 250, 220);

        add(loginPageBg1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBt1MouseClicked
//        System.exit(0);
    }//GEN-LAST:event_exitBt1MouseClicked

    private void loginTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextField1ActionPerformed

    private void loginTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTextField1MouseClicked
        // TODO add your handling code here:
//        close();
//        getLoginTextField1().setText("");
//        getLoginTextField1().setForeground(Color.black);
    }//GEN-LAST:event_loginTextField1MouseClicked

    private void passwordTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextField1MouseClicked
        // TODO add your handling code here:
//        getPasswordTextField1().setText("");
//        getPasswordTextField1().setForeground(Color.black);
//        close();
    }//GEN-LAST:event_passwordTextField1MouseClicked

    private void menuAwalBt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAwalBt2MouseClicked
        // TODO add your handling code here:
//        if (!isFlag()) {
//            setFlag(true);
//            getSettingBt1().setVisible(true);
//            getHelpBt2().setVisible(true);
//        } else {
//            setFlag(false);
//            getSettingBt1().setVisible(false);
//            getHelpBt2().setVisible(false);
//        }

    }//GEN-LAST:event_menuAwalBt2MouseClicked

    private void loginPageBg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPageBg1MouseClicked
        // TODO add your handling code here:
//        close();
    }//GEN-LAST:event_loginPageBg1MouseClicked

    private void passwordTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextField1KeyPressed
        // TODO add your handling code here:
//        int key = evt.getKeyCode();
//        if (key == KeyEvent.VK_ENTER) {
//            getLoginBt1().doClick();
//        }
    }//GEN-LAST:event_passwordTextField1KeyPressed

    private void passwordTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextField1FocusGained
        // TODO add your handling code here:
//        getPasswordTextField1().setEchoChar('●');
//        getPasswordTextField1().setText("");
    }//GEN-LAST:event_passwordTextField1FocusGained

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
//        close();
//        JOptionPane.showMessageDialog(this, "Hubungi/WA personil Data Entry : 082311897547",
//                "Lupa Password?", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
    setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));        // TODO add your handling code here:
//        getjLabel3().setForeground(new java.awt.Color(102, 204, 255));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
//        getjLabel3().setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel3MouseExited

    private void settingBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingBt1ActionPerformed
        // TODO add your handling code here:
//        jDialog = new JDialog();
//        jDialog.setTitle("Setting Database");
//        jDialog.setLocationRelativeTo(null);
//        jDialog.setSize(514, 381);
//        //dBConfigPanel = new DBConfigPanel();
//        //jDialog.add(dBConfigPanel);
//        jDialog.setResizable(false);
//        jDialog.setModal(true);
//        jDialog.setVisible(true);
//        DBConfig dbc = new DBConfig();
//        final JDialog frame = new JDialog(DataEntry55.getInstance(), "Setting", true);
//        frame.setLocationRelativeTo(null);
//        frame.setResizable(false);
//        frame.getContentPane().add(dbc.getJPanel2());
//        frame.getContentPane().add(dbc.getJPanel1());
//        frame.pack();
//        frame.setVisible(true);
    }//GEN-LAST:event_settingBt1ActionPerformed

    private void loginBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBt1ActionPerformed
        // TODO add your handling code here:
//        close();
//        usernameKosong();
//        passwordKosong();
    }//GEN-LAST:event_loginBt1ActionPerformed

    private void loginBt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBt1MouseClicked
        // TODO add your handling code here:
//        usernameKosong();
//        passwordKosong();
    }//GEN-LAST:event_loginBt1MouseClicked
//    void usernameKosong() {
//        if (getLoginTextField1().getText().length() < 1 || getLoginTextField1().getText().equalsIgnoreCase("Masukan Username")) {
//            JOptionPane.showMessageDialog(this, "Username masih kosong.", "Notification", JOptionPane.INFORMATION_MESSAGE);
//        }
//    }
//
//    void passwordKosong() {
//        if (getPasswordTextField1().getText().length() < 1) {
//            JOptionPane.showMessageDialog(this, "Password masih kosong.", "Notification", JOptionPane.INFORMATION_MESSAGE);
//        }
//    }
    private void minBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minBt1ActionPerformed
        // TODO add your handling code here:
//        DataEntry55.getInstance().minim();
//        close();
    }//GEN-LAST:event_minBt1ActionPerformed

    private void minBt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minBt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_minBt1MouseClicked

    private void loginBt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBt1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBt1MouseExited

    private void exitBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl55.component.ExitBt exitBt1;
    private pkl55.component.HelpBt helpBt2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private pkl55.component.LoginBt loginBt1;
    private pkl55.background.LoginPageBg loginPageBg1;
    private pkl55.component.LoginTextField loginTextField1;
    private pkl55.component.MenuAwalBt menuAwalBt2;
    private pkl55.component.MinBt minBt1;
    private pkl55.component.PasswordTextField passwordTextField1;
    private pkl55.component.SettingBt settingBt1;
    // End of variables declaration//GEN-END:variables

    public pkl55.component.ExitBt getExitBt1() {
        return exitBt1;
    }

    public void setExitBt1(pkl55.component.ExitBt exitBt1) {
        this.exitBt1 = exitBt1;
    }

    public pkl55.component.HelpBt getHelpBt2() {
        return helpBt2;
    }

    public void setHelpBt2(pkl55.component.HelpBt helpBt2) {
        this.helpBt2 = helpBt2;
    }

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JLayeredPane getjLayeredPane1() {
        return jLayeredPane1;
    }

    public void setjLayeredPane1(javax.swing.JLayeredPane jLayeredPane1) {
        this.jLayeredPane1 = jLayeredPane1;
    }

    public javax.swing.JLayeredPane getjLayeredPane2() {
        return jLayeredPane2;
    }

    public void setjLayeredPane2(javax.swing.JLayeredPane jLayeredPane2) {
        this.jLayeredPane2 = jLayeredPane2;
    }

    public pkl55.component.LoginBt getLoginBt1() {
        return loginBt1;
    }

    public void setLoginBt1(pkl55.component.LoginBt loginBt1) {
        this.loginBt1 = loginBt1;
    }

    public pkl55.background.LoginPageBg getLoginPageBg1() {
        return loginPageBg1;
    }

    public void setLoginPageBg1(pkl55.background.LoginPageBg loginPageBg1) {
        this.loginPageBg1 = loginPageBg1;
    }

    public pkl55.component.LoginTextField getLoginTextField1() {
        return loginTextField1;
    }

    public void setLoginTextField1(pkl55.component.LoginTextField loginTextField1) {
        this.loginTextField1 = loginTextField1;
    }

    public pkl55.component.MenuAwalBt getMenuAwalBt2() {
        return menuAwalBt2;
    }

    public void setMenuAwalBt2(pkl55.component.MenuAwalBt menuAwalBt2) {
        this.menuAwalBt2 = menuAwalBt2;
    }

    public pkl55.component.MinBt getMinBt1() {
        return minBt1;
    }

    public void setMinBt1(pkl55.component.MinBt minBt1) {
        this.minBt1 = minBt1;
    }

    public pkl55.component.PasswordTextField getPasswordTextField1() {
        return passwordTextField1;
    }

    public void setPasswordTextField1(pkl55.component.PasswordTextField passwordTextField1) {
        this.passwordTextField1 = passwordTextField1;
    }

    public pkl55.component.SettingBt getSettingBt1() {
        return settingBt1;
    }

    public void setSettingBt1(pkl55.component.SettingBt settingBt1) {
        this.settingBt1 = settingBt1;
    }
}
