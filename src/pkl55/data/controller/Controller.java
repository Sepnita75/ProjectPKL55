/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.data.controller;

import java.util.Hashtable;

/**
 *
 * @author faqih_
 */
public class Controller {

    private static Hashtable<String, Blok> blok;
    private static String nks[];
    private static boolean DS = false;

    public static final void setDict(Hashtable<String, Blok> ablok) {
        blok = ablok;
    }
    
    public static Blok getBlok(String blokName) {
        return blok.get(blokName);
    }

    public static Hashtable<String, Blok> getAllBloks() {
        return blok;
    }

    public static void setNksComponent(String... nks_component) {
        nks = nks_component;
    }

    public static String getNks() {
        String res = "";
        for (String s : nks) {
            res += VariabelMap.get(s);
        }
        return res;
    }

    /**
     * @return the DS
     */
    public static boolean isDS() {
        return DS;
    }

    /**
     * @param aDS the DS to set
     */
    public static void setDS(boolean aDS) {
        DS = aDS;
    }
}
