package Constructors1;

public class Student 
{
String name;
Student()
{
	this.name="unknown";
}
Student(String ename)
{
	this.name=ename;
}
public void show()
{
	System.out.println(" The student is "+name);
}
	public static void main(String[] args)
	{
		Student c1=new Student();
		Student c2=new Student("Deepu");
		c1.show();
		c2.show();
	}

}
