package Arrays;

import java.util.Scanner;

public class Prime 
{

	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int num=Sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter elements");
		for(int i=0;i<num;i++)
		{
			a[i]=Sc.nextInt();
		}
		System.out.println("No.of prime numbers");
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[i]);
			}		
		} 
		System.out.println();
	}
}
