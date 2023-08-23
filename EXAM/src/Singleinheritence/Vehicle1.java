package Singleinheritence;
class Vehicle1 
{
	String type="Vehicle";
	public void displaytype()
	{
		System.out.println("Type:"+type);
	}
}
class Car extends Vehicle1
	{
		String type="Car";
		public void displayCarType() 
		{
			System.out.println("Type:"+type);
		}
	
	public class VehicleMain 
	{
		public static void main(String[] args) {
			Car c = new Car();
			c.displaytype(); 
			c.displayCarType(); 

		}
	}
	}
	



