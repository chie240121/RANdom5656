import java.util.Scanner;
class AdharCard1
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
		System.out.println("you want another card info.");
		String yes = sc.nextLine();
		if(yes.equals("yes"))
		{
		
		System.out.println("enter name");
		String name1 = sc.nextLine();
		System.out.println("enter date of birth");
		String DOB1 = sc.nextLine();
		System.out.println("enter gender");
		String gender1 = sc.nextLine();
		System.out.println("enter adhar card number");
		String num1 = sc.nextLine();	
		System.out.println("aam aadmi ka adhikaar");
		}
		else
		{
		
		System.out.println(" okie leave now get lost");
		}
}
}