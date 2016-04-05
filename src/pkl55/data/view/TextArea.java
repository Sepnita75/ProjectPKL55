package pkl55.data.view;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import pkl55.data.controller.Variabel;
import pkl55.data.controller.VariabelMap;

/**
 *
 * @author faqih_
 */
public class TextArea extends AreaField {

    public TextArea() {
        super();
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                focusFollow(fe);
            }

            @Override
            public void focusLost(FocusEvent fe) {
                VariabelMap.set(getVarName(), getText());
                Variabel var = VariabelMap.getVar(getVarName());
            }

        });
    }

    private void focusFollow(java.awt.event.FocusEvent evt) {
        java.awt.Component focusedComponent = evt.getComponent();
        if (panel != null) {
            panel.scrollRectToVisible(focusedComponent.getBounds(null));
            repaint();
        } else {
            System.out.println("Panelnya belon di set coy");
        }
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
}
