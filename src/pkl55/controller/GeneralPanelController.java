package pkl55.controller;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import pkl55.component.ExitBt;
import pkl55.helpPanelComponent.aHelpCard;
import pkl55.maintest.DataEntry55;
import pkl55.model.LoginPanelModel;
import pkl55.panelcomponent.AllMenuButton;
import pkl55.panelcomponent.DSSubPanel;
import pkl55.panelcomponent.KuesSubPanel;

public class GeneralPanelController {

    private JPanel mainPanel;
    private AllMenuButton button;
    private CardLayoutController controller;
    private DSSubPanel dSSubPanel;
    private KuesSubPanel kuesSubPanel;
    private LoginPanelModel loginPanelModel;
    private aHelpCard helpCard;
    private helpController helpCont;
    private ExitBt exitBt;

    public GeneralPanelController(ExitBt exitBt, JPanel mainPanel, final AllMenuButton button, DSSubPanel dSSubPanel,
            KuesSubPanel kuesSubPanel, aHelpCard helpCard) {
        this.exitBt = exitBt;
        this.mainPanel = mainPanel;
        this.button = button;
        this.dSSubPanel = dSSubPanel;
        this.kuesSubPanel = kuesSubPanel;
        this.helpCard = helpCard;

        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout) mainPanel.getLayout());
        controller.setParentCard(mainPanel);

        helpCont = new helpController(helpCard);

        exitBt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (loginPanelModel.isLoginStatus()) {
                    int t = JOptionPane.showConfirmDialog((Component) null, "Log out dan Keluar?",
                            "Perhatian", JOptionPane.OK_CANCEL_OPTION);
                    if (t == 0) {
                        try {
                            if(logout()==3){
                                System.exit(0);
                            } else{
                                JOptionPane.showMessageDialog(null, "Jaringan bermasalah.",
                                        "Perhatian", JOptionPane.INFORMATION_MESSAGE);                         
                            }
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "Jaringan bermasalah.",
                        "Perhatian", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } else {
                    int t = JOptionPane.showConfirmDialog((Component) null, "Keluar?",
                            "Perhatian", JOptionPane.OK_CANCEL_OPTION);
                    if (t == 0) {
                        System.exit(0);
                    }
                }
            }
        });

        button.getDs1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getController().show(button, "dssubpanel");
            }
        });

        button.getKuesioner1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getController().show(button, "kuessubpanel");
            }
        });

        button.getHelp1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getController().show(button, "helpsubpanel");
            }
        });

        button.getAbout1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getController().show(button, "aboutsubpanel");
            }
        });

        button.getLogout1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {                
                if (loginPanelModel.isLoginStatus()) {
                    int t = JOptionPane.showConfirmDialog((Component) null, "Log out?",
                            "Perhatian", JOptionPane.OK_CANCEL_OPTION);
                    if (t == 0) {
                        try {
                            if(logout()==3){
                                backToLoginPanel();
                            } else{
                                JOptionPane.showMessageDialog(null, "Jaringan bermasalah.",
                                        "Perhatian", JOptionPane.INFORMATION_MESSAGE);                         
                            }
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "Jaringan bermasalah.",
                        "Perhatian", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }

        });
    }
    
    public int logout() throws IOException{
        URL url;
        try {
            url = new URL("http://izziweb.net/ServerPKL/Server.php?type=logout");
        } catch (MalformedURLException ex) {
            return 1;
        }
        Map<String,Object> params = new LinkedHashMap<>();
        params.put("username", LoginPanelController.getJson().get("Userusername".toString()));
        params.put("password", LoginPanelController.getJson().get("Userpass".toString()));

        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String,Object> param : params.entrySet()) {
            if (postData.length() != 0) postData.append('&');
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
            conn = (HttpURLConnection)url.openConnection();
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
        
        try {
            Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            return 1;
        }
        return 3;
    }

    private void backToLoginPanel() {
        button.getKuesioner1().setEnabled(true);
        button.getDs1().setEnabled(true);
        DataEntry55.getInstance().getLoginPanelController().getController().show("loginpanel");
        getController().show(button, "dssubpanel");
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public AllMenuButton getButton() {
        return button;
    }

    public void setButton(AllMenuButton button) {
        this.button = button;
    }

    public CardLayoutController getController() {
        return controller;
    }

    public void setController(CardLayoutController controller) {
        this.controller = controller;
    }

    public DSSubPanel getdSSubPanel() {
        return dSSubPanel;
    }

    public void setdSSubPanel(DSSubPanel dSSubPanel) {
        this.dSSubPanel = dSSubPanel;
    }

    public KuesSubPanel getKuesSubPanel() {
        return kuesSubPanel;
    }

    public void setKuesSubPanel(KuesSubPanel kuesSubPanel) {
        this.kuesSubPanel = kuesSubPanel;
    }

    public LoginPanelModel getLoginPanelModel() {
        return loginPanelModel;
    }

    public void setLoginPanelModel(LoginPanelModel loginPanelModel) {
        this.loginPanelModel = loginPanelModel;
    }

}
