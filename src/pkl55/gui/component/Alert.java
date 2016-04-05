/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.gui.component;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import pkl55.gui.panel.AlertPanel;
import pkl55.main.MainFrame;

/**
 *
 * @author faqih_
 */
public class Alert extends JDialog{
    
    public static Alert dialog;
    private static boolean isOk = false;
    
    
    public Alert(JPanel panel,JFrame frame){
        super(frame, true);
        setUndecorated(true);
        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(frame);
        setVisible(true);
    }
    
    public void close_(boolean respon){
        setVisible(false);
        dispose();
    }
    
    public static void show(String message,int type){
        AlertPanel ap = new AlertPanel(message, type);
        dialog = new Alert(ap, MainFrame.getInstance());
        ap.setDialog(dialog);
        System.out.println(dialog);
    }
    public static void show(String message,int type,JFrame parent){
        AlertPanel ap = new AlertPanel(message, type);
        dialog = new Alert(ap, parent);
        ap.setDialog(dialog);
        System.out.println(dialog);
    }
    
    public static boolean getRespon(){
        return isOk;
    }
}
