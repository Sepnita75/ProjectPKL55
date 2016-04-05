/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.gui.component;

import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author faqih_
 */
public class Toggle extends JLabel {

    private boolean isYes;

    public boolean isYes() {
        return isYes;
    }

    public void setYes(boolean isYes) {
        this.isYes = isYes;
        
    }

    public Toggle() {
        setText("");
        this.isYes = false;
        setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/toggle_no.png")));

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
                if (isYes()) {
                    setYes(false);
                    setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/toggle_no_hover.png")));
                } else {
                    setYes(true);
                    setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/toggle_yes_hover.png")));
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (isYes()) {
                    if (!((getLocationOnScreen().x < MouseInfo.getPointerInfo().getLocation().x) && ((getLocationOnScreen().x + getWidth()) > MouseInfo.getPointerInfo().getLocation().x)) && ((getLocationOnScreen().y < MouseInfo.getPointerInfo().getLocation().y) && ((getLocationOnScreen().y + getHeight()) > MouseInfo.getPointerInfo().getLocation().y))) {
                        setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/toggle_yes.png")));
                    }
                } else {
                    if (!((getLocationOnScreen().x < MouseInfo.getPointerInfo().getLocation().x) && ((getLocationOnScreen().x + getWidth()) > MouseInfo.getPointerInfo().getLocation().x)) && ((getLocationOnScreen().y < MouseInfo.getPointerInfo().getLocation().y) && ((getLocationOnScreen().y + getHeight()) > MouseInfo.getPointerInfo().getLocation().y))) {
                        setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/toggle_no.png")));
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                if (isYes()) {
                    setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/toggle_yes_hover.png")));
                } else {
                    setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/toggle_no_hover.png")));
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if (isYes()) {
                    setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/toggle_yes.png")));
                } else {
                    setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/toggle_no.png")));
                }
            }
        });
    }
}
