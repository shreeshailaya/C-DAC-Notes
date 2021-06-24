package dynamicQueueEmpolyee;

public class Empolyee {
	
	private int id;
	private String name;
	
	public Empolyee()
	{
		id=0;
		name=null;
		
	}
	
	public Empolyee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return "      ID      "+id+"     Name     "+name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
