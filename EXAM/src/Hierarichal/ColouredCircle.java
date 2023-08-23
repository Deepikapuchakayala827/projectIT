package Hierarichal;
class Shape
{
	void draw()
	{
		System.out.println("Triangle");
	}
}
class circle extends Shape
{
	void drawCircle()
	{
		System.out.println("sphere");
	}
}
class colourcircle extends circle
{
	void setColor()
	{
		System.out.println("Blue");
	}
}
public class ColouredCircle {

	public static void main(String[] args) {
		colourcircle c=new colourcircle();
		c.draw();
		c.drawCircle();
		c.setColor();
	}

}
