package View;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.border.EmptyBorder;

public class InputTextField extends TextField{

     private boolean focus;
     
       public boolean isFocus() {
        return focus;
       
    }

    public void setFocus(boolean focus) {
        this.focus = focus;
        repaint();
    }
    
    @Override
    public void onEdit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onEndEdit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      public InputTextField() {
        setOpaque(true);
        setBorder(new EmptyBorder(3, 3, 3, 3));
    
    }
      
    @Override
    protected void paintComponent(Graphics g) {
              
        Graphics2D gd = (Graphics2D) g.create();
       
        gd.fillRect(0, 0, getWidth(), getHeight());
        
        gd.dispose();
        
      super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
    
    }
    
}
