/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.gui.component;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JLabel;

/**
 *
 * @author faqih_
 */
public class LoginBottomLabel extends JLabel {

    private Called click;
    private final Font FONT = new Font("Lobster two", 0, 20);
    private final Map ATTRIBUTES;
    
    public LoginBottomLabel() {
        ATTRIBUTES = FONT.getAttributes();
        ATTRIBUTES.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        setFont(FONT);
        setForeground(new java.awt.Color(0, 153, 102));
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
                setForeground(new java.awt.Color(0, 195, 130));
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                setForeground(new java.awt.Color(0, 153, 102));
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                setFont(FONT.deriveFont(ATTRIBUTES));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setFont(FONT);
            }
        });
    }

    public void setClick(Called click) {
        this.click = click;
    }
}
