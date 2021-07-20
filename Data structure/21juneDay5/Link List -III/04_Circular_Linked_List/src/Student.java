
public class Student {
	private int rno;
	private String name;
	public Student()
	{
		rno=0;
		name=" ";
	}
	public Student(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	public String toString()
	{
	    return " [ "+rno+" "+name+" ]";
	}

}
