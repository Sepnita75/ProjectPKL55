/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Color;
import java.util.Hashtable;

/**
  *  Kumpulan message-message yang nanti tinggal dipanggil
  *  SILAHKAN DITAMBAHKAN KALO ADA MESSAGE BARU ATAU GANTI VALUENYA KALO KURANG PAS
 */
public class MessageString {
    
    public static final String ON_DISABLE = "Field ini harus kosong";
    public static final String OUT_LENGTH_STRING = "Text Terlalu Panjang";
    public static final String OUT_RANGE = "Di luar nilai yang diizinkan";
    public static final String SELECTION_NEED = "Harus sesuai pilihan";
    public static final String INTEGER_NEED = "Harus Bilangan Bulat";
    public static final String DECIMAL_NEED = "Harus Desimal";
    public static final String REQUIRE = "Harus di isi";
    
    //  NULL CHECK
    public static String null101(String code) {
        return "ERROR 101 : Pertanyaan " + code + " wajib di isi!";
    }
    public static String null102(String code) {
        return "ERROR 102 : Pertanyaan " + code + " harus di lewati!";
    }
    
    //  VALUE EXCEPTION
    public static String value201(String ex) {
        return "ERROR 201 : Terjadi kesalahan pengisian! (ex: " + ex + ")";
    }
    public static String value202(String should) {
        return "ERROR 202 : Pengisihan tidak valid (Nilai yang diperbolehkan : " + should + ")";
    }
    
    //  TYPE CHECK
    public static String type301() {
        return "ERROR 301 : Hanya boleh berisi huruf!";
    }
    public static String type302() {
        return "ERROR 302 : Harus diawali dengan huruf besar!";
    }
    public static String type303() {
        return "ERROR 303 : Harus di isi dengan huruf besar!";
    }
    public static String type304() {
        return "ERROR 304 : Harus di isi berupa bilangan bulat!";
    }
    public static String type305() {
        return "ERROR 305 : Harus di isi berupa bilangan real!";
    }
    public static String type306() {
        return "ERROR 306 : Hanya boleh di isi dengan angka 1 (iya) dan 2 (tidak)";
    }
    public static String type307() {
        return "ERROR 307 : Harus di isi berupa angka!";
    }
    public static String type308() {
        return "ERROR 308 : Tidak boleh berupa angka!";
    }
    
    //  RANGE CHECK
    public static String range401(int max) {
        return "ERROR 401 : Pengisian maximum " + max + " karakter!";
    }
    public static String range402(int min, int max) {
        return "ERROR 402 : Isian harus berada di antara " + min + " hingga " + max + "!";
    }
    
    //  HUBUNGAN
    public static String rel501(String a, String b) {
        return "ERROR 501 : " + b + " Tidak boleh sama dengan " + a + "!";
    }
}