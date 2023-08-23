package Arrays;

public class Nthlargest {

	public static void main(String[] args)
	{
		int a[]=new int[]{2,7,8,6,5,0,1,4};
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
			System.out.println(a[k]+" ");
		}
		System.out.println("The highest numebr is:"+a[a.length-1]);

	}

}
