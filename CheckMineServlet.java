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
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author deepe
 */
public class CheckMineServlet extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        PrintWriter out = response.getWriter();
       String n = request.getParameter("username");
       //int m = Integer.parseInt(request.getParameter("roll"));
       
        
       
      
        try { 
  
            response.setContentType("text/html");
            
            
            
            out.print("<form action=\"studentbiodata.html\" method=\"post\">\n" +
"<div class=\"topnav\">\n" +
"  <div class=\"login-container\">\n" +
"  <a class=\"active\" href=\"index.html\">Home</a>\n" +
"  <a href=\"http://www.cit.edu.in/about-us/\">About</a>\n" +
"  <a href=\"http://www.cit.edu.in/contact-us/\">Contact</a>\n" +
"      <button type=\"submit\">Logout</button>\n" +
"    </form>\n" +
"  </div>\n" +
"</div>\n" +
"\n");
            
            
            
            
           
            //PrintWriter out = response.getWriter(); 
            
            //String n = request.getParameter("username"); 
            out.print("Hello " + n ); 
        }catch(Exception e){
            out.println(e);
        }
        
        try {

          
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/cit","root","root");
            
            
           Statement stmt = con.createStatement();
         String sql,sql2;
         sql = ("select name,father,mother,bloodgroup,aadhar,gender from personal where username='"+n+"'");
         
         ResultSet rs = stmt.executeQuery(sql);
         
         
         while(rs.next()){
            //Retrieve by column name
            String name  = rs.getString("name");
            String father = rs.getString("father");
            String mother = rs.getString("mother");
            String bloodgroup = rs.getString("bloodgroup");
            String aadhar = rs.getString("aadhar");
            String gender = rs.getString("gender");

            //Display values
            out.println("<br><br>");
            out.println("Name: " + name + "<br>");
            out.println("Fathers Name: " + father + "<br>");
            out.println("Mother: " + mother + "<br>");
            out.println("Bloodgroup: " + bloodgroup + "<br>");
            out.println("Aadhar: " + aadhar + "<br>");
            out.println("Gender: " + gender + "<br>");
            out.println("<br><br>");
            
            
         }
         out.println("</body></html>");
         // Clean-up environment
         rs.close();
         stmt.close();
         con.close();
      } catch(Exception se) {
         //Handle errors for JDBC
         se.printStackTrace();
      }   
         
         
         
          out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
"<style>\n" +
"* {box-sizing: border-box;}\n" +
"\n" +
"body {\n" +
"  margin: 0;\n" +
"  font-family: Arial, Helvetica, sans-serif;\n" +
"}\n" +
"\n" +
".topnav {\n" +
"  overflow: hidden;\n" +
"  background-color: #e9e9e9;\n" +
"}\n" +
"\n" +
".topnav a {\n" +
"  float: left;\n" +
"  display: block;\n" +
"  color: black;\n" +
"  text-align: center;\n" +
"  padding: 14px 16px;\n" +
"  text-decoration: none;\n" +
"  font-size: 17px;\n" +
"}\n" +
"\n" +
".topnav a:hover {\n" +
"  background-color: #ddd;\n" +
"  color: black;\n" +
"}\n" +
"\n" +
".topnav a.active {\n" +
"  background-color: #2196F3;\n" +
"  color: white;\n" +
"}\n" +
"\n" +
".topnav .login-container {\n" +
"  float: right;\n" +
"}\n" +
"\n" +
".topnav input[type=text] {\n" +
"  padding: 6px;\n" +
"  margin-top: 8px;\n" +
"  font-size: 17px;\n" +
"  border: none;\n" +
"  width:120px;\n" +
"}\n" +
"\n" +
".topnav .login-container button {\n" +
"  float: right;\n" +
"  padding: 6px 10px;\n" +
"  margin-top: 8px;\n" +
"  margin-right: 16px;\n" +
"  background-color: #555;\n" +
"  color: white;\n" +
"  font-size: 17px;\n" +
"  border: none;\n" +
"  cursor: pointer;\n" +
"}\n" +
"\n" +
".topnav .login-container button:hover {\n" +
"  background-color: green;\n" +
"}\n" +
"\n" +
"@media screen and (max-width: 600px) {\n" +
"  .topnav .login-container {\n" +
"    float: none;\n" +
"  }\n" +
"  .topnav a, .topnav input[type=text], .topnav .login-container button {\n" +
"    float: none;\n" +
"    display: block;\n" +
"    text-align: left;\n" +
"    width: 100%;\n" +
"    margin: 0;\n" +
"    padding: 14px;\n" +
"  }\n" +
"  .topnav input[type=text] {\n" +
"    border: 1px solid #ccc;  \n" +
"  }\n" +
"}\n" +
"</style>\n" +
"</head>\n" +
"<body style=\"background:url(1.gif); background-position: center;background-size: cover;\">\n" +
"    <form action=\"studentbiodata.html\" method=\"post\">\n" +
"\n" +
"<div style=\"padding-left:16px\">\n" +
"  <h2></h2>\n" +
"  <p></p>\n" +
"  <p></p>\n" +
"  <div class=\"banner-head\">\n" +
"    	<h1 style=\"color:#FFC;\"></h1>\n" +
"        <h2 style=\"color:#FFC;\"></h2>\n" +
"        <div class=\"seperator\">\n" +
"        	<img src=\"D:\\College\\College\\src\\java\\cit123.JPG\">\n" +
"        </div>\n" +
"        <h3 style=\"color:#FFC;\"></h3>\n" +
"        <!-- <p>\" Nulla consequat massa quis enim.Donec pede justo, fringilla vel, aliquet nec, vulputate eget \"</p>-->\n" +
"        <div class=\"clearfix\"></div>\n" +
"        <p></p>\n" +
"    </div>\n" +
"    </div>\n" +
"</div>\n" +
"</form>\n" +
"</body>\n" +
"</html>\n" +
"");
         
         

        

        
    }

    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
