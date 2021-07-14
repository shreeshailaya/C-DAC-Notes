package mthreadII_ass1;
public class PrintingJob implements Runnable
{
	private Thread t;
	private Printer p;
	private String header,body,footer;
	
	public PrintingJob(Printer p, String header, String body, String footer)
	{
		this.p = p;
		this.header = header;
		this.body = body;
		this.footer = footer;
		t = new Thread(this);
	}
		
	public Thread getThread()
	{
		return t;
	}

	@Override
	public void run() 
	{
		//p.print(header, body, footer);
		p.syncPrint(header, body, footer);
	}
}
