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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author faqih_
 */
public class InputTextField extends TextField{

    public InputTextField() {
        
        //setOpaque(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));
        
        addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                setBackground(Color.PINK);
                //super.focusGained(e); //To change body of generated methods, choose Tools | Templates.
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                setBackground(Color.WHITE);
               // super.focusLost(e); //To change body of generated methods, choose Tools | Templates.
            }
            
            
});
        addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
            //    super.keyPressed(e); //To change body of generated methods, choose Tools | Templates.
                if(e.getKeyCode()==e.VK_ENTER){
                    nextFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
              //  super.keyReleased(e); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyTyped(KeyEvent e) {
                //super.keyTyped(e); //To change body of generated methods, choose Tools | Templates.
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
