package Dowhile;

import java.util.Scanner;

public class Positivenumbers {

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		int sum=0;
		int num;
		do
		{
			System.out.println("enter the number:");
			num=Sc.nextInt();

			if(num>0)
			{
				sum+=num;
				System.out.println("Sum of positive number: " + sum);
				
			}
		}
			while(num!=0);


	
	}

}
