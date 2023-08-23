package Secondassignament;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		double num1=Sc.nextDouble();
		System.out.println("Enter the second number:");
		double num2=Sc.nextDouble();
		System.out.println("Select an operation:");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.print("Enter your choice: ");
		int choice = Sc.nextInt();
		double result=0;
		switch (choice)
		{
		case 1:
			result=num1+num2;
			break;

		case 2:
			result=num1-num2;
			break;
		case 3:
			result=num1*num2;
			break;
		case 4:
			result=num1/num2;
			break;
		default:
			System.out.println("Invalid choice");
		}
		System.out.println("Result:"+result);
	}
}
