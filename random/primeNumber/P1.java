package primeNumber;

public class P1 {

	public static void main(String[] args) {
		int n = 7;
		int count = 0;
		for (int i = 2; i <=n/2; i++) {
			if(n%i==0) {
				count++;
			}
		}
if(count==0) {
	System.out.println(n + " is prime");
}
else
{
	System.out.println(n + " not prime");
}
	}

}
