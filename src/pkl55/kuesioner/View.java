package View;

import java.util.ArrayList;

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

    public static Field[] list;

    public static void init(int length) {
        list = null;
        list = new Field[length];
    }

    public static void add(Field tf) {
        list[tf.getPosition()] = tf;
    }

    public static Field get(int i) {
        return list[i];
    }

    public static int getLength() {
        return list.length;
    }
}
