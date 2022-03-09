package returntype;
import java.util.Scanner;
public class P3 {
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			System.out.print("enter the numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			cal(a);
			cal1(b);
			System.out.println("sum is" + (a+b) + "div is" + (a/b) + "sub is" + (a-b) + "mul is" + (a*b));
			}
	
	public static int cal(int a)
	{
		
		return a;
	}
	public static int cal1(int b)
	{
		
		return b;
	}
}
