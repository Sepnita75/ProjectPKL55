package pkl55.component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginTextField extends JTextField{
    
    public LoginTextField() {
        setOpaque(false);
        setBorder(new EmptyBorder(2,2,2,2));
        setPreferredSize(new Dimension(275,32));
        setText("Masukan Username");
        setForeground(Color.LIGHT_GRAY);
        setFont(new Font("abeatbyKai", 0, 18));
        
    }
    
}
