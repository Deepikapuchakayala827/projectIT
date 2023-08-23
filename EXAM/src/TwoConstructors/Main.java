package TwoConstructors;

public class Main {
	int number;
	  String language;
	Main()
	{
		 number=122;
		language="java";		
	}
	Main(int id,String elanguage)
	{
		number=id;
		language =elanguage;
	}
	public void display()
	{
		System.out.println("numbers are"+number);
		System.out.println("languages are"+language);
	}
	public static void main(String[] args)
	{
		Main e1=new Main();
		Main e2=new Main(100,"python");
		e1.display();
		e2.display();
	}

}
