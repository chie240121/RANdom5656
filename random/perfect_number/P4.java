package perfect_number;
import java.util.*;
public class P4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	System.out.println("the number is a perfect number : " + perfectNo(n));
}

public static boolean perfectNo(int n) {
	int sum = 0;
	for(int i = 1; i<=n/2;i++)
	{
		if(n%i==0)
			sum=sum+i;
	}
	if(sum==n)
	{
		return true;
	}
	else
	{
		return false;
	}

}
}
