

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableUpdatableResultSet {

	public static void main(String[] args) {
		Connection con =null;
		ResultSet rs=null;
		Statement st=null;
		String url="jdbc:mysql://localhost:3307/Employee";
		String uname="root";
		String pass="";
		String query="select * from employee";
		int salary;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,uname,pass);
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery(query);
			while(rs.next())
			{
				salary=rs.getInt(3);
				if(salary<10000)
				{
					salary+=((salary*2)/100);
					rs.updateInt(3, salary); 
					rs.updateRow();         
											
				}
				else if(salary>=10000 && salary<25000)
				{
					salary+=((salary*5)/100);
					rs.updateInt(3, salary);
					rs.updateRow();
				}
				else if(salary>=25000 && salary<50000)
				{
					salary+=((salary*8)/100);
					rs.updateInt(3, salary);
					rs.updateRow();
				}
				else if(salary>=50000)
				{
					salary+=((salary*10)/100);
					rs.updateInt(3, salary);
					rs.updateRow();
				}
			}
			System.out.println("Salaries are Updated");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("class not found");
		}
		catch(SQLException e)
		{
			System.out.println("Connection closed");
		}
		finally
		{
			try
			{
				st.close();
				rs.close();
				con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

}
