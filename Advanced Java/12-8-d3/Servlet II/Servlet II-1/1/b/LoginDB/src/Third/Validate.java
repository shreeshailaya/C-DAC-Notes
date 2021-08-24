package Third;

import java.sql.*;

public class Validate {
	
	public static boolean checkUser(String user,String pass) 
    {
        boolean st =false;
        try {

            //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/register","root","");
            PreparedStatement ps = con.prepareStatement("select * from register where user=? and password=?");
            ps.setString(1, user);
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
