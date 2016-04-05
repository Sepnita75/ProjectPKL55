package pkl55.kuesioner.validasi;

import pkl55.data.controller.SuperVariabel;
import pkl55.data.controller.MessageString;
import pkl55.data.controller.Controller;
import pkl55.data.controller.Blok;
import java.util.Hashtable;
import pkl55.data.controller.Loop;
import pkl55.data.controller.NumberSelect;
import pkl55.data.controller.Text;
import pkl55.data.controller.TextSelect;
import pkl55.data.controller.Variabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TOSHIBA
 */
public class ValidasiR {

    public static void main(String[] args) {
        ValidasiR.kuesioner();
    }

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
                //kode prov tersetting secara default, 52.
                value = "52";

            }
        });

        b1.put("b1r2", new TextSelect() {

            @Override
            public void valid() {
                //Validasi kode kabupaten. Hanya boleh diisi dengan 01 atau 08
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

                setLength(2);
            }
        });

        b1.put("b1r3", new TextSelect() {

            @Override
            public void valid() {
                //Validasi kode kecamatan. Hanya boleh berupa angka dan tidak kosong.
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

                setLength(3);
            }
        });

        b1.put("b1r4", new TextSelect() {

            @Override
            public void valid() {
                //Validasi kode kelurahan. Hanya boleh berupa angka dan tidak kosong.
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

                setLength(3);
            }

        });

        b1.put("b1r5", new TextSelect() {

            @Override
            public void valid() {
                //Validasi kode blok sensus.

                if (value.isEmpty()) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r5"));

                }

                setLength(4);

//                try {
//                    if ((Integer.parseInt(value) % 1) != 0) {
//                        setValid(false);
//                        addMessage(MessageString.type307());
//                    }
//                } catch (NumberFormatException e) {
//                    setValid(false);
//                    addMessage(MessageString.type307());
//                }
            }

        });

        b1.put("b1r6", new NumberSelect() {

            @Override
            public void valid() {
                //Validasi kode stratifikasi. Hanya boleh diisi 1 atau 2.
                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r6"));
                }

                if (value < 1 || value > 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(1);
            }

        });

        b1.put("b1r7", new NumberSelect() {

            @Override
            public void valid() {
                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r7"));
                }

                if (value < 1 || value > 3) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(1);
            }

        });

        b1.put("b1r8", new NumberSelect() {

            @Override
            public void valid() {
                if (value < 1 || value > 10) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r8"));
                }

                setLength(2);
            }

        });

        b1.put("b1r9", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r9"));
                }
                try {
                    if ((Integer.parseInt(value)) % 1 == 0) {
                        setValid(false);
                        addMessage(MessageString.type301());
                    }
                } catch (Exception e) {

                }

                setMaxLength(100);

            }

        });

        b1.put("b1r10", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r10"));
                }
                try {
                    if ((Integer.parseInt(value)) % 1 == 0) {
                        setValid(false);
                        addMessage(MessageString.type301());
                    }
                } catch (Exception e) {

                }

                setMaxLength(100);
            }

        });

        b1.put("b1r11", new NumberSelect() {

            @Override
            public void valid() {

                if (value < 1 || value > 3) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r11"));
                }

                setLength(1);

            }

        });

        b1.put("b1r12", new NumberSelect() {

            @Override
            public void valid() {
                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b1r12"));
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

                setLength(1);

            }

        });

        Blok blok1 = new Blok(b1);
        k1.put("b1", blok1);

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 2 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        final Hashtable<String, SuperVariabel> b2 = new Hashtable();

        b2.put("b2r2s1", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b2r2s1"));
                }
                try {
                    if ((Integer.parseInt(value)) % 1 == 0) {
                        setValid(false);
                        addMessage(MessageString.type301());
                    }
                } catch (Exception e) {

                }

                setMaxLength(100);
            }

        });

        b2.put("b2r2s2", new Text() {

            @Override
            public void valid() {
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b2r2s2"));
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

                setMaxLength(100);
            }

        });

        b2.put("b2r3s1", new Text() {

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
                    addMessage(MessageString.null101("b2r3s1"));
                }
                if (b2.containsKey("b2r3s2")) {
                    if (value.equals(var("b2r3s2"))) {
                        setValid(false);
                        addMessage(MessageString.rel501("b2r3s1", "b2r3s2"));
                    }
                }

                setMaxLength(7);
            }

        });

        b2.put("b2r3s2", new Text() {

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
                    addMessage(MessageString.null101("b2r3s1"));
                }
                if (b2.containsKey("b2r3s1")) {
                    if (value.equals(var("b2r3s1"))) {
                        setValid(false);
                        addMessage(MessageString.rel501("b2r3s1", "b2r3s2"));
                    }
                }
                setMaxLength(7);
            }

        });

        b2.put("b2r4s1", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt(value) < 14 || Integer.parseInt(value) > 23) {
                    setValid(false);
                    addMessage(MessageString.range402(14, 23));
                }
                if (b2.containsKey("b2r4s2")) {
                    if (Integer.parseInt(value) >= Integer.parseInt(var("b243s2"))) {
                        setValid(false);
                        addMessage(MessageString.value202("Harus kurang dari b2r4 kolom 3"));
                    }
                }
            }
        });

        b2.put("b2r4s2", new Text() {

            @Override
            public void valid() {
                if (Integer.parseInt(value) < 14 || Integer.parseInt(value) > 23) {
                    setValid(false);
                    addMessage(MessageString.range402(14, 23));
                }
                if (b2.containsKey("b2r4s1")) {
                    if (Integer.parseInt(value) <= Integer.parseInt(var("b2r4s1"))) {
                        setValid(false);
                        addMessage(MessageString.value202("Harus lebih dari b2r4 kolom 2"));
                    }
                }
            }
        });
        Blok blok2 = new Blok(b2);
        k1.put("b2", blok2);

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 3 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        Hashtable<String, SuperVariabel> b3 = new Hashtable();
        Hashtable<String, Variabel> b3Loop = new Hashtable();

        //  Memasukan pertanyaan b3r2 kedalam blok 3
        b3Loop.put("b3r2", new Text() {
            // Validasi Blok 3 rincian 2/ kolom 2/ nama ART
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(50);
                // Perlakuan jika tidak di isi
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b3r2"));
                }

                // Perlakuan harus huruf semua 
                if (!isHuruf(value)) {
                    setValid(false);
                    addMessage(MessageString.type301());
                }
            }
        });

        //  Memasukan pertanyaan b3r3 kedalam blok 3
        b3Loop.put("b3r3", new NumberSelect() {
            // Validasi Blok 3 rincian 3/ kolom 3/ hubungan dgn KART
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setLength(1);
                //Mendaftar options
                int[] opt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                setOptions(opt);

                // Perlakuan jika tidak di isi
                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.REQUIRE);
                }

            }
        });

        //  Memasukan pertanyaan b3r4 kedalam blok 3
        b3Loop.put("b3r4", new Text() {
            // Validasi Blok 3 rincian 4/ kolom 4/ jenis kelamin
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(1);
                // Perlakuan jika tidak di isi
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b3r4"));
                }
                //hanya boleh bilangan bulat
                if (!isBilanganBulat(value)) {
                    setValid(false);
                    addMessage(MessageString.type304());
                }
                //hanya boleh 1 atau 2 (Laki atau Pr)
                if (value.equalsIgnoreCase("1") || value.equalsIgnoreCase("2")) {
                    setValid(false);
                    addMessage(MessageString.value202("1 atau 2"));
                }
            }
        });

        //  Memasukan pertanyaan b3r5 kedalam blok 3
        b3Loop.put("b3r5", new Text() {
            // Validasi Blok 3 rincian 5/ kolom 5/ umur
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(2);
                // Perlakuan jika tidak di isi
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b3r5"));
                }
                //hanya boleh bilangan bulat
                if (!isBilanganBulat(value)) {
                    setValid(false);
                    addMessage(MessageString.type304());
                }
                //hanya boleh 0 sampai 98
                try {
                    Long umur = Long.parseLong(value);
                    if (umur < 0 || umur > 98) {
                        setValid(false);
                        addMessage(MessageString.range402(0, 98));
                    }
                } catch (Exception e) {
                }
                //KRT harus berusia >=10 thn 
                if (Long.parseLong(var("b3r3")) == 1 && Long.parseLong(value) < 10) {
                    setValid(false);
                    addMessage(MessageString.value202("Umur harus >= 10 tahun"));
                }
                //Org tua/mertua  harus berusia >=20 thn 
                if (Long.parseLong(value) < 20 && Long.parseLong(var("b3r3")) == 6) {
                    setValid(false);
                    addMessage(MessageString.value202("Umur harus >= 20 tahun"));
                }
                //Suami/istri atau menantu harus berusia >=10 thn 
                if (Long.parseLong(value) < 10 && (Long.parseLong(var("b3r3")) == 2 || Long.parseLong(var("b3r3")) == 4)) {
                    setValid(false);
                    addMessage(MessageString.value202("Umur harus >= 10 tahun"));
                }
            }
        });

        //  Memasukan pertanyaan b3r6 kedalam blok 3
        b3Loop.put("b3r6", new Text() {
            // Validasi Blok 3 rincian 6/ kolom 6/ kish number
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(2);
                // Perlakuan jika tidak di isi untuk umur >=21 tahun
                if (Long.parseLong(var("b3r6")) > 20) {
                    try {
                        if (value.isEmpty() || value.equals("")) {
                            setValid(false);
                            addMessage(MessageString.null101("b3r6"));
                        }
                    } catch (Exception e) {
                    }

                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 1 sampai 10
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 1 || t > 10) {
                            setValid(false);
                            addMessage(MessageString.range402(1, 10));
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r7 kedalam blok 3
        b3Loop.put("b3r7", new Text() {
            // Validasi Blok 3 rincian 7/ kolom 7/ status perkawinan
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(1);
                // Perlakuan jika tidak di isi
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b3r7"));
                }
                //hanya boleh bilangan bulat
                if (!isBilanganBulat(value)) {
                    setValid(false);
                    addMessage(MessageString.type304());
                }
                //hanya boleh 1 sampai 4
                try {
                    int t = (int) Long.parseLong(value);
                    if (t < 1 || t > 4) {
                        setValid(false);
                        addMessage(MessageString.range402(1, 4));
                    }
                } catch (Exception e) {
                }

                //Suami/istri dan menantu harus berusia >=10 thn dan berstatus kawin
                if (Long.parseLong(var("b3r5")) < 10 && (Long.parseLong(var("b3r3")) == 2 || (Long.parseLong(var("b3r3")) == 4))
                        && Long.parseLong(var(value)) != 2) {
                    setValid(false);
                    addMessage(MessageString.value202("Harus berstatus kawin"));
                }
            }
        });

        //  Memasukan pertanyaan b3r8 kedalam blok 3
        b3Loop.put("b3r8", new Text() {
            // Validasi Blok 3 rincian 8/ kolom 8/ STTB tertinggi
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(2);
                //Usia lebih dari 4/ 5 thn ke atas
                if (Long.parseLong(var("b3r5")) > 4) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r8"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 00 sampai 15
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 0 || t > 15) {
                            setValid(false);
                            addMessage(MessageString.range402(0, 15));
                        }
                    } catch (Exception e) {
                    }

                    //STTB tertinggi = 02-04, sedangkan umur <10
                    Long usia = Long.parseLong(var("b3r5"));
                    if ((Long.parseLong(value) > 1 && Long.parseLong(value) <= 4) && usia < 10) {
                        setValid(false);
                        addMessage(MessageString.value202("01"));
                    }
                    //STTB tertinggi = 05-07, sedangkan umur <13
                    if ((Long.parseLong(value) >= 5 && Long.parseLong(value) <= 7) && usia < 13) {
                        setValid(false);
                        addMessage(MessageString.value202("01-04"));
                    }
                    //STTB tertinggi = 08-11, sedangkan umur <16
                    if ((Long.parseLong(value) >= 8 && Long.parseLong(value) <= 11) && usia < 16) {
                        setValid(false);
                        addMessage(MessageString.value202("01-07"));
                    }
                    //STTB tertinggi = 12, sedangkan umur <17
                    if ((Long.parseLong(value) == 12) && usia < 17) {
                        setValid(false);
                        addMessage(MessageString.value202("01-11"));
                    }
                    //STTB tertinggi = 14, sedangkan umur <20
                    if ((Long.parseLong(value) == 14) && usia < 20) {
                        setValid(false);
                        addMessage(MessageString.value202("01-13"));
                    }
                    //STTB tertinggi = 15, sedangkan umur <22
                    if ((Long.parseLong(value) == 15) && usia < 22) {
                        setValid(false);
                        addMessage(MessageString.value202("01-14"));
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r9 kedalam blok 3
        b3Loop.put("b3r9", new Text() {
            // Validasi Blok 3 rincian 9/ kolom 9/ Bekerja
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(1);
                //Usia lebih dari 10
                if (Long.parseLong(var("b3r5")) > 9) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r9"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 1 dan 2
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 1 || t > 2) {
                            setValid(false);
                            addMessage(MessageString.type306());
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r10 kedalam blok 3
        b3Loop.put("b3r10", new Text() {
            // Validasi Blok 3 rincian 10/ kolom 10/ Sekolah
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(1);
                //Usia lebih dari 10
                if (Long.parseLong(var("b3r5")) > 9) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r10"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 1 dan 2
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 1 || t > 2) {
                            setValid(false);
                            addMessage(MessageString.type306());
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r11 kedalam blok 3
        b3Loop.put("b3r11", new Text() {
            // Validasi Blok 3 rincian 11/ kolom 11/ Mengurus rumah tangga
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(1);
                //Usia lebih dari 10
                if (Long.parseLong(var("b3r5")) > 9) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r11"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 1 dan 2
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 1 || t > 2) {
                            setValid(false);
                            addMessage(MessageString.type306());
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r12 kedalam blok 3
        b3Loop.put("b3r12", new Text() {
            // Validasi Blok 3 rincian 12/ kolom 12/ Kegiatan lainnya
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(1);
                //Usia lebih dari 10
                if (Long.parseLong(var("b3r5")) > 9) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r12"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 1 dan 2
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 1 || t > 2) {
                            setValid(false);
                            addMessage(MessageString.type306());
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r13 kedalam blok 3
        b3Loop.put("b3r13", new Text() {
            // Validasi Blok 3 rincian 13/ kolom 13/ Kegiatan terbanyak
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(1);
                //Usia lebih dari 10
                if (Long.parseLong(var("b3r5")) > 9) {
                    // Perlakuan jika tidak di isi
                    if ((value.isEmpty() || value.equals("")) && (var("b3r9").equalsIgnoreCase("1")
                            || var("b3r10").equalsIgnoreCase("1") || var("b3r11").equalsIgnoreCase("1")
                            || var("b3r12").equalsIgnoreCase("1"))) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r13"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 1 sampai 4
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 1 || t > 4) {
                            setValid(false);
                            addMessage(MessageString.range402(1, 4));
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r14 kedalam blok 3
        b3Loop.put("b3r14", new Text() {
            // Validasi Blok 3 rincian 14/ kolom 14/ Punya pekerjaan namun sementara tidak bekerja
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(1);
                //Usia lebih dari 10 dan bekerja = 2
                if (Long.parseLong(var("b3r5")) > 9 && Long.parseLong(var("b3r9")) == 2) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r14"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 1 sampai 2
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 1 || t > 2) {
                            setValid(false);
                            addMessage(MessageString.type306());
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r15 kedalam blok 3
        b3Loop.put("b3r15", new Text() {
            // Validasi Blok 3 rincian 15/ kolom 15/ Lapangan usaha utama
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(2);
                //Usia lebih dari 10 dan bekerja/ sedang tdk bekerja
                if (Long.parseLong(var("b3r5")) > 9 && (Long.parseLong(var("b3r9")) == 1 || Long.parseLong(var("b3r14")) == 1)) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r15"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 01 hingga 16
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 1 || t > 16) {
                            setValid(false);
                            addMessage(MessageString.value202("01 hingga 16"));
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r16 kedalam blok 3
        b3Loop.put("b3r16", new NumberSelect() {
            // Validasi Blok 3 rincian 16/ kolom 16/ Jenis pekerjaan utama
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setLength(1);
                //Usia lebih dari 10 dan bekerja/ sedang tdk bekerja
                if (Long.parseLong(var("b3r5")) > 9 && (Long.parseLong(var("b3r9")) == 1 || Long.parseLong(var("b3r14")) == 1)) {
                    //Mendaftar options
                    int[] opt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                    setOptions(opt);

                    // Perlakuan jika tidak di isi
                    if (value == 0) {
                        setValid(false);
                        addMessage(MessageString.REQUIRE);
                    }

                    //hanya boleh 1 hingga 9
                    try {
                        if (value < 1 || value > 9) {
                            setValid(false);
                            addMessage(MessageString.value202("1 hingga 9"));
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r17 kedalam blok 3
        b3Loop.put("b3r17", new Text() {
            // Validasi Blok 3 rincian 17/ kolom 17// status/kedudukan dalam pekerjaan
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(1);
                //Usia lebih dari 10 dan bekerja = 1 atau sementara tdk bekerja = 1
                if (Long.parseLong(var("b3r5")) > 9 && (Long.parseLong(var("b3r9")) == 1 || Long.parseLong(var("b3r14")) == 1)) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r17"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 1 sampai 7
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 1 || t > 7) {
                            setValid(false);
                            addMessage(MessageString.range402(1, 7));
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r18 kedalam blok 3
        b3Loop.put("b3r18", new Text() {
            // Validasi Blok 3 rincian 18/ kolom 17// gaji
            @Override
            public void valid() {
                //Usia lebih dari 10 dan bekerja = 1 atau sementara tdk bekerja = 1
                if (Long.parseLong(var("b3r5")) > 9 && (Long.parseLong(var("b3r9")) == 1 || Long.parseLong(var("b3r14")) == 1)) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r18"));
                    }
                    //hanya boleh angka
                    if (!isBilanganBulat(value) && !isBilanganDesimal(value)) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r19 kedalam blok 3
        b3Loop.put("b3r19", new Text() {
            // Validasi Blok 3 rincian 19/ kolom 19/ Lapangan usaha tambahan di sektor pariwisata
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(2);
                //Usia lebih dari 10 dan bekerja/ sedang tdk bekerja dan lapangan usaha utama = 01-03
                if (Long.parseLong(var("b3r5")) > 9 && (Long.parseLong(var("b3r9")) == 1 || Long.parseLong(var("b3r14")) == 1)
                        && (Long.parseLong(var("b3r15")) > 0 || Long.parseLong(var("b3r15")) < 4)) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r19"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 01 hingga 16
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 1 || t > 16) {
                            setValid(false);
                            addMessage(MessageString.value202("01 hingga 16"));
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r21 kedalam blok 3
        b3Loop.put("b3r21", new NumberSelect() {
            // Validasi Blok 3 rincian 21/ kolom 21/ Jenis pekerjaan tambahan di sektor pariwisata
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setLength(1);
                //Usia lebih dari 10 dan bekerja/ sedang tdk bekerja dan lapangan usaha utama = 01-03
                if (Long.parseLong(var("b3r5")) > 9 && (Long.parseLong(var("b3r9")) == 1 || Long.parseLong(var("b3r14")) == 1)
                        && (Long.parseLong(var("b3r15")) > 0 || Long.parseLong(var("b3r15")) < 4)) {
                    //Mendaftar options
                    int[] opt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                    setOptions(opt);

                    // Perlakuan jika tidak di isi
                    if (value == 0) {
                        setValid(false);
                        addMessage(MessageString.REQUIRE);
                    }
                    //hanya boleh 1 hingga 9
                    try {
                        if (value < 1 || value > 9) {
                            setValid(false);
                            addMessage(MessageString.value202("1 hingga 9"));
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r22 kedalam blok 3
        b3Loop.put("b3r22", new NumberSelect() {
            // Validasi Blok 3 rincian 22/ kolom 22// status/kedudukan dalam pekerjaan tambahan
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setLength(1);
                //Usia lebih dari 10 dan bekerja/ sedang tdk bekerja dan lapangan usaha utama = 01-03
                if (Long.parseLong(var("b3r5")) > 9 && (Long.parseLong(var("b3r9")) == 1 || Long.parseLong(var("b3r14")) == 1)
                        && (Long.parseLong(var("b3r15")) > 0 || Long.parseLong(var("b3r15")) < 4)) {

                    //Mendaftar options
                    int[] opt = {1, 2, 3, 4, 5, 6, 7};
                    setOptions(opt);

                    // Perlakuan jika tidak di isi
                    if (value == 0) {
                        setValid(false);
                        addMessage(MessageString.REQUIRE);
                    }
                    //hanya boleh 1 sampai 7
                    try {
                        //int t = (int) Long.parseLong(value);
                        if (value < 1 || value > 7) {
                            setValid(false);
                            addMessage(MessageString.range402(1, 7));
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r23 kedalam blok 3
        b3Loop.put("b3r23", new Text() {
            // Validasi Blok 3 rincian 23/ kolom 23// gaji pekerjaan +an di sektor pariwisata
            @Override
            public void valid() {
                //Usia lebih dari 10 dan bekerja = 1 atau sementara tdk bekerja = 1
                if (Long.parseLong(var("b3r5")) > 9 && (Long.parseLong(var("b3k15")) == 1 || Long.parseLong(var("b3r15")) == 2
                        || Long.parseLong(var("b3k15")) == 3) && (Long.parseLong(var("b3r9")) == 1 || Long.parseLong(var("b3r14")) == 1)) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r23"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value) && !isBilanganDesimal(value)) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                    //hanya boleh angka
                    if (!isBilanganBulat(value) && !isBilanganDesimal(value)) {
                        setValid(false);
                        addMessage(MessageString.type307());
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r24 kedalam blok 3
        b3Loop.put("b3r24", new Text() {
            // Validasi Blok 3 rincian 24/ kolom 24/ Berganti pekerjaan?
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(1);
                //Usia lebih dari 10
                if (Long.parseLong(var("b3r5")) > 9) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r24"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 1 dan 2
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 1 || t > 2) {
                            setValid(false);
                            addMessage(MessageString.type306());
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r25 kedalam blok 3
        b3Loop.put("b3r25", new Text() {
            // Validasi Blok 3 rincian 25/ kolom 25/ Lapangan usaha sebelumnya
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(2);
                //Usia lebih dari 10
                if (Long.parseLong(var("b3r5")) > 9 && Long.parseLong(var("b3r24")) == 1) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r25"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 01 hingga 16
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 1 || t > 16) {
                            setValid(false);
                            addMessage(MessageString.value202("01 hingga 16"));
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r26 kedalam blok 3
        b3Loop.put("b3r26", new NumberSelect() {
            // Validasi Blok 3 rincian 26/ kolom 26/ Jenis pekerjaan sebelumnya
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setLength(1);
                //Usia lebih dari 10
                if (Long.parseLong(var("b3r5")) > 9 && Long.parseLong(var("b3r24")) == 1) {
                    //Mendaftar options
                    int[] opt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                    setOptions(opt);

                    // Perlakuan jika tidak di isi
                    if (value == 0) {
                        setValid(false);
                        addMessage(MessageString.REQUIRE);
                    }

                    //hanya boleh 1 hingga 9
                    try {
//                        int t = (int) Long.parseLong(value);
                        if (value < 1 || value > 9) {
                            setValid(false);
                            addMessage(MessageString.value202("1 hingga 9"));
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r27 kedalam blok 3
        b3Loop.put("b3r27", new Text() {
            // Validasi Blok 3 rincian 27/ kolom 27/ Tempat lahir (Provinsi/Negara)
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(2);
                // Perlakuan jika tidak di isi
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b3r27"));
                }
                //hanya boleh bilangan bulat
                if (!isBilanganBulat(value)) {
                    setValid(false);
                    addMessage(MessageString.type304());
                }
                //hanya boleh 00, 11 hingga 19, 21,  31 hingga 36,  51 hingga 53, 61 hingga 65, 71 hingga 76, 81 hingga 82, 91, 94
                try {
                    int t = (int) Long.parseLong(value);
                    if (t < 0 || (t > 0 && t < 11) || t == 20 || (t > 21 && t < 31) || (t > 36 && t < 51) || (t > 53 && t < 61) || (t > 65 && t < 71) || (t > 76 && t < 81)
                            || (t > 82 && t < 91) || (t > 91 && t < 94) || t > 94) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                } catch (Exception e) {
                }
            }
        });

        //  Memasukan pertanyaan b3r28 kedalam blok 3
        b3Loop.put("b3r28", new Text() {
            // Validasi Blok 3 rincian 28/ kolom 28/ Tempat lahir (Kabupaten/Kota)
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(2);
                // Hanya untuk usia >= 5thn dan bukan luar negeri (00)
                if (Long.parseLong(var("b3r27")) != 0) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r28"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 00-99
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 0 || t > 99) {
                            setValid(false);
                            addMessage(MessageString.OUT_RANGE);
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r29 kedalam blok 3
        b3Loop.put("b3r29", new Text() {
            // Validasi Blok 3 rincian 29/ kolom 29/ Tempat tinggal 5 tahun yg lalu (Provinsi/Negara)
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(2);
                // Perlakuan jika tidak di isi
                if (value.isEmpty() || value.equals("")) {
                    setValid(false);
                    addMessage(MessageString.null101("b3r29"));
                }
                //hanya boleh bilangan bulat
                if (!isBilanganBulat(value)) {
                    setValid(false);
                    addMessage(MessageString.type304());
                }
                //hanya boleh 00, 11 hingga 19, 21,  31 hingga 36,  51 hingga 53, 61 hingga 65, 71 hingga 76, 81 hingga 82, 91, 94
                try {
                    int t = (int) Long.parseLong(value);
                    if (t < 0 || (t > 0 && t < 11) || t == 20 || (t > 21 && t < 31) || (t > 36 && t < 51) || (t > 53 && t < 61) || (t > 65 && t < 71) || (t > 76 && t < 81)
                            || (t > 82 && t < 91) || (t > 91 && t < 94) || t > 94) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                } catch (Exception e) {
                }
            }
        });

        //  Memasukan pertanyaan b3r30 kedalam blok 3
        b3Loop.put("b3r30", new Text() {
            // Validasi Blok 3 rincian 30/ kolom 30/ Tempat tinggal 5 tahun yang lalu (Kabupaten/Kota)
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setMaxLength(2);
                // Hanya untuk usia >= 5thn dan bukan luar negeri (00)
                if (Long.parseLong(var("b3r29")) != 0 && Long.parseLong(var("b3r5")) > 4) {
                    // Perlakuan jika tidak di isi
                    if (value.isEmpty() || value.equals("")) {
                        setValid(false);
                        addMessage(MessageString.null101("b3r30"));
                    }
                    //hanya boleh bilangan bulat
                    if (!isBilanganBulat(value)) {
                        setValid(false);
                        addMessage(MessageString.type304());
                    }
                    //hanya boleh 00-99
                    try {
                        int t = (int) Long.parseLong(value);
                        if (t < 0 || t > 99) {
                            setValid(false);
                            addMessage(MessageString.OUT_RANGE);
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });

        //  Memasukan pertanyaan b3r31 kedalam blok 3
        b3Loop.put("b3r31", new NumberSelect() {
            // Validasi Blok 3 rincian 31/ kolom 31/ alasan migrasi
            @Override
            public void valid() {
                //Set maksimum jumlah karakter
                setLength(1);
                //Hanya utk 5 tahun lalu tgl selain d NTB atau di NTB tapi kab tempat tgl saat ini beda dgn 5 thn lalu
                if (Long.parseLong(var("b3r29")) != 52 || (Long.parseLong(var("b3r29")) == 52 && Long.parseLong(var("b3r30")) != Long.parseLong(var("b1r2")))) {

                    //Mendaftar options
                    int[] opt = {1, 2, 3, 4, 5};
                    setOptions(opt);

                    // Perlakuan jika tidak di isi
                    if (value == 0) {
                        setValid(false);
                        addMessage(MessageString.REQUIRE);
                    }
                    //hanya boleh 1 hingga 5
                    try {
                        if (value < 1 || value > 5) {
                            setValid(false);
                            addMessage(MessageString.value202("1 hingga 5"));
                        }
                    } catch (Exception e) {
                    }
                } else {
                    setEnable(false);
                }
            }
        });
        
        b3.put("b3", new Loop(b3Loop));
        Blok blok3 = new Blok(b3);
        k1.put("b3", blok3);

//                                       - BLOK 4 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        Hashtable<String, SuperVariabel> b4 = new Hashtable();

        b4.put("b4r1", new NumberSelect() {

            @Override
            public void valid() {
                if (value < 1 || value > 10) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4r1"));
                }

                setLength(2);
            }

        });

        b4.put("b4ar1", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar1"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar1"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar2", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar2"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar2"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar3", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar3"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar3"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar4", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar4"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar4"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar5", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar5"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar5"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar6", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar6"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar6"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar7", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar7"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar7"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar8", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar8"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar8"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar9", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar9"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar9"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar10", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar10"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar10"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar11", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar11"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar11"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar12", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar12"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar12"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar13", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar13"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar13"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar14", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar14"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar14"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar15", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar15"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar15"));
                }

                setLength(1);
            }

        });

        b4.put("b4ar16", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4ar16"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4ar16"));
                }

                setLength(1);
            }

        });

        b4.put("b4br17", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4br17"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4br17"));
                }

                setLength(1);
            }

        });

        b4.put("b4br18", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4br18"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4br18"));
                }

                setLength(1);
            }

        });

        b4.put("b4br19", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4br19"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4br19"));
                }

                setLength(1);
            }

        });

        b4.put("b4br20", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4br20"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4br20"));
                }

                setLength(1);
            }

        });

        b4.put("b4br21", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4br21"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4br21"));
                }

                setLength(1);
            }

        });

        b4.put("b4br22", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4br22"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4br22"));
                }

                setLength(1);
            }

        });

        b4.put("b4br23", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4br23"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4br23"));
                }

                setLength(1);
            }

        });

        b4.put("b4br24", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4br24"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4br24"));
                }

                setLength(1);
            }

        });

        b4.put("b4cr25", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr25"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr25"));
                }

                setLength(1);
            }

        });

        b4.put("b4cr26", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr26"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr26"));
                }

                setLength(1);
            }

        });

        b4.put("b4cr27", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr27"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr27"));
                }

                setLength(1);
            }

        });

        b4.put("b4cr28", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr28"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr28"));
                }

                setLength(1);
            }

        });

        b4.put("b4cr29", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr29"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr29"));
                }

                setLength(1);
            }

        });

        b4.put("b4cr30", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr30"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr30"));
                }

                setLength(1);
            }

        });

        b4.put("b4cr31", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr31"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr31"));
                }

                setLength(1);
            }

        });

        b4.put("b4cr32", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b4cr32"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b4cr32"));
                }

                setLength(1);
            }

        });

        Blok blok4 = new Blok(b4);
        k1.put("b4", blok4);

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 5 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        Hashtable<String, SuperVariabel> b5 = new Hashtable();

        b5.put("b5r1", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r1"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r1"));
                }

                setLength(1);
            }

        });

        b5.put("b5r2", new NumberSelect() {

            @Override
            public void valid() {

                if (Integer.parseInt(var("b4r1")) == 0) {
                    setEnable(false);
                    addMessage(MessageString.null102("b5r2"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b5r2"));
                }

                setLength(1);
            }

        });

        Blok blok5 = new Blok(b5);
        k1.put("b5", blok5);

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 6 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        Hashtable<String, SuperVariabel> b6 = new Hashtable();

        b6.put("b6r1", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r1"));
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r1"));
                }

                if (value < 1 || value > 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(1);

            }

        });

        b6.put("b6r2", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r2"));
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r2"));
                }

                if (value < 1 || value > 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(1);
            }

        });

        b6.put("b6r3", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r3"));
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r3"));
                }

                if (value < 1 || value > 7) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(1);

            }

        });

        b6.put("b6r4", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r4"));
                }

                if (!var("b6r3").equals("1")) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r4"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(1);

            }

        });

        b6.put("b6r5", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r5"));
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r5"));
                }

                if (value < 1 || value > 7) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(1);

            }

        });

        b6.put("b6r6", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r6"));
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r6"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(1);

            }

        });

        b6.put("b6r7", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r7"));
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r7"));
                }

                if (value < 1 || value > 7) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(1);

            }

        });

        b6.put("b6r8", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r8"));
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r8"));
                }

                setLength(4);
            }

        });

        b6.put("b6r9s1", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r9s1"));
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r9s1"));
                }

                if (value < 1 || value > 12) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(2);
            }

        });

        b6.put("b6r9s2", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r9s2"));
                }

                if (Integer.parseInt(var("b6r9s1")) < 5 || Integer.parseInt(var("b6r9s1")) > 9) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r9s2"));
                }

                if (value < 1 || value > 3) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(1);
            }

        });

        b6.put("b6r10", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r10"));
                }

                if (Integer.parseInt(var("b6r9s1")) < 3) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r10"));
                }

                if (var("b6r9s1").equals(4)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r10"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(1);
            }

        });

        b6.put("b6r11s1", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r11s1"));
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r11s1"));
                }

                if (value < 1 || value > 3) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(1);

            }

        });

        b6.put("b6r11s2", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r11s2"));
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r11s2"));
                }

                if (value < 1 || value > 13) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(2);

            }

        });

        b6.put("b6r12", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r12"));
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r12"));
                }

                if (value < 1 || value > 10) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                setLength(2);
            }

        });

        b6.put("b6r13s1", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r13s1"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r13s1"));
                }

                setLength(1);
            }

        });

        b6.put("b6r13s2", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r13s2"));
                }

                if (var("b6r13s1").equals("4")) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r13s2"));
                }

                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r13s2"));
                }

                setLength(1);
            }

        });

        b6.put("b6r13s3", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r13s3"));
                }

                if (value < 1 || value > 5) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r13s3"));
                }

                setLength(1);
            }

        });

        b6.put("b6r14s1", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r14s1"));
                }

                if (value < 1 || value > 5) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r14s1"));
                }

                setLength(1);
            }

        });

        b6.put("b6r14s2", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r14s2"));
                }

                if (!var("b6r14s1").equals("1")) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r14s2"));
                }

                if (value < 1 || value > 6) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r14s2"));
                }

                setLength(1);
            }

        });

        b6.put("b6r15", new NumberSelect() {

            @Override
            public void valid() {

                if (!var("b1r11").equals(2) || !var("b1r11").equals(3)) {
                    setEnable(false);
                    addMessage(MessageString.null102("b6r15"));
                }

                if (value < 1 || value > 6) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

                if (value == 0) {
                    setValid(false);
                    addMessage(MessageString.null101("b6r14s2"));
                }

                setLength(1);
            }

        });

        Blok blok6 = new Blok(b6);
        k1.put("b6", blok6);

        //:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//                                       - BLOK 7 -
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::        
        Hashtable<String, SuperVariabel> b7 = new Hashtable();

        b7.put("catatan", new Text() {

            @Override
            public void valid() {

            }

        });

        Blok blok7 = new Blok(b7);
        k1.put("b7", blok7);

        Controller.setDS(false);
        Controller.setNksComponent("b1r1", "b1r2", "b1r3", "b1r4", "b1r5", "b1r8");
        Controller.setDict(k1);
    }
}
