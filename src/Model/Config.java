/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author faqih_
 */
public class Config {

    public static String url;
    public static boolean automove = false;
    public static String userName;

    public static final void setAutoMove(boolean b) {
        Config.automove = b;
    }

    public static void setURL(String url) {
        String sql = "SELECT * FROM settings";
        if (Database.select(sql).isEmpty()) {
            Database.insert("settings", "'"+url+"'");
        }
    }

    public static void setURLToConfig() {
        try {
            String sql = "SELECT * FROM settings";
            Config.url = (String) ((ArrayList)Database.select(sql).get(0)).get(0);
        }catch(Exception e){}
    
    }
    public static void createTableSettings() {
        String sql = "CREATE TABLE settings ("
                + "url TEXT"
                + ")";
        Database.createTable(sql);
    }
}
