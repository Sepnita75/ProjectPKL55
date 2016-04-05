/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.data.view;

import javax.swing.JLabel;

/**
 *
 * @author faqih_
 */
public class Counter extends JLabel{
    private LoopTool tool;
    
        public LoopTool getTool() {
        return tool;
    }

    public void setTool(LoopTool tool) {
        this.tool = tool;
    }
    
}
