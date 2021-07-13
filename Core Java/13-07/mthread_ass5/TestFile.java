package MultiThread;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestFile {

	public static void main(String[] args) {
		
		String source=null,dest=null;
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the source file name : ");
			source = br.readLine();
			
			System.out.println("Enter the destination file name : ");
			dest = br.readLine();
			
			new Read(source,dest);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
