package projectpkl55;

import pkl55.validasi.SuperVariabel;
import pkl55.validasi.IntNumber;
import pkl55.validasi.Variabel;
import pkl55.validasi.Loop;
import pkl55.validasi.MessageString;
import pkl55.validasi.DoubleDecimal;
import pkl55.validasi.Controller;
import pkl55.validasi.Blok;
import java.util.Hashtable;
import pkl55.validasi.Text;
import pkl55.validasi.Text;

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
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r1"));
                }

                // Perlakuan dimana 
                if (!value.equals("52")) {
                    setValid(false);
                    addMessage(MessageString.value201("52"));
                }

            }
        });

        b1.put("b1r2", new Text() {

            @Override
            public void valid() {
                if (value.equals("1") || value.equals("8")) {
                    if (value.equals("1")) {
                        setValue("01");
                    }
                    if (value.equals("8")) {
                        setValue("08");
                    }
                }
                if (!value.equals("01") && !value.equals("08")) {
                    setValid(false);
                    addMessage(MessageString.value201("01 atau 08"));
                }
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r2"));
                }
            }
        });

        b1.put("b1r3", new Text() {

            @Override
            public void valid() {

                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r3"));
                }
                try {
                    if ((Integer.parseInt(value) % 1) != 0) {
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

                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r4"));
                }
                try {
                    if ((Integer.parseInt(value) % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                    setValid(false);
                    addMessage(MessageString.type307());
                }
            }

        });

        b1.put("b1r5s1", new Text() {

            @Override
            public void valid() {

            }

        });

        b1.put("b1r5s2", new Text() {

            @Override
            public void valid() {

            }

        });

        b1.put("b1r5s3", new Text() {

            @Override
            public void valid() {

            }

        });

        b1.put("b1r5s4", new Text() {

            @Override
            public void valid() {

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
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b2r1s1"));
                }
                try {
                    if ((Integer.parseInt(value)) % 1 == 0) {
                        setValid(false);
                        addMessage(MessageString.type301());
                    }
                } catch (Exception e) {
                    setValid(false);
                    addMessage(MessageString.type301());
                }
            }

        });

        b2.put("b2r1s2", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b2r1s2"));
                }

                try {
                    if ((Integer.parseInt(value)) % 1 == 0) {
                        setValid(false);
                        addMessage(MessageString.type301());
                    }
                } catch (Exception e) {
                    setValid(false);
                    addMessage(MessageString.type301());
                }
            }

        });

        b2.put("b2r2s1", new Text() {

            @Override
            public void valid() {
                if (!(value.substring(0, 2).equals("12") || value.substring(0, 2).equals("13"))) {
                    setValid(false);
                    addMessage(MessageString.value201("13.7867"));
                } else if (!(value.substring(2, 3).equals("."))) {
                    setValid(false);
                    addMessage(MessageString.value201("13.7867"));
                }
                if (value.isEmpty() && value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b2r2s1"));
                }
            }

        });

        b2.put("b2r2s2", new Text() {

            @Override
            public void valid() {
                if (!(value.substring(0, 1).equals("12") || value.substring(0, 1).equals("13"))) {
                    setValid(false);
                    addMessage(MessageString.value201("13.7867"));
                } else if (!(value.substring(2, 3).equals("."))) {
                    setValid(false);
                    addMessage(MessageString.value201("13.7867"));
                }
                if (value.isEmpty() && value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b2r2s1"));
                }
                if (value.equals(var("b2r2s1"))) {
                    setValid(false);
                    addMessage(MessageString.rel501("b2r2s1", "b2r2s2"));
                }
            }

        });

        b2.put("b2r3s1", new Text() {

            @Override
            public void valid() {

            }
        });

        b2.put("b2r3s2", new Text() {

            @Override
            public void valid() {

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

        b3.put("b3r1", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b3r1"));
                }

                try {
                    if ((Integer.parseInt(value)) % 1 == 0) {
                        setValid(false);
                        addMessage(MessageString.type301());
                    }
                } catch (Exception e) {
                    setValid(false);
                    addMessage(MessageString.type301());
                }
            }

        });

        b3.put("b3r2", new IntNumber() {

            @Override
            public void valid() {
                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b3r2"));
                }

                try {
                    if ((value % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                    setValid(false);
                    addMessage(MessageString.type307());
                }
            }

        });

        b3.put("b3r3", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b3r3"));
                }

                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.type306());
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3r2"));
                }

            }

        });

        Blok blok3 = new Blok(b3);
        k1.put("b3", blok3);

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 3a -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        Hashtable<String, SuperVariabel> b3a = new Hashtable();

        b3a.put("b3ar5", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar5"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar5"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar5"));
                }
            }

        });

        b3a.put("b3ar6", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar6"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar6"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar6"));
                }
            }

        });

        b3a.put("b3ar7", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar7"));
                }

                if (Integer.parseInt(value) < 1 || Integer.parseInt(value) > 3) {
                    setValid(false);
                    addMessage(MessageString.value202("1, 2, atau 3"));
                }
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar7"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar7"));
                }
            }

        });

        b3a.put("b3ar8s1", new Text() {

            @Override
            public void valid() {
                if ((Integer.parseInt(value) % 1) != 0) {
                    setValid(false);
                    addMessage(MessageString.type307());
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar8s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar8s1"));
                }
            }

        });

        b3a.put("b3ar8s2", new Text() {

            @Override
            public void valid() {
                if (((Integer.parseInt(value)) % 1) != 0) {
                    setValid(false);
                    addMessage(MessageString.type307());
                }

                if (Integer.parseInt(value) < 1 || Integer.parseInt(value) > 12) {
                    setValid(false);
                    addMessage(MessageString.range402(1, 12));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar8s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar8s2"));
                }
            }

        });

        b3a.put("b3ar9", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar6"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar9"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar9"));
                }
            }

        });

        b3a.put("b3ar10", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b3ar10"));
                }

                if (Integer.parseInt(value) < 1 || Integer.parseInt(value) > 3) {
                    setValid(false);
                    addMessage(MessageString.value202("1, 2, atau 3"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar10"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b3ar10"));
                }
            }

        });

        Blok blok3a = new Blok(b3a);
        k1.put("b3a", blok3a);

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 4 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        Hashtable<String, SuperVariabel> b4 = new Hashtable();

        b4.put("b4r1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r1"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r1"));
                }
            }

        });

        b4.put("b4r1lainnya", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b4r1")) == 6) {
                    if (value.isEmpty()) {
                        setValid(false);
                        addMessage(MessageString.null101("b4r1lainnya"));
                    }
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r1lainnya"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r1lainnya"));
                }
            }

        });

        b4.put("b4r2", new IntNumber() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r2"));
                }
            }

        });

        b4.put("b4r3", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r3"));
                }

                if (!value.equals("1") && !value.equals("2") && !value.equals("4") && !value.equals("8") && !value.equals("16")) {
                    setValid(false);
                    addMessage(MessageString.range402(1, 31));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r3"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r3"));
                }
            }

        });

        b4.put("b4r4", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r4"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r4"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r4"));
                }
            }

        });

        b4.put("b4r5s1d1", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r5"));
                }

                if ((Integer.parseInt(value)) % 1 != 0) {
                    setValid(false);
                    addMessage(MessageString.type301());
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s1d1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s1d1"));
                }

                if (Integer.parseInt(var("b4r4")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s1d1"));
                }
            }

        });

        b4.put("b4r5s1d2", new IntNumber() {

            @Override
            public void valid() {
                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r5s1d2"));
                }

                try {
                    if (value % 1 == 0) {
                        setValid(false);
                        addMessage(MessageString.type301());
                    }
                } catch (Exception e) {
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s1d2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s1d2"));
                }

                if (Integer.parseInt(var("b4r4")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s1d2"));
                }
            }

        });

        b4.put("b4r5s1d3", new IntNumber() {

            @Override
            public void valid() {
                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r5s1d3"));
                }

                try {
                    if (value % 1 == 0) {
                        setValid(false);
                        addMessage(MessageString.type301());
                    }
                } catch (Exception e) {
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s1d3"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s1d3"));
                }

                if (Integer.parseInt(var("b4r4")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s1d3"));
                }
            }

        });

        b4.put("b4r5s2", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r5s2"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s2"));
                }

                if (Integer.parseInt(var("b4r4")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s2"));
                }
            }

        });

        b4.put("b4r5s3", new IntNumber() {

            @Override
            public void valid() {
                try {
                    if ((value % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s3"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s3"));
                }

                if (Integer.parseInt(var("b4r4")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s3"));
                }

                if (Integer.parseInt(var("b4r5s2")) == 1) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s2"));
                }
            }

        });

        b4.put("b4r5s4d1", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r5s4d1"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d1"));
                }

                if (Integer.parseInt(var("b4r4")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d1"));
                }
            }

        });

        b4.put("b4r5s4d2", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r5s4d2"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d2"));
                }

                if (Integer.parseInt(var("b4r4")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d2"));
                }
            }

        });

        b4.put("b4r5s4d3", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r5s4d3"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d3"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d3"));
                }

                if (Integer.parseInt(var("b4r4")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d3"));
                }
            }

        });

        b4.put("b4r5s4d4", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r5s4d4"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d4"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d4"));
                }

                if (Integer.parseInt(var("b4r4")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d4"));
                }
            }

        });

        b4.put("b4r5s4d5", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r5s4d5"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d5"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d5"));
                }

                if (Integer.parseInt(var("b4r4")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4d5"));
                }
            }

        });

        b4.put("b4r5s4lainnya", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4lainnya"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4lainnya"));
                }

                if (Integer.parseInt(var("b4r4")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r5s4lainnya"));
                }

            }

        });

        b4.put("b4r6s1", new IntNumber() {

            @Override
            public void valid() {
                try {
                    if ((value % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r6s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r6s1"));
                }

            }

        });

        b4.put("b4r6s2", new IntNumber() {

            @Override
            public void valid() {
                try {
                    if ((value % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r6s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r6s2"));
                }
            }

        });

        b4.put("b4r6s3", new IntNumber() {

            @Override
            public void valid() {
                try {
                    if ((value % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r6s3"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r6s3"));
                }
            }

        });

        b4.put("b4r6s4", new IntNumber() {

            @Override
            public void valid() {
                try {
                    if ((value % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r6s4"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r6s4"));
                }
            }

        });

        b4.put("b4r6s5", new IntNumber() {

            @Override
            public void valid() {
                try {
                    if ((value % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r6s5"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r6s5"));
                }
            }

        });

        b4.put("b4r6lainnya", new IntNumber() {

            @Override
            public void valid() {
                try {
                    if ((value % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r6lainnya"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4r6lainnya"));
                }
            }

        });

        Blok blok4 = new Blok(b4);
        k1.put("b4", blok4);

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 4a -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        Hashtable<String, SuperVariabel> b4a = new Hashtable();

        b4a.put("b4ar7", new IntNumber() {

            @Override
            public void valid() {
                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar7"));
                }

                setMin(1);
                setMax(3);
                valid();

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar7"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar7"));
                }
            }

        });

        b4a.put("b4ar8", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar8"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar8"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar8"));
                }
            }

        });

        b4a.put("b4ar8lainnya", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt(var("b4ar8")) == 6 && value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar8lainnya"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar8lainnya"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar8lainnya"));
                }
            }

        });

        b4a.put("b4ar9", new IntNumber() {

            @Override
            public void valid() {
                try {
                    if ((value % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar9"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar9"));
                }
            }

        });

        b4a.put("b4ar10", new IntNumber() {

            @Override
            public void valid() {
                try {
                    if ((value % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar10"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar10"));
                }
            }

        });

        b4a.put("b4ar11", new IntNumber() {

            @Override
            public void valid() {
                try {
                    if ((value % 1) != 0) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } catch (NumberFormatException e) {
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar11"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar11"));
                }
            }

        });

        b4a.put("b4ar12", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r5s4d5"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar12"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar12"));
                }
            }

        });

        b4a.put("b4ar13", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(7);
                valid();

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar13"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar13"));
                }
            }

        });

        b4a.put("b4ar13lainnya", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt("b4ar13") == 7 && value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar13lainnya"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar13lainnya"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar13lainnya"));
                }
            }

        });

        b4a.put("b4ar14", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(8);
                valid();

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar14"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar14"));
                }
            }

        });

        b4a.put("b4ar14lainnya", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt("b4ar14") == 8 && value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar14lainnya"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar14lainnya"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar14lainnya"));
                }
            }

        });

        Blok blok4a = new Blok(b4a);
        k1.put("b4a", blok4a);

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 4c -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        Hashtable<String, SuperVariabel> b4c = new Hashtable();

        b4c.put("b4cr15", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r5s4d5"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr15"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr15"));
                }
            }

        });

        b4c.put("b4cr16s1", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr16s1"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s1"));
                }

                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s1"));
                }
            }

        });

        b4c.put("b4cr16s2", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr16s2"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s2"));
                }
                
                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s2"));
                }
            }

        });

        b4c.put("b4cr16s3", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr16s3"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s3"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s3"));
                }
                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s3"));
                }
            }

        });

        b4c.put("b4cr16s4", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr16s4"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s4"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s4"));
                }
                
                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s4"));
                }
            }

        });

        b4c.put("b4cr16s5", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr16s5"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s5"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s5"));
                }
                
                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s5"));
                }
            }

        });

        b4c.put("b4cr16s6", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr16s6"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s6"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s6"));
                }
                
                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s6"));
                }
            }

        });

        b4c.put("b4cr16s7", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr16s7"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s7"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s7"));
                }
                
                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s7"));
                }
            }

        });

        b4c.put("b4cr16s8", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr16s8"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s8"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s8"));
                }
                
                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s8"));
                }
            }

        });

        b4c.put("b4cr16s9", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr16s9"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s9"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s9"));
                }
                
                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s9"));
                }
            }

        });

        b4c.put("b4cr16s10", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr16s10"));
                }
                if (!(value.equals("1") && value.equals("2"))) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s10"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s10"));
                }
                
                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s10"));
                }
            }

        });

        b4c.put("b4cr16s10d1", new Text() {

            @Override
            public void valid() {
                if ((Integer.parseInt(value)) % 1 != 0) {
                    setValid(false);
                    addMessage(MessageString.type301());
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s10d1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s10d1"));
                }
                
                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s10d1"));
                }
            }

        });

        b4c.put("b4cr16s10d2", new Text() {

            @Override
            public void valid() {
                if ((Integer.parseInt(value)) % 1 != 0) {
                    setValid(false);
                    addMessage(MessageString.type301());
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s10d2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s10d2"));
                }
                
                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s10d2"));
                }
            }

        });

        b4c.put("b4cr16s10d3", new Text() {

            @Override
            public void valid() {
                if ((Integer.parseInt(value)) % 1 != 0) {
                    setValid(false);
                    addMessage(MessageString.type301());
                }

                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s10d3"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s10d3"));
                }
                
                if (Integer.parseInt(var("b4cr15")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr16s10d3"));
                }
            }

        });

        Blok blok4c = new Blok(b4c);
        k1.put("b4c", blok4c);

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 5 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        Hashtable<String, SuperVariabel> b5 = new Hashtable();

        b5.put("b5r1s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r1s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r1s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r1s1"));
                }
            }

        });

        b5.put("b5r1s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r1s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r1s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r1s2"));
                }
            }

        });

        b5.put("b5r2s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r2s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r2s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r2s1"));
                }
            }

        });

        b5.put("b5r2s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r2s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r2s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r2s2"));
                }
            }

        });

        b5.put("b5r3s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r3s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r3s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r3s1"));
                }
            }

        });

        b5.put("b5r3s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r3s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r3s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r3s2"));
                }
            }

        });

        b5.put("b5r4s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r4s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r4s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r4s1"));
                }
            }

        });

        b5.put("b5r4s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r4s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r4s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r4s2"));
                }
            }

        });

        b5.put("b5r5s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r4s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r5s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r5s1"));
                }
            }

        });

        b5.put("b5r5s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r5s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r5s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r5s2"));
                }
            }

        });

        b5.put("b5r6s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r6s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r6s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r6s1"));
                }
            }

        });

        b5.put("b5r6s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r6s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r6s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r6s2"));
                }
            }

        });

        b5.put("b5r7s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r7s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r7s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r7s1"));
                }
            }

        });

        b5.put("b5r7s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r7s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r7s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r7s2"));
                }
            }

        });

        b5.put("b5r8s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r8s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r8s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r8s1"));
                }
            }

        });

        b5.put("b5r8s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r8s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r8s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r8s2"));
                }
            }

        });

        b5.put("b5r9s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r9s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r9s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r9s1"));
                }
            }

        });

        b5.put("b5r9s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r9s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r9s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r9s2"));
                }
            }

        });

        b5.put("b5r10s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r10s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r10s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r10s1"));
                }
            }

        });

        b5.put("b5r10s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r10s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r10s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r10s2"));
                }
            }

        });

        b5.put("b5r11s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r11s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r11s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r11s1"));
                }
            }

        });

        b5.put("b5r11s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r11s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r11s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r11s2"));
                }
            }

        });

        b5.put("b5r12s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r12s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r12s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r12s1"));
                }
            }

        });

        b5.put("b5r12s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r12s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r12s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r12s2"));
                }
            }

        });

        b5.put("b5r13s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r13s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r13s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r13s1"));
                }
            }

        });

        b5.put("b5r13s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r13s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r13s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r13s2"));
                }
            }

        });

        b5.put("b5r14s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r14s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r14s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r14s1"));
                }
            }

        });

        b5.put("b5r14s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r14s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r14s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r14s2"));
                }
            }

        });

        b5.put("b5r15s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r15s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r15s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r15s1"));
                }
            }

        });

        b5.put("b5r15s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r15s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r15s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r15s2"));
                }
            }

        });

        b5.put("b5r16s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r16s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r16s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r16s1"));
                }
            }

        });

        b5.put("b5r16s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r16s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r16s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r16s2"));
                }
            }

        });

        b5.put("b5r17s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r17s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r17s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r17s1"));
                }
            }

        });

        b5.put("b5r17s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r17s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r17s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r17s2"));
                }
            }

        });

        b5.put("b5r18s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r18s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r18s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r18s1"));
                }
            }

        });

        b5.put("b5r18s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r18s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r18s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r18s2"));
                }
            }

        });

        b5.put("b5r19s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r19s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r19s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r19s1"));
                }
            }

        });

        b5.put("b5r19s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r19s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r19s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r19s2"));
                }
            }

        });

        b5.put("b5r20s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r20s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r20s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r20s1"));
                }
            }

        });

        b5.put("b5r20s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r20s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r20s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r20s2"));
                }
            }

        });

        b5.put("b5r21s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r21s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r21s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r21s1"));
                }
            }

        });

        b5.put("b5r21s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r21s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r21s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r21s2"));
                }
            }

        });

        b5.put("b5r22s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r22s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r22s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r22s1"));
                }
            }

        });

        b5.put("b5r22s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r22s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r22s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r22s2"));
                }
            }

        });

        b5.put("b5r23s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r23s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r23s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r23s1"));
                }
            }

        });

        b5.put("b5r23s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r23s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r23s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r23s2"));
                }
            }

        });

        b5.put("b5r24s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r24s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r24s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r24s1"));
                }
            }

        });

        b5.put("b5r24s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r24s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r24s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r24s2"));
                }
            }

        });

        b5.put("b5r25s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r25s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r25s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r25s1"));
                }
            }

        });

        b5.put("b5r25s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r25s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r25s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r25s2"));
                }
            }

        });

        b5.put("b5r26s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r26s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r26s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r26s1"));
                }
            }

        });

        b5.put("b5r26s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r26s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r26s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r26s2"));
                }
            }

        });

        b5.put("b5r27s1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r27s1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r27s1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r27s1"));
                }
            }

        });

        b5.put("b5r27s2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r27s2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r27s2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r27s2"));
                }
            }

        });

        Blok blok5 = new Blok(b5);
        k1.put("b5", blok5);

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 4a -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        Hashtable<String, SuperVariabel> b6 = new Hashtable();

        b6.put("b6r1", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(6);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r1"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r1"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r1"));
                }
            }

        });

        b6.put("b6r2", new IntNumber() {

            @Override
            public void valid() {
                setMin(1);
                setMax(7);
                valid();

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r2"));
                }
                
                if (Integer.parseInt(var("b3r2")) < 15) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r2"));
                }

                if (Integer.parseInt(var("b3r3")) == 2) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r2"));
                }
            }

        });

        Blok blok6 = new Blok(b6);
        k1.put("b6", blok6);

        Controller.setDict(k1);
//        Controller.setNksComponent("b1r1","b1r2","b1r3");
    }
}
