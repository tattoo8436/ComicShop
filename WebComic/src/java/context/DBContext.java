
package context;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBContext {
    
    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
     public Connection getConnection()throws Exception {
         try{
            String url = "jdbc:mysql://localhost:3306/comic?useSSL=false";
            Class.forName("com.mysql.jdbc.Driver");
            String user = "root";
            String password = "12345";
            return DriverManager.getConnection(url, user, password);
         } catch(ClassNotFoundException e){
             System.out.println(e);
         } catch(SQLException e){
             System.out.println(e);
         }
         return null;
    }  
 
    public static void main(String[] args) {
        try{
            System.out.println(new DBContext().getConnection());
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
 