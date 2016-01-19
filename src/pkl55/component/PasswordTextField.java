package pkl55.component;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public class PasswordTextField extends JPasswordField{
    
    
    public PasswordTextField(){
        setOpaque(false);
        setBorder(new EmptyBorder(2, 2, 2, 2));
        setPreferredSize(new Dimension(275,32));
        setEchoChar((char)0);
        setForeground(Color.LIGHT_GRAY);
    }
    
}
