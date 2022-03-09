package self_prctice;

import java.util.Iterator;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		System.out.println("enter the 1st  number");
		int n = sc.nextInt();
		System.out.println("enter the 2nd number");
		int m = sc.nextInt();
		
		for ( int i = n; i <=m; i++)
		{
			int count = 0;
			for (int j = 2; j <=i/2; j++) 
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
		}
		}
}
}

