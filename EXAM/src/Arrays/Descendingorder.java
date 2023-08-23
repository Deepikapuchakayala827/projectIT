package Arrays;

public class Descendingorder {

	public static void main(String[] args)
	{
		int a[]=new int[]{7,2,3,1,9,8,10};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
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

	}

}
