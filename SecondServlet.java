/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author deepe
 */
public class SecondServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
      
        try { 
  
            response.setContentType("text/html"); 
           
            //PrintWriter out = response.getWriter(); 
            
            String n = request.getParameter("username"); 
            //String m = request.getParameter("roll");
           // ServletContext context=getServletContext();  
           // String o =(String)context.getAttribute("m");
            //int newm = Integer.parseInt(m);
          
            out.print("<form action='studentbiodata.html' method='post'>"+"<div class='topnav'>"+"<div class='login-container'>"+"<button type='submit'>Logout</button>"+"</form>"+"</div>"+"</div>");
            
            
            
            
            
            
            
            out.print("Hello " + n );
            out.print("<br>");
            out.print("<body>\n" +
"      <marquee>Edit and Save Your Details</marquee>\n" +
"   </body>");
            /* out.println is used to print on the client web browser */
           
            
            out.println("<link rel='stylesheet' type='text/css' href='biodatas.css' />");
        
       
        out.println("<form action=\"Biodata\" method=\"post\">");
        //out.println("<form action='SecondServlet?username=" + n + "' >);
        
        
        out.println("<body>");
        out.println("<h3>STUDENT BIODATA FORM</h3>");
        out.println("<table align=\"center\" cellpadding = \"5\">");
        
        
        
        
        
        out.println("<tr>\n" +
"<td>NAME</td>\n" +
"<td><input type=\"text\" name=\"name\" maxlength=\"30\"/>\n" +
"</td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>ROLL NUMBER</td>\n" +
"<td><input type=\"text\" name=\"roll\" maxlength=\"30\"/>\n" +
"</td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>FATHER'S NAME</td>\n" +
"<td><input type=\"text\" name=\"father\" maxlength=\"30\"/>\n" +
"</td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td>MOTHER'S NAME</td>\n" +
"<td><input type=\"text\" name=\"mother\" maxlength=\"30\"/>\n" +
"\n" +
"</td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>BLOOD GROUP</td>\n" +
" \n" +
"<td>\n" +
"<select name=\"bloodgroup\" id=\"bloodgroup\">\n" +
"<option value=\"-1\">Select</option>\n" +
"<option value=\"A+\">A+</option>\n" +
"<option value=\"A-\">A-</option>\n" +
"<option value=\"B+\">B+</option>\n" +
" \n" +
"<option value=\"B-\">B-</option>\n" +
"<option value=\"O+\">O+</option>\n" +
"<option value=\"O-\">O-</option>\n" +
"<option value=\"AB+\">AB+</option>\n" +
"<option value=\"AB-\">AB-</option>\n" +
"</select>\n" +
" \n" +
"</td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>EMAIL ID</td>\n" +
"<td><input type=\"text\" name=\"email\" maxlength=\"100\" /></td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>AADHAR NUMBER</td>\n" +
"<td>\n" +
"<input type=\"text\" name=\"aadhar\"/>\n" +
"</td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>GENDER</td>\n" +
"<td>\n" +
"Male <input type=\"radio\" name=\"gender\" value=\"Male\" />\n" +
"Female <input type=\"radio\" name=\"gender\" value=\"Female\" />\n" +
"</td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>ADDRESS <br /><br /><br /></td>\n" +
"<td><textarea name=\"Address\" rows=\"4\" cols=\"30\"></textarea></td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>CITY</td>\n" +
"<td><input type=\"text\" name=\"city\" maxlength=\"30\" />\n" +
"(max 30 characters a-z and A-Z)\n" +
"</td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>PIN CODE</td>\n" +
"<td><input type=\"text\" name=\"pin\" maxlength=\"6\" />\n" +
"(6 digit number)\n" +
"</td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>STATE</td>\n" +
"<td><input type=\"text\" name=\"state\" maxlength=\"30\" />\n" +
"(max 30 characters a-z and A-Z)\n" +
"</td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>COUNTRY</td>\n" +
"<td><input type=\"text\" name=\"country\" /></td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>MOBILE NUMBER</td>\n" +
"<td><input type=\"text\" name=\"mobile\" maxlength=\"30\"/>\n" +
"</td>\n" +
"</tr>");
        
        out.println("<tr>\n" +
"<td>Userame</td>\n" +
"<td><input type=\"text\" name=\"username\" maxlength=\"30\"/>\n" +
"</td>\n" +
"</tr>");
        
        
        
        out.println("<tr>\n" +
"<td>QUALIFICATION <br /><br /><br /><br /><br /><br /><br /></td>\n" +
" \n" +
"<td>\n" +
"<table>\n" +
" \n" +
"<tr>\n" +
"<td align=\"center\"><b>Sl.No.</b></td>\n" +
"<td align=\"center\"><b>Examination</b></td>\n" +
"<td align=\"center\"><b>Board</b></td>\n" +
"<td align=\"center\"><b>Percentage</b></td>\n" +
"<td align=\"center\"><b>Year of Passing</b></td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>1</td>\n" +
"<td>Class X</td>\n" +
"<td><input type=\"text\" name=\"ClassX_Board\" maxlength=\"30\" /></td>\n" +
"<td><input type=\"text\" name=\"ClassX_Percentage\" maxlength=\"30\" /></td>\n" +
"<td><input type=\"text\" name=\"ClassX_YrOfPassing\" maxlength=\"30\" /></td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>2</td>\n" +
"<td>Class XII</td>\n" +
"<td><input type=\"text\" name=\"ClassXII_Board\" maxlength=\"30\" /></td>\n" +
"<td><input type=\"text\" name=\"ClassXII_Percentage\" maxlength=\"30\" /></td>\n" +
"<td><input type=\"text\" name=\"ClassXII_YrOfPassing\" maxlength=\"30\" /></td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>3</td>\n" +
"<td>Graduation</td>\n" +
"<td><input type=\"text\" name=\"Graduation_Board\" maxlength=\"30\" /></td>\n" +
"<td><input type=\"text\" name=\"Graduation_Percentage\" maxlength=\"30\" /></td>\n" +
"<td><input type=\"text\" name=\"Graduation_YrOfPassing\" maxlength=\"30\" /></td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td>4</td>\n" +
"<td>Masters</td>\n" +
"<td><input type=\"text\" name=\"Masters_Board\" maxlength=\"30\" /></td>\n" +
"<td><input type=\"text\" name=\"Masters_Percentage\" maxlength=\"30\" /></td>\n" +
"<td><input type=\"text\" name=\"Masters_YrOfPassing\" maxlength=\"30\" /></td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td></td>\n" +
"<td></td>\n" +
"<td align=\"center\">(10 char max)</td>\n" +
"<td align=\"center\">(upto 2 decimal)</td>\n" +
"</tr>\n" +
"</table>\n" +
" \n" +
"</td>\n" +
"</tr>");
        out.println("<tr>\n" +
"<td colspan=\"2\" align=\"center\">\n" +
"<input type=\"submit\" value=\"Save\">\n" +
"<input type=\"reset\" value=\"Reset\">\n" +
"</td>\n" +
"</tr>");
        out.println("</table>\n" +
" \n" +
"</form>\n" +
" \n" +
"</body>\n" +
"</html>");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
        out.println("");
            out.close(); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
        
       /* out.print("<table width=100% border=1>");  

        
        String roll = request.getParameter("roll");
        String name = request.getParameter("name");
        String father = request.getParameter("father");
        String mother = request.getParameter("mother");
        String bloodgroup = request.getParameter("bloodgroup");
        String aadhar = request.getParameter("aadhar");
        String gender = request.getParameter("gender");
        
        
        
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String pin = request.getParameter("pin");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String mobile = request.getParameter("mobile");
        
        String ClassX_Board = request.getParameter("ClassX_Board");
        String ClassX_Percentage = request.getParameter("ClassX_Percentage");
        String ClassX_YrOfPassing = request.getParameter("ClassX_YrOfPassing");
        
        String ClassXII_Board = request.getParameter("ClassXII_Board");
        String ClassXII_Percentage = request.getParameter("ClassXII_Percentage");
        String ClassXII_YrOfPassing = request.getParameter("ClassXII_YrOfPassing");
        
        String Graduation_Board = request.getParameter("Graduation_Board");
        String Graduation_Percentage = request.getParameter("Graduation_Percentage");
        String Graduation_YrOfPassing = request.getParameter("Graduation_YrOfPassing");
        
        
        String Masters_Board = request.getParameter("Masters_Board");
        String Masters_Percentage = request.getParameter("Masters_Percentage");
        String Masters_YrOfPassing = request.getParameter("Masters_YrOfPassing");
        
        PrintWriter writer = response.getWriter();
        String htmlresponse = "<html>";
        
        htmlresponse +="<table align='center' cellpadding = '10'>";
        htmlresponse += "<tr><td>NAME</td><td>"+name+"</td></tr>";
        
        htmlresponse += "<tr><td>ROLL NUMBER</td><td>"+roll +"</td></tr>";
       
        htmlresponse += "<tr><td>Father's Name</td><td>"+father+"</td></tr>";
        
        htmlresponse += "<tr><td>Mother's Name</td><td>"+mother+"</td></tr>";
        
        htmlresponse += "<tr><td>Blood Group</td><td>"+bloodgroup+"</td></tr>";
        
        htmlresponse += "<tr><td>EmailId</td><td>"+email+"</td></tr>";
        
        htmlresponse += "<tr><td>AadharNo</td><td>"+aadhar+"</td></tr>";
        
        htmlresponse += "<tr><td>Gender</td><td>"+gender+"</td></tr>";
        
        htmlresponse += "<tr>" +"<td>ADDRESS <br /><br /><br /></td></tr>";
        
        htmlresponse += "<tr><td>City</td><td>"+city+"</td></tr>";
        
        htmlresponse += "<tr><td>State</td><td>"+state+"</td></tr>";
        
        htmlresponse += "<tr><td>Country</td><td>"+country+"</td></tr>";
        
        htmlresponse += "<tr><td>PinCode</td><td>"+pin+"</td></tr>";
        
        htmlresponse += "<tr><td>Mobile NO</td><td>"+mobile+"</td></tr>";
        
        htmlresponse += "<tr><td>Qualification<br /><br /><br /><br /><br /><br /></td></tr>";
        
        htmlresponse += "<tr><td>EmailId</td><td>"+email+"</td></tr>";
        
        htmlresponse += "<tr><td>Mobile</td><td>"+mobile+"</td></tr>";
        
        htmlresponse += "<tr>" +"<td>QUALIFICATION <br /><br /><br /><br /><br /><br /><br /></td>" +"<td>" +"<table>";

        
        
        
        
        

       /* htmlresponse += "<h2>Name: " + name + "<br>";
        htmlresponse += "<h2>Name: " + name + "<br>";
        htmlresponse += "<h2>Name: " + name + "<br>";
        htmlresponse += "<h2>Name: " + name + "<br>";
        htmlresponse += "<h2>Name: " + name + "<br>";
        htmlresponse += "<h2>Name: " + name + "<br>";
        htmlresponse += "<h2>Name: " + name + "<br>";
        htmlresponse += "<h2>Name: " + name + "<br>";
        htmlresponse += "<h2>Name: " + name + "<br>";
        htmlresponse += "<h2>Name: " + name + "<br>";
        htmlresponse += "<h2>Name: " + name + "<br>";*/
        
        //htmlresponse +="</html>";
        //writer.println(htmlresponse);
 
        
        
        
        
        
        
    }

  
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
