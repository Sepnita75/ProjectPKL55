/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.gui.panel;

import java.awt.Component;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import pkl55.data.model.Model;
import pkl55.gui.component.Called;
import pkl55.main.MainFrame;

/**
 *
 * @author faqih_
 */
public class MainPanel extends javax.swing.JPanel {

//    private Component
    public MainPanel() {
        initComponents();
        init();
        login();
    }

    private void init() {
        logo.setLocation(630, 20);
        repaint();
        all = new Component[16];
        all[0] = about;
        all[1] = background_title;
        all[2] = dock;
        all[3] = editButton;
        all[4] = entriButton;
        all[5] = newButton;
        all[6] = loginBox;
        all[7] = tableBox;
        all[8] = title;
        all[9] = user;
        all[10] = username_image;
        all[11] = loginLoadingBox;
        all[12] = help;
        all[13] = errorPanel;
        all[14] = entriPanel;
        all[15] = entriEditButton;
        newButton.setClick(new Called() {
            @Override
            public void click() {
                entriPanel.setKues(EntriPanel.LU);
                errorPanel.getErrorDetil().removeAll();
                errorPanel.getErrorList().removeAll();
                openEntriPanel();
            }
        });
        entriButton.setClick(new Called() {
            @Override
            public void click() {
                if (Model.isSE) {
                    entriPanel.setKues(EntriPanel.UU);
                } else {
                    entriPanel.setKues(EntriPanel.R);
                }
                errorPanel.getErrorDetil().removeAll();
                errorPanel.getErrorList().removeAll();
                openEntriPanel();
            }
        });
        exitApp.setClick(new Called() {
            @Override
            public void click() {
                if (entriPanel.isVisible() && errorPanel.isVisible()) {
                    int out = JOptionPane.showConfirmDialog(MainFrame.getInstance(), "Apakah Anda Yakin Ingin Menutup Aplikasi ?", "Perhatian", JOptionPane.OK_CANCEL_OPTION);
                    if (out == 0) {
                        System.exit(0);
                    }
                } else {
                    System.exit(0);
                }

            }
        });
        entriEditButton.setClick(new Called() {
            @Override
            public void click() {
                JTable table = tableBox.getTable();
                if (table.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(MainFrame.getInstance(), "Silahkan Pilih Isian Terlebih Dahulu", "Perhatian", JOptionPane.OK_OPTION);
                } else {
                    if (Model.isSE) {
                        entriPanel.setKues(EntriPanel.UU);
                    } else {
                        entriPanel.setKues(EntriPanel.R);
                    }
                    errorPanel.getErrorDetil().removeAll();
                    errorPanel.getErrorList().removeAll();
                    try {
                        Model.edit((String) table.getValueAt(table.getSelectedRow(), 1));
                    } catch (Exception ex) {
                        Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    openEntriPanel();
                }
            }
        });
        entriPanel.setErrorPanel(errorPanel.getErrorList(), errorPanel.getErrorDetil());
    }

    public JComponent getPanel() {
        return this;
    }

    public void animateLogo() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                boolean go = true;
                int x = logo.getLocation().x;
                for (; go;) {
                    logo.setLocation(x, logo.getLocation().y);
                    x -= 10;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (x <= 110) {
                        break;
                    }
                    repaint();
                }
            }
        }).start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minimizeApp = new pkl55.gui.component.Minimize_App();
        exitApp = new pkl55.gui.component.Exit_App();
        settingBox = new pkl55.gui.panel.SettingBox();
        logo = new pkl55.gui.component.Logo();
        errorPanel = new pkl55.gui.panel.ErrorPanel();
        entriPanel = new pkl55.gui.panel.EntriPanel();
        settingButton = new pkl55.gui.component.SettingButton();
        user = new javax.swing.JLabel();
        username_image = new javax.swing.JLabel();
        dock = new pkl55.gui.panel.Dock();
        help = new pkl55.gui.panel.Help();
        background_title = new javax.swing.JPanel();
        title_all = new javax.swing.JLabel();
        loginLoadingBox = new pkl55.gui.panel.LoginLoadingBox();
        entriButton = new pkl55.gui.component.EntriButton();
        entriEditButton = new pkl55.gui.component.EditButton();
        loginBox = new pkl55.gui.panel.LoginBox();
        about = new pkl55.gui.panel.About();
        tableBox = new pkl55.gui.panel.TableBox();
        editButton = new pkl55.gui.component.EditButton();
        newButton = new pkl55.gui.component.NewButton();
        title = new javax.swing.JLabel();
        background_image = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        /*
        add(minimizeApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 30, -1));
        */
        add(minimizeApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1295, 10, 30, -1));
        minimizeApp.setClick(new Called() {
            @Override
            public void click(){
                MainFrame.getInstance().minimize();
            }
        });

        exitApp.setClick(new Called(){
            @Override
            public void click(){
                System.exit(0);
            }
        });
        add(exitApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, -1, -1));

        settingBox.setVisible(false);
        add(settingBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, -1, -1));
        add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        add(errorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        add(entriPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        settingButton.setPreferredSize(new java.awt.Dimension(43, 43));
        add(settingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 50, -1, 50));
        settingButton.setClick(new Called(){
            @Override
            public void click(){
                if(settingBox.isVisible()){
                    settingBox.setVisible(false);
                }else{
                    settingBox.setVisible(true);
                }

            }
        });

        user.setFont(new java.awt.Font("Lobster Two", 1, 18)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("Sepnita Wulandari");
        /*
        add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 410, 20));
        */
        add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 67, 410, 20));

        username_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/useruse_background.png"))); // NOI18N
        /*
        add(username_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));
        */
        add(username_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 62, -1, -1));
        add(dock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));
        add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        background_title.setBackground(new java.awt.Color(0, 153, 102));
        background_title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 117, 78), 3));

        title_all.setBackground(new java.awt.Color(0, 153, 102));
        title_all.setFont(new java.awt.Font("Lobster Two", 1, 21)); // NOI18N
        title_all.setForeground(new java.awt.Color(255, 255, 255));
        title_all.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_all.setText("Validasi");
        background_title.add(title_all);

        add(background_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 380, 40));
        add(loginLoadingBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));
        add(entriButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 370, -1, -1));
        add(entriEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 430, -1, -1));
        add(loginBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));
        add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));
        add(tableBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));
        add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 450, -1, -1));
        add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 390, -1, -1));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/title_app.png"))); // NOI18N
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 360, -1));

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/main_background.png"))); // NOI18N
        add(background_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl55.gui.panel.About about;
    private javax.swing.JLabel background_image;
    private javax.swing.JPanel background_title;
    private pkl55.gui.panel.Dock dock;
    private pkl55.gui.component.EditButton editButton;
    private pkl55.gui.component.EntriButton entriButton;
    private pkl55.gui.component.EditButton entriEditButton;
    private pkl55.gui.panel.EntriPanel entriPanel;
    private pkl55.gui.panel.ErrorPanel errorPanel;
    private pkl55.gui.component.Exit_App exitApp;
    private pkl55.gui.panel.Help help;
    private pkl55.gui.panel.LoginBox loginBox;
    private pkl55.gui.panel.LoginLoadingBox loginLoadingBox;
    private pkl55.gui.component.Logo logo;
    private pkl55.gui.component.Minimize_App minimizeApp;
    private pkl55.gui.component.NewButton newButton;
    private pkl55.gui.panel.SettingBox settingBox;
    private pkl55.gui.component.SettingButton settingButton;
    private pkl55.gui.panel.TableBox tableBox;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title_all;
    private javax.swing.JLabel user;
    private javax.swing.JLabel username_image;
    // End of variables declaration//GEN-END:variables

    private Component all[];

    public void entriDLU() {
        for (Component c : all) {
            if (c != username_image && c != user && c != dock) {
                c.setVisible(false);
            }
        }
        title_all.setText("Entri DLU");
        background_title.setVisible(true);
        title_all.setVisible(true);
        tableBox.setVisible(true);
        newButton.setVisible(true);
        editButton.setVisible(true);
    }

    public void openEntriPanel() {
        for (Component c : all) {
            if (c != username_image && c != user) {
                c.setVisible(false);
            }
        }
        entriPanel.setVisible(true);
        errorPanel.setVisible(true);
    }

    public void entriKues() {
        try {
            for (Component c : all) {
                if (c != username_image && c != user && c != dock) {
                    c.setVisible(false);
                }
            }
            tableBox.getTable().setModel(new javax.swing.table.DefaultTableModel(
                    Model.getTable(false),
                    new String[]{
                        "No ", "nks", "status", "terkirim"
                    }
            ) {
                Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };

                @Override
                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }
            });
            title_all.setText("Entri Pencacahan");
            background_title.setVisible(true);
            title_all.setVisible(true);
            tableBox.setVisible(true);
            entriButton.setVisible(true);
            entriEditButton.setVisible(true);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void developer() {
        for (Component c : all) {
            if (c != username_image && c != user && c != dock) {
                c.setVisible(false);
            }
        }
        title_all.setText("Developer Data Entri 55");
        background_title.setVisible(true);
        title_all.setVisible(true);
        about.setVisible(true);
    }

    public void help() {
        for (Component c : all) {
            if (c != username_image && c != user && c != dock) {
                c.setVisible(false);
            }
        }
        title_all.setText("Help");
        background_title.setVisible(true);
        title_all.setVisible(true);
        getHelp().setVisible(true);
    }

    public void logout() {
        //logout process

        login();
    }

    public void toMenu() {
        loginLoadingBox.setVisible(false);
        animateLogo();
        username_image.setVisible(true);
        user.setVisible(true);
        if (Model.isPapi && Model.isSE) {
            dock.open(Dock.PAPI_SE);
            entriDLU();
        } else if (Model.isPapi && !Model.isSE) {
            dock.open(Dock.PAPI_SK);
            entriKues();
        } else if (!Model.isPapi && Model.isSE) {
            dock.open(Dock.CAPI_SE);
            entriDLU();
        }
        dock.setVisible(true);
    }

    public void mainMenu() {
        for (Component c : all) {
            c.setVisible(false);
        }
        loginLoadingBox.setVisible(false);
        animateLogo();
        username_image.setVisible(true);
        user.setVisible(true);
        if (Model.isPapi && Model.isSE) {
            dock.open(Dock.PAPI_SE);
            entriDLU();
        } else if (Model.isPapi && !Model.isSE) {
            dock.open(Dock.PAPI_SK);
            entriKues();
        } else if (!Model.isPapi && Model.isSE) {
            dock.open(Dock.CAPI_SE);
            entriDLU();
        }
        dock.setVisible(true);
    }

    public void login() {
        for (Component c : all) {
            c.setVisible(false);
        }
        loginBox.setVisible(true);
        title.setVisible(true);

    }

    public void guest() {
        for (Component c : all) {
            c.setVisible(false);
        }
        help();
        dock.open(Dock.GUEST);
        dock.setVisible(true);
    }

    public void loading(String username, String password) {
        for (Component c : all) {
            c.setVisible(false);
        }
        loginLoadingBox.setVisible(true);
        loginLoadingBox.start();
        process(username, password);
    }
    private boolean go = true;
    private boolean isLogin = false;
    private int counter = 0;

    public void process(final String username, final String password) {
        new Thread() {
            @Override
            public void run() {
                isLogin = Model.login(username, password);
                go = false;
            }

        }.start();
        new Thread() {
            @Override
            public void run() {
                settingButton.setVisible(false);
                settingBox.setVisible(false);
                try {
                    Thread.sleep(1000);
                    while (go && counter <= 20) {
                        Thread.sleep(1000);
                        counter++;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (username.equals("KT001") && password.toLowerCase().equals("12345")) {
                    isLogin = true;
                    Model.isPapi = true;//nanti hapus ini
                    Model.isSE = false;//nanti hapus ini
                } else if (username.equals("KT002") && password.toLowerCase().equals("12345")) {
                    isLogin = true;
                    Model.isPapi = true;//nanti hapus ini
                    Model.isSE = true;//nanti hapus ini
                } else if (username.equals("KT003") && password.toLowerCase().equals("12345")) {
                    isLogin = true;
                    Model.isPapi = false;//nanti hapus ini
                    Model.isSE = true;//nanti hapus ini
                }
                String name = Model.getName();

                user.setText(name);

                if (isLogin) {
                    loginLoadingBox.stop();
                    settingButton.setVisible(true);
                    toMenu();
                } else {
                    loginLoadingBox.stop();
                    settingButton.setVisible(true);
                    loginLoadingBox.setVisible(false);
                    loginBox.setVisible(true);
                    JOptionPane.showMessageDialog(MainFrame.getInstance(), "Login Gagal", "Perhatian", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }.start();
    }

    /**
     * @return the help
     */
    public pkl55.gui.panel.Help getHelp() {
        return help;
    }

    /**
     * @param help the help to set
     */
    public void setHelp(pkl55.gui.panel.Help help) {
        this.help = help;
    }

    /**
     * @return the errorPanel
     */
    public pkl55.gui.panel.ErrorPanel getErrorPanel() {
        return errorPanel;
    }
}
