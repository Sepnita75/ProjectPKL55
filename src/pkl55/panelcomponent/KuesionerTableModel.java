/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.panelcomponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;
//import pkl54.dao.B1Dao;
//import pkl54.entity.B1;
//import pkl54.entity.Bs;
//import pkl54.entity.Desa;
//import pkl54.entity.Kabupaten;
//import pkl54.entity.Kecamatan;

/**
 *
 * @author Habib
 */
public class KuesionerTableModel extends AbstractTableModel {

//    private int startPosition;
    private Vector<String> column;
    private List<B1> row;
//    private int counter = 0;

    public KuesionerTableModel() {
        super();
//        this.startPosition = 0;
        column = new Vector<>();
        column.add("NKS");
        column.add("Responden");
        column.add("Flag");
        column.add("Status Entry");
        column.add("Status Kirim");
        row = new ArrayList<>();
//        update();
    }

    @Override
    public int getRowCount() {
        return row.size();
    }

//    public List<B1> getTheList() {
//        return row;
//    }
    
    @Override
    public String getColumnName(int column) {
        return this.column.get(column);
    }

//    public void setList(List<B1> list) {
//        row = list;
//        fireTableDataChanged();
//    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
//    public B1 getB1(int i){
//        return row.get(i);
//    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//        B1 b1 = row.get(rowIndex);

        Object toReturn = null;
//        switch (columnIndex) {
//            case 0:
//                toReturn = b1.getNks();
//                break;
//            case 1:
//                toReturn = b1.getB1r11();
//                break;
//            case 2:
//                toReturn = b1.getCleanFlag();
//                break;
//            case 3:
//                toReturn = b1.getStatusEntry();
//                break;
//            default:
//
//        }
        return toReturn;
    }
    

//    public void update() {
//        row = B1Dao.getInstance().getList();
//        fireTableDataChanged();
//    }
//    
//    private List<B1> getItems() {
//        return B1Dao.getInstance().getList();
//    }
//
//    public void updateByBs(Bs b) {
//        row = B1Dao.getInstance().getByBs(b.getKodebs());
//        setList(row);
//        fireTableDataChanged();
//    }
//    
//    public void updateByDesa(Desa d) {
//        row = B1Dao.getInstance().getByBs(d.getId());
//        setList(row);
//        fireTableDataChanged();
//    }
//    
//    public void updateByKec(Kecamatan b) {
//        row = B1Dao.getInstance().getByBs(b.getId());
//        setList(row);
//        fireTableDataChanged();
//    }
//    
//    public void updateByKab(Kabupaten b) {
//        row = B1Dao.getInstance().getByBs(b.getId());
//        setList(row);
//        fireTableDataChanged();
//    }
//    
//    public void updateCleanFlag(B1 b1,boolean bol){
//        int ind = row.indexOf(b1);
//        row.get(ind).setCleanFlag(bol);
//        fireTableDataChanged();
//    }
//    
//    public void updateStatusEntry(int ind,boolean bol,boolean bol2){
//        row.get(ind).setStatusEntry(bol);
//        row.get(ind).setCleanFlag(bol2);
//        fireTableDataChanged();
//    }
}
