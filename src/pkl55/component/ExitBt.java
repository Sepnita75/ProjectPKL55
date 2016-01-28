package pkl55.component;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ExitBt extends JButton {

    private ImageIcon icon;

    public ExitBt() {

        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        icon = new ImageIcon(getClass().getResource("/pkl55/images/exit.png"));
        setIcon(icon);

        setPreferredSize(new Dimension(64, 56));
        setVisible(true);
        setText(null);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/exit-hover.png"));
                setIcon(icon);
                setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/exit.png"));
                setIcon(icon);
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mousePressed(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/exit-pressed.png"));
                setIcon(icon);
            }
                        
        });
    }

}
