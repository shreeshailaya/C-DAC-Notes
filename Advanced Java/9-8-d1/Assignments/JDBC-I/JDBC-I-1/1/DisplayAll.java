import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayAll
{
	public static void main(String[] args)
     	{
		try
           	{
			Class.forName("com.mysql.jdbc.Driver");
			//serverhost = localhost, port=3306, username=root, password=
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			Statement smt=cn.createStatement();
			//query to display all records from table employee
			String q = "select * from myemployee";
			//to execute query
			ResultSet rs=smt.executeQuery(q);
			//to print the resultset on console
			if(rs.next())
			{ 
				do
				{
					System.out.println(rs.getString(1)+","+rs.getString(2));
		
				}while(rs.next());
			}
			else
			{
				System.out.println("Record Not Found...");
			}
			cn.close();
		  }
		  catch(Exception e)
    		  {
			System.out.println(e);
		  }
	}
}

