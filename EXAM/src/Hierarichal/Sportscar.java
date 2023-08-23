package Hierarichal;
class Vehicle
{
	void start()
	{
		System.out.println("Start the vehicle");
	}
}
class car extends Vehicle
{
	void drive()
	{
		System.out.println("Drive the car");
	}
}
class sportsbike extends car
{
	void accelerate()
	{
		System.out.println("Accelerate the car");
	}
}

public class Sportscar {

	public static void main(String[] args) {
		sportsbike s=new sportsbike();
		s.start();
		s.drive();
		s.accelerate();
	}

}
