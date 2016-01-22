/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpkl55;

import Controller.MessageString;
import Controller.Text;
import Controller.Variabel;
import java.util.Hashtable;

/**
 *
 * @author Toshiba-PC
 */
public class ControlDS {
    public static void setDict() {
        Hashtable<String, Variabel> ds = new Hashtable();
        ds.put("b1r1", new Text() {

            @Override
            public void valid() {
                if (getValue().equals("2") || getValue().equals("9")) {
                    if(getValue().equals("2")) setValue("02");
                    if(getValue().equals("9")) setValue("09");
                }
                if (!getValue().equals("02") || !getValue().equals("09")) {
                    setValid(false);
                    addMessage(MessageString.value201("02 atau 09"));
                }
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r1"));
                }
            }
        });
        ds.put("b1r2", new Text() {
            @Override
            public void valid() {

                if (getValue().isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r2"));
                }
            } 
        });
        ds.put("b1r3", new Text(){
           @Override
            public void valid() {

                if (getValue().isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r3"));
                }
            } 
        });
        ds.put("b1r4", new Text(){
            @Override
            public void valid() {

                if ((!getValue().equals("1") || !getValue().equals("2")) && !getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.value201("1 atau 2"));
                }
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r4"));
                }
            }
        });
        ds.put("b1r5", new Text() {
            @Override
            public void valid() {
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r5"));
                }
            }
        });
        ds.put("b1r6", new Text() {
            @Override
            public void valid() {
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r6"));
                }
            }
        });
        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 3 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

        ds.put("b3r1", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b3r1"));
                }
            }
        });
        ds.put("b3r2", new Text() {
            @Override
            public void valid() {
                if (!(getValue().substring(0, 1).equals("12") || getValue().substring(0, 1).equals("13"))) {
                    setValid(false);
                    addMessage(MessageString.value201("13.7867"));
                } else if (!(getValue().substring(2).equals("."))) {
                    setValid(false);
                    addMessage(MessageString.value201("13.7867"));
                }
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b3r2"));
                }
            }
        });
        ds.put("b3r3", new Text() {
            @Override
            public void valid() {
                if(Integer.parseInt(getValue()) < 1 || Integer.parseInt(getValue()) > 31) {
                    setValid(false);
                    addMessage(MessageString.range402(1, 31));
                }
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b3r3"));
                }
            }
        });
    }
}