package mthreadII_ass2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class PrintDemo {
	public void print(int num)
	{
	
		
		FileWriter myWriter=null;
		try {
			int i;
			File file = new File("append.txt");
			FileWriter fr = new FileWriter(file, true);
			BufferedWriter br = new BufferedWriter(fr);
			PrintWriter pr = new PrintWriter(br);
			 // create a new writer
	         PrintWriter pw = new PrintWriter(System.out);

	         // format text with specified locale.
	         // %s indicates a string will be placed there, which is s
	         pw.format(Locale.UK, "This is a %s number", num);
			for (i=1;i<=num;i++) 
			{
			
			    if (num % i == 0)
			    {
			    	
			    	pr.print(i+",");
			    
			    	//myWriter.write(i + " , ");
			       
			    
			        System.out.print(i + " , ");
			    }
			         	
			}
			pw.flush();
			pr.close();
			br.close();
			fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  
	}
}
