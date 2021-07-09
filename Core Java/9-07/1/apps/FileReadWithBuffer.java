package apps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadWithBuffer {

	public static void main(String[] args) {
		String source=null;
		FileReader fr = null;
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the source file name : ");
			source = br.readLine();
			
			File f = new File(source);
			
			if(f.exists())
			{
				if(f.isDirectory())
				{
					File [] allfiles=f.listFiles();
					
					for(File file : allfiles)
						
						System.out.println(file.getName());
				}
				else if(f.isFile())
				{
					int i;
					long size = f.length();
					if(size > 25)
					{
						br = new BufferedReader(new FileReader(f));
						while((i=br.read()) != -1)
							//System.out.println("Reading with bufferReader..Size>25");
							System.out.print((char)i); 
							
					}
					else
					{
						fr = new FileReader(f);
						while((i=fr.read()) != -1)
							//System.out.println("reading with File Reader");
							System.out.print((char)i);
					}
				}
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
				//fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
