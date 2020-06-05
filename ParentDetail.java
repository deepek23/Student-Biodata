/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author deepe
 */
@WebServlet(urlPatterns = {"/ParentDetail"})
public class ParentDetail extends HttpServlet {

    
   
        
           
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
       // String roll = request.getParameter("roll");
        String fname = request.getParameter("fname");
        String mname = request.getParameter("mname");
        String mphone = request.getParameter("mphone");
        String tel = request.getParameter("tel");
        String add1 = request.getParameter("add1");
        String add2 = request.getParameter("add2");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String pin = request.getParameter("pin");
        
        
        try {

            //loading drivers for mysql
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/College","root","root");
            Statement stmt = con.createStatement();
      
      String sql = "INSERT INTO parent (father,mother,mobile,telephone,add1,add2,city,state,country,pin)" +
                   "VALUES (fname,mname,mphone,tel,add1,city,state,country,pin)";
      stmt.executeUpdate(sql);
            
        }
        catch(Exception e) {
            out.println(e);
            out.println("Some error try again!");
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
