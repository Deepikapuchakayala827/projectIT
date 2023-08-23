package Arrays;

public class MatrixArray {

	public static void main(String[] args) 
	{
		int a[]={7,1,2,3,4,5,6,7,8,9};
		int m=2;
		int n=5;
		int count=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[count++]+" ");
			}
		}
		System.out.println();

	}


}


