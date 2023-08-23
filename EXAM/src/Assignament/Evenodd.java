package Assignament;
import java.util.*;
public class Evenodd {

	public static void main(String[] args) 
	{
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=Sc.nextInt();
	if(num%2==0)
	{
		System.out.println(num + " is even");
	}
	else
	{
		System.out.println(num+" is odd");	
	}

	}

}
