/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.kuesioner.view;

import pkl55.data.view.Hal;

public class RHal5 extends Hal {

    /**
     * Creates new form section5
     */
    public RHal5() {
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

        b3r27 = new pkl55.data.view.TextFieldLoop();
        b3r28 = new pkl55.data.view.TextFieldLoop();
        b3r29 = new pkl55.data.view.TextFieldLoop();
        b3r30 = new pkl55.data.view.TextFieldLoop();
        b3r31 = new pkl55.data.view.TextFieldLoop();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelLoop1 = new pkl55.data.view.TabelLoop();
        section5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b3r27.setErrorlist(errorList);
        b3r27.setLoopName("b3");
        b3r27.setPanel(this);
        b3r27.setPosition(44);
        b3r27.setVarName("b3r27");
        add(b3r27, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 306, 50, 25));

        b3r28.setErrorlist(errorList);
        b3r28.setLoopName("b3");
        b3r28.setPanel(this);
        b3r28.setPosition(45);
        b3r28.setVarName("b3r28");
        add(b3r28, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 306, 51, 25));

        b3r29.setErrorlist(errorList);
        b3r29.setLoopName("b3");
        b3r29.setPanel(this);
        b3r29.setPosition(46);
        b3r29.setVarName("b3r29");
        add(b3r29, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 306, 50, 25));

        b3r30.setErrorlist(errorList);
        b3r30.setLoopName("b3");
        b3r30.setPanel(this);
        b3r30.setPosition(47);
        b3r30.setVarName("b3r30");
        add(b3r30, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 306, 50, 25));

        b3r31.setEnd(true);
        b3r31.setErrorlist(errorList);
        b3r31.setLoopName("b3");
        b3r31.setPanel(this);
        b3r31.setPosition(48);
        b3r31.setVarName("b3r31");
        add(b3r31, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 306, 25, 25));

        tabelLoop1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelLoop1.setEnd(48);
        tabelLoop1.setStart(20);
        jScrollPane1.setViewportView(tabelLoop1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 414, 700, 260));

        section5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl55/kuesioner/picture/R05.png"))); // NOI18N
        add(section5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1070));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl55.data.view.TextFieldLoop b3r27;
    private pkl55.data.view.TextFieldLoop b3r28;
    private pkl55.data.view.TextFieldLoop b3r29;
    private pkl55.data.view.TextFieldLoop b3r30;
    private pkl55.data.view.TextFieldLoop b3r31;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel section5;
    private pkl55.data.view.TabelLoop tabelLoop1;
    // End of variables declaration//GEN-END:variables
}