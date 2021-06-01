package apps;
import backend.InvalidCountryException;

import java.util.Scanner;

import backend.InvalidCountryException;

public class UserRegistrationDemo {
	public static void registerUser(String username, String usercountry) {
		try {
			if(usercountry.equalsIgnoreCase("INDIA"))
				System.out.println("Registration Successful");
			else
				throw new InvalidCountryException();				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User name:");
		String name = sc.next();
		System.out.println("Enter User country:");
		String country = sc.next();
		
		registerUser(name, country);
	}
}