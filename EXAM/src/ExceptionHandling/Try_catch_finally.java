package ExceptionHandling;

public class Try_catch_finally
{
	public void show()
	{
		System.out.println("Inside method");
		try
		{
			System.out.println("Inside try block");
		int i=1/0;
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("one will not divide by zero");
		}
		finally
		{
			System.out.println("inside finally block");
		}
		System.out.println("outside the block");
	}
	public static void main(String[] args)
	{
		Try_catch_finally t=new Try_catch_finally();
		t.show();
	}
}