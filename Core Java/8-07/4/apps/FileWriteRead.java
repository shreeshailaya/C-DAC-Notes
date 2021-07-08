package apps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriteRead
{
	public static void main(String[] args) 
	{
		FileWriter fw = null;
		FileReader fr = null;
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the file name : ");
			String fname = br.readLine();
			fw = new FileWriter(fname);
			System.out.println("Enter the data : ");
			System.out.println("Enter 'q' to quit");
			int i;
			while((i=br.read()) != 'q')
				fw.write(i);
			fw.close();
			System.out.println("Data is written into file");
			System.out.println("Reading same data back and displaying on the console : ");
			System.out.println();
			fr = new FileReader(fname);
			while((i=fr.read()) != -1)
			{
				System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		

	}

}
