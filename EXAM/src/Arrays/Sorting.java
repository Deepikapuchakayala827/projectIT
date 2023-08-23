package Arrays;

public class Sorting {
	
	           ///Bubble sort///Ascending order///

	public static void main(String[] args)
	{
		int a[]=new int[] {3,5,6,7,8,9,4,2,1};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The values are:");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}

	}

}
