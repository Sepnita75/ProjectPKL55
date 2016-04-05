/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.data.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author faqih_
 */
public final class NextButton extends JButton {

    private final ImageIcon icon;
    private LoopTool tool;

    public LoopTool getTool() {
        return tool;
    }

    public void setTool(LoopTool tool) {
        this.tool = tool;
    }
//    private 

    public NextButton() {

        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        icon = new ImageIcon(getClass().getResource("/pkl55/images/next_loop.png"));
        setIcon(icon);
        setPreferredSize(new Dimension(30, 30));
        setVisible(true);
        setText("");
        
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(tool.getLoop().isForwardable()){
                    String row[][] = tool.getLoop().forward();
                    for(int i=0;i<row[0].length;i++){
                        ((TextFieldLoop)find(row[0][i])).setText(row[1][i]);
                    }
                }
                tool.getCounter().setText(tool.getLoop().getActive()+"");
            }
        });
    }
    
    public TextFieldLoop find(String key) {
        TextFieldLoop res = null;
        for (int i = tool.getStart(); i <= tool.getEnd(); i++) {
            TextFieldLoop a = ((TextFieldLoop)View.get(i));
            if(a.getVarName().equals(key)){
                res = a;
                break;
            }
        }
        return res;
    }

    @Override
    public void setText(String string) {
        super.setText(""); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the tool
     */
}
