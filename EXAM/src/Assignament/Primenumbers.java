package Assignament;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) 
	{
		int i;
		int j;
		for(i=1;i<=100;i++)
		{
			int Count=0;
		
		for(j=1;j<=i;j++);
		{
			if(i%2==0)
			{
				Count++;
			}
			if(Count==0)
			{
				System.out.println(i);
			}
		}
		}
	}
}
	
