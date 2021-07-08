package apps;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowLineNumbers {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file name : ");
		String fpath = br.readLine();
		File f = new File(fpath);
		if(f.exists())
		{
			FileReader fr = new FileReader(f);
			int n;
			int count = 0;
			String str = "";
			while((n=fr.read()) != -1)
			{
				if(n!='\n')
				{
					s+=(char)n;
				}
				else
				{
					System.out.println(count + ". "+s);
					count++;
					s="";
				} 
				
			}			
		}
		else
		{
			System.out.println("File not available");
		}

	}

}
