package pkl55.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConfigManager {
    
    private DBConfigModel jCfg;
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;

    public DBConfigModel readConfig() {
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("DBconfig.pkl55"));
            try {
                jCfg =((DBConfigModel) objectInputStream.readObject());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBConfigModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(DBConfigModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jCfg;
    }

    public void saveConfig(DBConfigModel j) {
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("DBconfig.pkl55"));
            objectOutputStream.writeObject(j);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(DBConfigModel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(DBConfigModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
