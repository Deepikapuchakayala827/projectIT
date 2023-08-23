package Singleinheritence;
class Shape
{
	void draw()
	{
		System.out.println("Draw the shape");	}
}

class circle extends Shape
{
	void drawcircle()
	{
		System.out.println("Draw the circle");
	}
}
public class DrawCircleMain {

	public static void main(String[] args)
	{
circle c=new circle();
c.draw();
c.drawcircle();

	}

}
