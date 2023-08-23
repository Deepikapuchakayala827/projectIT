package Arrays;

public class Matrix2 {

	public static void main(String[] args)
	{
		int rows=3;
		int columns=3;
		int a[][]=new int[rows][columns];
		int num=2;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			a[i][j]=num;
			num++;
			}
		}
		System.out.println("matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			
		}

	}

}
