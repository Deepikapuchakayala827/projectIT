package Polymorpism;
                //Static Polymorphism//

public class Methodoverloading1
{
	public void display()
	{
		System.out.println("Inside display method");
	}
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static float add(float a,float b)
	{
		float d=a+b;
		return d;
	}
public static void main(String[]args)
{
	Methodoverloading1 c1=new Methodoverloading1();
	c1.display();
	int c=c1.add(100,20);
	System.out.println("The c value is"+c);
	float d=c1.add(20.0f,30.0f);
	System.out.println("The d value is"+d);
}
}
