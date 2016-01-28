/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author faqih_
 */
public class VariabelMap {

    private static Hashtable<String, Variabel> varList = new Hashtable();
    private static Hashtable<String, ArrayList<String>> varLoop = new Hashtable();
    private static Hashtable<String, Loop> loopMap = new Hashtable();

    public static void add(String key, Variabel var) {
        varList.put(key, var);
    }

    public static void add(String key, Loop loop) {
        loopMap.put(key, loop);
    }

    public static void add(String key, ArrayList<String> var) {
        varLoop.put(key, var);
    }

    public static String get(String key) {
        return varList.get(key).getValue();
    }

    public static String get(String key, int i) {
        return varLoop.get(key).get(i);
    }

    public static void set(String varName, String value) {
        varList.get(varName).setValue(value);
    }
    public static Variabel getVar(String varName){
        return varList.get(varName);
    }
    public static Loop getLoop(String loopName){
        return loopMap.get(loopName);
    }
    public static void next(String loopName) {
        loopMap.get(loopName).next();
    }
}
