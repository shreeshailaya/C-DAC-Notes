package Ass2.entities;

public class Customer {
		private String email, name;
		private double price;
		public Customer() {
			super();
		}



		public Customer(String email, String name,double price) {
			super();
			this.email = email;
			this.name = name;
			this.price=price;
		}

public double getPrice()
{
	return price;
}

		public double giveDiscount()
		{
			System.out.println("No DISCUONT");
			return  price;
		}
		public String toString()
		{
			return "\t Name "+name+"\t Email "+email+"\t Price "+price;
		}
	}


