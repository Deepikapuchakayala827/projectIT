package Arrays;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) 
	{
		int Count=0;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=Sc.nextInt();
		if(num%2==0)
		{
			Count++;
			System.out.println(num + " is even");
		}
		else
		{
		
			System.out.println(num+" is odd");	
		}			}
		
		
		

	}


