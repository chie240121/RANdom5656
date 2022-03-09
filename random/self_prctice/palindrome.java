package self_prctice;
// wajp by taking user i/p n tell the given number is palindrome or not
import java.util.*;
public class palindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int i = sc.nextInt();
	int rev = 0;
	int temp=i;
	while(i>0) {
		
		int rem=i%10;
		rev=rev*10+rem;
		i=i/10;
	}
	
	if(temp==rev)
	{
		System.out.println("the number : " + temp + " is palindrome number");
	}
	else
	{
		System.out.println("the number : " + temp + " is not palindrome number");	
	}
}
}
