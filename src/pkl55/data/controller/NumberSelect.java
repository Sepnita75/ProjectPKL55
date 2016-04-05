/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.data.controller;

/**
 *
 * @author faqih_
 */
public abstract class NumberSelect extends Variabel {

    protected int value;
    private int[] options;
    private int length;

    @Override
    public void check() {

        valid();
        boolean notValid = true;
        for (int option : options) {
            if (value == option) {
                notValid = false;
                break;
            }
        }
        if (notValid) {
            setValid(false);
            addMessage(MessageString.OUT_RANGE);
        }
    }

    @Override
    public String getValue() {
        if (isNot) {
            return value + "";
        } else {
            return "";
        }
    }

    @Override
    public void setValue(String val) {
        super.setValue(val);
        try {
            this.value = Integer.parseInt(val);
            isNot = true;
        } catch (Exception e) {
            this.value = 0;
            if (val.equals("") && isRequire() == true) {
                setValid(false);
                addMessage(MessageString.REQUIRE);
            } else {
                addMessage(MessageString.SELECTION_NEED);
            }
        }
        try {
            check();
        } catch (Exception e) {
        }
    }

    public int[] getOptions() {
        return options;
    }

    /**
     * @param options the options to set
     */
    public void setOptions(int[] options) {
        this.options = options;
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
