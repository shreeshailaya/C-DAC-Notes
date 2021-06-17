package assignment1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Team cricket = new Team(11);
		cricket.accept();
		cricket.display();
		
		Team kabadi = new Team(7);
		kabadi.accept();
		kabadi.display();
		

		

	}

}

/*
_____________________________________________________________________
*/

package assignment1;

import java.util.Scanner;

public class Player {
	String name,city,state;
	int playerNo;
	
	
	public Player()
	{
		name="default";
		city="default";
		state="default";
		playerNo=0;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player number");
		playerNo=sc.nextInt();
		System.out.println("Enter Player Name, City and State ");
		name=sc.next();
		city=sc.next();
		state=sc.next();
		
	}
	
	public void display()
	{
		System.out.println("***************************");
		System.out.println("Player Number"+playerNo);
		System.out.println("Name:-"+name);
		System.out.println("Address" +city+ "   " +state);
		
	}

}

/*
__________________________________________________________________________

*/


package assignment1;

public class Team {
	int size;
	Player [] p;
	public Team(int size)
	{
		this.size=size;
		p = new Player[size];
		for(int i=0;i<size;i++)
		{
			p[i]=new Player();
		}
	}
	
	public void accept()
	{
		for(int i=0;i<size;i++)
		{
			p[i].accept();
		}
	}
	
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			p[i].display();
		}
	}

}



