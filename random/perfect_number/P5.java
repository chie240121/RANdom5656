package perfect_number;

import java.util.Scanner;

public class P5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		System.out.println("enter the second no.");
		int m = sc.nextInt();
		for (int i = n; i <=m; i++) {
			int sum=0;
			for(int k=1; k<=i/2;k++)
			{
			if(i%k==0)
				sum=sum+k;
	        }
			if(sum==i)
				System.out.print(i + " , " );
		}
	}
}


