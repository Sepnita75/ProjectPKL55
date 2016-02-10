package pkl55.component2;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Help extends JButton {

    private ImageIcon icon;
    private boolean flag;

    public Help() {
        flag = false;

        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        icon = new ImageIcon(getClass().getResource("/pkl55/images/helpNavBar.png"));
        setIcon(icon);

        setPreferredSize(new Dimension(105, 80));
        setVisible(true);
        setText(null);
        setToolTipText("Bantuan menggunakan aplikasi");

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                if (isFlag() == false) {
                    icon = new ImageIcon(getClass().getResource("/pkl55/images/helpNavBar-hover.png"));
                    setIcon(icon);
                        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                }

            }

            @Override
            public void mouseExited(MouseEvent me) {
                if (isFlag() == false) {
                    icon = new ImageIcon(getClass().getResource("/pkl55/images/helpNavBar.png"));
                    setIcon(icon);
                } else {
                    setActive();
                }

            }

            @Override
            public void mousePressed(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/pkl55/images/helpNavBar-pressed.png"));
                setIcon(icon);
                if (isFlag() == false) {
                    setFlag(true);
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (isFlag() == true) {
                    icon = new ImageIcon(getClass().getResource("/pkl55/images/helpNavBar-hover.png"));
                    setIcon(icon);
                }

            }

        });
    }

    public void setActive() {
        setFlag(true);
        icon = new ImageIcon(getClass().getResource("/pkl55/images/helpNavBar-hover.png"));
        setIcon(icon);
    }

    public void reset() {
        setFlag(false);
        icon = new ImageIcon(getClass().getResource("/pkl55/images/helpNavBar.png"));
        setIcon(icon);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
