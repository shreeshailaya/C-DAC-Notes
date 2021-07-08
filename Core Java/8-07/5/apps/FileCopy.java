package apps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileCopy {

	public static void main(String[] args) {
		String source=null,dest=null;
		FileWriter fw = null;
		FileReader fr = null;
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the source file name : ");
			source = br.readLine();
			System.out.println("Enter the destination file name : ");
			dest = br.readLine();
			
			fw = new FileWriter(dest);
			fr = new FileReader(source);
			System.out.println("Copying the content ......");
			
			int i;
			while((i=fr.read()) != -1)
				fw.write(i);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
				fw.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
