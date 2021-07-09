package apps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineWithMaxChars {

	public static void main(String[] args) 
	{
		String source=null;
		BufferedReader br1 = null;
		BufferedReader br = null;
		int length=0;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the source file name : ");
			source = br.readLine();
			File f = new File(source);
			if(f.exists())
			{
				System.out.println("File exists");
				br1=new BufferedReader(new FileReader(f));
				String str = null;
				int max =0;
				String maxline = null;
				System.out.println("starts reading");
				while((str=br1.readLine()) != null)
				{
					 length = str.length();
					length++;
					if(length > max)
					{
						max = length;
						maxline = str;
					}
				}
				System.out.println("Line with max no of characters : ");
				System.out.println(length+" : "+maxline);
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
		
			try {
				br.close();
				br1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

	}

}
