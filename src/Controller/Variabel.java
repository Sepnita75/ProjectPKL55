
package Controller;

import java.util.ArrayList;



public abstract class Variabel extends SuperVariabel implements Cloneable{
    
    private boolean valid;
    private boolean enable;
    private boolean require;
    private ArrayList<String> message;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    
    public Variabel() {
        this.valid = true;
        this.require = false;
        this.enable = true;
        this.message = new ArrayList<>();
    }

    public abstract void check();

    public abstract void valid();
    
    public abstract String getValue(); 
    
    public void setValue(String value){
        valid = true;
        if(!isEnable()&&!value.equals("")){
            setValid(false);
            addMessage(MessageString.ON_DISABLE);
        }
    };
    
    public boolean isValid() {
        return valid;
    }

    
    public void setValid(boolean valid) {
        this.valid &= valid;
    }

    public boolean isRequire() {
        return require;
    }

    
    public void setRequire(boolean require) {
        this.require = require;
    }

    
    public String[] getMessage() {
        return this.message.toArray(new String[message.size()]);
    }
    protected String var(String var){
        return VariabelMap.get(var);
    }
    protected String var(String var,int i){
        return VariabelMap.get(var, i);
    }
    
    public void addMessage(String message) {
        this.message.add(message);
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
