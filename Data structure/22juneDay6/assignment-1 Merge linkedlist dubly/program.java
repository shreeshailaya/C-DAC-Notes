


public class program {
	
	public static void main(String[] args)
	{
		Linklist list1=new Linklist();
		list1.createLinklist(5);
		list1.display();
		Linklist list2=new Linklist();
		list2.createLinklist(3);
		list2.display();
		list1.merge(list2);
		list1.display();
		
	}
}
