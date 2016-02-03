/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author faqih_
 */
public class BackButton extends JButton{

    private ImageIcon icon;
//    private 
    
    public BackButton() {
        
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        icon = new ImageIcon(getClass().getResource("/pkl55/images/next_loop.png"));
        setIcon(icon);
        setPreferredSize(new Dimension(30, 30));
        setVisible(true);
        setText("");
    }

    @Override
    public void setText(String string) {
        super.setText(""); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
