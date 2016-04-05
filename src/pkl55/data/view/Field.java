/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.data.view;

import javax.swing.JTextField;

public abstract class Field extends JTextField {

    public String varName;
    protected int position;
    protected ErrorList errorlist;
    protected boolean nextpage;
    protected Hal panel;

    public Field() {
        setText("");
    }

    public String varName() {
        return varName;
    }

    @Override
    public void requestFocus() {
        super.requestFocus();
        View.active = this;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void addToView() {
        System.out.println("VARIABEL\t"+position+"\t" + varName);
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

    public Hal getPanel() {
        return panel;
    }
}
