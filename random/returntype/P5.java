package returntype;
import java.util.Scanner;
public class P5 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the age of shayam");
	int a = sc.nextInt();
	System.out.println("enter the age of ram");
	int b = sc.nextInt();
	System.out.println("enter the age of sita");
	int c = sc.nextInt();
	int class_9 = shayam(a);
	int class_12 = ram(b);
	int class_11 = sita(c);
	int gap = (class_9 - class_12);
	int sum = (gap + class_11);
	System.out.println("the dffere of ram and sham age is:" + gap);
	System.out.println("the sum of sita age and difference of the ram and shayam age is:"+ sum);
	
}
public static int shayam(int age)
{
	return age;
}
public static int ram(int age)
{
	return age;
}
public static int sita(int age)
{
	return age;
}
}
