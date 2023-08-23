package Hierarichal;
class person
{
  int id;
  String name;
  int age;
  public void person(int id,String name,int age)
  {
	  this.id=id;
	  this.name=name;
	  this.age=age;
  }
  public void displayInfo()
  {
	  System.out.println("id:"+id);
	  System.out.println("age:"+age);
	  System.out.println("name:"+name);
  } 
}
class Employee extends person
{
	String name;
	double salary;
	public void Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;	
	}
	public void displaySalary()
	{
		System.out.println("Employee name:"+name);
		System.out.println("Employee salary:"+salary);
	}	
}
class manager extends Employee
{
	String name;
	String department;
	double salary;
	public void manager(String name,String department,double salary)
	{
		this.name=name;
		this.department=department;
		this.salary=salary;	
	}
	public void displayDepartment()
	{
		System.out.println("Mnager name:"+name);
		System.out.println("Manager department:"+department);
		System.out.println("Manager salary:"+salary);
	}
}
public class Person1 {

	public static void main(String[] args) {
		person p=new person();
		p.person(101,"jensoft",22);
		p.displayInfo();
		Employee e=new Employee();
		e.Employee("Deepu",25000);
		e.displaySalary();
		manager m=new manager();
		m.manager("jensoft", "java", 50000);
		m.displayDepartment();
		
		
	}

}
