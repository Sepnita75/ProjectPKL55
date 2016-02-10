/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.kuesioner;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author faqih_
 */
public abstract class Panel extends JPanel {



    public void next() {
        ((CardLayout)this.getLayout()).next(this);
    }
    public void back() {
        ((CardLayout)this.getLayout()).next(this);
    }


}
