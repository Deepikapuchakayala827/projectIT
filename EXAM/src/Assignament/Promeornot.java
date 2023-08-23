package Assignament;

import java.util.Scanner;

public class Promeornot {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=Sc.nextInt();
		
		if(num>1) 
		{
			for(int i=1;i<=num;i++)
			{
				if(i%2==0)
				{
					i++;
				}
			}
			
		if(num==2)
		{
            System.out.println("It is a prime number.");
		}
         else 
        {
            System.out.println("It is not a prime number.");
        }
		}
		 else
		{
			System.out.println("It is not a prime number");
		}
		}
    }


    
