package Dowhile;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=Sc.nextInt();
		int i=1;
		do
		{
			System.out.println(num+"*"+i+"="+(num*i));
			i++;
		}
		while(i<=10);
	}

}
