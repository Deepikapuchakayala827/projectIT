package Constructors;

import java.lang.reflect.Constructor;

public class Consructorexample1 {
	
		int employeeid;
		static String employeename;
		Consructorexample1(int employeeid,String employeename)
		{
			this.employeeid=employeeid;
			this.employeename=employeename;
		}
		 public void display()
		{
			System.out.println("the id is"+employeeid);
			System.out.println("The name is "+employeename);
		}


	public static void main(String[] args) 
	{
		Consructorexample1 c1 =new Consructorexample1(101,"ABC");
		Consructorexample1 c2=new Consructorexample1(102,"XYZ");
		c1.display();
		c2.display();
		

	}

}

