package Secondassignament;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the time taken in hours:");
		int timetaken=Sc.nextInt();
		if((timetaken>=2)&&(timetaken<3))
		{
			System.out.println("worker highly efficient");	
		}
		else if((timetaken>=3)&&(timetaken<4))
		{
			System.out.println("worker highly efficient");	System.out.println("worker ordered to improve speed");	
		}
		else if((timetaken>=4)&&(timetaken<5))
		{
			System.out.println("worker s given training to improve his speed");
		}
		else if((timetaken>=5))
		{
			System.out.println("worker has to leave the company");
		}
		else
		{
			System.out.println("invalid output");
		}
	}

}
