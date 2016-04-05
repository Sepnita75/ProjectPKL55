/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.main;

import pkl55.data.model.Config;
import pkl55.data.model.Model;

/**
 *
 * @author faqih_
 */
public class Initialization {
    public static void init(){
        Config.createTableSettings();
        Model.startSync();
    }
}
