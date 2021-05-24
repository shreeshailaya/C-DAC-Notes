public class UseArray
{
   public static void main(String [] args)
   {
	/*int [] arr;    //array of int values, declaration
	arr = new int[5];    //array object created
	arr[0] = 32;
	arr[1] = 34;
	arr[2] = 32;
	arr[3] = 56;
	arr[4] = 67; */
        int [] arr = {34,32,67,65,43};//declare, instantiation, initialization
	int total = 0;
	for(int i=0;i<arr.length;i++)
	{
	    total += arr[i];
	}
	System.out.println("sum : "+total);

        int [] [] matrix;
	matrix = new int[3][3];
        matrix[0][0] = 23;
        int [][] matrix = {{3,4,5},{6,3,8},{2,9,8}}	
   }
}