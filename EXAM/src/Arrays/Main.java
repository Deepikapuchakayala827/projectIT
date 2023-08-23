package Arrays;

public class Main {

	public static void main(String[] args)
	{
		{
			int[] arr={2,4,5,3,2,6,9,1};
			for(int i=0;i<arr.length;i++)
			{
				int count=0;int count1=0;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						count+=arr[j];
					}
					if(arr[i]<arr[j])
					{
						count1+=arr[j];
					}
				}
				System.out.print(count*count1+" ");
			}
		}
	}
}



