
package pkl55.data.view;

import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author faqih_
 */
public abstract class Hal extends JPanel{
    private Panel parent;
    protected ErrorList errorList;
    
    public void setErrorList(ErrorList errorList) {
        this.errorList = errorList;
    }
    public void setParent(Panel parent){
        this.parent = parent;
    }
    public void next(){
        parent.next();
    }
    public void back(){
        parent.back();
    }
    public void addToView(){
        for (Component comp : getComponents()) {
            if (comp.isVisible()) {
                if (comp instanceof Field) {
                    ((Field) comp).setErrorlist(errorList);
                    ((Field) comp).addToView();
                }
            }
        }
    }
}
