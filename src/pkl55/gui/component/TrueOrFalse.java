/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.gui.component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author faqih_
 */
public class TrueOrFalse extends JLabel {

    public TrueOrFalse() {
    }

    public void setTrue() {
        setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/centang.png")));
    }

    public void setFalse() {
        setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/salah.png")));
    }

    public void setNone() {
        setIcon(null);
    }

}
