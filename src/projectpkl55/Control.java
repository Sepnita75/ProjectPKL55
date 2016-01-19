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
        Hashtable<String, Variabel> b1 = new Hashtable();
        b1.put("b1r1", new Text() {

            @Override
            public void valid() {

                if (getValue() != "32") {
                    setValid(false);
                    addMessage("kita PKL di Bandung bro!");
                }
            }
        });

        b1.put("b1r2", new Text() {

            @Override
            public void valid() {
                if (getValue() != "02" || getValue() != "09") {
                    setValid(false);
                    addMessage("Harus 02 atau 09");
                }
            }

        });

        b1.put("b1r3", new Text() {

            @Override
            public void valid() {
                try {
                    if ((Long.parseLong(getValue()) % 1) != 0) {
                        setValid(false);
                        addMessage("Harus angka");
                    }
                } catch (Exception e) {

                }

                if (getValue().isEmpty()) {
                    setValid(false);
                    addMessage("Harus Diisi");
                }
            }

        });

        b1.put("b1r4", new Text() {

            @Override
            public void valid() {

                try {
                    if ((Long.parseLong(getValue()) % 1) != 0) {
                        setValid(false);
                        addMessage("Harus angka");
                    }
                } catch (Exception e) {

                }

                if (getValue().isEmpty()) {
                    setValid(false);
                    addMessage("Harus Diisi");
                }
            }

        });

        b1.put("b1r5", new Text() {

            @Override
            public void valid() {

                if (getValue() != "1" || getValue() != "2") {
                    setValid(false);
                    addMessage("Harus diisi 1 atau 2");
                }
            }

        });

        b1.put("b1r6", new Text() {

            @Override
            public void valid() {

            }

        });

        b1.put("b1r7", new Text() {

            @Override
            public void valid() {

            }

        });

        b1.put("b1r8", new Text() {

            @Override
            public void valid() {
            }
        });

        b1.put("b1r9", new Text() {

            @Override
            public void valid() {
            }
        });

        b1.put("b1r10", new Text() {

            @Override
            public void valid() {
            }
        });

        b1.put("b1r11", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty()) {
                    setValid(false);
                    addMessage("Harus Diisi");
                }
                try {
                    if ((Integer.parseInt(getValue())) % 1 == 0) {
                        setValid(false);
                        addMessage("Tidak Boleh Angka");
                    }
                } catch (Exception e) {
                    //ISI NEXT
                }
            }
        });

        b1.put("b1r12", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty()) {
                    setValid(false);
                    addMessage("Harus Diisi");
                }
            }
        });

        b1.put("b1r13", new Text() {

            @Override
            public void valid() {
                try {
                    if ((Integer.parseInt(getValue()) % 1) != 0) {
                        setValid(false);
                        addMessage("Harus di isi berupa angka");
                    }
                } catch (Exception ex) {

                }
                if (getValue().isEmpty()) {
                    setValid(false);
                    addMessage("Harus Diisi");
                }
            }
        });

        Hashtable<String, Variabel> b2 = new Hashtable();

        b2.put("b2r1s1", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty()) {
                    setValid(false);
                    addMessage("Harus Diisi");
                }
            }

        });

        b2.put("b2r1s2", new Text() {

            @Override
            public void valid() {
                if (getValue().isEmpty()) {
                    setValid(false);
                    addMessage("Harus Diisi");
                }
            }

        });

        b2.put("b2r2s1", new Text() {

            @Override
            public void valid() {
                if (!(getValue().substring(0, 1).equals("12") || getValue().substring(0, 1).equals("13"))) {
                    setValid(false);
                    addMessage("NIM tidak sesuai");
                } else if (!(getValue().substring(2).equals("."))) {
                    setValid(false);
                    addMessage("NIM tidak sesuai");
                }
            }

        });

        b2.put("b2r2s2", new Text() {

            @Override
            public void valid() {
                if (!(getValue().substring(0, 1).equals("12") || getValue().substring(0, 1).equals("13"))) {
                    setValid(false);
                    addMessage("NIM tidak sesuai");
                } else if (!(getValue().substring(2).equals("."))) {
                    setValid(false);
                    addMessage("NIM tidak sesuai");
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
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        Hashtable<String, Variabel> b3 = new Hashtable();

        b3.put("b3ar1", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt(getValue()) < 15 || Integer.parseInt(getValue()) > 99) {
                    setValid(false);
                    addMessage("Umur harus berada diantara 15 sampai dengan 99");
                }
            }

        });

        b3.put("b3ar2", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt(getValue()) == 0) {
                    if (Integer.parseInt(getValue()) != 1 || Integer.parseInt(getValue()) != 2) {
                        setValid(false);
                        addMessage("Harus 1 atau 2");
                    }
                }
            }

        });

        b3.put("b3ar3", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt(getValue()) < 1 || Integer.parseInt(getValue()) > 3) {
                    setValid(false);
                    addMessage("Harus 1,2, atau 3");
                }

                if (Integer.parseInt(getValue()) == 0) {
                    setValid(false);
                    addMessage("Tidak boleh kosong");
                }

                if (Integer.parseInt(getValue()) == 1) {

                } else if (Integer.parseInt(getValue()) == 1) {

                }
            }

        });

        b3.put("b3ar4", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt(getValue()) < 1 || Integer.parseInt(getValue()) > 8) {
                    setValid(false);
                    addMessage("Harus 1,2, atau 3");
                }
            }

        });
    }
}
