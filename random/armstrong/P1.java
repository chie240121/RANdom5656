package armstrong;
public class P1 {
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
public static void main(String[] args) {
	int c  = countDigit(1234);
	System.out.println(c);
}
}
