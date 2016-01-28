package pkl55.background;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class NavBar  extends JPanel{
    private final Image image;
    
    public NavBar(){
        image = new ImageIcon(getClass().getResource("/pkl55/images/navbar.png")).getImage();
        setPreferredSize(new Dimension(106,633));
    }
    

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(image, 0, 0,null);
        gd.dispose();
    }
    
}
