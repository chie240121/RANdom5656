package palindrome;
import java.util.*;
public class P4 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the number to check ");
	int n =sc.nextInt();
	int temp=n;
	int rev=0;
	while(n>0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(temp==rev) {
		System.out.println("number is palindrome : " + temp);
	}
	else
	{
		System.out.println("not palindrome : " + temp);
	}
}
}
