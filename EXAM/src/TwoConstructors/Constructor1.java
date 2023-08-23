package TwoConstructors;
//overloading constructor//
public class Constructor1 
{
	int employeid;
	String name;
	Constructor1()  //no args constructor
	{
	employeid=10;
	name="deepu";
	}
	Constructor1(int id,String ename)//parameterized constructors
	{
		employeid=id;
		name=ename;
	}
	public void display()
	{
		System.out.println("the empid is" + employeid);
		System.out.println("the name is " + name);			
	}

	public static void main(String[] args) 
	{
		Constructor1 c1= new Constructor1();
		c1.display();
		Constructor1 c2= new Constructor1(110,"abcd");
		c2.display();
		
	}

}
