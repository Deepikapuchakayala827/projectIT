package Strings;

public class Findinglength 
{
	public static void main(String[] args)
	{
		String s="Deepika Puchakayala";
		char ch[]=s.toCharArray();
		int count=0;
		for(int i:ch) 
		{
			count++; 
		}
		System.out.println("length of string is"+count);
	}
}
