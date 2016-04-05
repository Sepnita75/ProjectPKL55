package pkl55.data.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import test.CustomDialog;

public class Blok {

    private Hashtable<String, SuperVariabel> variabel;

    public Blok(Hashtable<String, SuperVariabel> variabel) {
        this.variabel = variabel;
        Set<String> keyO = variabel.keySet();
        String[] key = keyO.toArray(new String[keyO.size()]);
        Collection<SuperVariabel> varO = variabel.values();
        SuperVariabel[] var = varO.toArray(new SuperVariabel[varO.size()]);
        System.out.println("Blok "+CustomDialog.b);
        CustomDialog.b++;
        setVarMap(key, var);
    }

    public void setVarMap(String[] key, SuperVariabel[] var) {
        for (int i = 0; i < key.length; i++) {
            if (var[i] instanceof Variabel) {
                VariabelMap.add(key[i], (Variabel) var[i]);
            } else {
                VariabelMap.add(key[i], ((Loop)var[i]));
                Hashtable<String, ArrayList<String>> l = ((Loop) var[i]).getAllVariabels();
                Hashtable<String, Variabel> l1 = ((Loop) var[i]).getAllVars();
                String[] keyL = l.keySet().toArray(new String[l.size()]);
                ArrayList<String>[] varL = l.values().toArray(new ArrayList[l.size()]);
                Variabel[] variabelL = l1.values().toArray(new Variabel[l1.size()]);
                for (int j = 0; j < keyL.length; j++) {
                    VariabelMap.add(keyL[j], variabelL[j]);
                    VariabelMap.add(keyL[j], varL[j]);
                }
            }
        }
    }
    public Variabel getVariabel(String name) {
        SuperVariabel res = variabel.get(name);
        if (res instanceof Variabel) {
            return (Variabel)res;
        } else {
            return null;
        }
    }

    public Loop getLoop(String loopName) {
        SuperVariabel res = variabel.get(loopName);
        if (res instanceof Loop) {
            return (Loop) res;
        } else {
            return null;
        }
    }


    public Hashtable<String, SuperVariabel> getAllVariabels() {
        return variabel;
    }

    public boolean isValid() {
        boolean res = true;
        SuperVariabel[] list = variabel.values().toArray(new SuperVariabel[variabel.size()]);
        for (SuperVariabel sv : list) {
            if (sv instanceof Variabel) {
                res &= ((Variabel) sv).isValid();
            } else {
                
                res &= ((Loop) sv).isValid();
            }
        }
        return res;
    }

}
