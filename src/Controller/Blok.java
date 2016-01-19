package Controller;

import java.util.Hashtable;

public class Blok {

    private Hashtable<String, SuperVariabel> variabel;
    private boolean ds;

    public Blok(Hashtable<String, SuperVariabel> variabel) {
        this.variabel = variabel;
    }

    public void set(String loopName, String name, String value) {
        ((Loop) variabel.get(loopName)).set(name, value);
    }

    public void set(String name, String value) {
        ((Variabel) variabel.get(name)).setValue(value);
    }

    public Variabel get(String name) {
        return (Variabel) variabel.get(name);
    }

    public Loop getLoop(String loopName) {
        SuperVariabel res = variabel.get(loopName);
        if (res instanceof Loop) {
            return (Loop) variabel.get(loopName);
        } else {
            return null;
        }
    }

    public Variabel get(String loopName, String name) {
        return ((Loop) variabel.get(loopName)).get(name);
    }

    public Hashtable<String, SuperVariabel> getAllVariabels() {
        return variabel;
    }

    public boolean isValid() {
        boolean res = true;
        SuperVariabel[] list = (SuperVariabel[]) variabel.values().toArray();
        for (SuperVariabel sv : list) {
            if (sv instanceof Variabel) {
                res &= ((Variabel)sv).isValid();
            }else{
                res &= ((Loop)sv).isValid();
            }
        }
        return res;
    }

    /**
     * @return the ds
     */
    public boolean isDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(boolean ds) {
        this.ds = ds;
    }
}
