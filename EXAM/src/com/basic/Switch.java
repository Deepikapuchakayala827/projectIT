package com.basic;

import java.util.*;

public class Switch {

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int monthNumber=Sc.nextInt();
		switch(monthNumber)
		{
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("february");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
			
		default:
			System.out.println("not a valid number");
				
		}
	}

}
