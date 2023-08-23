package StringsAssignament;

public class Finding {

	public static void main(String[] args) 
	{
		String s="Deepika";
		char ch[]=s.toCharArray();
		int count=0;
		for(int i:ch)
		{
			count++;
		}
		System.out.println("The Length of string"+count);

	}

}
