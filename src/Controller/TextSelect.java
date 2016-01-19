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
public abstract class TextSelect extends Variabel {
    
    private int value;
    private int[] options;

    @Override
    public void check() {
        valid();
        int i = 0;
        for (i = 0; i < options.length; i++) {
            if (value == options[i]) {
                break;
            }
        }
        if (i==options.length) {
            setValid(false);
            addMessage(MessageString.OUT_RANGE);
        }
    }

    public int getLengthOption(){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<options.length;i++) {
            if(options[i] > largest) {
                largest = options[i];
            }
        }
        return largest;
    }
    @Override
    public String getValue() {
        return value+"";
    }

    @Override
    public void setValue(String val) {
        super.setValue(val);
        try {
            this.value = Integer.parseInt(val);
        } catch (Exception e) {
            if (val.equals("") && isRequire() == true) {
                setValid(false);
                addMessage(MessageString.REQUIRE);
            } else {
                addMessage(MessageString.SELECTION_NEED);
            }
        }
        check();
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

}
