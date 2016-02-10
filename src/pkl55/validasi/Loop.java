/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.validasi;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

/**
 *
 * @author faqih_
 */
public class Loop extends SuperVariabel {

    private Hashtable<String, Variabel> variabel = new Hashtable();
    private Hashtable<String, ArrayList<String>> varList = new Hashtable();

    private int active;

    public Loop(Hashtable<String, Variabel> variabel) {
//        System.out.println("ok\t"+variabel.values().isEmpty());
        String[] keys = variabel.keySet().toArray(new String[variabel.size()]);
        this.variabel = variabel;
        for (int i = 0; i < keys.length; i++) {
            ArrayList<String> ar = new ArrayList();
            this.varList.put(keys[i], ar);
        }
        active = 0;
    }
//
//    public void set(String name, String value) {
//        variabel.get(name).setValue(value);
//    }
//
//    public void set(String name, int activ, String value) {
//        varList.get(name).set(activ, value);
//    }

    public void next() {
        String[] keys = this.variabel.keySet().toArray(new String[variabel.size()]);
        if (active == (varList.size())) {
            for (String key : keys) {
                this.varList.get(key).add(this.variabel.get(key).getValue());
            }
            active++;
        } else {
            for (String key : keys) {
                this.varList.get(key).set(active, this.variabel.get(key).getValue());
            }
            active = varList.size();
        }
    }

//    public ArrayList<Variabel> getVar(String name) {
//        ArrayList<Variabel> arl = variabel.get(name);
//        arl = (ArrayList<Variabel>) arl.subList(0, arl.size() - 1);
//        return arl;
//    }
//
//    public Variabel[] getVarArray(String name) {
//        ArrayList<Variabel> arl = variabel.get(name);
//        arl = (ArrayList<Variabel>) arl.subList(0, arl.size() - 1);
//        return arl.toArray(new Variabel[arl.size()]);
//    }

    public Hashtable<String, Variabel> getAllVars() {
        return variabel;
    }
    public Hashtable<String, ArrayList<String>> getAllVariabels() {
        return varList;
    }
    public String[] getVarArray(String name){
        ArrayList<String> vl = varList.get(name);
        return vl.toArray(new String[vl.size()]);
    }
    
    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public boolean isValid() {
        ArrayList<Variabel>[] ar = variabel.values().toArray(new ArrayList[variabel.size()]);
        boolean res = true;
        for (ArrayList<Variabel> a : ar) {
            boolean val1 = true;
            for (Variabel v : a) {
                val1 &= v.isValid();
            }
            res &= val1;
        }
        return res;
    }

    public static String getNksAdded() {
        return "";
    }
}
