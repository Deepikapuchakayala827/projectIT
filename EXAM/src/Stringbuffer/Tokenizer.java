package Stringbuffer;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args)
	{
		StringTokenizer t=new StringTokenizer("my name is Deepika"," z");
		while(t.hasMoreElements())
		{
			System.out.println(t.nextElement());
		}

	}

}
