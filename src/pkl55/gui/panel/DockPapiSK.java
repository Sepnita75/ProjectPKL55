/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.gui.panel;

/**
 *
 * @author faqih_
 */
public class DockPapiSK extends javax.swing.JPanel {

    /**
     * Creates new form Dock
     */
    public DockPapiSK() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kuesButton = new pkl55.gui.component.KuesButton();
        helpButton = new pkl55.gui.component.HelpButton();
        aboutButton1 = new pkl55.gui.component.AboutButton();
        exitButton1 = new pkl55.gui.component.LogoutButton();
        background_image = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        /*
        add(kuesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 90, -1));
        */
        add(kuesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 50, 80, -1));

        /*
        add(helpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));
        */
        add(helpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 120, -1, -1));

        /*
        add(aboutButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));
        */
        add(aboutButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 190, -1, -1));

        /*
        add(exitButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));
        */
        add(exitButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 260, -1, -1));

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/gui/images/menupanel.png"))); // NOI18N
        add(background_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl55.gui.component.AboutButton aboutButton1;
    private javax.swing.JLabel background_image;
    private pkl55.gui.component.LogoutButton exitButton1;
    private pkl55.gui.component.HelpButton helpButton;
    private pkl55.gui.component.KuesButton kuesButton;
    // End of variables declaration//GEN-END:variables
}
