/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.background3;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author nurilmi
 */
public class entriCacahIsi extends JPanel{
    private final Image image;
    
    public entriCacahIsi(){
        image = new ImageIcon(getClass().getResource("/pkl55/images/entriCacahIsi.png")).getImage();
        setPreferredSize(new Dimension(1366,1000));
    }
    

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        gd.drawImage(image, 0, 0,null);
        gd.dispose();
    }
    
}
