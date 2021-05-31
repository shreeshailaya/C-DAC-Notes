package assignment2;

import java.util.Scanner;

import assignment2.compareClass.MeritCompare;
import assignment2.compareClass.NameCompare;
import assignment2.compareClass.RollCompare;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students [] arr;
		arr = new Students[3];
		Scanner sc = new Scanner(System.in);
		int rollNo,choise;
		String name;
		double marks;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Roll No of Student:-");
			rollNo = sc.nextInt();
			System.out.println("Enter the Name of Student:-");
			name=sc.next();
			System.out.println("Enter Marks of Students:-");
			marks=sc.nextDouble();
			arr[i]=new Students(rollNo, name, marks);
		}
		do
		{
			System.out.println("\n\nPlease Enter the sorting method:-");
			System.out.println("\t 1.Sort by Roll Number");
			System.out.println("\t 2.Sort by Name ");
			System.out.println("\t 3. Sort by Merit");
			System.out.println("\t **PRESS 0 FOR EXIT**");
			System.out.println("\n*********************************\n");
			choise = sc.nextInt();
			switch(choise)
			{
			case 1:
				Comperer c = new RollCompare();
				for(int i=0;i<arr.length;i++)
				{
					for(int j=i+1;j<arr.length;j++)
					{
						if (c.compare(arr[i], arr[j])>0)
						{
						Students temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						}
					}
				} for(Students s : arr)
				{
					System.out.println(s);
				}
				break;
			case 2:
				Comperer c1 = new NameCompare();
				for(int i=0;i<arr.length;i++)
				{
					for(int j=i+1;j<arr.length;j++)
					{
						if (c1.compare(arr[i], arr[j])>0)
						{
						Students temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						}
					}
				}for(Students s : arr)
				{
					System.out.println(s);
				}
				break;
			case 3:
				Comperer c2 = new MeritCompare();
				for(int i=0;i<arr.length;i++)
				{
					for(int j=i+1;j<arr.length;j++)
					{
						if (c2.compare(arr[i], arr[j])>0)
						{
						Students temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						}
					}
				} for(Students s : arr)
				{
					System.out.println(s);
				}
				break;
				
			}
		}while(choise!=0);
		

	}

}
