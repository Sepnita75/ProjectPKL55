package pkl55.util;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    String url;// = "jdbc:mysql://localhost:3306/db_kues_rev_18";
    String port;
    String username;// = "root";
    String password;// = "";
    String dbName;

    public ConnectDB() {
    }

    public ConnectDB(String url, String port, String dbName, String username, String password) {
        this.url = "jdbc:mysql://"+url+":"+port+"/"+dbName;
        this.username = username;
        this.password = password;
    }
    
    

    public void Connect() {
        //System.out.println("Connecting database...");

        try{
            java.sql.Connection connection = DriverManager.getConnection(url, username, password);
            //System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!");
        }
    }
    
//    public static void main(String[] args) {
//        ConnectDB cd = new ConnectDB();
//        cd.Connect();
//    }

}
