/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.data.view;

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
        Object[] l = listModel.toArray();
        for (Object x : l) {
            if (((ListItem) x).getVarName().equals(li.getVarName())) {
                return;
            }
        }
        listModel.addElement(li);
    }

    public void add(ListItemLoop li) {
        Object[] l = listModel.toArray();
        for (Object x : l) {
            if (((ListItem) x).getVarName().equals(li.getVarName())) {
                return;
            }
        }
        listModel.addElement(li);
    }

    public void remove(String li) {
        for (int i = 0; i < listModel.size(); i++) {
            if (listModel.get(i).getVarName().equals(li)) {
                ed.deleteList();
                listModel.remove(i);
            }
        }
    }

    public void remove(String li, int pos) {
        for (int i = 0; i < listModel.size(); i++) {
            ListItem liObj = listModel.get(i);
            if (liObj instanceof ListItemLoop) {
                if (liObj.getVarName().equals(li) && ((ListItemLoop) liObj).getPos()==pos) {
                    ed.deleteList();
                    listModel.remove(i);
                }
            }
        }
    }

    public void removeSemua() {
        listModel.clear();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.getSelectedValue() instanceof ListItemLoop) {
            this.getSelectedValue().addMessageToErrorDetil(ed);
        } else if (e.getClickCount() == 1) {
            System.out.println("HERE "+this.getSelectedValue().getVarName());
            Field fl = View.get(this.getSelectedValue().getVarName());
            if (View.get(View.pos) != null) {
                short page_back = 0;
                int pos = View.pos;
                Hal pointer_panel = View.get(pos).getPanel();
                while (View.get(pos) != fl) {
                    pos--;
                    if (pos < 0) {
                        pos = View.getLength() - 1;
                    }
                    if (View.get(pos).getPanel() != pointer_panel) {
                        page_back++;
                        pointer_panel = View.get(pos).getPanel();
                    }
                }
                View.pos = pos;
                for (int i = 0; i < page_back; i++) {
                    fl.getPanel().back();
                    System.out.println("Back Loh");
                }
            }
            fl.requestFocus();
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

    public void checkAll() {

    }
}
