package Constructors1;

public class Circle
{
	double Area;
	double radius;
	Circle()
	{
		this.radius=1;
	}	
	Circle (int radius)
	{
		this.radius=radius;
	}
	 void getArea(double radius)
	{
		 
		Area=3.14*radius*radius;
		System.out.println("circle:" +radius+ " Area: " +Area);
	}
	public static void main(String[] args) 
	{
		Circle c1=new Circle();
		Circle c2=new Circle();
		Circle c3=new Circle();
		c1.getArea(2.0);
		c2.getArea(12);
		c3.getArea(24);   
	}

}
