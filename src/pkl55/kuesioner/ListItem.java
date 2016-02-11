/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.kuesioner;

import Controller.Variabel;
import java.awt.Component;

/**
 *
 * @author faqih_
 */
public class ListItem extends Component{
    private String []message;
    private String varName;

    public ListItem(String []message,String varName) {
        this.message = message;
        this.varName = varName;
    }
    
    public String[] getMessage() {
        return message;
    }

    public void setVariabel(String []message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return getVarName();
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }
    
    public void addMessageToErrorDetil(ErrorDetil ed){
        ed.setList(message);
    }
    
}
