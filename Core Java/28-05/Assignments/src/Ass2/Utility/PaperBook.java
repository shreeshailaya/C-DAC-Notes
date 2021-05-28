package Ass2.Utility;
public class PaperBook extends Book 
{
	private double deli;

	

	public PaperBook(String name, float price) {
		super(name, price);
		
	}
	
	@Override
	public double calCost() 
	{
		// TODO Auto-generated method stub
		if (price<=500)
		{
			this.deli=price+(price*0.02);
			return deli;
		}
		else if (price>500 && price<=1000)
		{
			this.deli=price+(price*0.05);
			return deli;
		}
		else
		{
			this.deli=price+(price*0.07);
		    return deli;
		}
	
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("After delivery charges added the price of the Paperbook :");
	}
	
}
