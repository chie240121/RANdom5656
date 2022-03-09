package armstrong;
//check whether the number is armstrong or not by user input
import java.util.*;
public class P7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be check");
		int number = sc.nextInt();
		int sum=0;
		int temp=number;
		int count_of_number=count(number);
		while(temp>0) {
			int rem=temp%10;
			sum=sum+power(rem,count_of_number);
			temp=temp/10;
		}
		if(number==sum)
		{
			System.out.println(number + ": is armstrong number");
		}
		else
		{
			System.out.println(number + " : is not armstrong number");
		}
	}
	public static int power(int base, int expo) {
		int mul=1;
		while(expo>0) {
			mul=mul*base;
			expo--;
		}
		return mul;
	}
	private static int count(int count_of_the_digits) {
		int count=0;
		while(count_of_the_digits>0) {
			count_of_the_digits=count_of_the_digits/10;
			count++;
		}
		return count;
	}

}
