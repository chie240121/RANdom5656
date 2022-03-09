package self_prctice;
//print the palindrome numbers between two intervals
import java.util.*;
public class P2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number of the interval");
		int first_number = sc.nextInt();
		System.out.println("enter the second number of the interval");
		int last_number = sc.nextInt();
		for(first_number=first_number;first_number<=last_number;first_number++) {
			int rev=0;
			int temp= first_number;
		while(temp>0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(first_number==rev) 
			System.out.println(first_number);
		
		}
	}

}
