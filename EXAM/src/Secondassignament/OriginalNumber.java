package Secondassignament;

import java.util.Scanner;

public class OriginalNumber {

	public static void main(String[] args) 

	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter five digit number:");
		int num=Sc.nextInt();
		int original=num;
		int reversednum=0;
		while(num!=0)
		{
			int digit=num%10;
			reversednum=reversednum*10+digit;
			num/=10;
		}
		System.out.println("Reversed number: " + reversednum);

		if (original == reversednum) 
		{
			System.out.println("The original number and reversed number are equal.");
		} else
		{
			System.out.println("The original number and reversed number are not equal.");


		}

	}
}
