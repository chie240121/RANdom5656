package primeNumber;
import java.util.*;
public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  number");
		int i = sc.nextInt();
int count =0;
for (int j = 2; j <=i/2; j++) {
	if(i%j==0) {
		count++;
	}
}
if(count==0) {
	System.out.println(i + " is prime");
}
else
{
	System.out.println(i + " is not prime");
}
	}

}
