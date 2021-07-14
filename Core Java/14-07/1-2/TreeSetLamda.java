package multithreadII_ass4;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLamda {
public static void main(String[] args) {
 Set<String>set=new TreeSet<>((String s1,String s2)->
 {
	 int diff=(int)(s1.length()-s2.length());
	 if(s1.length()==s2.length());
	 diff=s1.compareTo(s2);
	 return diff;
 });
		 	set.add("suraj");
		 	set.add("rohit");
		 	System.out.println(set);
}
}
