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
    private int length;
    
    @Override
    public void check() {
        valid();
        if (value.length()>length) {
            setValid(false);
            addMessage(MessageString.OUT_LENGTH_STRING);
        }
    }
    
    @Override
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    @Override
    public void setValue(String value) {
        super.setValue(value);
        this.value = value;
        check();
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    
    
}
