/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author faqih_
 */
public class Config {
    public static String url;
    public static boolean automove;
    public static String userName;
    
    public static final void setUrl(String url){
        Config.url=url;
    }
    public static final void setAutoMove(boolean b){
        Config.automove=b;
    }
}
