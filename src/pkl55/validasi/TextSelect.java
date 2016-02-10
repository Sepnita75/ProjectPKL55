/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.validasi;

/**
 *
 * @author faqih_
 */
public abstract class TextSelect extends Variabel {

    protected String value;
    private String[] options;
    private int length;

    @Override
    public void check() {
        valid();
        boolean notValid = true;
        for (String option : options) {
            if (value.equals(option)) {
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
        return value;
    }

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

    public String[] getOptions() {
        return options;
    }

    /**
     * @param options the options to set
     */
    public void setOptions(String[] options) {
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
