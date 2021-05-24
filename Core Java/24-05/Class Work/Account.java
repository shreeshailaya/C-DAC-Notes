class Account
{
   //instace-non-static variables
   private int accno;
   private double balance;
   //static variable/class variable
   private static float int_rate;

   //static block
   static
   {
	int_rate = 4.7f;
	System.out.println("int_rate initialized");
   }

   public Account()
   {
	System.out.println("def cons");
   }
   
   public Account(int accno, double balance)
   {
	this.accno = accno;
	this.balance = balance; 
        System.out.println("para cons");
   }
   
   public void display()
   {
	System.out.println("Acc no : "+this.accno);
	System.out.println("Balance : "+(this.balance+calInterest()));
   }

   //non-static method - non-static as well as static data
   public double calInterest()  //non-static/instance method
   {
	return balance*int_rate/100; 
   }

   //static method - can access only static data	
   public static void updateIntRate(float newrate) //static 
   {
	int_rate = newrate;
	balance = 23000.00;
   }





}