package Arrays;

public class Duplicatelements {

	public static void main(String[] args) 

	{
		int a[]={1,2,3,2,1,34,5,6,3,4,2,1};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{

					System.out.println("The duplicate number is:"+a[i]);
				}
			}
		}
	}

}
