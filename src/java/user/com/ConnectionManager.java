/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager{


public static ConnectionManager instance = null;
        
    private final String USERNAME = "root";
    private final String PASSWORD = "manali@123";
    private final String CONN_STRING = "jdbc:mysql://localhost:3306/user_data";
    
    private Connection conn = null;
    
    private ConnectionManager(){
        
    }
    public static ConnectionManager getInstance(){
        if(instance==null){
            instance = new ConnectionManager();
        }
        return instance;
    }
    private boolean openConnection(){
        try{
                conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
               }catch(SQLException e){
                   e.printStackTrace();
        }
        return true;
    }
public Connection getConnection(){
    if(conn==null){
        if(openConnection()){
         System.out.println("Connection Opened");
        return conn;
        }else{
            return null;
        }
    }
    return conn;
}
    public void close(){
        System.out.println("Closing Connection");
        try{
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        conn=null;
    }
    }
