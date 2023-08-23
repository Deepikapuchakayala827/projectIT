package StringsAssignament;

public class Helloworld {

	public static void main(String[] args) 
	{
		String s2="Hello,world";
		char ch[]=s2.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='o'|| ch[i]==',')
			{
				System.out.print(i+" ");
			}


	}
	}
}


