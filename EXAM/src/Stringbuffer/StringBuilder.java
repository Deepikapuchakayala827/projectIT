package Stringbuffer;

public class StringBuilder {

	public static void main(String[] args)
	{
		StringBuilder t=new StringBuilder();
		String s=t.toString();
		System.out.println("String value is :"+s);
		StringBuffer obj=new StringBuffer(s);
		System.out.println(obj);

	}

}
