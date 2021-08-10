

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsingProcedure {

	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cs = null;
		BufferedReader br=null;
		String url="jdbc:mysql://localhost:3307/Employee";
		String uname="root";
		String pass="";
		int id;
		int sal;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,uname,pass);
			con.setAutoCommit(false);
			br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Emp Id to update : ");
			id=Integer.parseInt(br.readLine());
			System.out.println("Enter Salary : ");
			sal=Integer.parseInt(br.readLine());
			cs=con.prepareCall("{call updateBySalary(?,?)}");
			cs.setInt(1, id);
			cs.setInt(2, sal);
			if(!cs.execute()) //cs.execute return false
			{
				System.out.println("Salary Updated for emp id : "+id);
				con.commit();
			}
			else
			{
				System.out.println("salary not updated");
				con.rollback();
			}
			con.setAutoCommit(true);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class Not Found");
		}
		catch(SQLException e)
		{
			System.out.println("Connection closed");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
				cs.close();
				con.close();
			}
			catch(IOException | SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

}
