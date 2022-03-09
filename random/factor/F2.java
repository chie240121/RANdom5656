package factor;
import java.util.Scanner;
public class F2{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int a = sc.nextInt();
	int fac = 1;
	for(int n =a;n>0;n--)
	{
		fac=fac*n;
	}
	System.out.println(fac);
}
}
