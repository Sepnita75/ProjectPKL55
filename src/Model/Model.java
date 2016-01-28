/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Blok;
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
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Model {

    public static String activeId;
    private static String name;
    private static String nim;
    private static String kodeKoorTim;
    private static String kode_tim;

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
        blok.setAttributeNode(attr);
        Collection<SuperVariabel> cl = b.getAllVariabels().values();
        SuperVariabel[] vars = cl.toArray(new SuperVariabel[cl.size()]);
        Set<String> st = b.getAllVariabels().keySet();
        String[] varNames = st.toArray(new String[st.size()]);
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
        loop.setAttributeNode(attr);
        Set<String> k = l.getAllVariabels().keySet();
        String[] varNames = k.toArray(new String[k.size()]);
        for (String varName : varNames) {
            String[] var = l.getVarArray(varName);
            loop.appendChild(saveVariabel(varName, var, doc));
        }
        return loop;
    }

    private static Element saveVariabel(String varName, String[] v, Document doc) {
        Element var = doc.createElement("variabel");
        Attr attr = doc.createAttribute("name");
        attr.setValue(varName);
        var.setAttributeNode(attr);
        for (String va : v) {
            var.appendChild(createValue(va, doc));
        }
        return var;
    }

    private static Element saveVariabel(String varName, Variabel v, Document doc) {
        Element var = doc.createElement("variabel");
        Attr attr = doc.createAttribute("name");
        attr.setValue(varName);
        var.setAttributeNode(attr);
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
            Attr attr = doc.createAttribute("nks");
            attr.setValue(Controller.getNks());
            root.setAttributeNode(attr);
            Attr attr1 = doc.createAttribute("nama");
            attr1.setValue(name);
            root.setAttributeNode(attr1);
            Attr attr2 = doc.createAttribute("nim");
            attr2.setValue(nim);
            root.setAttributeNode(attr2);
            Attr attr3 = doc.createAttribute("kode_kortim");
            attr3.setValue(kodeKoorTim);
            root.setAttributeNode(attr3);
            Attr attr4 = doc.createAttribute("kode_tim");
            attr4.setValue(kode_tim);
            root.setAttributeNode(attr4);
            doc.appendChild(root);
            Collection<Blok> b = Controller.getAllBloks().values();
            Blok[] bloks = b.toArray(new Blok[b.size()]);
            Set<String> s = Controller.getAllBloks().keySet();
            String[] blokNames = s.toArray(new String[s.size()]);
            for (int i = 0; i < bloks.length; i++) {
                root.appendChild(saveBlok(blokNames[i], bloks[i], doc));
            }
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource src = new DOMSource(doc);
            String nks = Controller.getNks();
            StreamResult res = new StreamResult(new File("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\data_entri55\\" + nks + ".xml"));
            t.transform(src, res);
        } catch (ParserConfigurationException | DOMException | TransformerException e) {
        }
    }

    public void edit(String nks) {
        try {
            File fXmlFile = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\data_entri55\\" + nks + ".xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            
        } catch (Exception e) {
        }
    }

    private void readPerBlok() {

    }

    private static void send(String tableName, String qis) {
        try {
            QueryString qs = new QueryString("table_name", tableName);
            qs.add("value", qis);
            HttpRequest.sendPost(Config.url, qs.toString());
        } catch (Exception ex) {
        }

    }

    private static void sendPerBlok(String blokName, Blok b) {
        try {
            JSONArray ary = new JSONArray();
            ary.put(Controller.getNks());
            Collection<SuperVariabel> sp = b.getAllVariabels().values();
            SuperVariabel sv[] = sp.toArray(new SuperVariabel[sp.size()]);
            Set<String> ks = b.getAllVariabels().keySet();
            String[] key = ks.toArray(new String[ks.size()]);
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
            Collection<ArrayList<String>> av = p.getAllVariabels().values();
            ArrayList<String>[] var = av.toArray(new ArrayList[av.size()]);
            for (int i = 0; i < var[0].size(); i++) {
                JSONArray ary = new JSONArray();
                for (ArrayList<String> var1 : var) {
                    ary.put(var1.get(i));
                }
                send(loopName, ary.toString());
            }
        } catch (Exception ex) {
        }
    }

    public static void sendAll() {
        Collection<Blok> b = Controller.getAllBloks().values();
        Blok[] bloks = b.toArray(new Blok[b.size()]);
        Set<String> s = Controller.getAllBloks().keySet();
        String[] blokNames = s.toArray(new String[s.size()]);
        for (int i = 0; i < bloks.length; i++) {
            sendPerBlok(blokNames[i], bloks[i]);
        }
    }

    public static boolean login(String username, String password) {
        boolean isLogin = false;
        try {
            QueryString qs = new QueryString("username", username);
            qs.add("password", password);
            System.out.println(Config.url);
            String respon = HttpRequest.sendPost(Config.url, qs.toString());
            if (respon != null) {
                JSONObject jObject = new JSONObject(respon);
                if (jObject.getInt("UserstatusLogin") == 0) {
                    isLogin = false;
                } else {
                    isLogin = true;
                    name = jObject.getString("Usernama");
                    nim = jObject.getString("Usernim");
                    kodeKoorTim = jObject.getString("Userkodekortim");
                    kode_tim = jObject.getString("Userusername");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isLogin;
    }

    public static String getName() {
        return name;
    }

    public static String getNim() {
        return nim;
    }

    public static String getKodeKoorTim() {
        return kodeKoorTim;
    }

    public static String getKodeTim() {
        return kode_tim;
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

    @Override
    public String toString() {
        return getQuery();
    }

}
