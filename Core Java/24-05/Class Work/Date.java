public class Date
{
   //state+beahvior
   //data members(private) + member methods(public)
   private int dd;  //instance varible
   private int mm;
   private int yy;
   //static data/varibale
   private static int count;

   static
   {
	count = 0;
   } 
   
   //default constructor - zero argument cons
   public Date()
   {
	//dd=mm=yy=0;
        dd = 21;
	mm = 5;
	yy = 2021;
	count++;
   }



   //parameterised constructor - full arg cons
   public Date(int dd,int mm,int yy) //local varibles
   {
        //instance variable = local varible 
        //dd = dd;      no effect
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;

	count++;        
   }

   public Date(int n)
   {
	dd=mm=yy=n;
	count++;
   }
   //constructor overloading 


   //method overloading   
   public void showdate()
   {
	System.out.println(dd+"/"+mm+"/"+yy);
   }

   public void showdate(char ch)
   {
	System.out.println(dd+""+ch+mm+""+ch+yy);
   }

   public static void showCount()
   {
	System.out.println("Count of objects : "+count);
   }

}








