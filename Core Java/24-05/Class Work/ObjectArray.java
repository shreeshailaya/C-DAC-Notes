public class ObjectArray
{
   public static void main(String [] args)
   {
	/*Date [] datearr;             //int [] arr;
	datearr = new Date[3];       //arr = new int[5];
	datearr[0] = new Date();
	datearr[1] = new Date(11,12,1999);
	datearr[2] = new Date(12);*/

        Date [] datearr = {new Date(),new Date(12,11,1999),new Date(12)};

	for(int i=0; i<datearr.length; i++)
	{
		datearr[i].showdate('-');
	}
        
	

   }
}