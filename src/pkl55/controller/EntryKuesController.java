package pkl55.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pkl55.model.EntryKuesModel;
import pkl55.panelcomponent.EntryKuesPanel;
import pkl55.panelcomponent.KuesSubPanel;

public class EntryKuesController {

    private KuesSubPanel kuesSubPanel;
    private EntryKuesPanel entryKues;
    private EntryKuesModel entryKuesModel;
    private LoginPanelController loginPanelController;

    public EntryKuesController(EntryKuesPanel entryKues, EntryKuesModel entryKuesModel, final LoginPanelController loginPanelController, KuesSubPanel kuesSubPanel) {
        this.kuesSubPanel = kuesSubPanel;
        this.entryKues = entryKues;
        this.entryKuesModel = entryKuesModel;
        this.loginPanelController = loginPanelController;
        
        kuesSubPanel.getUpdateds1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                loginPanelController.getController().show("entry");
                
            }
        });

        entryKues.getLogout21().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int t = JOptionPane.showConfirmDialog((Component) null, "Batalkan?",
                        "Perhatian", JOptionPane.OK_CANCEL_OPTION);
                if (t == 0) {
                    loginPanelController.getController().show("generalpanel");
                }
            }
        });
        
        entryKues.getSave1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int t = JOptionPane.showConfirmDialog((Component) null, "Tambah entrian?",
                        "Perhatian", JOptionPane.OK_CANCEL_OPTION);
            }
        });
    }

}
