package ExceptionHandling;

public class Exception1
{
	public void method()
	{
		System.out.println("Inside block");
		int arr[]= {1,2,3,4};
		System.out.println(arr[2]);
		int a=1/0;
		System.out.println("try-catch-finally");
	}
	public static void main(String[] args) {
		Exception1 c=new Exception1();
		try
		{
			c.method();
		}
		catch(ArrayIndexOutOfBoundsException e)                                      
		{
			System.out.println("Catch block");	
		}
		finally

		{
			System.out.println("finally block");
		}
	}
}
