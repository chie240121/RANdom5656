package reverse;

public class P5 {
	public static void main(String[] args) {
		int n = 123456;
		int sum = 0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2!=0)
			{
				sum = sum+rem;
			}
			n=n/10;
		}
		System.out.print(sum);
	}
	}


