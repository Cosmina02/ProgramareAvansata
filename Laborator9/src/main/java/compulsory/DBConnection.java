package compulsory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbconnection;
    private Connection conn;
    private DBConnection(String path){
        try{
            String url="jdbc:sqlite:"+path;
            conn= DriverManager.getConnection(url);
            System.out.println("Connected to SQLite!");
        }catch(SQLException ex1) {
            System.out.println(ex1.getMessage());
        }
    }

    public static DBConnection getInstance(String path){
        if(dbconnection==null){
            dbconnection=new DBConnection(path);
        }
        return dbconnection;
    }

    public Connection getConn() {
        return conn;
    }
}
