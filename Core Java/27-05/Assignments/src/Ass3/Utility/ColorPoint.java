package Ass3.Utility;

public class ColorPoint extends Point {

	private String color;
	private static String [] colors;
	
	static
	{
		colors = new String [5];
		colors[0] = "black";
		colors[1] = "blue";
		colors[2] = "red";
		colors[3] = "green";
		colors[4] = "pink";
	}

	public ColorPoint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		
		boolean flag = false;
		for(int i=0;i<colors.length;i++)
		{
			if(color.equals(colors[i]))
			{
				this.color = color;
				flag = true;
				break;
			}
		}
		if(flag == false)
		{
			this.color = "white";
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nColor : "+color;
	}

	
	
}
