package Todayclass;
//It will print two methods//
//if we write calling  position then its comes from one method//
public class throwsException
{
	public void show()
	{
		System.out.println("inside show method");
		try
		{
			int a=1/0;
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("show method");
		try
		{
			int arr[]= {1,2,3,4};
			System.out.println(arr[6]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
			public static void main(String[] args) 
			{
				throwsException e=new throwsException();
				e.show();

			}

		}
