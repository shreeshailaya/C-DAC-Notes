package collII_6;

import java.util.*;
import java.util.Map.Entry;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Keyword");
		String keyword = sc.next();
		/*
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		
		for(int i=0;i<keywo Vard.length();i++)
		{
			//String s = (String)keyword.charAt(i);
			map.put(i, keyword.charAt(i));
		}
		*/
		//Set<Entry<Integer, Character>> setmap = map.entrySet();
		//Map<Integer, Character> countmap = new HashMap<Integer, Character>();
		//Set<Entry<Integer, Character>> setcountmap = countmap.entrySet();
		//int count=0;
		Map<Character,Integer> map1 = new LinkedHashMap<Character,Integer>();

		for(int i=0; i<keyword.length();i++)
		{
			char ch = keyword.charAt(i);
			if(map1.containsKey(ch))
			{
				int val = map1.get(ch);
				val++;
				map1.replace(ch,val);
			}else
			{
				map1.put(ch,1 );
			}
		}
		
		Set<Entry<Character,Integer>> setmap1 = map1.entrySet();
		for(Entry<Character,Integer> e : setmap1)
		{
			System.out.println("Key   "+e.getKey()+"    Value    "+e.getValue());
		}
		

	}

}
