package test;
import java.awt.MouseInfo;
import javax.swing.JDialog; 
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import pkl55.data.model.Database;
import pkl55.gui.component.Alert;
import pkl55.gui.panel.AlertPanel;
import pkl55.gui.panel.DockPapiSE;
import pkl55.gui.panel.EntriPanel;
import pkl55.gui.panel.LoginBox;
import pkl55.gui.panel.LoginLoadingBox;
import pkl55.gui.panel.MainPanel;
import pkl55.kuesioner.validasi.ValidasiR;
import pkl55.kuesioner.view.LUMainPanel;
import pkl55.kuesioner.view.UUMainPanel;

public class CustomDialog extends JDialog implements ActionListener {
    private JPanel myPanel = null;
    private JButton yesButton = null;
    private JButton noButton = null;
    private boolean answer = false;
    public boolean getAnswer() { return answer; }
    public static int i = 1;
    public static int b = 1;
    
    public static void main(String[] args) { 
//        MainPanel k = new MainPanel();
//        new Alert(k, null);
        ValidasiR.kuesioner();
    }
    
    public CustomDialog(JFrame frame, boolean modal, String myMessage) {
        super(frame, modal);
        myPanel = new JPanel();
        getContentPane().add(new LoginBox());
        myPanel.add(new JLabel(myMessage));
        yesButton = new JButton("Yes");
        yesButton.addActionListener(this);
        myPanel.add(yesButton); 
        noButton = new JButton("No");
        noButton.addActionListener(this);
        myPanel.add(noButton);  
        pack();
        setLocationRelativeTo(frame);
        setVisible(true);
        System.out.println("\t"+yesButton.getLocationOnScreen().x+"\t"+yesButton.getLocationOnScreen().y);
        System.out.println("\t"+(yesButton.getLocationOnScreen().x+yesButton.getWidth())+"\t"+(yesButton.getLocationOnScreen().y+yesButton.getHeight()));
        yesButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent me) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                System.out.print(((yesButton.getLocationOnScreen().x<MouseInfo.getPointerInfo().getLocation().x)&&((yesButton.getLocationOnScreen().x+yesButton.getWidth())>MouseInfo.getPointerInfo().getLocation().x))+"\t");
                System.out.println(((yesButton.getLocationOnScreen().y<MouseInfo.getPointerInfo().getLocation().y)&&((yesButton.getLocationOnScreen().y+yesButton.getHeight())>MouseInfo.getPointerInfo().getLocation().y))+"\t");
            }

            @Override
            public void mouseExited(MouseEvent me) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if(yesButton == e.getSource()) {
            System.err.println("User chose yes.");
            answer = true;
            setVisible(false);
        }
        else if(noButton == e.getSource()) {
            System.err.println("User chose no.");
            answer = false;
            setVisible(false);
        }
        dispose();
    }
    
}