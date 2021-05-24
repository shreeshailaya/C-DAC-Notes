public class DateDemo
{
   public static void main(String [] args)
   {
	/*Date d1;     //reference varibale declaration 
	d1 = new Date();   //object creation - default
	d1.showdate();   //21/5/2021

        //(date)reference = object(date)
	Date d2 = new Date(21, 11, 2009); //object creation - parametrised
	d2.showdate();    //21/11/2009
       
        Date d3 = new Date();
        d3.showdate('-');    //21-5-2021  */ 

        Date d1;     //reference varibale declaration 
	d1 = new Date();
        //Date d2 = new Date();
        Date d2 = d1;
        d1 = null;
        d2 = null; 
        if(d1 == d2)
           System.out.println("d1 and d2 are same");
        else
	   System.out.println("d1 and d2 are diff");  
   }
}

