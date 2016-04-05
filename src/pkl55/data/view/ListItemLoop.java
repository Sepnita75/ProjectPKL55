/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.data.view;

/**
 *
 * @author faqih_
 */
public class ListItemLoop extends ListItem{
    private int pos;
    
    public ListItemLoop(String[] message, String varName,int pos) {
        super(message, varName);
        this.pos = pos;
    }

    /**
     * @return the pos
     */
    public int getPos() {
        return pos;
    }
    @Override
    public String toString() {
        return getVarName()+" : "+(pos+1);
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(int pos) {
        this.pos = pos;
    }
    
}
