package Todayclass;


public class MultipleExceptions 
{
	public void show() throws ClassNotFoundException,ArrayIndexOutOfBoundsException
	{
		Class.forName("A");
		System.out.println("Inside method");
		int arr[]= {1,2,3,4};
		System.out.println(arr[8]);
	}

	public static void main(String[] args) {
		MultipleExceptions m=new MultipleExceptions();
		try {
			m.show();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
