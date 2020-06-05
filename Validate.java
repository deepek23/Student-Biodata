import java.sql.*;

public class Validate {
    public static boolean checkUser(String email,String pass) 
    {
        boolean st =false;
        try {

            //loading drivers for mysql
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/cit","root","root");
            PreparedStatement ps = con.prepareStatement("select username,password from register where username=? and password=?");
            ps.setString(1, email);
            ps.setString(2, pass);
            ResultSet rs =ps.executeQuery();
            st = rs.next();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;              
    }   
}
