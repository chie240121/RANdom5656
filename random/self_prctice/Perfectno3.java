package self_prctice;
// print the perfect numbers between two intervals
import java.util.*;
public class Perfectno3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int first_numb = sc.nextInt();
		System.out.println("enter the last number");
		int last_numb=sc.nextInt();
		for (first_numb=first_numb; first_numb<=last_numb; first_numb++) {
			int sum=0;
			for (int k = 1; k<=first_numb/2; k++) {
				if(first_numb%k==0)
			sum=sum+k;
			}
			if(sum==first_numb)
				System.out.print(first_numb + ",");
			}
		}
	}


