/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.data.view;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author faqih_
 */
public class Panel extends JPanel {

    protected ErrorList errorList;
    private Hal active;

    public Panel() {
    }

     public void init(){
         
     }
    
    public void setErrorList(ErrorList errorList) {
        this.errorList = errorList;
    }

    public ErrorList getErrorList() {
        return errorList;
    }

    public void next() {
        ((CardLayout) this.getLayout()).next(this);
//        System.out.println(((CardLayout)this.getLayout()).);
    }

    public void back() {
        ((CardLayout) this.getLayout()).previous(this);
    }

    public void addToView(Hal... hals) {
        for (Hal hal : hals) {
            hal.setParent(this);
            hal.setErrorList(errorList);
            hal.addToView();
        }
    }

    /**
     * @return the active
     */
    public Hal getActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(Hal active) {
        this.active = active;
    }

}
