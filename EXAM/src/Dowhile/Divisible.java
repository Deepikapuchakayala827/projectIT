package Dowhile;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int divisor=Sc.nextInt();
		int num=1;
		System.out.println("Numbers divisible by " +divisor + " are:");
		do
		{
			if(num%divisor==0)
			{
				System.out.println( num+" ");
			}
			num++;
		}
		while(num<=100);
		
		
		

	}

}
