package Todayclass;

        //checked Exception it is mandatory in try catch exception handling in calling position//

public class ThrowsEx
{
	public void show()throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int arr[]= {1,2,3,4};
		System.out.println(arr[4]);
		int a=1/0;
		System.out.println("Inside method");
		
	}
	public static void main(String[] args) {
		ThrowsEx e=new ThrowsEx();
		try
		{
			e.show();
		}
		catch(Exception m)
		{
			m.printStackTrace();
		}
	}
}
