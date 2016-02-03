/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JTextField;

/**
 *
 * @author faqih_
 */
public abstract class Field extends JTextField{
    protected int position;
    protected ErrorList errorlist;
    protected boolean nextpage;
    protected Hal panel;

    public Field() {
        setText("");
    }
    
    
    
    public void setPosition(int position) {
        this.position = position;
    }
    
    public void addToView(){
        View.add(this);
    }

    public int getPosition() {
        return position;
    }
    public void setErrorlist(ErrorList errorlist) {
        this.errorlist = errorlist;
    }
    public boolean isNextpage() {
        return nextpage;
    }

    public void setNextpage(boolean nextpage) {
        this.nextpage = nextpage;
    }
    public void setPanel(Hal panel) {
        this.panel = panel;
    }
}
