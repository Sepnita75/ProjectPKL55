/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.gui.component;

import pkl55.main.MainFrame;

/**
 *
 * @author faqih_
 */
public class LogoutButton extends Dock_Button {
    public LogoutButton() {
        super("exit_btn",new Called() {
            @Override
            public void click() {
                MainFrame.getInstance().getMainPanel1().login();
            }
        });
        setToolTipText("Logout");
    }
}
