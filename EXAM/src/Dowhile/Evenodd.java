package Dowhile;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		
		
		int sumeven = 0;
		int sumodd = 0;
		int num;
		do
		{
			System.out.println("Enter the number:");
			 num=Sc.nextInt();
			 
			if(num%2==0)
			{
				sumeven+=num;
				System.out.println(num + " is even");
			}
			else
			{
				sumodd = num;
				System.out.println(num+" is odd");	
			}
	}
		while(num!=0);
}
}
