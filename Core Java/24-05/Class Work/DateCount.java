public class DateCount
{
   public static void main(String [] args)
   {
	Date d1 = new Date();	
	Date.showCount();
	Date d2 = new Date(12,2,1999);
	Date.showCount();
	Date d3 = new Date(12);
	Date.showCount();
   }
}