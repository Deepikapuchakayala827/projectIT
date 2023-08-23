package Todayclass;
//it is mandatory  in checked exception//
public class ThrowException
{
	public void show()
	{
		int age=20;
		if(age<22)
		{
			throw new ArithmeticException("Age will be greater than 20");
		}
	}

	public static void main(String[] args) 
	{
		ThrowException t=new ThrowException();
		try
		{
		t.show();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
