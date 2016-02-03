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
public class KuesionerPKL {

    public static void kuesioner() {
        Hashtable<String, Blok> k1 = new Hashtable();
        //Blok 1
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 1 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

        //  Pembuatan hashtable blok 1
        Hashtable<String, SuperVariabel> b1 = new Hashtable();

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
//                System.out.println("Okesih\t"+value+"\t"+isValid());
            }
        });

        b1.put("b1r2", new Text() {

            @Override
            public void valid() {
                if (getValue().equals("2") || getValue().equals("9")) {
                    if (getValue().equals("2")) {
                        setValue("02");
                    }
                    if (getValue().equals("9")) {
                        setValue("09");
                    }
                }
                if (!getValue().equals("02") && !getValue().equals("09")) {
                    System.out.println("Coba ini\t"+isValid());
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
                try {
                    if ((Integer.parseInt(getValue()) % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                    setValid(false);
                    addMessage(MessageString.type307());
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
                try {
                    if ((Integer.parseInt(getValue()) % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                    setValid(false);
                    addMessage(MessageString.type307());
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
                    setValid(false);
                    addMessage(MessageString.type301());
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
                } catch (NumberFormatException e) {
                    setValid(false);
                    addMessage(MessageString.type307());
                }
                if (getValue().isEmpty() || getValue().equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r13"));
                }
            }
        });
        Blok blok1 = new Blok(b1);
        k1.put("b1", blok1);
        

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 2 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        Hashtable<String, SuperVariabel> b2 = new Hashtable();

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
                if (!(getValue().substring(0, 2).equals("12") || getValue().substring(0, 2).equals("13"))) {
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
                if (getValue().equals(var("b2r2s1"))) {
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
        Blok blok2 = new Blok(b2);
        k1.put("b2", blok2);

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 3 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        Hashtable<String, SuperVariabel> b3 = new Hashtable();

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
                if (var("b3ar3").equals("1")) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar4"));
                }

                if (!(var("b3ar3")).equals("1")) {
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
                if (var("b3ar3").equals("1")) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar5"));
                }

                if (var("b3ar4").equals("1")) {
                    if (Integer.parseInt(getValue()) < 1 || Integer.parseInt(getValue()) > 8 || Integer.parseInt(getValue()) == 7 || Integer.parseInt(getValue()) == 0) {
                        setValid(false);
                        addMessage(MessageString.range402(1, 8));
                    }

                }

                if (Integer.parseInt(var("b3ar4")) > 1 && Integer.parseInt(var("b3ar4")) < 6) {
                    if (Integer.parseInt(getValue()) < 1 || Integer.parseInt(getValue()) > 3 || Integer.parseInt(getValue()) != 8 || Integer.parseInt(getValue()) == 0) {
                        setValid(false);
                        addMessage(MessageString.value202("1, 2, 3, 8"));
                    }
                }

                if (Integer.parseInt(var("b3ar4")) == 6) {
                    if (Integer.parseInt(getValue()) < 1 || Integer.parseInt(getValue()) > 4 || Integer.parseInt(getValue()) != 8 || Integer.parseInt(getValue()) == 0) {
                        setValid(false);
                        addMessage(MessageString.value202("1, 2, 3, 4, 8"));
                    }
                }

                if (Integer.parseInt(var("b3ar4")) < 1 || Integer.parseInt(var("b3ar4")) > 7 || Integer.parseInt(getValue()) == 0) {
                    if (Integer.parseInt(getValue()) > 0 || Integer.parseInt(getValue()) <= 8) {
                        setValid(false);
                        addMessage(MessageString.null101("b3ar5"));
                    }
                }
            }
        });

        b3.put("b3ar6", new Text() {

            @Override
            public void valid() {

                if (var("b3ar3").equals("1")) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar6"));
                }

                if (var("b3ar4").equals("1")) {
                    if (Integer.parseInt(var("b3ar5")) > 0 && Integer.parseInt(var("b3ar5")) < 7) {
                        if (!getValue().equals("1")) {
                            addMessage(MessageString.value202("1"));
                        }
                    }
                    if (Integer.parseInt(var("b3ar5")) == 8) {
                        if (!getValue().equals("2")) {
                            addMessage(MessageString.value202("2"));
                        }
                    }
                }   

                // Validasi 1
                if (var("b3ar4").equals("2")) {
                    if (Integer.parseInt(var("b3ar5")) > 0 && Integer.parseInt(var("b3ar5")) < 4) {
                        if (!(getValue().equals("2"))) {
                            setValid(false);
                            addMessage(MessageString.value202("2"));
                        }
                    }
                    if (Integer.parseInt(var("b3ar5")) == 8) {
                        if (!(getValue().equals("3"))) {
                            setValid(false);
                            addMessage(MessageString.value202("3"));
                        }
                    }
                }

                //  Validasi #2
                if (var("b3ar4").equals("3")) {
                    if (Integer.parseInt(var("b3ar5")) > 0 && Integer.parseInt(var("b3ar5")) < 4) {
                        if (!(getValue().equals("3"))) {
                            setValid(false);
                            addMessage(MessageString.value202("3"));
                        }
                    }
                    if (Integer.parseInt(var("b3ar5")) == 8) {
                        if (!(getValue().equals("4"))) {
                            setValid(false);
                            addMessage(MessageString.value202("4"));
                        }
                    }
                }

                //  Validasi #3
                if (var("b3ar4").equals("4")) {
                    if (Integer.parseInt(var("b3ar5")) > 0 && Integer.parseInt(var("b3ar5")) < 4) {
                        if (!(getValue().equals("4"))) {
                            setValid(false);
                            addMessage(MessageString.value202("4"));
                        }
                    }
                    if (Integer.parseInt(var("b3ar5")) == 8) {
                        if (!(getValue().equals("4"))) {
                            setValid(false);
                            addMessage(MessageString.value202("4"));
                        }
                    }
                }

                //  Validasi #4
                if (var("b3ar4").equals("5")) {
                    if (Integer.parseInt(var("b3ar5")) > 0 && Integer.parseInt(var("b3ar5")) < 4) {
                        if (!(getValue().equals("5"))) {
                            setValid(false);
                            addMessage(MessageString.value202("5"));
                        }
                    }
                    if (Integer.parseInt(var("b3ar5")) == 8) {
                        if (!(getValue().equals("6"))) {
                            setValid(false);
                            addMessage(MessageString.value202("6"));
                        }
                    }
                }

                //  Validasi #5
                if (var("b3ar4").equals("5") && var("b3ar5").equals("1")) {
                    if (!(getValue().equals("6"))) {
                        setValid(false);
                        addMessage(MessageString.value202("6"));
                    }
                }

                //  Validasi #6
                if (var("b3ar4").equals("5") && (Integer.parseInt(var("b3ar5")) > 0 || Integer.parseInt(var("b3ar5")) == 2)) {
                    if (!(getValue().equals("6"))) {
                        setValid(false);
                        addMessage(MessageString.value202("6"));
                    }
                }

                //  Validasi #7
                if (var("b3ar4").equals("6") && (Integer.parseInt(var("b3ar5")) > 0 && Integer.parseInt(var("b3ar5")) < 4)) {
                    if (!(getValue().equals("6"))) {
                        setValid(false);
                        addMessage(MessageString.value202("6"));
                    }
                }

                //  Validasi #8
                if (var("b3ar4").equals("6") && (Integer.parseInt(var("b3ar5")) == 8)) {
                    if (!(getValue().equals("7"))) {
                        setValid(false);
                        addMessage(MessageString.value202("7"));
                    }
                }

                //  Validasi #9
                if (var("b3ar4").equals("7") && (Integer.parseInt(var("b3ar5")) > 0 && Integer.parseInt(var("b3ar5")) < 5)) {
                    if (!(getValue().equals("8"))) {
                        setValid(false);
                        addMessage(MessageString.value202("8"));
                    }
                }

                //  Validasi #10               
                if (var("b3ar4").equals("8") && (Integer.parseInt(var("b3ar5")) > 0 && Integer.parseInt(var("b3ar5")) < 3)) {
                    if (!(getValue().equals("9"))) {
                        setValid(false);
                        addMessage(MessageString.value202("9"));
                    }
                }

                //  Validasi #11
                if (var("b3ar4").equals("8") && (Integer.parseInt(var("b3ar5")) > 0 && Integer.parseInt(var("b3ar5")) < 5)) {
                    if (!(getValue().equals("9"))) {
                        setValid(false);
                        addMessage(MessageString.value202("9"));
                    }
                }
            }

        });

        b3.put("b3ar7s1", new IntNumber() {

            @Override
            public void valid() {

                if (Integer.parseInt(getValue()) != 1 || Integer.parseInt(getValue()) != 2 || Integer.parseInt(getValue()) == 0) {
                    setValid(false);
                    addMessage(MessageString.value201("1 atau 2"));
                }
            }

        });

        b3.put("b3ar7s2", new Text() {

            @Override
            public void valid() {
                if (var("b3ar7s1").equals("1")) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar7s2"));
                }

                if (var("b3ar7s2").equals("2")) {
                    if (Integer.parseInt(getValue()) < 1 && Integer.parseInt(getValue()) > 4) {
                        setValid(false);
                        addMessage(MessageString.value201("1,2,3,4"));
                    }
                }
            }

        });

        b3.put("b3ar7s2lainnya", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b3ar7s2lainnya")) == 0 && getValue().isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar7s2lainnya"));
                }
            }

        });

        b3.put("b3a7s3", new IntNumber() {

            @Override
            public void valid() {
                if (value != 1 || value != 2 || value == 0) {
                    setValid(false);
                    addMessage(MessageString.value201("1 atau 2"));
                }
            }

        });

        b3.put("b3ar8s1", new IntNumber() {

            @Override
            public void valid() {

            }

        });

        b3.put("b3ar8s2", new IntNumber() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b3ar8s1")) == 0 && value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar8s2"));
                }

                if (Integer.parseInt(var("b3ar8s1")) != 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar8s2"));
                }
            }

        });

        b3.put("b3ar8s3", new IntNumber() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b3ar8s1")) != 0) {
                    if (value == 0 || value != 1 || value != 2) {
                        setValid(false);
                        addMessage(MessageString.null101("b3ar8s3"));
                    }
                }

                if (Integer.parseInt(var("b3ar8s1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar8s3"));
                }
            }

        });

        b3.put("b3ar8s4", new IntNumber() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b3ar8s1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar8s4"));
                }
            }

        });

        b3.put("b3ar9s1", new IntNumber() {

            @Override
            public void valid() {

                if (value != 1 || value != 2 || value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar9s1"));
                }

            }

        });

        b3.put("b3ar9s2", new IntNumber() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b3ar9s1")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar9s2"));
                }
                if (Integer.parseInt(var("b3ar9s1")) == 1 && value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar9s2"));
                }
            }

        });

        b3.put("b3ar10s1", new IntNumber() {

            @Override
            public void valid() {

                if (value != 1 || value != 2 || value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar10s1"));
                }

            }

        });

        b3.put("b3ar10s2", new IntNumber() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b3ar10s1")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar10s2"));
                }
            }

        });

        b3.put("b3ar11", new IntNumber() {

            @Override
            public void valid() {
                if (value != 1 || value != 2 || value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar11"));
                }

            }

        });

        b3.put("b3ar12", new IntNumber() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b3ar7s11")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar12"));
                }

                if ((Integer.parseInt(getValue()) % 1) != 0) {
                    setValid(false);
                    addMessage(MessageString.type307());
                }

            }

        });

        b3.put("b3ar13", new IntNumber() {

            @Override
            public void valid() {
                if (value != 1 || value != 2 || value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar13"));
                }
            }

        });

        b3.put("b3ar14", new IntNumber() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b3ar13")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar14"));

                }
            }
        });

        b3.put("b3ar13", new IntNumber() {

            public void valid() {
                if (value != 1 || value != 2 || value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar13"));
                }
            }

        });

        b3.put("b3ar14", new IntNumber() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b3ar13")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar14"));
                }

            }
        });
        Blok blok3 = new Blok(b3);
        k1.put("b3", blok3);

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 4 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
        
        Hashtable<String, Variabel> b4a1 = new Hashtable();
        
        b4a1.put("b4ar1s1", new IntNumber() {

            @Override
            public void valid() {
                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar1 jenis kapal"));
                }
            }

        });

        b4a1.put("b4ar1s2", new Text() {

            @Override
            public void valid() {
                if ((Integer.parseInt(getValue())) % 1 != 0) {
                    setValid(false);
                    addMessage(MessageString.type308());
                }
            }

        });

        b4a1.put("b4ar2s1", new DoubleDecimal() {

            @Override
            public void valid() {
                if ((value % 1) > 0 || (value % 1) < 0) {
                    setValid(false);
                    addMessage(MessageString.type307());
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar2 Panjang"));
                }
            }

        });

        b4a1.put("b4ar2s2", new DoubleDecimal() {

            @Override
            public void valid() {
                if ((value % 1) > 0 || (value % 1) < 0) {
                    setValid(false);
                    addMessage(MessageString.type307());
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar2 lebar"));
                }
            }

        });

        b4a1.put("b4ar3", new DoubleDecimal() {

            @Override
            public void valid() {
                if ((value % 1) > 0 || (value % 1) < 0) {
                    setValid(false);
                    addMessage(MessageString.type307());
                }
            }

        });

        b4a1.put("b4ar4", new DoubleDecimal() {

            @Override
            public void valid() {
                if ((value % 1) > 0 || (value % 1) < 0) {
                    setValid(false);
                    addMessage(MessageString.type307());
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar4"));
                }
            }

        });

        b4a1.put("b4ar5", new IntNumber() {

            @Override
            public void valid() {
                if (value < 1 && value > 3) {
                    setValid(false);
                    addMessage(MessageString.range402(1, 3));
                }

            }

        });

        b4a1.put("b4ar5lainnya", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b4ar5")) == 0 && value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("lainnya"));
                }

                if ((Integer.parseInt(getValue())) % 1 != 0) {
                    setValid(false);
                    addMessage(MessageString.type301());
                }
                
                if (Integer.parseInt(var("b4ar5")) >0 && Integer.parseInt(var("b4ar5")) <4) {
                    setEnable(false);
                    addMessage(MessageString.null102("lainnya"));
                }

            }

        });

        b4a1.put("b4ar6", new IntNumber() {

            @Override
            public void valid() {
                if (value != 1 || value != 2 || value == 0) {
                    setValid(false);
                    addMessage(MessageString.value201("1 atau 2"));

                }
                
            }

        });
        Loop b4a = new Loop(b4a1);
        System.out.println(b4a);
        
//  END
//      OF
//          LOOP        

        Hashtable<String, SuperVariabel> b4a2 = new Hashtable();
        b4a2.put("b4a1", b4a);
        
        b4a2.put("b4ar7", new IntNumber() {

            @Override
            public void valid() {
                if ((value % 1) > 0 || (value % 1) < 0) {
                    setValid(false);
                    addMessage(MessageString.type304());
                }
            }

        });

        b4a2.put("b4ar8s1", new IntNumber() {

            @Override
            public void valid() {
                if ((value % 1) > 0 || (value % 1) < 0) {
                    setValid(false);
                    addMessage(MessageString.type304());
                }

                if (value < 1 && value > 12) {
                    setValid(false);
                    addMessage(MessageString.range402(1, 12));
                }
            }

        });

        b4a2.put("b4ar8s2", new IntNumber() {

            @Override
            public void valid() {
                if ((value % 1) > 0 || (value % 1) < 0) {
                    setValid(false);
                    addMessage(MessageString.type304());
                }

                if (!getValue().substring(0, 2).equals("201")) {
                    setValid(false);
                    addMessage(MessageString.value202("2016"));
                }

                if (!(getValue().substring(3).equals("4") || getValue().substring(3).equals("5"))) {
                    setValid(false);
                    addMessage(MessageString.value202("2016"));
                }

            }

        });
        Blok blok4 = new Blok(b4a2);
        k1.put("b4a2", blok4);
        Controller.setDict(k1);
//        Controller.setNksComponent("b1r1","b1r2","b1r3");
    }
}