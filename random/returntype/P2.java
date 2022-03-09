package returntype;
import java.util.Scanner;
public class P2 {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number to add");
	int a = sc.nextInt();
	int b = sc.nextInt();
	sum(a,b);
	System.out.println("enter the number to mul");
	int x = sc.nextInt();
	int y = sc.nextInt();
	mul(x,y);
	System.out.println("enter the number to div");
	int p = sc.nextInt();
	int q = sc.nextInt();
	div(p,q);
	System.out.println("enter the number to sub");
	int r = sc.nextInt();
	int s = sc.nextInt();
	sub(r,s);
	System.out.println(sum(a,b)   + "    " +  mul(x,y) + "  "+ div(p,q) + "  " + sub(r,s) );
}
public static int sum(int a , int b)
{
	return a+b;
}
public static int mul(int x , int y)
{
	return x*y;
}
public static int div(int p , int q)
{
	return p/q;
}
public static int sub(int r , int s)
{
	return r-s;
}
}
