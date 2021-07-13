package MultiThread;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;


public class Read implements Runnable
{
	Thread r;
	String source,dest=null;
	FileWriter fw = null;
	FileReader fr = null;

	public Read(String source, String dest) {
		
		this.source = source;
		this.dest = dest;
		
		r=new Thread(this);
		System.out.println("FIle thread::"+r);
		
		r.start();
	}


	@Override
	public void run() {
		
		try
		{
					
			
			File f1 = new File(dest);
			
			System.out.println("File created and start copying...");
			fw = new FileWriter(f1);
			
			fr = new FileReader(source);
			
			System.out.println("Copying the content ......");
			
			int i;
			
			while((i=fr.read()) != -1)
				fw.write(i);
			System.out.println("Done");
			
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
