package Secondassignament;

import java.util.*;

public class Threetires {

	

	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int guess=Sc.nextInt();
		int correct=Sc.nextInt();
		
		if(guess==correct)
		{
			System.out.println("correct,welcome back.");
	
		}
		else
		{
			System.out.println("incorrect,try again.");
		}
		System.out.println("sorry but you have been locked out.");

	}

}

