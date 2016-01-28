package Model;

import java.sql.*;
import java.util.ArrayList;

public class Database {

    private static void execute(String sql) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("Opened database successfully");
            stmt = c.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Execution successfully");
    }

    public static ArrayList select(String sql) {
        ArrayList result = new ArrayList();
        Connection c = null;
        Statement stmt = null;
        try { 
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            int numcols = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                ArrayList row = new ArrayList(numcols);
                for (int i = 1; i <= numcols; i++) {
                    row.add(rs.getString(i));
                }
                result.add(row);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Query done successfully");
        return result;
    }
    
    public static void insert(String table,String... value){
        String sqlInsert="INSERT INTO "+table+" VALUES (";
        for(int i=0;i<value.length;i++){
            sqlInsert+=value[i];
            if(!(i==value.length-1)){
                sqlInsert+=",";
            }
        }
        sqlInsert+=");";
        execute(sqlInsert);
    }
    public static void update(String table,String[] col,String[] val,String where) throws Exception{
        String sqlUpdate="UPDATE "+table+" SET ";
        if(col.length!=val.length) throw new Exception("Length Kolom dan Value Tidak Sama");
        for(int i=0;i<val.length;i++){
            sqlUpdate+=" "+col[i]+"="+val[i];
            if(!(i==val.length-1)){
                sqlUpdate+=",";
            }
        }
        sqlUpdate+=" WHERE "+where+";";
        execute(sqlUpdate);
    }
    public static void delete(String table,String where){
        String sqlUpdate="DELETE FROM "+table;
        sqlUpdate+=" WHERE "+where+";";
        execute(sqlUpdate);
    }
    
    public static void createTable(String sql){
        execute(sql);
    }
}
