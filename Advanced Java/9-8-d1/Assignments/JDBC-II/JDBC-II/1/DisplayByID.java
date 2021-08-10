
import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DisplayByID {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

	        //creating connection with the database
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee","root","");
			Statement smt=con.createStatement();

			Scanner sc=new Scanner(System.in);

			//input a particular employee id of which we want to display record
			System.out.print("Enter Employee ID:");
			String eid=sc.next();

			//query to display a particular record from table employee where empid(employee id) is equals to eid
			String q="Select * from emp where empid='"+eid+"'";

			//to execute query
			ResultSet rs=smt.executeQuery(q);

			//to print the resultset on console
			if(rs.next())
			{
				System.out.println("ID :"+rs.getInt(1)+","+"Name :"+rs.getString(2)+","+"Dept ID :"+rs.getInt(3)+","+"Salary :"+rs.getDouble(4));
			}
			else
			{
				System.out.println("Employee Not Found...");
			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
