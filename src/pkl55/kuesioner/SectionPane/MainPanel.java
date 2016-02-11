/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.SectionPane;

import View.ErrorList;
import View.Panel;

/**
 *
 * @author faqih_
 */
public class MainPanel extends Panel {

    private ErrorList errorList;

    public void setErrorList(ErrorList errorList) {
        this.errorList = errorList;
    }

    public MainPanel() {
        super();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        section11 = new View.SectionPane.Section1();
        section21 = new View.SectionPane.Section2();
        section31 = new View.SectionPane.Section3();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(section11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        add(section21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        add(section31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void init() {
        addHal("hal1", section11);
        addHal("hal2", section21);
        addHal("hal3", section31);
        section11.setParent(this);
        section21.setParent(this);
        section31.setParent(this);
        section11.setErrorList(errorList);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.SectionPane.Section1 section11;
    private View.SectionPane.Section2 section21;
    private View.SectionPane.Section3 section31;
    // End of variables declaration//GEN-END:variables

}
