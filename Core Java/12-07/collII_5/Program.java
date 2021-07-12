package collII_5;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap();
		map.put(1, "a");
		map.put(5, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(2, "e");
		
		Set<Entry<Integer,String>> setmap=map.entrySet(); 
		
		for(Entry< Integer, String> e : setmap)
		{
			System.out.println("Key  :  "+e.getKey()+"  Value  :  "+e.getValue());
		}

		

	}

}
