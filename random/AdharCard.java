import java.util.Scanner;   
class AdharCard
{
	public static void main(String[] args)
	{
		System.out.println("``````ADHAR CARD DETAILA ``````");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter date of birth");
		String DOB = sc.nextLine();
		System.out.println("enter gender");
		String gender = sc.nextLine();
		System.out.println("enter adhar card number");
		String num = sc.nextLine();
		System.out.println("aam aadmi ka adhikaar");  
		aCard(name, DOB, gender, num);
		System.out.println("enter the details of other person");
		System.out.println("enter name");
		String name1 = sc.nextLine();
		System.out.println("enter date of birth");
		String DOB1 = sc.nextLine();
		System.out.println("enter gender");
		String gender1 = sc.nextLine();
		System.out.println("enter adhar card number");
		String num1 = sc.nextLine();
		System.out.println("aam aadmi ka adhikaar");  
		aCard1(name1, DOB1, gender1, num1);
	}

	public static void aCard(String name, String DOB, String gender, String num)
	{
	System.out.println(name + ""+ DOB + " "+ gender + "  "+ num);
	System.out.println("==============================");
	}
	public static void aCard1(String name1, String DOB1, String gender1, String num1)
	{
	System.out.println(name1 + ""+ DOB1 + " "+ gender1 + "  "+ num1);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
	
		