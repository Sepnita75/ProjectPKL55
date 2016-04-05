package pkl55.data.controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class Loop extends SuperVariabel {

    private Hashtable<String, Variabel> variabel = new Hashtable();
    private Hashtable<String, ArrayList<String>> varList = new Hashtable();
    private String[] nart;

    private int active;

    public Variabel getVariabel(String key){
        return variabel.get(key);
    }
    public ArrayList<String> getVariabelValue(String key){
        return varList.get(key);
    }
    
    public Loop(Hashtable<String, Variabel> variabel) {
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

    public boolean isActiveEnd() {
        String[] keys = this.variabel.keySet().toArray(new String[variabel.size()]);
        return active == (varList.get(keys[0]).size());
    }

    public void setNArtComponent(String... nart_component) {
        nart = nart_component;
    }

    public String getNArt() {
        String res = "";
        if (nart != null) {
            for (String s : nart) {
                res += VariabelMap.get(s);
            }
        }
        return res;
    }

    public void next() {
        String[] keys = this.variabel.keySet().toArray(new String[variabel.size()]);
        if (active == (varList.get(keys[0]).size())) {
            for (String key : keys) {
                this.varList.get(key).add(this.variabel.get(key).getValue());
                System.out.println("Key " + key + "\t" + this.variabel.get(key).getValue());
                this.variabel.get(key).setValue("");
                System.out.println("after Key " + key + "\t" + this.variabel.get(key).getValue());
            }
            active++;
        } else {
            for (String key : keys) {
                this.varList.get(key).set(active, this.variabel.get(key).getValue());
                System.out.println("Key " + key + "\t" + this.variabel.get(key).getValue());
                this.variabel.get(key).setValue("");
            }
            active = varList.get(keys[0]).size();
        }
    }

    public String[][] back() {
        active--;
        String[] key = this.variabel.keySet().toArray(new String[variabel.size()]);
        String res[][] = new String[2][key.length];
        for (int i = 0; i < key.length; i++) {
            res[0][i] = key[i];
            res[1][i] = this.varList.get(key[i]).get(active);
            this.variabel.get(key[i]).setValue(res[1][i]);
        }
        return res;
    }

    public String[][] forward() {
        active++;
        String[] key = this.variabel.keySet().toArray(new String[variabel.size()]);
        String res[][] = new String[2][key.length];
        for (int i = 0; i < key.length; i++) {
            res[0][i] = key[i];
            res[1][i] = this.varList.get(key[i]).get(active);
            this.variabel.get(key[i]).setValue(res[1][i]);
        }
        return res;
    }

    public boolean isForwardable() {
        String[] keys = this.variabel.keySet().toArray(new String[variabel.size()]);
        return active < varList.get(keys[0]).size();
    }

    public boolean isBackable() {
        return active > 0;
    }

    public void delete() {
        String[] keys = this.variabel.keySet().toArray(new String[variabel.size()]);
        if (active != (varList.get(keys[0]).size())) {
            for (String key : keys) {
                this.varList.get(key).remove(active);
            }
            active = varList.get(keys[0]).size();
        }
    }

    public void delete(int position) {
        String[] keys = this.variabel.keySet().toArray(new String[variabel.size()]);
        for (String key : keys) {
            this.varList.get(key).remove(position);
        }
        active = varList.get(keys[0]).size();
    }

    public String[][] edit(int position) {
        active = position;
        String[] key = this.variabel.keySet().toArray(new String[variabel.size()]);
        String res[][] = new String[2][key.length];
        for (int i = 0; i < key.length; i++) {
            System.out.print(key[i] + " :\t");
            res[0][i] = key[i];
            res[1][i] = this.varList.get(key[i]).get(active);
            this.variabel.get(key[i]).setValue(res[1][i]);
        }
        return res;
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

    public String[] getVarArray(String name) {
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
