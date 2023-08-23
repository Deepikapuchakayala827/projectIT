package Singleinheritence;
class MathUtility 
{
	public static int square(int num)
	 {
		return num*num;
	 }
}
class calculator extends MathUtility
{
	public static int cube(int num)
	{
		int result=square(num);
		return result*num;
	}
}
public class MathMain {

	public static void main(String[] args) 
	{
		
		

	}

}
