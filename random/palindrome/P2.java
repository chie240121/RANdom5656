package palindrome;
import java.util.*;
public class P2 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int a = sc.nextInt();
	int temp=a;
	int rev=0;
	while(a>0)
	{
		int rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		
	}
	if(temp==rev)
	{
		System.out.println("the no. is palindrome");
	}
	else {
		System.out.println("the no. is not palindrome");
	}
}
}
