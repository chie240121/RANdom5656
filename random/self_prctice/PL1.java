package self_prctice;
//print palindrome numbers between two intervals by user input
import java.util.*;
public class PL1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int first = sc.nextInt();
		System.out.println("enter the last number");
		int last = sc.nextInt();
		for (first= first; first<= last ; first++) {
			int rev=0;
			int temp=first;
			while(temp>0) {
				int rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(first==rev) {
				System.out.println(first);
			}
			
		}
	}

}
