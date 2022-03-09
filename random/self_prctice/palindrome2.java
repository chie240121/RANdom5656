package self_prctice;
//palindrom between two intervals
import java.util.*;
public class palindrome2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number");
	int  i = sc.nextInt();
	System.out.println("enter the second number");
	int j = sc.nextInt();
	for ( i = i; i<=j; i++) {
		int rev=0;
		for (int k = i; k >0; k=k/10) {
			int rem=k%10;
			rev=rev*10+rem;
		}
		if(i==rev)
		{
			System.out.println(i);
		}
	}
}
}
