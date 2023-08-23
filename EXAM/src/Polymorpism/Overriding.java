package Polymorpism;

class bank
{
	public void documentation()
	{
		System.out.println(" Adhar,payslips,address proof");
	}
	public float rate_of_interest()
	{
		return 1.0f;	
	}
	public float rate_of_interest1()
	{
		return 2.0f;
	}
	public float rate_of_interest2()
	{
		return 3.0f;
	}
}
public class Overriding
{
	public static void main(String[] args)
	{
		bank b=new bank();
		float a=b.rate_of_interest1();
		b.documentation();
		

	}

}
