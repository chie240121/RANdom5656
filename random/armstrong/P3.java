package armstrong;
//to chech the number is armstrong or not 
import java.util.*;
public class P3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n  = sc.nextInt();
	int arm=0,c;
	c=n;
	while(n>0)
	{
		int rem=n%10;
		arm=(rem*rem*rem*rem)+arm;
		n=n/10;
	}
	if(c==arm)
	{
		System.out.println("number is armstrong number");
	}
	else
	{
		System.out.println("number is not armstrong number");
	}
}
}
