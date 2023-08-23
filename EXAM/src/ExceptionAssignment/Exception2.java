package ExceptionAssignment;

import java.nio.file.AccessDeniedException;

public class Exception2
{
	 public void checkAge(int age) throws AccessDeniedException 
	 {
		 public void show();
		int age1=20;
        if (age1<18)
        {
            throw new Exception("Access denied");
        }
        else
        {
            System.out.println("Access granted");
        }
		
	}
	public static void main(String[] args) 
	{
		Exception2 m=new Exception2();
		try {
            m.show();
        } catch (AccessDeniedException e)
		{
           System.out.println(e.getMessage());
        }

		
	}

}
