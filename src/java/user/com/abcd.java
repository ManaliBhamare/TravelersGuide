/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author Manali Bhamare
 */

@WebServlet(name = "abcd", urlPatterns = {"/abcd"})
public class abcd extends HttpServlet {
     private String first_name;
    private String last_name;
    private String user_name;
    private String email;
    private String password;
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstname = request.getParameter(first_name);
        String lastname = request.getParameter(last_name);
        String username = request.getParameter(user_name);
        String Email = request.getParameter(email);
        String Password = request.getParameter(password);
        
        getsetdata sets = new getsetdata();
        sets.setFirst_name(first_name);
        sets.setLast_name(last_name);
        sets.setUser_name(user_name);
        sets.setEmail(email);
        sets.setPassword(password);
        
       
         try {
             DBManager.Insert(sets);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(abcd.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(abcd.class.getName()).log(Level.SEVERE, null, ex);
         }
      
    }
}
    
   


