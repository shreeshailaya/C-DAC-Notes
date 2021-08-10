
import java.sql.*;

public class StoredProcedureCall{
 
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3307/employee";
        String user = "root";
        String password = "";
 
 
        try (
 
            Connection conn = DriverManager.getConnection(dbURL, user, password);
 
            CallableStatement statement = conn.prepareCall("{call GetAllEmployee()}");
        ) 
        {
        	 
        	//Executing the CallableStatement
        	ResultSet rs = statement.executeQuery();
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
          
            
            statement.close();
 
            System.out.println("Stored procedure called successfully!");
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}