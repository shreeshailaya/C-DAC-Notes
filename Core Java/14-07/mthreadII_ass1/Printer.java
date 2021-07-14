package mthreadII_ass1;

import java.io.PrintWriter;

public class Printer 
{
	PrintWriter out;
	
	public Printer()
	{
		//printwriter is internally buffering
		out = new PrintWriter(System.out);
	}
	
	public void print(String header,String body,String footer)
	{
		try
		{
			out.print(header);
			out.flush();
			Thread.sleep(200);
			out.print(body);
			out.flush();
			Thread.sleep(200);
			out.print(footer);
			out.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public synchronized void syncPrint(String header,String body,String footer)
	{
		//synchronized(this)
		//{
			try
			{
				out.print(header);
				out.flush();
				Thread.sleep(200);
				out.print(body);
				out.flush();
				Thread.sleep(200);
				out.print(footer);
				out.print("\n");
				out.flush();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		//}
		
	}
}
