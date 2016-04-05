/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.data.view;

import pkl55.data.controller.Loop;

/**
 *
 * @author faqih_
 */
public class LoopTool extends javax.swing.JPanel {
    
    private Loop loop;
    private int start;
    private int end;
    
    public LoopTool() {
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton1 = new pkl55.data.view.BackButton();
        nextButton1 = new pkl55.data.view.NextButton();
        counter = new pkl55.data.view.Counter();
        deleteButton1 = new pkl55.data.view.DeleteButton();

        setBackground(new java.awt.Color(255, 255, 255));

        backButton1.setText("backButton1");

        nextButton1.setText("nextButton1");

        counter.setBackground(new java.awt.Color(255, 255, 255));
        counter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        counter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counter.setText("1");

        deleteButton1.setText("deleteButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(counter, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(counter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deleteButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nextButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl55.data.view.BackButton backButton1;
    private pkl55.data.view.Counter counter;
    private pkl55.data.view.DeleteButton deleteButton1;
    private pkl55.data.view.NextButton nextButton1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the loop
     */
    public Loop getLoop() {
        return loop;
    }

    /**
     * @param loop the loop to set
     */
    public void setLoop(Loop loop) {
        this.loop = loop;
    }

    /**
     * @return the start
     */
    public int getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * @return the end
     */
    public int getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(int end) {
        this.end = end;
    }

    /**
     * @return the counter1
     */
    public pkl55.data.view.Counter getCounter() {
        return counter;
    }

    /**
     * @param counter1 the counter1 to set
     */
    public void setCounter(pkl55.data.view.Counter counter) {
        this.counter = counter;
    }
}
