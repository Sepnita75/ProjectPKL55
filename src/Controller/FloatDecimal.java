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
public abstract class FloatDecimal extends Variabel {

    private float value;
    private float max;
    private float min;

    public FloatDecimal() {
        super();
        this.value = 0;
        this.max = Float.MAX_VALUE;
        this.min = Float.MIN_VALUE;
    }

    
    @Override
    public void check() {
        valid();
        if(value>max||value<min){
            setValid(false);
            addMessage(MessageString.OUT_RANGE);
        }
    }

    /**
     * @return the max
     */
    public double getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(float max) {
        this.max = max;
    }

    /**
     * @return the min
     */
    public double getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(float min) {
        this.min = min;
    }

    /**
     * @return the value
     */
    @Override
    public String getValue() {
        return value+"";
    }

    
    @Override
    public void setValue(String val) {
        super.setValue(val);
        try{
            this.value = Float.parseFloat(val);
        }catch(Exception e){
            if(val.equals("")&&isRequire()==true){
                setValid(false);
                addMessage(MessageString.REQUIRE);
            }else{
                addMessage(MessageString.DECIMAL_NEED);
            }
        }
        check();
    }

}
