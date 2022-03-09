package returntype;
public class P1 {
public static void main(String[] args) {
	 sum();
	mul();
	System.out.println("here is the result");
	System.out.println("sum of x + and y is:"  + sum() +  "multiplication of x and y is:" + mul() );
}
public static int sum()
{
	int x = 20 , y = 30;
	return x+y;
}
public static int mul()
{
int x = 13 , y = 2;
return x*y;
}
}
