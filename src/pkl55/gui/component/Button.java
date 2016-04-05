/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.gui.component;

/**
 *
 * @author faqih_
 */
public class Button extends Dock_Button {

    public Button() {
        super("button", null);
        setClick(new Called() {
            @Override
            public void click() {
                
            }
        });
    }

}
