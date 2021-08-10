

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String url="jdbc:mysql://localhost:3307/employee";
		String uname="root";
		String pass="";
		String query="select * from emp order by emp_salary desc";
		Set<Employee>empset=new TreeSet<Employee>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getSal()-o1.getSal();
			}
		});
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,uname,pass);
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next())
			{
				empset.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
			}
			for(Employee e : empset)
			{
				System.out.println(e);
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not Found");
		}
		catch(SQLException e)
		{
			System.out.println("Connection Error");
		}
		finally
		{
			try
			{
				rs.close();
				stmt.close();
				con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

	}

}
