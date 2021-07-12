package collII_4;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> name = new PriorityQueue<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		
		
		name.add("Hi");
		name.add("Shree");
		name.add("is");
		name.add("Here");
		name.add("..!");
		
		
		for(String s : name)
		{
			System.out.println(s);
		}
		
		System.out.println("********************************");
		
		while(!name.isEmpty())
		{
			System.out.println(name.poll());   //prority ASCII value
		}

		

	}

}
