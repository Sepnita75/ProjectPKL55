package pkl55.controller;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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

    public GeneralPanelController(JPanel mainPanel, final AllMenuButton button, DSSubPanel dSSubPanel,
            KuesSubPanel kuesSubPanel, aHelpCard helpCard) {

        this.mainPanel = mainPanel;
        this.button = button;
        this.dSSubPanel = dSSubPanel;
        this.kuesSubPanel = kuesSubPanel;
        this.helpCard = helpCard;

        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout) mainPanel.getLayout());
        controller.setParentCard(mainPanel);
        
        helpCont = new helpController(helpCard);

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
                if (getLoginPanelModel().isLoginStatus()) {
                    int t = JOptionPane.showConfirmDialog((Component) null, "Log out?",
                            "Perhatian", JOptionPane.OK_CANCEL_OPTION);
                    if (t == 0) {
                        backToLoginPanel();
                    }
                } else {
                    backToLoginPanel();
                }
            }

        });
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
