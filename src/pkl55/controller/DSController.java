package pkl55.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pkl55.panelcomponent.DSSubPanel;
import pkl55.panelcomponent.EntryDSPanel;

public class DSController {

    private EntryDSPanel entryDSPanel;
    private DSSubPanel dSSubPanel;
    private LoginPanelController loginPanelController;

    public DSController(LoginPanelController loginPanelController, EntryDSPanel entryDSPanel, DSSubPanel dSSubPanel) {
        this.entryDSPanel = entryDSPanel;
        this.dSSubPanel = dSSubPanel;

        dSSubPanel.getStartds1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                loginPanelController.getController().show("entryds");
            }
        });

        entryDSPanel.getLogout21().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int t = JOptionPane.showConfirmDialog((Component) null, "Batalkan?",
                        "Perhatian", JOptionPane.OK_CANCEL_OPTION);
                if (t == 0) {
                    loginPanelController.getController().show("generalpanel");
                }
            }
        });
        
        entryDSPanel.getSave1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int t = JOptionPane.showConfirmDialog((Component) null, "Tambah entrian?",
                        "Perhatian", JOptionPane.OK_CANCEL_OPTION);
            }
        });
    }

}
