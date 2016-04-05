package pkl55.data.view;

import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author faqih_
 */
public class View {

    public static Field active;
    public static AreaField catatan;
    public static Field[] list;
    public static Hashtable<String, TabelLoop> listTable = new Hashtable<String, TabelLoop>();
    public static int pos;

    public static void addTabelLoop(String loopName, TabelLoop tl) {
        listTable.put(loopName, tl);
    }

    public static TabelLoop getTabelLoop(String loopName) {
        return listTable.get(loopName);
    }

    public static void init(int length) {
        list = null;
        list = new Field[length];
        pos = 0;
    }

    public static void add(Field tf) {
//        System.out.println("VARIABEL\t"+tf.getPosition()+"\t" + tf.varName);
        list[tf.getPosition()] = tf;
    }

    public static Field get(int i) {
        return list[i];
    }

    public static Field get(String varName) {
        Field res = null;
        int i=0;
        for (Field f : list) {
            System.out.println(i+"\t"+(f!=null)+"\t"+f.varName+"\t"+varName);i++;
            if (f.varName.equals(varName)) {
                res = f;
                break;
            }
        }
        return res;
    }

    public static int getLength() {
        return list.length;
    }

}
