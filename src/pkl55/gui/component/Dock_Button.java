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
public abstract class Dock_Button extends JLabel{
    private Called click;
    private String button_type;
    
    public Dock_Button(String buttonType,final Called call) {
        this.click = call;
        setText("");
        button_type = buttonType;
        setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/"+button_type+".png")));
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {
                setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/"+button_type+"_clicked.png")));
            }
                
            @Override
            public void mouseReleased(MouseEvent me) {
                if(((getLocationOnScreen().x<MouseInfo.getPointerInfo().getLocation().x)&&((getLocationOnScreen().x+getWidth())>MouseInfo.getPointerInfo().getLocation().x))&&((getLocationOnScreen().y<MouseInfo.getPointerInfo().getLocation().y)&&((getLocationOnScreen().y+getHeight())>MouseInfo.getPointerInfo().getLocation().y))){
                    setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/"+button_type+"_hover.png")));
                }
                click.click();
            }
                
            @Override
            public void mouseEntered(MouseEvent me) {
                setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/"+button_type+"_hover.png")));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/"+button_type+".png")));
            }
        });
    }

    public  void setClick(Called click){
        this.click = click;
    }

    /**
     * @return the button_type
     */
    public String getButton_type() {
        return button_type;
    }

    /**
     * @param button_type the button_type to set
     */
    public void setButton_type(String button_type) {
        this.button_type = button_type;
    }
}
