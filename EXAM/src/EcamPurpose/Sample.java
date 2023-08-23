package EcamPurpose;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args)
	{
		
		int temp=0;
      int a[]=new int[] {1,4,9,8};
     for(int i=0;i<a.length;i++)
     {
    	 for(int j=i+1;j<a.length;j++)
    	 {
    		 if(a[i]<a[j])
    		 {
    			 temp=a[i];
    			 a[i]=a[j];
    			 temp=a[j];
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
     
    	

