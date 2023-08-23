package Constructors1;

public class Car
{
String name;
Car()
{
	this.name ="ford";
}
public void getbrand()

{
	System.out.println("brand:"+name);
}
	public static void main(String[] args)
	{
		Car c=new Car();
		c.getbrand();

	}

}
