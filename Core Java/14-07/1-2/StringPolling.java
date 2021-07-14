package multithreadII_ass4;

public class StringPolling {
public static void main(String[] args) {
	String s1="hello";
	String s2=new String("hello");
	if(s1==s2)
		System.out.println("equals");
	else 
		System.out.println("Not Equal:");
	
	StringBuffer obj=new StringBuffer("hello");
	obj.append("java");
	System.out.println(obj);
	
	String s3="we lc om e";
	String[]arr=s3.split(" ");
	for(String ele:arr)
		System.out.print(ele);
}
}
