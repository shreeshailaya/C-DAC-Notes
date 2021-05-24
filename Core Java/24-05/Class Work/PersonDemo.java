public class PersonDemo
{
   public static void main(String [] args) 
   {
	Person p1 = new Person("Bakul",12,2,1999);
	p1.display();   //main->Person(display)->Date(showdate)
 
        Person p2 = new Person();  //default - name,bdate=null
        p2.display();
   }
}