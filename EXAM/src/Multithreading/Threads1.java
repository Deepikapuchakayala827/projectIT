package Multithreading;

public class Threads1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		Threads1 t=new Threads1();
		Thread c=new Thread(t);
		c.start();

	}

}
