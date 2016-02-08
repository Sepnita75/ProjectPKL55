
package pkl55.background;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
//jhjhj
public class tick  extends JPanel{
    private Image image;
    
    public tick(){
        image = new ImageIcon(getClass().getResource("/pkl55/images/tick.png")).getImage();
        setPreferredSize(new Dimension(25,25));
    }
    

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(getImage(), 0, 0,null);
        gd.dispose();
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    
}
