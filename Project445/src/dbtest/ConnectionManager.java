package dbtest;
import java.sql.*;
import java.util.ArrayList;

public class ConnectionManager {
   
    
    private static String url = "jdbc:mysql://localhost:3306/kim_seungku_db";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static Connection connection;
    private static String urlString;
    
    public static Connection getConnection(){       
        try{
            Class.forName(driverName);
            try {
                connection = DriverManager.getConnection(url, "root", "E!W!ahs5013");
                System.out.println("Connection Sucessful");                
            } catch (SQLException ex) {
                System.out.println("Failed to create the database");
                ex.printStackTrace();
            }
        }catch(ClassNotFoundException ex) {
            System.out.println("Driver not found");
        }
        
        return connection;
    }
    
}
