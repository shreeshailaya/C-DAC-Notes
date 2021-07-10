package asstwo_1;

import java.util.*;

public class ArrayColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int choise;
		List<String> l = new ArrayList<String>();
		do
		{
		System.out.println("1.Enter String");
		System.out.println("2.Display");
		System.out.println("3.Remove");
		System.out.println("4.Size");
		System.out.println("5.Sort");
		System.out.println("6.Reverse");
		System.out.println("7.Check String");
		System.out.println("0.Exist");
		
		Scanner sc = new Scanner(System.in);
		choise = sc.nextInt();
		switch(choise)
		{
		case 1:
			s=sc.next();
			l.add(s);
			break;
		case 2:
			System.out.println(l);
			break;
		case 3:
			System.out.println("Enter INDEX NO");
			int ind = sc.nextInt();
			l.remove(ind);
			System.out.println("Element Removed");
			System.out.println("NEW COLLECTION"+l);
			break;
		case 4:
			System.out.println("The Size of collection is"+(int)l.size());
			break;
		case 5:
			Collections.sort(l);
			System.out.println(l);
			break;
		case 6:
			Collections.reverse(l);
			System.out.println(l);
			break;
		case 7:
			System.out.println("Enter String to Check present or not");
			String chstr=sc.next();
			Collections.sort(l);
			int index=Collections.binarySearch(l, chstr);
			if(index>=0) {
			System.out.println("The String is found at : "+index);
			}else {
				System.out.println("Str Not found");
			}
		}
		}while(choise!=0);
		
}
}
