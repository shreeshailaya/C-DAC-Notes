
import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SearchBySalary {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

	        //creating connection with the database
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee","root","");
			Statement smt=con.createStatement();

			//creating object of DataInputStream
			Scanner sc=new Scanner(System.in);
			//input mimimum salary
			System.out.print("Enter Min Salary: ");
			String min=sc.next();
			//input maximum salary
			System.out.print("Enter Max Salary: ");
			String max=sc.next();

			//query to select salary between minimum and maximum values
			String q="Select * from emp where salary between "+min+" and "+max;

			// to execute query
			ResultSet rs=smt.executeQuery(q);
			//to print the resultset on console
			if(rs.next())
			{
				do{
					System.out.println("ID :"+rs.getInt(1)+","+"Name :"+rs.getString(2)+","+"Dept ID :"+rs.getInt(3)+","+"Salary :"+rs.getDouble(4));
				}while(rs.next());
			}
			else
			{
				System.out.println("Record Not Found...");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
