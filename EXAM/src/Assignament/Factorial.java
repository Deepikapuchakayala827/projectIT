package Assignament;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=Sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("factorial is " +num+ " is "+fact);
	}

}
