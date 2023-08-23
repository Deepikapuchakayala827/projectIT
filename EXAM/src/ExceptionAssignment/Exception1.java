package ExceptionAssignment;

public class Exception1
{
	public void show()
	{
	try
	{
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[6]);
	}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e.getMessage());
}
	}
	public static void main(String[] args) 
	{
		Exception1 m=new Exception1();
		m.show();
	}

}
