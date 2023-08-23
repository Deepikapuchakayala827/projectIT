package Secondassignament;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int quantity=Sc.nextInt();
		double price=Sc.nextDouble();
		double totalexpenses;
		if(quantity>100)
		{
			double discountamount=0.1*quantity*price;
			totalexpenses=quantity*price-discountamount;		
		}
		else
		{
			totalexpenses=quantity*price;
		}
		System.out.println("totalexpenses:"+totalexpenses);
		
	}


}
