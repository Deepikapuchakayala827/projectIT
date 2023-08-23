package Multithreading;

public class Threads extends Thread
{
			public void run()
		{
			for(int i=0;i<8;i++)
			{
				System.out.println(i);
			}
		}
	

	public static void main(String[] args)
	{
		Threads v=new Threads();
		//v.run();
		v.start();
	}

	}
	
