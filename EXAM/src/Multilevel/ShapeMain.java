package Multilevel;
class Shape
{
	void draw()
	{
		System.out.println("Draw the shape");
	}
}
class Circle extends Shape
{
	void drawcircle()
	{
		System.out.println("Draw the  shape circle");
	}
}
class coloredcircle extends Circle
{
	void setColor()
	{
		System.out.println("circle colour blue");
	}
}
public class ShapeMain {

	public static void main(String[] args)
	{	
		coloredcircle d=new coloredcircle();
		d.draw();
		d.drawcircle();
		d.setColor();
	}

}
