package toko_fashion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection connection;
    public static Connection DBConnection(){
        String dbUrl = "jdbc:mysql://localhost:3306/fashion";
        String user = "root";
        String password = "";
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = (Connection) DriverManager.getConnection(dbUrl, user, password);
        } catch(Exception e){
            System.out.println(e);
            
        }
            return connection;
    }     
}
