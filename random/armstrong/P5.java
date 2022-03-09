package armstrong;
public class P5 {
public static int countDigit(int n)
{
	int count = 0;
	while(n>0)
	{
		n=n/10;
		count++;
	}
	return count;
}
public static int power(int b, int e) 
{
	int power = 1;
	while(e>0) {
		power = power*b;
		e--;
	}
	return power;
}
public static void main(String[] args) {
	int a = 2;
	while(a<=50000)
	{
		int n =a;
		int sum=0;
	int c  = countDigit(a);
	
	while(n>0)
	{
		int rem=n%10;
		sum=sum+power(rem, c);
		n=n/10;
	}
	if(a==sum)
		System.out.println(a);
		a++;
}
}
}
