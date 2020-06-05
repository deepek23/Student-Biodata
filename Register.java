
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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author deepe
 */
public class Register extends HttpServlet {

            
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String firstname=request.getParameter("fname");
        String surname=request.getParameter("lname");
        String father=request.getParameter("father");
        int roll=Integer.parseInt(request.getParameter("roll"));
        String mobile=request.getParameter("mobile");
        String course=request.getParameter("course");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String day=request.getParameter("day");
        String month=request.getParameter("month");
        String year=request.getParameter("year");
        String gender=request.getParameter("gender");
        try{  
Class.forName("org.apache.derby.jdbc.ClientDriver");  
Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/cit","root","root");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into register values(?,?,?,?,?,?,?,?,?,?,?,?)");  
  
ps.setString(1,firstname);  
ps.setString(2,surname);  
ps.setString(3,father);  
ps.setInt(4,roll);
ps.setString(5,mobile);
ps.setString(6,course);
ps.setString(7,username);
ps.setString(8,password);
ps.setString(9,day);
ps.setString(10,month);
ps.setString(11,year);
ps.setString(12,gender);
          
int i=ps.executeUpdate();  
if(i>0)  
out.println("You are successfully registered...");
RequestDispatcher rs = request.getRequestDispatcher("studentbiodata.html");
            rs.forward(request, response);
out.println("You are successfully registered...");
      
          
}catch (Exception e2) {out.println(e2);}  
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
