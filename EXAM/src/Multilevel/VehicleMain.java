package Multilevel;
class Vehicle
{
	void start()
	{
		System.out.println("start the vehicle");
	}
}
class car extends Vehicle
{
	void drive()
	{
		System.out.println("drive the car");
	}
}
class sportscar extends car
{
	void accelerate()
	{
		System.out.println("accelerate the sportscar");
	}
}
public class VehicleMain {

	public static void main(String[] args) 
	{
		sportscar c=new sportscar();
		c.start();
		c.drive();
		c.accelerate();

	}

}
