/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author faqih_
 */
public abstract class Panel extends JPanel {

    private CardLayout layoutManager;
    ArrayList<String> halName;
    String active;

    public Panel() {
        halName = new ArrayList();
        layoutManager = new CardLayout();
        setLayout(layoutManager);
        init();
    }

    public void addHal(String name, JPanel halaman) {
        halName.add(name);
        layoutManager.addLayoutComponent(halaman, name);
    }

    public void show(String name) {
        active = name;
        layoutManager.show(this, name);
    }

    public void next() {
        try {
            int i = halName.indexOf(active);
            active = halName.get(i+1);
            show(active);
        } catch (Exception e) {}
    }
    public void back() {
        try {
            int i = halName.indexOf(active);
            active = halName.get(i+1);
            show(active);
        } catch (Exception e) {}
    }

    public abstract void init();

}
