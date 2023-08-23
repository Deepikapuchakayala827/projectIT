package Multilevel;
class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
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
		void displayColor()
		{
			System.out.println("labrader colour is brown");
		}
	}

public class AnimalMain {

	public static void main(String[] args) {
		Labrador l=new Labrador();
		l.eat();
		l.bark();
		l.displayColor();
	}

}
