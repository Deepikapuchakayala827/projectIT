package ExceptionHandling;

public class Exception
{
	public void method()
	{
		System.out.println("Inside method");
		int a=1/0;
		System.out.println("outside try-catch-finally block");
	}
	public static void main(String[] args)
	{
		Exception obj=new Exception();
		try
		{
			obj.method();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
		}

		finally
		{
			System.out.println("Finally block");
		}	
	}

}
