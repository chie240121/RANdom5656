package perfect_number;
public class P2 {
public static void main(String[] args) {
	int k = 27;
	int sum = 0;
	for (int i = 1; i<=k/2; i++)
	{
	if(k%i==0)	
		sum=sum+i;
	}
	if(sum==k)
	{
		System.out.println(k + " this is a perfect number");
	}
	else
	{
		System.out.println( k + " this is not a perfect number");
	}
	}
}

