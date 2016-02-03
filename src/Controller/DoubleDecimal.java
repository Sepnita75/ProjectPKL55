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
public abstract class DoubleDecimal extends Variabel {

    protected double value;
    private double max;
    private double min;

    public DoubleDecimal() {
        super();
        this.value = 0;
        this.max = Double.MAX_VALUE;
        this.min = Double.MIN_VALUE;
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
    public void setMax(double max) {
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
    public void setMin(double min) {
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
            this.value = Double.parseDouble(val);
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
