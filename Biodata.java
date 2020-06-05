import java.io.*;
import java.sql.*;
import java.sql.DriverManager;
import javax.servlet.*;
import javax.servlet.http.*;

public class Biodata extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
       
        
        //out.println("Need to write jdbc con code for inserting data into table");
        //out.print("<link rel='stylesheet' type='text/css' href='biodatas.css'>");
        out.print("<table width=100% border=1>");  

        
        String r = request.getParameter("roll");
        int roll =Integer.parseInt(r);
        String name = request.getParameter("name");
        String father = request.getParameter("father");
        String mother = request.getParameter("mother");
        String bloodgroup = request.getParameter("bloodgroup");
        String aadhar = request.getParameter("aadhar");
        String gender = request.getParameter("gender");
        String username=request.getParameter("username");
        
        
        
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
        
        
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/cit","root","root");
            
            //----->ClassX 
            PreparedStatement classx=con.prepareStatement(  "insert into classx values(?,?,?,?,?)");
            classx.setInt(1, roll);
            classx.setString(2, username);
            classx.setString(3, ClassX_Board);
            classx.setString(4, ClassX_Percentage);
            classx.setString(5, ClassX_YrOfPassing);
            int i=classx.executeUpdate();
           
            
            //----->ClassXII
            PreparedStatement xii=con.prepareStatement(  "insert into classxii values(?,?,?,?,?)");
            xii.setInt(1, roll);
            xii.setString(2, username);
            xii.setString(3, ClassXII_Board);
            xii.setString(4, ClassXII_Percentage);
            xii.setString(5, ClassXII_YrOfPassing);
            int k=xii.executeUpdate();
            
            
            //----->Graduation info
            PreparedStatement gra=con.prepareStatement(  "insert into graduation values(?,?,?,?,?)");
            gra.setInt(1, roll);
            gra.setString(2, username);
            gra.setString(3, Graduation_Board);
            gra.setString(4, Graduation_Percentage);
            gra.setString(5, Graduation_YrOfPassing);
            int m=gra.executeUpdate();
            
            //------>Contact Details
            PreparedStatement contact=con.prepareStatement(  "insert into contact values(?,?,?,?,?,?,?,?,?,?)");
            contact.setInt(1, roll);
            contact.setString(2, username);
            contact.setString(3, address);
            contact.setString(4, city);
            contact.setString(5, pin);
            contact.setString(6, state);
            contact.setString(7, country);
            contact.setString(8, mobile);
            contact.setString(9, email);
            contact.setString(10, aadhar);
            //contact.setString(10, username);
            
            int n=contact.executeUpdate();
            
            //----->Master's Info
            PreparedStatement mas=con.prepareStatement(  "insert into masters values(?,?,?,?,?)");
            mas.setInt(1, roll);
            mas.setString(2, username);
            mas.setString(3, Masters_Board);
            mas.setString(4, Masters_Percentage);
            mas.setString(5, Masters_YrOfPassing);
            int o=mas.executeUpdate();
            
            //---->Personal Details
            PreparedStatement pd=con.prepareStatement(  "insert into personal values(?,?,?,?,?,?,?,?)");
            pd.setInt(1, roll);
            pd.setString(2, username);
            pd.setString(3, name);
            pd.setString(4,father );
            pd.setString(5,mother );
            pd.setString(6,bloodgroup );
            pd.setString(7, aadhar);
            pd.setString(8, gender);
            int p=pd.executeUpdate();
            
            
            
            
            
        }catch(Exception e)
        {
            out.println(e);
        }
        
        //RequestDispatcher ab = request.getRequestDispatcher("Showbiodata");
        //ab.forward(request, response);
        
        
        
        //TO PRINT HTML PAGE AFTER FILLING THIS FORM
        
        
        String n = request.getParameter("username"); 
            out.print("Welcome " + n);
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
        
        htmlresponse += "<tr><td>NAME</td><td>"+username+"</td></tr>";
        
        htmlresponse += "<tr>" +"<td>QUALIFICATION <br /><br /><br /><br /><br /><br /><br /></td>";
        
        /*htmlresponse +="<tr>\n" +
"<td align=\"center\"><b>Sl.No.</b></td>\n" +
"<td align=\"center\"><b>Examination</b></td>\n" +
"<td align=\"center\"><b>Board</b></td>\n" +
"<td align=\"center\"><b>Percentage</b></td>\n" +
"<td align=\"center\"><b>Year of Passing</b></td>\n" +
"</tr>";
        
        htmlresponse+="<tr>"+"<td>1</td>"+"<td>"+ClassX_Board+"</td>" +"<td></td>" +"<td>"+ClassX_Board+"</td>n" +"<td>"+ClassX_Board+"</td>" +"</tr>";
        
        htmlresponse="<tr>" +"<td>2</td>" +"<td>Class XII</td>n" +"<td>"+ClassXII_Board+"</td>" +"<td>"+ClassXII_Percentage+"</td>" +"<td>"+ClassXII_YrOfPassing+"</td>" +"</tr>";
        
        htmlresponse="<tr>" +"<td>3</td>" +"<td>Graduation</td>" +"<td>"+Graduation_Board+"</td>"+"<td>"+Graduation_Percentage+"</td>" +"<td>"+Graduation_YrOfPassing+"</td>" +"</tr>";
 
        
        
 

        
        
        
        
        

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
        
        htmlresponse +="</html>";
        writer.println(htmlresponse);
        out.print("<a href='CheckMineServlet?username=" + n + " ' style=\"color:red\">Check your own Details</a>");
        
        
        
    }  
}