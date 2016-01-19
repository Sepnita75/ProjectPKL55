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
public class Loop extends SuperVariabel {

    private Hashtable<String, ArrayList<Variabel>> variabel;
    private int active;

    public Loop(Hashtable<String, Variabel> variabel) {
        String[] keys = (String[]) variabel.keySet().toArray();
        Variabel[] var = (Variabel[]) variabel.values().toArray();
        for (int i = 0; i < keys.length; i++) {
            ArrayList<Variabel> ar = new ArrayList();
            ar.add(var[i]);
            ar.add((Variabel) Clonner.cloneObject(var[i]));
            this.variabel.put(keys[i], ar);
        }

        active = 0;
    }

    public void set(String name, String value) {
        variabel.get(name).get(active).setValue(value);
    }
    
    public void next() {
        String[] keys = (String[]) variabel.keySet().toArray();
        if (active == (keys.length-1)) {
            for (String key : keys) {
                ArrayList<Variabel> ar = variabel.get(key);
                ar.add((Variabel) Clonner.cloneObject(ar.get(active + 1)));
            }
        }
        active++;
    }
    public Variabel[] getVar(String name) {
        return (Variabel[]) variabel.get(name).toArray();
    }
    public Variabel get(String name) {
        return variabel.get(name).get(active);
    }

    public Hashtable<String, ArrayList<Variabel>> getAllVariabels() {
        return variabel;
    }
    public String getNuArt(){
        return "";
    }
    /**
     * @return the active
     */
    public int getActive() {
        return active;
    }

    
    public void setActive(int active) {
        this.active = active;
    }
    public boolean isValid(){
        ArrayList<Variabel>[] ar = (ArrayList<Variabel>[]) variabel.values().toArray();
        boolean res = true;
        for(ArrayList<Variabel> a:ar){
            boolean val1 = true;
            for(Variabel v:a){
                val1 &= v.isValid();
            }
            res &= val1;
        }
        return res;
    }
}
