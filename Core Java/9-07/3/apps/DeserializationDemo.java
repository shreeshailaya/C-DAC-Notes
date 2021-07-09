package apps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import office.staff.Emp;

public class DeserializationDemo
{

	public static void main(String[] args) {
		//Emp [] emps = new Emp[3];
		List<Emp> emps=new ArrayList<>();
		ObjectInputStream ois = null;
		try
		{
			ois= new ObjectInputStream(new FileInputStream("D://Emp.xls"));
			
			while(true)
			{
				try
				{
					emps.add((Emp)ois.readObject());
				}
				catch(Exception e)
				{
					break;
				}
			}
			
			
			for(Emp e : emps)
			{
				System.out.println(e);
				System.out.println("Salary : "+e.calSalary());
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}



