package Arrays;

import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int num=Sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter the elements:");
		for(int i=0;i<num;i++)
		{
			a[i]=Sc.nextInt();
		}
		System.out.println("After reversing elements");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}

}
