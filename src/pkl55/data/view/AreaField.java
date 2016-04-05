/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.data.view;

import javax.swing.JTextArea;

/**
 *
 * @author faqih_
 */
public abstract class AreaField extends JTextArea{
    protected String varName;
    protected Hal panel;

    public AreaField() {
        setText("");
    }

    public String varName(){
        return varName;
    }
    
    public void addToView(){
        View.catatan = this;
    }

    public void setPanel(Hal panel) {
        this.panel = panel;
    }
    public Hal getPanel(){
        return panel;
    }
}
