/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TextField;
import Controller.Variabel;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author faqih_
 */
public class Controller {

    private static Hashtable<String,Blok> blok;
    

    public static final void setDict(Hashtable<String,Blok> ablok) {
        blok = (Hashtable<String, Blok>) Clonner.cloneObject(ablok);
    }
    public static final void set(String blokName,String varName,String value){
        blok.get(blokName).set(varName,value);
    }
    //belom di apa apain
    public static final void set(String blokName,String varName,String loopName,String value){
        blok.get(blokName).set(varName,value);
    }
    public static final Variabel get(String blokName,String varName,String loopName){
        return blok.get(blokName).get(varName);
    }
    public static final Variabel get(String blokName,String varName){
        return blok.get(blokName).get(varName);
    }
    public static Blok getBlok(String blokName){
        return blok.get(blokName);
    }
    public static Hashtable<String,Blok> getAllBloks(){
        return blok;
    }
    public static String getNks(){
        String nks = "";
        String temp;
        for (int i = 1; i < 11; i++) {
            temp = "b1r" + Integer.toString(i);
            nks = nks + get("b1", temp).getValue();
        }
        return nks;
    }
}
