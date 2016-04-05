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
public class SettingButton extends JLabel{
    private Called click;

    private boolean open;
    
    public SettingButton() {
        setToolTipText("Settings");
        setText("");
        open = false;
        setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/setting.png")));
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {
                setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/setting_clicked.png")));
            }
                
            @Override
            public void mouseReleased(MouseEvent me) {
                if(((getLocationOnScreen().x<MouseInfo.getPointerInfo().getLocation().x)&&((getLocationOnScreen().x+getWidth())>MouseInfo.getPointerInfo().getLocation().x))&&((getLocationOnScreen().y<MouseInfo.getPointerInfo().getLocation().y)&&((getLocationOnScreen().y+getHeight())>MouseInfo.getPointerInfo().getLocation().y))){
                    setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/setting_hover.png")));
                }
                click.click();
            }
                
            @Override
            public void mouseEntered(MouseEvent me) {
                setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/setting_hover.png")));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/setting.png")));
            }
        });
    }

    public  void setClick(Called click){
        this.click = click;
    }

    /**
     * @return the open
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * @param open the open to set
     */
    public void setOpen(boolean open) {
        this.open = open;
    }
}
