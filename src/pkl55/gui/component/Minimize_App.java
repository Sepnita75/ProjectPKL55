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
public class Minimize_App extends JLabel{
    
    private Called click;
    
    public Minimize_App() {
        setToolTipText("Minimize");
        setText("");
        setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/minimize.png")));
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {
                setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/minimize_clicked.png")));
            }
                
            @Override
            public void mouseReleased(MouseEvent me) {
                if(((getLocationOnScreen().x<MouseInfo.getPointerInfo().getLocation().x)&&((getLocationOnScreen().x+getWidth())>MouseInfo.getPointerInfo().getLocation().x))&&((getLocationOnScreen().y<MouseInfo.getPointerInfo().getLocation().y)&&((getLocationOnScreen().y+getHeight())>MouseInfo.getPointerInfo().getLocation().y))){
                    setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/minimize_hover.png")));
                }
                click.click();
            }
                
            @Override
            public void mouseEntered(MouseEvent me) {
                setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/minimize_hover.png")));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setIcon(new ImageIcon(getClass().getResource("/pkl55/gui/images/minimize.png")));
            }
        });
    }

    public  void setClick(Called click){
        this.click = click;
    }
}
