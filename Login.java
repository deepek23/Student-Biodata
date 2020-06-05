
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("username");
        String pass = request.getParameter("psw");
        if(username.equals("admin")&& pass.equals("admin")){
            
            out.print("<a href='ChecYourDetailServlet'>Check All Students Details</a>");
        }
        
        else if(Validate.checkUser(username, pass))
        {
            //RequestDispatcher rs = request.getRequestDispatcher("welcome.html");
            //rs.forward(request, response)
        
 
        
        RequestDispatcher rs = request.getRequestDispatcher("WelcomeServlet");
        rs.forward(request, response);
        
 
        }
        else
        {
           out.println("Username or Password incorrect,try again or Register");
           RequestDispatcher rs = request.getRequestDispatcher("studentbiodata.html");
           rs.include(request, response);
        }
    }  
}