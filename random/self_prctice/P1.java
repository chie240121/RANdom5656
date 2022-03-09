package self_prctice;
//check whether the number is palindrome or not by user input
import java.util.*;
public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number you wan to check");
		int number = sc.nextInt();
		int temp=number;
		int rev=0;
		while(temp>0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(number==rev) {
			System.out.println(number + ": is palindrome");
		}
		else {
			System.out.println(number + ": is not palindrome number");
		}
	}

}
