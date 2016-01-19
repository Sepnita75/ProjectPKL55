/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Controller.TextSelect;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JTextField;
import Model.Config;
import javax.swing.JPanel;

/**
 *
 * @author faqih_
 */
public abstract class TextFieldLoop extends JTextField {

    private String varName;
    private String blokName;
    private String loopName;
    private int position;
    private JPanel panel;
    private boolean start;
    private boolean end;
    
    public abstract void onEdit();

    public abstract void onEndEdit();

    public TextFieldLoop() {
        super();
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (Config.automove) {
                    if (Controller.get(blokName, varName) instanceof TextSelect) {
                        if (getText().length() == (((TextSelect) Controller.get(blokName, varName)).getLengthOption() + "").length()) {
                            if (position + 1 < View.getLength()) {
                                View.get(position + 1).requestFocus();
                            }
                        }
                    }
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO: Do something for the keyPressed event
            }
        });
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
//                try {
//                    if (Controller.get(blokName, varName).isEnable()) {
//                        setColor(FieldColor.ON_DISABLE);
//                    } else {
//                        setColor(FieldColor.ON_INPUT);
//                    }
//                } catch (Exception e) {
//                }
                focusFollow(fe);
                onEdit();
            }

            @Override
            public void focusLost(FocusEvent fe) {
//                Controller.set(blokName, varName,loopName,getText());
//                if (!Controller.get(blokName, varName).isValid()) {
//                    JOptionPane.showMessageDialog(null, Controller.get(blokName, varName).getMessage());
//                    setColor(FieldColor.ON_ERROR);
//                } else {
//                    setColor(FieldColor.ON_NORMAL);
//                }
                onEndEdit();
            }

        });
        this.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (position + 1 < View.getLength()) {
                    try {
                        View.get(position + 1);
                    } catch (Exception ex) {
                        System.out.println("Error" + (position + 1) + " " + View.getLength());
                    }
                }
            }
        });
    }
    private void focusFollow(java.awt.event.FocusEvent evt) {
        java.awt.Component focusedComponent = evt.getComponent();
        panel.scrollRectToVisible(focusedComponent.getBounds(null));
        repaint();
    }
    public void setPosition(int position) {
        this.position = position;
    }
//    public void set
    public int getPosition() {
        return position;
    }
    public void setPanel(JPanel panel){
        this.panel = panel;
    }
    private void setColor(Color c) {
        setBackground(c);
    }

    public void warning() {
        setBackground(FieldColor.ON_WARNING);
    }

    public void error() {
        setBackground(FieldColor.ON_ERROR);
    }

    public void empty() {
        setText("");
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public String getValue() {
        return getText();
    }

    /**
     * @return the blokName
     */
    public String getBlokName() {
        return blokName;
    }

    /**
     * @param blokName the blokName to set
     */
    public void setBlokName(String blokName) {
        this.blokName = blokName;
    }

    /**
     * @return the start
     */
    public boolean isStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(boolean start) {
        this.start = start;
    }

    /**
     * @return the end
     */
    public boolean isEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(boolean end) {
        this.end = end;
    }

    /**
     * @return the loopName
     */
    public String getLoopName() {
        return loopName;
    }

    /**
     * @param loopName the loopName to set
     */
    public void setLoopName(String loopName) {
        this.loopName = loopName;
    }
}
