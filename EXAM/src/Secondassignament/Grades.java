package Secondassignament;

import java.util.*;

public class Grades {

	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the hardness value:");
		int hardness=Sc.nextInt();
		System.out.println("enter the carbon content  value:");
		double carbonContent=Sc.nextDouble();
		System.out.println("enter the tensileStrength value:");
		int TensileStrength=Sc.nextInt();
		int grade;
			if((hardness>50)&&(carbonContent<0.7)&&(TensileStrength>5600))
			{
				grade=10;
			}
			else if((hardness>50)&&(carbonContent<0.7))
			{
				grade=9;
			}
			else if((carbonContent<0.7)&&(TensileStrength>5600))
			{
				grade=8;
			}
			else if((hardness>50)&&(TensileStrength>5600))
			{
				grade=7;
			}
			else if((hardness>50)||(carbonContent<0.7)||(TensileStrength>5600))
			{
				grade=6;
			}
			else {
				grade=5; }
			System.out.println("The grade of the steel in:"+grade);
		}
	}


