/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.kuesioner;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author faqih_
 */
public class ErrorList extends JList<ListItem> implements MouseListener, KeyListener {

    private DefaultListModel<ListItem> listModel;
    private ErrorDetil ed;

    public ErrorList() {
        listModel = new DefaultListModel();
        this.setModel(listModel);
        this.addMouseListener(this);
        ed = null;
    }

    public void SetErrorDetil(ErrorDetil ed) {
        this.ed = ed;
    }

    public void add(ListItem li) {
        listModel.addElement(li);
    }

    public void remove(String li) {
        for (int i = 0; i < listModel.size(); i++) {
            if (listModel.get(i).getVarName().equals(li)) {
                listModel.remove(i);
                break;
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 1) {
            this.getSelectedValue().addMessageToErrorDetil(ed);
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        if (ke.getKeyChar() == KeyEvent.VK_ENTER) {
            this.getSelectedValue().addMessageToErrorDetil(ed);
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    public void checkAll(){
        
    }
}
