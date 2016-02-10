/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.validasi;

import pkl55.kuesioner.TextField;
import pkl55.validasi.Variabel;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author faqih_
 */
public class Controller {

    private static Hashtable<String, Blok> blok;
    private static String nks[];

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
            res += s;
        }
        return res;
    }
}
