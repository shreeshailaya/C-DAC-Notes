public class MainClass
{
	public static void main(String [] args)
	{
		System.out.println("This is main class ");
		Person p1;
		p1 = new Person();
		p1.displayPerson();
		System.out.println("*****This is mainClass Creating 2nd obj(with para) of Person*****");
		Person p2=new Person("Shree",7,8,97);
		p2.displayPerson();
	}
}
