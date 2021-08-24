package Assignment2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB_Connect {

	public static Connection getConnection() throws SQLException,IOException,ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

        //creating connection with the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/register","root","");
        return con;
	}
}
