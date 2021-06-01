package apps;

public class UseOfFinally {

	public static void main(String[] args) {
		try
		{
			int [] arr = {3,5,7};
			System.out.println(arr[2]);
			System.exit(0);; //end of process,application
			//open the file
			//reading the contents from file
		}
		catch(Exception e)
		{
			//handle the exception
			e.printStackTrace();
		}
		finally
		{
			//close the file
			System.out.println("in the finally block");
		}
		
	}

}
         //catch - handles the exception,
		//      - accepts argument as Exception object
		//		- gets executed only when exception occurs
		//finally - there is no argument that is required
		//        - purpose is not to handle the exception
		//        - will always get executed
		//closing the resources - file,database