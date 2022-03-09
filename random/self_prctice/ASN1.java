package self_prctice;
//print armstrong number by taking user input between two intervals
import java.util.*;
public class ASN1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first number of series");
	int first =sc.nextInt();
	System.out.println("enter last number of the series");
	int last = sc.nextInt();
	for (first=first; first<=last; first++) {
		int temp= first;
		int sum=0;
		int numberCount = digitCount(first);
		while(temp>0) {
			int rem=temp%10;
			sum=sum+power(rem,numberCount);
			temp=temp/10;
		}
		if(first==sum)
			System.out.println(first);
	}
	
}

public static int power(int b, int e) {
	int pr=1;
	while(e>0) {
		pr=pr*b;
		e--;
	}
	return pr;
}

public static int digitCount(int number_to_be_digits_counted) {
	int count = 0;
	while(number_to_be_digits_counted>0) {
		number_to_be_digits_counted=number_to_be_digits_counted/10;
		count++;
	}
	return count;
}
}
