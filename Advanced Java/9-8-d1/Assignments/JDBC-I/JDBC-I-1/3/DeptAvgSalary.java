package apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptAvgSalary {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs= null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","");
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT e.deptno,d.dname,avg(e.salary) from emp e, dept d where e.deptno = d.deptno group by e.deptno order by avg(e.salary) desc");
			System.out.println("Deptno\tDept Name\tAvg Salary");
			if(rs.next())
			{
				do
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
				}while(rs.next());
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
