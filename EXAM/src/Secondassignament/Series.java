package Secondassignament;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=Sc.nextInt();
		double sum=0.0;
		for(int i=1;i<=n;i++)
		{
		sum+=1.0/i;	
		}
		System.out.println("sum of the series:"+sum);

	}

}
