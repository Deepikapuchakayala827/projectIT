package ExceptionHandling;
//nested try catch block//
public class Exception2 
{
	public void method()
	{
		System.out.println("Inside method");
		try
		{
			System.out.println("outer try block");
			int arr[]= {1,2,3,4};
			System.out.println(arr[2]);
			try
			{
				System.out.println("Inside inner try block");
				int a=1/0;
				catch()
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
