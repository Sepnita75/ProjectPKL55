package pkl55.data.model;

import pkl55.data.view.View;
import pkl55.data.view.TabelLoop;
import pkl55.data.controller.Blok;
import pkl55.data.controller.Variabel;
import pkl55.data.controller.Controller;
import pkl55.data.controller.Loop;
import pkl55.data.controller.SuperVariabel;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.Timer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
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
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import pkl55.main.MainFrame;

public class Model {

    public static String activeId;
    private static String name;
    public static boolean isSE;
    public static boolean isPapi;
    private static String username;
    private static String nim;
    private static String kodeKoorTim;
    private static String kode_tim;
    private static boolean valid;

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
        Attr nart = doc.createAttribute("nart");
        nart.setValue(l.getNArt());
        loop.setAttributeNode(nart);
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

        Attr attr1 = doc.createAttribute("hide");
        if (v.isHidden()) {
            attr1.setValue("yes");
        } else {
            attr1.setValue("no");
        }
        var.setAttributeNode(attr1);

        var.appendChild(createValue(v.getValue(), doc));
        return var;
    }

    private static Element createValue(String value, Document doc) {
        Element val = doc.createElement("value");
        val.appendChild(doc.createTextNode(value));
        return val;
    }

    public static boolean checkAll() {
        boolean res = true;
        Collection<Blok> b = Controller.getAllBloks().values();
        Blok[] bloks = b.toArray(new Blok[b.size()]);
        for (Blok blok : bloks) {
            res &= checkBlok(blok);
        }
        return res;
    }

    private static boolean checkBlok(Blok b) {
        boolean res = true;
        Collection<SuperVariabel> cl = b.getAllVariabels().values();
        SuperVariabel[] vars = cl.toArray(new SuperVariabel[cl.size()]);
        for (SuperVariabel var : vars) {
            if (var instanceof Loop) {
                res &= checkLoop((Loop) var);
            } else {
                res &= checkVar((Variabel) var);
            }
        }
        return res;
    }

    private static boolean checkLoop(Loop l) {
        boolean res = true;
        Set<String> k = l.getAllVariabels().keySet();
        String[] varNames = k.toArray(new String[k.size()]);
        for (String varName : varNames) {
            res &= checkVars(l.getVariabel(varName), l.getVariabelValue(varName));
        }
        return res;
    }

    private static boolean checkVars(Variabel v, ArrayList<String> values) {
        boolean res = true;
        for (String value : values) {
            v.setValue(value);
            res &= v.isValid();
        }
        return res;
    }

    private static boolean checkVar(Variabel v) {
        v.setValue(v.getValue());
        return v.isValid();
    }

    public static void saveAll() {
        boolean status = checkAll();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.newDocument();
            Element root = doc.createElement("kuesioner");
            Attr attr0 = doc.createAttribute("timestamps");
            attr0.setValue("" + (System.currentTimeMillis() / 1000));
            root.setAttributeNode(attr0);
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
            Attr attr5 = doc.createAttribute("status");
            if (status) {
                attr5.setValue("clear");
            } else {
                attr5.setValue("unclear");
            }
            root.setAttributeNode(attr5);
            doc.appendChild(root);
            Collection<Blok> b = Controller.getAllBloks().values();
            Blok[] bloks = b.toArray(new Blok[b.size()]);
            Set<String> s = Controller.getAllBloks().keySet();
            String[] blokNames = s.toArray(new String[s.size()]);
            for (int i = 0; i < bloks.length; i++) {
                root.appendChild(saveBlok(blokNames[i], bloks[i], doc));
            }

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);
//            String xmlString = result.getWriter().toString();
//            System.out.println("Start:\n" + xmlString);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource src = new DOMSource(doc);
            String nks = Controller.getNks();

            StreamResult res;
            if (Controller.isDS()) {
                res = new StreamResult(new File("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Data Entri 55\\DS_" + nks + ".xml"));
            } else {
                res = new StreamResult(new File("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Data Entri 55\\" + nks + ".xml"));
            }
            t.transform(src, res);
            System.out.println("Save");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (DOMException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public static void createDir() {
        File dir = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Data Entri 55");
        if (!dir.exists()) {
            dir.mkdir();
        }
    }

//    private static void Edit(String nks) {
//        try {
//            File fXmlFile = new File("/Users/mkyong/staff.xml");
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//            Document doc = dBuilder.parse(fXmlFile);
//            
//            doc.getDocumentElement().normalize();
//            
//            
//            
////            Collection<Blok> b = Controller.getAllBloks().values();
////            Blok[] bloks = b.toArray(new Blok[b.size()]);
//            for (Blok blok : bloks) {
//                editBlok(blok);
//            }
//        } catch (ParserConfigurationException | SAXException | IOException ex) {
//            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    private static boolean editBlok(Blok b) {
//        boolean res = true;
//        Collection<SuperVariabel> cl = b.getAllVariabels().values();
//        SuperVariabel[] vars = cl.toArray(new SuperVariabel[cl.size()]);
//        for (SuperVariabel var : vars) {
//            if (var instanceof Loop) {
//                res &= checkLoop((Loop) var);
//            } else {
//                res &= checkVar((Variabel) var);
//            }
//        }
//        return res;
//    }
////
////    private static boolean checkLoop(Loop l) {
////        boolean res = true;
////        Set<String> k = l.getAllVariabels().keySet();
////        String[] varNames = k.toArray(new String[k.size()]);
////        for (String varName : varNames) {
////            res &= checkVars(l.getVariabel(varName), l.getVariabelValue(varName));
////        }
////        return res;
////    }
////
////    private static boolean checkVars(Variabel v, ArrayList<String> values) {
////        boolean res = true;
////        for (String value : values) {
////            v.setValue(value);
////            res &= v.isValid();
////        }
////        return res;
////    }
////
////    private static boolean checkVar(Variabel v) {
////        v.setValue(v.getValue());
////        return v.isValid();
////    }
////    
//    private void readPerBlok(Blok b) {
//        
//    }
//
////    private static void send(String tableName, String qis) {
////        try {
////            QueryString qs = new QueryString("table_name", tableName);
////            qs.add("value", qis);
//            HttpRequest.sendPost(Config.url, qs.toString());
//        } catch (Exception ex) {
//        }
//
//    }
//
//    private static void sendPerBlok(String blokName, Blok b) {
//        try {
//            JSONArray ary = new JSONArray();
//            ary.put(Controller.getNks());
//            Collection<SuperVariabel> sp = b.getAllVariabels().values();
//            SuperVariabel sv[] = sp.toArray(new SuperVariabel[sp.size()]);
//            Set<String> ks = b.getAllVariabels().keySet();
//            String[] key = ks.toArray(new String[ks.size()]);
//            for (int i = 0; i < sv.length; i++) {
//                JSONObject fl = new JSONObject();
//                if (sv[i] instanceof Variabel) {
//                    ary.put(fl.put(key[i], ((Variabel) sv[i]).getValue()));
//                } else {
//                    sendPerLoop(key[i], ((Loop) sv[i]));
//                }
//            }
//            send(blokName, ary.toString());
//        } catch (Exception ex) {
//            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    private static void sendPerLoop(String loopName, Loop p) {
//        try {
//            Collection<ArrayList<String>> av = p.getAllVariabels().values();
//            ArrayList<String>[] var = av.toArray(new ArrayList[av.size()]);
//            Set<String> key = p.getAllVariabels().keySet();
//            String[] keys = key.toArray(new String[key.size()]);
//            for (int i = 0; i < var[0].size(); i++) {
//                JSONArray ary = new JSONArray();
//                for (ArrayList<String> var1 : var) {
//                    JSONObject fl = new JSONObject();
//                    ary.put(fl.put(keys[i], var1.get(i)));
//                }
//                send(loopName, ary.toString());
//            }
//        } catch (Exception ex) {
//        }
//    }
//
//    public static void sendAll() {
//        Collection<Blok> b = Controller.getAllBloks().values();
//        Blok[] bloks = b.toArray(new Blok[b.size()]);
//        Set<String> s = Controller.getAllBloks().keySet();
//        String[] blokNames = s.toArray(new String[s.size()]);
//        for (int i = 0; i < bloks.length; i++) {
//            sendPerBlok(blokNames[i], bloks[i]);
//        }
//    }
    public static boolean login(String username, String password) {
        Model.username = username;
        boolean isLogin = false;
        try {
            QueryString qs = new QueryString("password", password);
            qs.add("username", username);
            String url = Config.url1 + "?type=login";
            String respon = HttpRequest.sendPost(url, qs.toString());
            if (respon != null) {
                JSONObject jObject = new JSONObject(respon);
                if (jObject.getInt("statusLogin") == 0) {
                    isLogin = false;
                } else {
                    isLogin = true;
                    name = jObject.getString("nama");
                    nim = jObject.getString("nim");
                    kodeKoorTim = jObject.getString("kodekortim");
                    kode_tim = jObject.getString("username");
                    isSE = jObject.getString("bidang").equals("SE");
                    isPapi = jObject.getString("tool").equals("PAPI");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isLogin;
    }

    public static boolean logout() {
        boolean isLogout = false;
        try {
            QueryString qs = new QueryString("username", username);
            String url = Config.url1 + "?type=logout";
            String respon = HttpRequest.sendPost(url, qs.toString());
            if (respon != null) {
                isLogout = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isLogout;
    }

    public static void startSync() {
        try {
            Timer time = new Timer();
            UploaderSync st = new UploaderSync();
            time.schedule(st, 0, 120000);
        } catch (Exception ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String checkServer() {
        String res = "";
        QueryString qs;
        qs = new QueryString("nim", "13.7454");
        try {
            String respon = HttpRequest.sendPost(Config.url1 + "?type=check", qs.toString());
            if (respon != null) {
                res = respon;
            }
        } catch (Exception ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\n\n\n" + res);
        return res;
    }

    private static String[] checkLocal() throws Exception {
        File folder = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Data Entri 55");
        File[] listOfFiles = folder.listFiles();
        String fs = checkServer();
        JSONArray raw = new JSONArray(fs);
        Vector<String> data = new Vector();
        boolean emptyServer = raw.length() == 0;
        for (File listOfFile : listOfFiles) {
            String name = listOfFile.getName();
            if (listOfFile.isFile() && name.substring(name.lastIndexOf(".") + 1).equals("xml")) {
                Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(listOfFile);
                doc.getDocumentElement().normalize();
                Element el = (Element) doc.getElementsByTagName("kuesioner").item(0);
                if (!emptyServer) {
                    for (int j = 0; j < raw.length(); j++) {
                        JSONObject ob = raw.getJSONObject(j);
                        if (ob.getString("nks").equals(el.getAttribute("nks"))) {
                            if (Long.parseLong(ob.getString("timestamps")) < Long.parseLong(el.getAttribute("timestamps"))) {
                                data.add(el.getAttribute("nks"));
                                break;
                            }
                        } else if (j == raw.length() - 1) {
                            data.add(el.getAttribute("nks"));
                        }

                    }
                } else {
                    data.add(el.getAttribute("nks"));
                }
            }
        }
        return data.toArray(new String[data.size()]);
    }

    private static void send(String tableName, String qis, String nks) {
        try {
            QueryString qs = new QueryString("namablok", tableName);
            qs.add("value", qis);
            qs.add("nks", nks);
            String url = Config.url1 + "?type=simpanBlokKues";
            String respon = HttpRequest.sendPost(url, qs.toString());
            System.out.println("RES this : " + respon);
        } catch (Exception ex) {
        }

    }

    public static void sendAll() throws Exception {
        System.out.println("Start Sync");
        String[] update = checkLocal();
        if (update.length != 0) {
            for (String file : update) {
                File xml = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Data Entri 55\\" + file + ".xml");
                Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xml);
                doc.getDocumentElement().normalize();
                Node all_node = doc.getElementsByTagName("kuesioner").item(0);
                NodeList list_blok = all_node.getChildNodes();
                for (int i = 0; i < list_blok.getLength(); i++) {
                    Node blok = list_blok.item(i);
                    sendPerBlok(blok, ((Element) all_node).getAttribute("nks"));
                }
            }
        }
    }

    private static void sendPerBlok(Node blok, String nk) throws Exception {
        JSONArray json = new JSONArray();
        NodeList vars = blok.getChildNodes();
        for (int i = 0; i < vars.getLength(); i++) {
            Node var = vars.item(i);
//            System.out.println(((Element) var).getAttribute("name")+" : "+((Element) var.getFirstChild()).getTextContent());
            if (((Element) var).getTagName().equals("loop")) {
                sendPerLoop(var, nk);
            } else {
                JSONObject item = new JSONObject();
                item.put(((Element) var).getAttribute("name"), ((Element) var.getFirstChild()).getTextContent());
                json.put(item);
            }
        }
        send(((Element) blok).getAttribute("name"), json.toString(), nk);
    }

    private static void sendPerLoop(Node loop, String nk) throws Exception {
        NodeList vars = loop.getChildNodes();
        for (int i = 0; i < vars.item(0).getChildNodes().getLength(); i++) {
            JSONArray json = new JSONArray();
            JSONObject item = new JSONObject();
            item.put("nart", (((Element) loop).getAttribute("nart")));
            for (int j = 0; j < vars.getLength(); j++) {
                Node var = vars.item(j);
                item = new JSONObject();
                item.put(((Element) var).getAttribute("name"), ((Element) var.getChildNodes().item(i)).getTextContent());
                json.put(item);
            }
            send(((Element) loop).getAttribute("name"), json.toString(), nk);
        }
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

    public static String[][] getTable(boolean isDS/*, String... cols*/) throws ParserConfigurationException, SAXException, IOException {
        File folder = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Data Entri 55");
        File[] listOfFiles = folder.listFiles();

        Vector<Vector<String>> data = new Vector();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                if (isDS) {
                    if (listOfFiles[i].getName().substring(0, 2).equals("DS")) {
                        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(listOfFiles[i]);
                        doc.getDocumentElement().normalize();
                        Vector<String> row = new Vector();
                        row.addElement((i + 1) + "");
                        row.addElement(((Element) doc.getElementsByTagName("kuesioner").item(0)).getAttribute("nks"));
                        row.addElement(((Element) doc.getElementsByTagName("kuesioner").item(0)).getAttribute("status"));
//                for (String col : cols) {
//                    Node row_node = doc.getElementsByTagName(col).item(0);
//                    if (row_node.getNodeType() == Node.ELEMENT_NODE) {
//                        Element row_elem = (Element) row_node;
//                        row.addElement(row_elem.getElementsByTagName("value").item(0).getTextContent());
//                    }
//                }
                        data.addElement(row);
                    }
                } else {
                    if (!listOfFiles[i].getName().substring(0, 2).equals("DS")) {
                        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(listOfFiles[i]);
                        doc.getDocumentElement().normalize();
                        Vector<String> row = new Vector();
                        row.addElement((i + 1) + "");
                        row.addElement(((Element) doc.getElementsByTagName("kuesioner").item(0)).getAttribute("nks"));
                        row.addElement(((Element) doc.getElementsByTagName("kuesioner").item(0)).getAttribute("status"));
//                for (String col : cols) {
//                    Node row_node = doc.getElementsByTagName(col).item(0);
//                    if (row_node.getNodeType() == Node.ELEMENT_NODE) {
//                        Element row_elem = (Element) row_node;
//                        row.addElement(row_elem.getElementsByTagName("value").item(0).getTextContent());
//                    }
//                }
                        data.addElement(row);
                    }
                }

            }
        }
        String[][] result = new String[data.size()][data.get(0).size()];
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(0).size(); j++) {
                result[i][j] = data.get(i).get(j);
            }
        }
        return result;
    }

    public static void edit(String nks) throws Exception {//belom dimasukin looping textfield
        File fXmlFile = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\Data Entri 55\\" + nks + ".xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        NodeList row_node = doc.getElementsByTagName("variabel");
        for (int i = 0; i < row_node.getLength(); i++) {
            Node nNode = row_node.item(i);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element var = (Element) nNode;
                if (((Element) var.getParentNode()).getTagName().equals("loop")) {
                    
                } else {
                    View.get(var.getAttribute("name")).setText(var.getFirstChild().getTextContent());
                }
            }
        }
        NodeList loops = doc.getElementsByTagName("loop");
        for (int i = 0; i < loops.getLength(); i++) {
            Node xNode = loops.item(i);
            if (xNode.getNodeType() == Node.ELEMENT_NODE) {
                Element loop = (Element) xNode;
                String loopName = loop.getAttribute("name");
                TabelLoop tl = View.getTabelLoop(loopName);
                NodeList vars = loop.getElementsByTagName("variabel");
                for (int k = 0; k < vars.item(0).getChildNodes().getLength(); k++) {
                    String row[] = new String[vars.getLength()];
                    for (int j = 0; j < vars.getLength(); j++) {
                        Node cellNode = vars.item(i);
                        if (cellNode.getNodeType() == Node.ELEMENT_NODE) {
                            Element cell = (Element) cellNode;
                            String key = cell.getAttribute("name");
                            int pos = View.get(key).getPosition() - tl.getStart();
                            row[pos] = cell.getChildNodes().item(i).getTextContent();
                        }
                    }
                    tl.insert(row);
                }
            }
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

    @Override
    public String toString() {
        return getQuery();
    }

}
