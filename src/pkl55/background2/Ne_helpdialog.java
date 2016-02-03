
package pkl55.background2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Ne_helpdialog  extends JPanel{
    private final Image image;
    
    public Ne_helpdialog(){
        image = new ImageIcon(getClass().getResource("/pkl55/images/new-judul.png")).getImage();
        setPreferredSize(new Dimension(1142,538));
    }
    

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(image, 0, 0,null);
        gd.dispose();
    }
    
}
