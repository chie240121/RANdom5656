package palindrome;
public class P1 {
public static void main(String[] args) {
	int n =1331;
	int rev=0;
	int temp =n;
	while(n>0)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println(rev);
	if(temp==rev)
	{
		System.out.println("the number is palindrome");
	}
	else
	{
		System.out.println("the number is not palindrome");
	}
}
}
