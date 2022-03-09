package reverse;
public class P1 {
public static void main(String[] args) {
	int x = 45678;
	while(x>0)
	{
		int rem=x%10;
		System.out.print(rem);
		x=x/10;
	}
}
}
