/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.data.model;

import java.util.ArrayList;

/**
 *
 * @author faqih_
 */
public class Config {

    public static String url1;
    public static String url2;
    public static boolean automove = false;
    public static String userName;
    public static boolean guest = false;

    public static final void setAutoMove(boolean b) {
        Config.automove = b;
    }

    public static void setURL(String url1,String url2,boolean automove) {
        String sql = "SELECT * FROM settings";
        if (Database.select(sql).isEmpty()) {
            Database.insert("settings", "'"+url1+"'", "'"+url2+"'" , "'"+(automove?1:0)+"'");
        }else{
            Database.delete("settings", "1=1");
            Database.insert("settings", "'"+url1+"'", "'"+url2+"'");
        }
    }

    public static void setURLToConfig() {
        try {
            String sql = "SELECT url1 FROM settings";
            Config.url1 = (String) ((ArrayList)Database.select(sql).get(0)).get(0);
        }catch(Exception e){}
        try {
            String sql = "SELECT url2 FROM settings";
            Config.url2 = (String) ((ArrayList)Database.select(sql).get(0)).get(0);
        }catch(Exception e){}
        try {
            String sql = "SELECT automove FROM settings";
            Config.automove = ((String)((ArrayList)Database.select(sql).get(0)).get(0)).equals("1");
        }catch(Exception e){}
    }
    public static void createTableSettings() {
        String sql = "CREATE TABLE settings ("
                + "url1 TEXT,"
                + "url2 TEXT,"
                + "automove TEXT"
                + ")";
        Database.createTable(sql);
    }
}
