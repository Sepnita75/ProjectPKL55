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
public abstract class LongNumber extends Variabel {

    protected long value;
    private long max;
    private long min;

    public LongNumber() {
        this.value = 0;
        this.max = Long.MAX_VALUE;
        this.min = Long.MIN_VALUE;
    }

    @Override
    public void check() {

        valid();
        if (value > max || value < min) {
            setValid(false);
            addMessage(MessageString.OUT_RANGE);
        }
    }

    public long getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(long max) {
        this.max = max;
    }

    /**
     * @return the min
     */
    public long getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(long min) {
        this.min = min;
    }

    /**
     * @return the value
     */
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
            this.value = Long.parseLong(val);
            isNot = true;
        } catch (Exception e) {
            this.value = 0;
            if (val.equals("") && isRequire() == true) {
                setValid(false);
                addMessage(MessageString.REQUIRE);
            } else {
                addMessage(MessageString.INTEGER_NEED);
            }
        }
        try {
            check();
        } catch (Exception e) {
        }
    }

}
