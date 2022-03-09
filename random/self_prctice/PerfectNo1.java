package self_prctice;
// check whether the given number is perfect number or not by taking user input.
import java.util.*;
public class PerfectNo1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int sum=0;
		for (int i = 1; i<=num/2; i++) 
		{
			  if(num%i==0) 
				sum=sum+i;
		}
			if(sum==num) 
			{
				
				System.out.println(num + " : is perfect number");
			}
		else
		{
			System.out.println(num + ": is not a perfect number");
		}

	}

}
