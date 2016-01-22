/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Blok;
import Controller.Text;
import Controller.Variabel;
import Controller.Controller;
import Controller.Loop;
import Controller.SuperVariabel;
import View.Panel;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.json.JSONArray; 
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author faqih_
 */
public class Model {

    public static String activeId;

    public Model() {

    }
//    private static String[] createTablesQuery() {
//        String bloks[] = (String[]) Controller.getAllBloks().keySet().toArray();
//        String tables[] = new String[bloks.length + 1];
//        for (int i = 0; i < bloks.length; i++) {
//            String vars[] = (String[]) Controller.getBlok(bloks[i]).getAllVariabels().keySet().toArray();
//            String blok = "CREATE TABLE IF NOT EXISTS" + bloks[i] + " ("
//                    + "nks TEXT PRIMARY KEY NOT NULL";
//            for (int j = 0; j < vars.length; j++) {
//                if (Controller.get(bloks[i], vars[j]) instanceof Text) {
//                    blok += ", " + vars[j] + " TEXT";
//                } else {
//                    blok += ", " + vars[j] + " INT";
//                }
//            }
//            blok += ", valid INT );";
//            tables[i] = blok;
//        }
//        tables[bloks.length] = "CREATE TABLE IF NOT EXISTS autosave ("
//                + "key TEXT"
//                + "value TEXT"
//                + ");";
//        return tables;
//    }
//    public static void createTable() {
//        String tables[] = createTablesQuery();
//        for (String query : tables) {
//            Database.createTable(query);
//        }
//    }

//    private static void saveBlok(String blokName, Blok b,String nks) {
//        Variabel []vars = (Variabel[])b.getAllVariabels().values().toArray();
//        String []keys = (String[])b.getAllVariabels().keySet().toArray();
//        
//        String []val = new String[vars.length+1];
//        String []key = new String[vars.length+1];
//        val[0] = nks;
//        key[0] = "nks";
//        for(int i=1;i<val.length;i++){
//            val[i] = vars[i-1].getValue();
//            key[i] = keys[i-1];
//        }
//        String select = "SELECT * FROM " + blokName + " WHERE nks=" + nks + ";";
//        if (Database.select(select).size() == 0) {
//            Database.insert(blokName, val);
//        } else {
//            Database.up
//        }
//    }
//    public static void saveAll() {
//        Blok[] bloks = (Blok[]) Controller.getAllBloks().values().toArray();
//        String[] blokNames = (String[]) Controller.getAllBloks().keySet().toArray();
//        for (int i = 0; i < bloks.length; i++) {
//            saveBlok(blokNames[i], bloks[i]);
//        }
//    }
//    public static void saveItem(String blokName, String varName, String value) {
//        String select = "SELECT * FROM autosave WHERE key=" + varName + ";";
//        if (Database.select(select).size() == 0) {
//            Database.insert(blokName, varName, value);
//        } else {
//            String col[] = {"value"};
//            String val[] = {value};
//            try {
//                Database.update(blokName, col, val, "key=" + varName);
//            } catch (Exception ex) {
//                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
    private static Element saveBlok(String blokName, Blok b, Document doc) {
        Element blok = doc.createElement("blok");
        Attr attr = doc.createAttribute("name");
        attr.setValue(blokName);
        SuperVariabel[] vars = (SuperVariabel[]) b.getAllVariabels().values().toArray();
        String[] varNames = (String[]) b.getAllVariabels().keySet().toArray();
        for (int i = 0; i < vars.length; i++) {
            if (vars[i] instanceof Loop) {
                blok.appendChild(saveLoop(varNames[i], (Loop) vars[i], doc));
            } else {
                blok.appendChild(saveVariabel(varNames[i], (Variabel) vars[i], doc));
            }
        }
        return blok;
    }

    private static Element saveLoop(String loopName, Loop l, Document doc) {
        Element loop = doc.createElement("loop");
        Attr attr = doc.createAttribute("name");
        attr.setValue(loopName);
        String[] varNames = (String[]) l.getAllVariabels().keySet().toArray();
        for (int i = 0; i < varNames.length; i++) {
            Variabel[] var = l.getVar(varNames[i]);
            loop.appendChild(saveVariabels(varNames[i], var, doc));
        }
        return loop;
    }

    private static Element saveVariabels(String varName, Variabel[] v, Document doc) {
        Element var = doc.createElement("variabel");
        Attr attr = doc.createAttribute("name");
        attr.setValue(varName);
        for (Variabel va : v) {
            var.appendChild(createValue(va.getValue(), doc));
        }
        return var;
    }

    private static Element saveVariabel(String varName, Variabel v, Document doc) {
        Element var = doc.createElement("variabel");
        Attr attr = doc.createAttribute("name");
        attr.setValue(varName);
        var.appendChild(createValue(v.getValue(), doc));
        return var;
    }

    private static Element createValue(String value, Document doc) {
        Element val = doc.createElement("value");
        val.appendChild(doc.createTextNode(value));
        return val;
    }

    public static void saveAll() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.newDocument();
            Element root = doc.createElement("kuesioner");
            doc.appendChild(root);
            Blok[] bloks = (Blok[]) Controller.getAllBloks().values().toArray();
            String[] blokNames = (String[]) Controller.getAllBloks().keySet().toArray();
            for (int i = 0; i < bloks.length; i++) {
                root.appendChild(saveBlok(blokNames[i], bloks[i], doc));
            }
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource src = new DOMSource(doc);
            String nks = Controller.getNks();
            StreamResult res = new StreamResult(new File("C:\\Users\\" + Config.userName + "\\Documents\\data_entri55\\" + nks + ".xml"));
            t.transform(src, res);
        } catch (Exception e) {
        }
    }
    public void read(String fileName,Panel p){
        
    }
    private void readBlok(){
        
    }
    
    public static void saveDS() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.newDocument();
            Element root = doc.createElement("kuesioner");
            doc.appendChild(root);
            Blok[] bloks = (Blok[]) Controller.getAllBloks().values().toArray();
            String[] blokNames = (String[]) Controller.getAllBloks().keySet().toArray();
            for (int i = 0; i < bloks.length; i++) {
                if (bloks[i].isDs()) {
                    root.appendChild(saveBlok(blokNames[i], bloks[i], doc));
                }
            }
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource src = new DOMSource(doc);
            String nks = Controller.getNks();
            StreamResult res = new StreamResult(new File("C:\\Users\\" + Config.userName + "\\Documents\\data_entri55\\ds_" + nks + ".xml"));
            t.transform(src, res);
        } catch (Exception e) {
        }
    }

    public static void deleteIsian(String fileName) {
        try {
            File file = new File("C:\\Users\\" + Config.userName + "\\Documents\\data_entri55\\" + fileName + ".xml");
            if (file.delete()) {
                System.out.println(file.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void send(String tableName, String qis) {
        try {
            QueryString qs = new QueryString("table_name", tableName);
            qs.add("value", qis);
            HttpRequest.sendPost(Config.url, qs.toString());
        } catch (Exception ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void sendPerBlok(String blokName, Blok b) {
        try {
            JSONArray ary = new JSONArray();
            ary.put(Controller.getNks());
            SuperVariabel sv[] = (SuperVariabel[]) b.getAllVariabels().values().toArray();
            String[] key = (String[]) b.getAllVariabels().keySet().toArray();
            for (int i = 0; i < sv.length; i++) {
                if (sv[i] instanceof Variabel) {
                    ary.put(((Variabel) sv[i]).getValue());
                } else {
                    sendPerLoop(key[i], ((Loop) sv[i]));
                }
            }
            send(blokName, ary.toString());
        } catch (Exception ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void sendPerLoop(String loopName, Loop p) {
        try {
            ArrayList<Variabel>[] var = (ArrayList<Variabel>[]) p.getAllVariabels().values().toArray();
            for (int i = 0; i < var[0].size(); i++) {
                JSONArray ary = new JSONArray();
                for (int j = 0; j < var.length; j++) {
                    ary.put(var[j].get(i));
                }
                send(loopName, ary.toString());
            }
        } catch (Exception ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

class QueryString {

    private String query = "";

    public QueryString(String name, String value) {
        encode(name, value);
    }

    public void add(String name, String value) {
        query += "&";
        encode(name, value);
    }

    private void encode(String name, String value) {
        try {
            query += URLEncoder.encode(name, "UTF-8");
            query += "=";
            query += URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException("Broken VM does not support UTF-8");
        }
    }

    public String getQuery() {
        return query;
    }

    public String toString() {
        return getQuery();
    }

}
