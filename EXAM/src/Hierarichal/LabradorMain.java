package Hierarichal;
class Animal
{
	void eat()
	{
		System.out.println("Grass");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class Labrador extends Dog
{
 void displaycolor()
 {
System.out.println("Labrador dog color is black");
 }
}
public class LabradorMain {

	public static void main(String[] args) 
	{
		Labrador c=new Labrador();
		c.eat();
		c.bark();
		c.displaycolor();

	}

}
