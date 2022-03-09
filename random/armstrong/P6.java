package armstrong;
//print armstrong number by taking user input between two intervals
import java.util.*;
public class P6 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the first number");
	int i = sc.nextInt();
	System.out.println("enter the second number");
	int j=sc.nextInt();
	for(i=i;i<=j;i++) {
		int temp=i;
		int sum=0;
		int count_of_digits= count(i);
		while(temp>0) {
			int rem=temp%10;
			sum=sum+power(rem,count_of_digits);
			temp=temp/10;
		}
		if(i==sum)
			System.out.println(i);
	}
}

public static int power(int base, int expo) {
	int power=1;
	while(expo>0) {
		power=power*base;
		expo--;
	}
	return power;
}

public static int count(int count_of_digit_of_number) {
	int count = 0;
	while(count_of_digit_of_number>0) {
		count_of_digit_of_number=count_of_digit_of_number/10;
		count++;
	}
	return count;
}
}
