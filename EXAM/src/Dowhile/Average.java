package Dowhile;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
Scanner Sc=new Scanner(System.in);
int sum=0;
int count=0;
int num=0;
do
{
	System.out.println("enter the number:");
	num=Sc.nextInt();
	if(num!=0)
	{
		double average=(double)sum/count;
		sum+=num;
		count++;
		System.out.println("Average of entered numbers: " + average);
	}
}
while(num!=0);

	}

}
