/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.data.view;

import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author faqih_
 */
public class ErrorDetil extends JList<String> {

    private DefaultListModel<String> listModel;

    public ErrorDetil() {
        listModel = new DefaultListModel();
        this.setModel(listModel);
    }

    public void setList(String []message) {
        for(String ms:message){
            listModel.addElement(ms);
        }
    }

    public void deleteList() {
        listModel.removeAllElements();
    }

    /**
     * @return the listModel
     */
    public DefaultListModel<String> getListModel() {
        return listModel;
    }

    /**
     * @param listModel the listModel to set
     */
    public void setListModel(DefaultListModel<String> listModel) {
        this.listModel = listModel;
    }


}
