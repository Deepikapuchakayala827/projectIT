package Assignament;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();	
		switch(num)
		{
		case 1:
			for(int i=1;i<=10;i++)
			{
				System.out.println(num+"x"+i+"="+(num*i));	
			}
			break;
		case 2:
			for(int i=1;i<=10;i++) {
				System.out.println(num+"x"+i+"="+(num*i));
			}
			break;
		case 3:
			for(int i=1;i<=10;i++)
			{
				System.out.println(num+"x"+i+"="+(num*i));
			}
			break;
			default:
				System.out.println("invalid");
				break;
		}
	}
}
		