package pkl55.controller;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import pkl55.maintest.DataEntry55;
import pkl55.model.LoginPanelModel;
import pkl55.panelcomponent.DBConfig;
import pkl55.panelcomponent.GeneralPanel;
import pkl55.panelcomponent.LoginPanel;

public class LoginPanelController {

    private JPanel mainPanel;
    private LoginPanel loginPanel;
    private LoginPanelModel loginPanelModel;
    private CardLayoutController controller;
    private GeneralPanel generalPanel;

    public LoginPanelController(JPanel mainPanel, final GeneralPanel generalPanel, final LoginPanel loginPanel, final LoginPanelModel loginPanelModel) {
        this.mainPanel = mainPanel;
        this.loginPanel = loginPanel;
        this.loginPanelModel = loginPanelModel;

        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout) mainPanel.getLayout());
        controller.setParentCard(mainPanel);
        generalPanel.getController().setLoginPanelModel(loginPanelModel);

        loginPanel.getHelpBt2().setVisible(false);
        loginPanel.getSettingBt1().setVisible(false);

        //EventHandler
        loginPanel.getHelpBt2().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                loginPanelModel.setLoginStatus(false);
                getController().show("generalpanel");
                generalPanel.getController().getController().show(generalPanel.getIcontemp1(), "helpsubpanel");
                generalPanel.getUserLabel().setText("GUEST");
                generalPanel.getIcontemp1().getDs1().setEnabled(false);
                generalPanel.getIcontemp1().getKuesioner1().setEnabled(false);
                closeLoginPanelMenu();
            }
        });

        loginPanel.getExitBt1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        loginPanel.getMinBt1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                DataEntry55.getInstance().minim();
                closeLoginPanelMenu();

            }
        });

        loginPanel.getLoginTextField1().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                closeLoginPanelMenu();
                loginPanel.getLoginTextField1().setText("");
                loginPanel.getLoginTextField1().setForeground(Color.black);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        loginPanel.getPasswordTextField1().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                closeLoginPanelMenu();
                loginPanel.getPasswordTextField1().setText("");
                loginPanel.getPasswordTextField1().setForeground(Color.black);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        loginPanel.getPasswordTextField1().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_ENTER) {
                    loginPanel.getLoginBt1().doClick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        loginPanel.getPasswordTextField1().addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                loginPanel.getPasswordTextField1().setEchoChar('●');
                loginPanel.getPasswordTextField1().setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });

        loginPanel.getLoginBt1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                closeLoginPanelMenu();
                usernameKosong();
                passwordKosong();
                generalPanel.getIcontemp1().getDs1().setActive();
                loginPanelModel.setLoginStatus(true);
                getController().show("generalpanel");

            }
        });

        loginPanel.getMenuAwalBt2().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (!loginPanelModel.isFlag()) {
                    loginPanelModel.setFlag(true);
                    loginPanel.getSettingBt1().setVisible(true);
                    loginPanel.getHelpBt2().setVisible(true);
                } else {
                    loginPanelModel.setFlag(false);
                    loginPanel.getSettingBt1().setVisible(false);
                    loginPanel.getHelpBt2().setVisible(false);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        loginPanel.getLoginPageBg1().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                closeLoginPanelMenu();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        loginPanel.getjLabel3().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                closeLoginPanelMenu();
                JOptionPane.showMessageDialog(loginPanel, "Hubungi/WA personil Data Entry : 082311897547",
                        "Lupa Password?", JOptionPane.INFORMATION_MESSAGE);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                loginPanel.getjLabel3().setForeground(new java.awt.Color(102, 204, 255));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginPanel.getjLabel3().setForeground(new java.awt.Color(255, 255, 255));

            }
        });

        loginPanel.getSettingBt1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                DBConfig dbc = new DBConfig();
                final JDialog frame = new JDialog(DataEntry55.getInstance(), "Setting", true);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.getContentPane().add(dbc.getJPanel2());
                frame.getContentPane().add(dbc.getJPanel1());
                frame.pack();
                frame.setVisible(true);
                closeLoginPanelMenu();
            }
        });

    }

    public void closeLoginPanelMenu() {
        getLoginPanelModel().setFlag(false);
        getLoginPanel().getSettingBt1().setVisible(false);
        getLoginPanel().getHelpBt2().setVisible(false);
    }

    public void usernameKosong() {
        if (getLoginPanel().getLoginTextField1().getText().length() < 1 || getLoginPanel().getLoginTextField1().getText().equalsIgnoreCase("Masukan Username")) {
            JOptionPane.showMessageDialog(getLoginPanel(), "Username masih kosong.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void passwordKosong() {
        if (getLoginPanel().getPasswordTextField1().getText().length() < 1) {
            JOptionPane.showMessageDialog(getLoginPanel(), "Password masih kosong.", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public LoginPanel getLoginPanel() {
        return loginPanel;
    }

    public void setLoginPanel(LoginPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

    public LoginPanelModel getLoginPanelModel() {
        return loginPanelModel;
    }

    public void setLoginPanelModel(LoginPanelModel loginPanelModel) {
        this.loginPanelModel = loginPanelModel;
    }

    public CardLayoutController getController() {
        return controller;
    }

    public void setController(CardLayoutController controller) {
        this.controller = controller;
    }

}
