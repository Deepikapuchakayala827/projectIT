package Arrays;

public class Twodimensional {

	public static void main(String[] args)
	{
		int a[][]=new int[3][3];
		int count=0;
		for(int i=0;i<3;i++)//0;0<3
		{
			for(int j=0;j<3;j++)//0<3
			{
				a[i][j]=count;//[0][0]=0
				count=count+1;
			}
		}
		for(int k=0;k<3;k++)
		{
			 for(int l=0;l<3;l++)
			{
				System.out.print(a[k][l]+"  ");
			}
			System.out.println();
		}
	}
}
