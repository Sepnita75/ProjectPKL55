package pkl55.component2;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class About extends JButton {

    private ImageIcon icon;
    private boolean flag;

    public About() {
        flag = false;

        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        icon = new ImageIcon(getClass().getResource("/pkl55/images/about.png"));
        setIcon(icon);

        setPreferredSize(new Dimension(105, 80));
        setVisible(true);
        setText(null);
        setToolTipText("Tentang pembuat aplikasi");

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                if (isFlag() == false) {
                    icon = new ImageIcon(getClass().getResource("/pkl55/images/about-hover.png"));
                    setIcon(icon);
                        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                }

            }

            @Override
            public void mouseExited(MouseEvent me) {
                if (isFlag() == false) {
                    icon = new ImageIcon(getClass().getResource("/pkl55/images/about.png"));
                    setIcon(icon);
                } else {
                    setActive();
                }

            }

            @Override
            public void mousePressed(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/about-pressed.png"));
                setIcon(icon);
                if (isFlag() == false) {
                    setFlag(true);
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (isFlag() == true) {
                    icon = new ImageIcon(getClass().getResource("/pkl55/images/about-hover.png"));
                    setIcon(icon);
                }

            }

        });
    }

    public void setActive() {
        icon = new ImageIcon(getClass().getResource("/pkl55/images/about-hover.png"));
        setIcon(icon);
    }

    public void reset() {
        setFlag(false);
        icon = new ImageIcon(getClass().getResource("/pkl55/images/about.png"));
        setIcon(icon);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
