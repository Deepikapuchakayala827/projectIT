package TwoConstructors;

import java.util.*;

public class Largest {

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number:");
			int num=Sc.nextInt();
			int sum=0;double average;
			for(int i=0;i<=num;i++)
			{
				sum+=num;
			}
			double average1=(double)sum/num;
	System.out.println("The avg number entered is:"+average1);

	}

}
