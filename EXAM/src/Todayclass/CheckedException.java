package Todayclass;
//checked Exception//
import java.io.IOException;

public class CheckedException
{
	public void show()throws IOException
	{
		System.out.println("Inside method");
		int a=1/0;
	}
	public static void main(String[] args) 
	{
		CheckedException c=new CheckedException();
		try
		{
		c.show();
		}
		catch(Exception e)
		{
		 e.printStackTrace();
		}
		

	}

}
