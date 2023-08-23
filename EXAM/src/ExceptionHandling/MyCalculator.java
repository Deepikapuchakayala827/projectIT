package ExceptionHandling;

import java.util.Scanner;

public class MyCalculator
{
	long power(int n,int p)throws Exception
	{
        if (n<0||p<0)
        {
           throw new Exception("n or p should not be negative");
        } 
        else if(n==0&&p==0)
        {
          throw new Exception("n and p should not be zero");
        } 
        else 
        {
          throw new Exception("it should be wrong");
        }
    }
	public static void main(String[] args)
	{
		MyCalculator c = new MyCalculator();
        try {
            long result=c.power(n,p);
            System.out.println(result);
        } 
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
		

	}


