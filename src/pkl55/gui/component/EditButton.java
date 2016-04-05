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
public class EditButton extends Dock_Button{

    public EditButton() {
        super("edit_btn",new Called() {
            @Override
            public void click() {
                
            }
        });
        setToolTipText("Edit DLU");
    }
    
}
