
package pkl55.kuesioner;

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
}
