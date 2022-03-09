package reverse;
public class P2 {
public static void main(String[] args) {
	int i = 45678;
	while(i>0)
	{
		int rem =i%10;
		if(rem%2==0)
		{
			System.out.print(rem);
		}
		i= i/10;
	}
}
}
