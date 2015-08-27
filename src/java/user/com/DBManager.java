/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBManager {
    private static Connection conn = ConnectionManager.getInstance().getConnection();
    
    public static void Insert (getsetdata set)throws ClassNotFoundException, SQLException{
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        
        String sql = "INSERT INTO user(first_name,last_name,user_name,email,password)VALUES(DEFAULT,NULL,NULL,NULL,NULL)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,set.getFirst_name());
        pstmt.setString(2,set.getLast_name());
        pstmt.setString(3,set.getUser_name());
        pstmt.setString(4,set.getEmail());
        pstmt.setString(5,set.getPassword());
        pstmt.executeUpdate();
        ConnectionManager.getInstance().close();
        
    }
    
}
