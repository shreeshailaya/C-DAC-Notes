
public class Book {

	private int bno;
	private String bname;
	public Book(int bno, String bname) {
		super();
		this.bno = bno;
		this.bname = bname;
	}
	public Book() {
		super();
	}
	public int getbno() {
		return bno;
	}
	public void setbno(int bno) {
		this.bno = bno;
	}
	public String getbname() {
		return bname;
	}
	public void setbname(String bname) {
		this.bname = bname;
	}
	public String toString()
	{
		return "\t"+bno+"\t"+bname;
	}
	
}
