package Assignament;
import java.util.*;
public class Fibanocciseries {

	public static void main(String[] args) {
		int n=7;
		int f=0;int s=1;int t;
		for(int i=1;i<=n;i++)
		{
			t=f+s;;
			System.out.println(""+t);
			f=s;
			s=t;
		}

	}
}
