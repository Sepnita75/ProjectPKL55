package projectpkl55;

import java.util.Hashtable;
import Controller.*;
import Controller.Text;
import Controller.Text;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TOSHIBA
 */
public class Control {

    public static void setDict() {
        Hashtable<String, Blok> k1 = new Hashtable();
        //Blok 1
        //:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 1 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        
        //  Pembuatan hashtable blok 1
        Hashtable<String, Variabel> b1 = new Hashtable();
        
        //  Memasukan pertanyaan b1r1 kedalam blok 1
        b1.put("b1r1", new Text() {
            
            // Validasi Blok 1
            @Override
            public void valid() {
                
                // Perlakuan jika tidak di isi
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r1"));
                }
                
                // Perlakuan dimana 
                if (!getValue().equals("32")) {
                    setValid(false);
                    addMessage(MessageString.value201("32"));
                }
            }
        });

        b1.put("b1r2", new Text() {

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
                    addMessage(MessageString.null101("b1r2"));
                }
            }
        });

        b1.put("b1r3", new Text() {

            @Override
            public void valid() {

                if (getValue().isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r3"));
                }
            }
        });

        b1.put("b1r4", new Text() {

            @Override
            public void valid() {

                if (getValue().isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r4"));
                }
            }

        });

        b1.put("b1r5", new Text() {

            @Override
            public void valid() {

                if ((!getValue().equals("1") || !getValue().equals("2")) && !getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.value201("1 atau 2"));
                }
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r5"));
                }
            }

        });

        b1.put("b1r6", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r6"));
                }
            }

        });

        b1.put("b1r7", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r7"));
                }
            }

        });

        b1.put("b1r8", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r8"));
                }
            }
        });

        b1.put("b1r9", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r9"));
                }
            }
        });

        b1.put("b1r10", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r10"));
                }
            }
        });

        b1.put("b1r11", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r11"));
                }
                try {
                    if ((Integer.parseInt(getValue())) % 1 == 0) {
                        setValid(false);
                        addMessage(MessageString.type301());
                    }
                } catch (Exception e) {
                    //ISI NEXT
                }
            }
        });

        b1.put("b1r12", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r12"));
                }
            }
        });

        b1.put("b1r13", new Text() {

            @Override
            public void valid() {
                try {
                    if ((Integer.parseInt(getValue()) % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (Exception ex) {

                }
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r13"));
                }
            }
        });

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 2 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        
        Hashtable<String, Variabel> b2 = new Hashtable();

        b2.put("b2r1s1", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b2r1s1"));
                }
            }

        });

        b2.put("b2r1s2", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b2r1s2"));
                }
            }

        });

        b2.put("b2r2s1", new Text() {

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
                    addMessage(MessageString.null101("b2r2s1"));
                }
            }

        });

        b2.put("b2r2s2", new Text() {

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
                    addMessage(MessageString.null101("b2r2s1"));
                }
                if (getValue().equals(Controller.get("b2", "b2r2s1").getValue())) {
                    setValid(false);
                    addMessage(MessageString.rel501("b2r2s1", "b2r2s2"));
                }
            }

        });
        
//  Ini belum bisa karena tipe data 'date' belum ada
//  Ada hubungan antara b2r3s1 dan b2r3s2
        b2.put("b2r3s1", new Text() {
            
            @Override
            public void valid() {

            }
        });

        b2.put("b2r3s2", new Text() {

            @Override
            public void valid() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 3 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
                
        Hashtable<String, Variabel> b3 = new Hashtable();

        b3.put("b3ar1", new IntNumber() {

            @Override
            public void valid() {
                if (Integer.parseInt(getValue()) < 15 || Integer.parseInt(getValue()) > 99) {
                    setValid(false);
                    addMessage(MessageString.range402(15, 99));
                }
            }

        });

        b3.put("b3ar2", new IntNumber() {

            @Override
            public void valid() {
                if (Integer.parseInt(getValue()) == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b2r2s1"));
                }
                if (Integer.parseInt(getValue()) != 1 || Integer.parseInt(getValue()) != 2) {
                    setValid(false);
                    addMessage(MessageString.value201("1 atau 2"));
                }
            }

        });

        b3.put("b3ar3", new IntNumber() {

            @Override
            public void valid() {
                if (Integer.parseInt(getValue()) < 1 || Integer.parseInt(getValue()) > 3) {
                    setValid(false);
                    addMessage(MessageString.value201("1, 2, atau 3"));
                }

                if (Integer.parseInt(getValue()) == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar3"));
                }
            }
        });

        b3.put("b3ar4", new Text() {

            @Override
            public void valid() {
                if (Controller.get("b3", "b3ar3").getValue().equals("1")) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar4"));
                }

                if (!(Controller.get("b3", "b3ar3")).getValue().equals("1")) {
                    if (Integer.parseInt(getValue()) < 1 || Integer.parseInt(getValue()) > 8) {
                        setValid(false);
                        addMessage(MessageString.range402(1, 8));
                    }
                    if (Integer.parseInt(getValue()) == 0) {
                        setValid(false);
                        addMessage(MessageString.null101("b3ar3"));
                    }
                }
            }
        });
    

        b3.put("b3ar5", new Text() {

            @Override
            public void valid() {
                if (Controller.get("b3", "b3ar3").getValue().equals("1")) {
                    setEnable(false);
                    addMessage("Tidak boleh diisi");
                }

                if (Controller.get("b3", "b3ar4").getValue().equals("1")) {
                    if (Integer.parseInt(getValue()) < 1 || Integer.parseInt(getValue()) > 8 || Integer.parseInt(getValue()) == 7 || Integer.parseInt(getValue()) == 0) {
                        setValid(false);
                        addMessage("Tingkat tidak sesuai");
                    }

                }

                if (Integer.parseInt(Controller.get("b3", "b3ar4").getValue()) > 1 || Integer.parseInt(Controller.get("b3", "b3ar4").getValue()) < 6) {
                    if (Integer.parseInt(getValue()) < 1 || Integer.parseInt(getValue()) > 3 || Integer.parseInt(getValue()) != 8 || Integer.parseInt(getValue()) == 0) {
                        setValid(false);
                        addMessage("Isian tidak sesuai");
                    }
                }

                if (Integer.parseInt(Controller.get("b3", "b3ar4").getValue()) == 6) {
                    if (Integer.parseInt(getValue()) < 1 || Integer.parseInt(getValue()) > 4 || Integer.parseInt(getValue()) != 8 || Integer.parseInt(getValue()) == 0) {
                        setValid(false);
                        addMessage("Isian tidak sesuai");
                    }
                }

                if (Integer.parseInt(Controller.get("b3", "b3ar4").getValue()) < 1 || Integer.parseInt(Controller.get("b3", "b3ar4").getValue()) > 7 || Integer.parseInt(getValue()) == 0) {
                    if (Integer.parseInt(getValue()) > 0 || Integer.parseInt(getValue()) < 8) {
                        setValid(false);
                        addMessage("Harus Diisi");
                    }
                }

            }
        });

        b3.put("b3ar6", new Text() {

            @Override
            public void valid() {
                if (Controller.get("b3", "b3ar3").getValue().equals("1")) {
                    setEnable(false);
                    addMessage("Tidak boleh diisi");
                }

                if (Controller.get("b3", "b3ar4").getValue().equals("2")) {
                    if (Integer.parseInt(Controller.get("b3", "b3ar5").getValue()) > 0 || Integer.parseInt(Controller.get("b3", "b3ar5").getValue()) < 4) {
                        if (!(getValue().equals("2"))) {
                            setValid(false);
                            addMessage("Isian tidak sesuai");
                        }
                    }
                }

                if (Controller.get("b3", "b3ar4").getValue().equals("3")) {
                    if (Integer.parseInt(Controller.get("b3", "b3ar5").getValue()) > 0 || Integer.parseInt(Controller.get("b3", "b3ar5").getValue()) < 4) {
                        if (!(getValue().equals("3"))) {
                            setValid(false);
                            addMessage("Isian tidak sesuai");
                        }
                    }
                }

                if (Controller.get("b3", "b3ar4").getValue().equals("4")) {
                    if (Integer.parseInt(Controller.get("b3", "b3ar5").getValue()) > 0 || Integer.parseInt(Controller.get("b3", "b3ar5").getValue()) < 4) {
                        if (!(getValue().equals("4"))) {
                            setValid(false);
                            addMessage("Isian tidak sesuai");
                        }
                    }
                }

                if (Controller.get("b3", "b3ar4").getValue().equals("5")) {
                    if (Integer.parseInt(Controller.get("b3", "b3ar5").getValue()) > 0 || Integer.parseInt(Controller.get("b3", "b3ar5").getValue()) < 4) {
                        if (!(getValue().equals("5"))) {
                            setValid(false);
                            addMessage("Isian tidak sesuai");
                        }
                    }
                }

                if (Controller.get("b3", "b3ar4").getValue().equals("5") && Controller.get("b3", "b3ar5").getValue().equals("1")) {
                    if (!(getValue().equals("6"))) {
                        setValid(false);
                        addMessage("Isian tidak sesuai");
                    }
                }

                if (Controller.get("b3", "b3ar4").getValue().equals("5") && (Integer.parseInt(Controller.get("b3", "b3ar5").getValue()) > 0 || Integer.parseInt(Controller.get("b3", "b3ar5").getValue()) < 3)) {
                    if (!(getValue().equals("6"))) {
                        setValid(false);
                        addMessage("Isian tidak sesuai");
                    }
                }

                if (Controller.get("b3", "b3ar4").getValue().equals("5") && (Integer.parseInt(Controller.get("b3", "b3ar5").getValue()) > 0 || Integer.parseInt(Controller.get("b3", "b3ar5").getValue()) < 4)) {
                    if (!(getValue().equals("6"))) {
                        setValid(false);
                        addMessage("Isian tidak sesuai");
                    }
                }
                
                if (Controller.get("b3", "b3ar4").getValue().equals("5") && (Integer.parseInt(Controller.get("b3", "b3ar5").getValue())>0 || Integer.parseInt(Controller.get("b3", "b3ar5").getValue())<5)) {
                    if (!(getValue().equals("6"))) {
                        setValid(false);
                        addMessage("Isian tidak sesuai");
                    }
                }
                
                
            }

        });
    }
}
