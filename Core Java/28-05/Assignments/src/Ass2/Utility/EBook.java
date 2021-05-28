package Ass2.Utility;
public class EBook  extends Book 
{
	private double disc;

	public EBook(String name, float price) 
	{
		super(name, price);
		
	}
	

	@Override
	public double calCost()
	{
		// TODO Auto-generated method stub
		if (price<=500)
		{
			this.disc=price-(price*0.02);
			return disc;
		}
		else if (price>500 && price<=1000)
		{
			this.disc=price-(price*0.05);
			return disc;
		}
		else 
		{
			this.disc=price-(price*0.07);
			return disc;
		}
		 
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("After discount the price of the EBook :");
	}
	
	
	
	
}

