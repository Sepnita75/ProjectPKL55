package pkl55.data.controller;

import java.util.ArrayList;
import pkl55.data.view.View;

public abstract class Variabel extends SuperVariabel implements Cloneable {

    private boolean valid;
    private boolean enable;
    private boolean require;
    protected boolean isNot;
    private boolean hidden;
    private ArrayList<String> message;

    public Variabel() {
        this.isNot = false;
        this.valid = true;
        this.require = false;
        this.enable = true;
        this.message = new ArrayList<String>();
    }

    public boolean isBilanganBulat(String str) {
        try {
            double d = Long.parseLong(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public boolean isBilanganDesimal(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public boolean isHuruf(String str) {
        return str.matches("^[ A-z]+$");
    }

    public void addMessageToMany(String variabels[], String message) {
        for (String key : variabels) {
            VariabelMap.getVar(key).addMessage(message);
        }
    }

    public void addMessageToMany(int start, int end, String message) {
        String[] variabels = new String[end - start + 1];
        for (int i = start; i <= end; i++) {
            variabels[i - start] = View.get(i).varName();
        }
        for (String key : variabels) {
            VariabelMap.getVar(key).addMessage(message);
        }
    }

    public void setEnableInList(String variabels[], boolean isEnable) {
        for (String key : variabels) {
            VariabelMap.getVar(key).setEnable(enable);
        }
    }

    public void setEnableInList(int start, int end, boolean isEnable) {
        String[] variabels = new String[end - start + 1];
        for (int i = start; i <= end; i++) {
            variabels[i - start] = View.get(i).varName();
        }
        for (String key : variabels) {
            VariabelMap.getVar(key).setEnable(enable);
        }
    }

    public abstract void check();

    public abstract void valid();

    public abstract String getValue();

    public void setValue(String value) {
        valid = true;
        if (!isEnable() && !value.equals("")) {
            setValid(false);
            addMessage(MessageString.ON_DISABLE);
        }
    }

    public void setValue(String key, String value) {
        View.get(key).setText(value);
        VariabelMap.getVar(key).setValue(value);
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid &= valid;
    }

    public void setValid(String key, boolean valid, String message) {
        Variabel k = VariabelMap.getVar(key);
        k.setValid(valid);
        k.addMessage(message);
        this.valid &= valid;
    }

    public boolean isRequire() {
        return require;
    }

    public void setRequire(boolean require) {
        this.require = require;
        if (getValue().equals("") && isRequire() == true) {
            setValid(false);
            addMessage(MessageString.REQUIRE);
        }
    }

    public String[] getMessage() {
        return this.message.toArray(new String[message.size()]);
    }

    protected String var(String var) {
        return VariabelMap.get(var);
    }

    protected String var(String var, int i) {
        return VariabelMap.get(var, i);
    }

    protected Variabel variabel(String var) {
        return VariabelMap.getVar(var);
    }

    public void addMessage(String message) {
        this.message.add(message);
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
        if (!isEnable() && !getValue().equals("")) {
            setValid(false);
            addMessage(MessageString.ON_DISABLE);
        }
    }

    public boolean isHidden() {
        return hidden;
    }

    /**
     * @param hidden the hidden to set
     */
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
