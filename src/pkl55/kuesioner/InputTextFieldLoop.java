/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.kuesioner;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author faqih_
 */
public class InputTextFieldLoop extends TextFieldLoop{

    public InputTextFieldLoop() {
        setOpaque(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));
        
        addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                setBackground(Color.pink);
                //super.focusGained(e); //To change body of generated methods, choose Tools | Templates.
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                setBackground(Color.white);
               // super.focusLost(e); //To change body of generated methods, choose Tools | Templates.
            }
            
            
});
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd = (Graphics2D) g.create();
        gd.fillRect(0, 0, getWidth(), getHeight());
        gd.dispose();
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
