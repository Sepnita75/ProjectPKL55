/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.kuesioner.SectionPane;

import pkl55.kuesioner.ErrorList;
import pkl55.kuesioner.Panel;

/**
 *
 * @author faqih_
 */
public class MainPanel extends Panel {

    private ErrorList errorList;

    public void setErrorList(ErrorList errorList) {
        this.errorList = errorList;
    }

    public ErrorList getErrorList() {
        return errorList;
    }
    

    public MainPanel() {
        initComponents();
        pkl55.kuesioner.View.init(54);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.CardLayout());
    }// </editor-fold>//GEN-END:initComponents


//    public final void init() {
//        System.out.println(section11);
//        addHal("hal1", section11);
//        addHal("hal2", section21);
//        addHal("hal3", section31);
//        section11.setParent(this);
//        section21.setParent(this);
//        section31.setParent(this);
//        section11.setErrorList(errorList);
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
