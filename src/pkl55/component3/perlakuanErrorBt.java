/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.component3;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author nurilmi
 */
public class perlakuanErrorBt extends JButton{
    private ImageIcon icon;

    public perlakuanErrorBt() {

        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        icon = new ImageIcon(getClass().getResource("/pkl55/images/perlakuanErrorBt.png"));
        setIcon(icon);

        setPreferredSize(new Dimension(700, 50));
        setVisible(true);
        setText(null);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/perlakuanErrorBt-hover.png"));
                setIcon(icon);
                setCursor (new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/perlakuanErrorBt.png"));
                setIcon(icon);
            }

            @Override
            public void mousePressed(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/perlakuanErrorBt-pressed.png"));
                setIcon(icon);
            }
            
            @Override
            public void mouseReleased(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/perlakuanErrorBt-hover.png"));
                setIcon(icon);
                //setActive(true);
            }
        });
    }
}
