public class AccountDemo
{
   public static void main(String [] args)
   {
	Account a1;   //class will not be loaded   
	a1 = new Account();    //class will be loaded 

	Account a2 = new Account(346574, 30000.00);
        //class is already loaded will not be reloaded
        a2.display();
	
	//int rate updated
        //static methods can be called on object even
        //a1.updateIntRate(5.6f);
	Account.updateIntRate();
	a2.display();
   }
}