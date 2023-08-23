package Arrays;

import java.util.Scanner;

public class Increment {

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements you want in array:");
		int num=Sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter all the elements:");
		for(int i=0;i<num;i++)
		{
			a[i]=Sc.nextInt();	
		}
		System.out.println("Elements of array after increment by 1:");
		for (int i=1;i<num;i++) 
		{
		System.out.print(a[i] + ",");
		}
		System.out.println();
	}

}
