/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author faqih_
 */
public abstract class Text extends Variabel{
    protected String value;
    private int maxlength;
    
    @Override
    public void check() {
        valid();
        if (value.length()>maxlength) {
            setValid(false);
            addMessage(MessageString.OUT_LENGTH_STRING);
        }
    }
    
    @Override
    public String getValue() {
        return value;
    }

    /**
     * @param val
     */
    @Override
    public void setValue(String val) {
        super.setValue(val);
        if (val.equals("") && isRequire() == true) {
            setValid(false);
            addMessage(MessageString.REQUIRE);
        }
        this.value = val;
        check();
    }

    /**
     * @return the length
     */
    public int getMaxLength() {
        return maxlength;
    }

    /**
     * @param length the length to set
     */
    public void setMaxLength(int length) {
        this.maxlength = length;
    }

    
    
}
