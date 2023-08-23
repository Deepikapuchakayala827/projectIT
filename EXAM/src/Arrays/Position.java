package Arrays;

import java.util.Scanner;

public class Position {

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter no.of elements you want in array:");
		int num=Sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter all the elements");
		for(int i=0;i<num;i++)
		{
			a[i]=Sc.nextInt();
		}
		System.out.println("Enter the element you want to find:");
		int key=Sc.nextInt();
	
		if(key!=-1)
		{
			System.out.println("Element found at position:"+(key-1));
        }
		else 
        {
            System.out.println("Element no found in the array.");
        }

        System.out.println();

		}
		
	}

