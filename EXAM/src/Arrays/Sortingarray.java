package Arrays;

public class Sortingarray {

	// Descending order//

	public static void main(String[] args)
	{
		int a[]=new int[]{6,8,9,7,4,3,2,1,5};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
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
			System.out.println(a[k]+" ");
		}
		System.out.println("The highest numebr is:"+a[a.length-1]);
		System.out.println("The lowest value is:"+a[a.length-9]);
	}
}


