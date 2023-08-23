package Strings;

public class Extraspaces {
	public static void main(String[] args) 
	{
		String s="My  Name  isJAVA";
		String s1=s.replace("","");
		String s2=s1.replace("","");
		String s3=s2.replace("isJAVA","is Java");
		System.out.println(s3);		
	}
}
