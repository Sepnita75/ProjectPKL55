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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import pkl55.maintest.DataEntry55;
import pkl55.model.LoginPanelModel;
import pkl55.panelcomponent.DBConfig;
import pkl55.panelcomponent.GeneralPanel;
import pkl55.panelcomponent.LoginPanel;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import pkl55.util.DBConfigModel;

public class LoginPanelController {

    public static JSONObject getJson() {
        return json;
    }

    public static void setJson(JSONObject aJson) {
        json = aJson;
    }

    private JPanel mainPanel;
    private LoginPanel loginPanel;
    private LoginPanelModel loginPanelModel;
    private CardLayoutController controller;
    private GeneralPanel generalPanel;
    private static JSONObject json;
    private DBConfig dbc;

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
        
        dbc = new DBConfig();

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
                if (getLoginPanel().getLoginTextField1().getText().length() < 1 || getLoginPanel().getLoginTextField1().getText().equalsIgnoreCase("Masukan Username")) {
                    JOptionPane.showMessageDialog(getLoginPanel(), "Username masih kosong.", "Notification", JOptionPane.INFORMATION_MESSAGE);
                } else if (getLoginPanel().getPasswordTextField1().getText().length() < 1) {
                    JOptionPane.showMessageDialog(getLoginPanel(), "Password masih kosong.", "Notification", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (login() == 3) {
                        if (getJson().get("UserstatusLogin").toString().equalsIgnoreCase("1")) {
                            JOptionPane.showMessageDialog(loginPanel, "User masih aktif, mohon logout dahulu atau hubungi admin.",
                                    "Perhatian", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            generalPanel.getIcontemp1().getDs1().setActive();
                            loginPanelModel.setLoginStatus(true);
                            generalPanel.getUserLabel().setText(getJson().get("Usernama").toString());
                            DataEntry55.getInstance().getEntryKues1().getjLabel1().setText(getJson().get("Usernama").toString());
                            DataEntry55.getInstance().getEntryDSPanel1().getjLabel1().setText(getJson().get("Usernama").toString());
                            getController().show("generalpanel");
                        }
                    } else if (login() == 2) {
                        JOptionPane.showMessageDialog(loginPanel, "Password atau username salah.",
                                "Perhatian", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(loginPanel, "Koneksi bermasalah, ulangi lagi atau hubungi admin.",
                                "Perhatian", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

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
                final JDialog frame = new JDialog(DataEntry55.getInstance(), "Setting", true);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.getContentPane().add(getDbc().getJPanel2());
                frame.getContentPane().add(getDbc().getJPanel1());
                frame.pack();
                frame.setVisible(true);
                closeLoginPanelMenu();
            }
        });

    }

    public int login() {
        URL url;
        try {
            String fromSetting = getDbc().getDBConfig().getLoginUrl();
            if(fromSetting!=null){
                url = new URL(fromSetting);
            } else url = new URL("http://izziweb.net/ServerPKL/Server.php?type=login");
        } catch (MalformedURLException ex) {
            return 1;
        }
        Map<String, Object> params = new LinkedHashMap<>();
        params.put("username", loginPanel.getLoginTextField1().getText());
        params.put("password", loginPanel.getPasswordTextField1().getText());

        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String, Object> param : params.entrySet()) {
            if (postData.length() != 0) {
                postData.append('&');
            }
            try {
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            } catch (UnsupportedEncodingException ex) {
                return 1;
            }
            postData.append('=');
            try {
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
            } catch (UnsupportedEncodingException ex) {
                return 1;
            }
        }
        byte[] postDataBytes;
        try {
            postDataBytes = postData.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            return 1;
        }

        HttpURLConnection conn;
        try {
            conn = (HttpURLConnection) url.openConnection();
        } catch (IOException ex) {
            return 1;
        }
        try {
            conn.setRequestMethod("POST");
        } catch (ProtocolException ex) {
            return 1;
        }
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        try {
            conn.getOutputStream().write(postDataBytes);
        } catch (IOException ex) {
            return 1;
        }

        Reader in;
        try {
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        } catch (IOException ex) {
            return 1;
        }

        String json1 = "";
        try {
            for (int c = in.read(); c != -1; c = in.read()) {
                json1 += (char) c;
            }
        } catch (IOException ex) {
            return 1;
        }
        JSONObject json = null;
        if (!json1.equalsIgnoreCase("[]")) {
            try {
                json = (JSONObject) new JSONParser().parse(json1);
                this.setJson(json);
                return 3;
            } catch (ParseException ex) {
                return 1;
            }
        } else {
            return 2;
        }
    }

    public void closeLoginPanelMenu() {
        getLoginPanelModel().setFlag(false);
        getLoginPanel().getSettingBt1().setVisible(false);
        getLoginPanel().getHelpBt2().setVisible(false);
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

    public DBConfig getDbc() {
        return dbc;
    }

    public void setDbc(DBConfig dbc) {
        this.dbc = dbc;
    }

}
