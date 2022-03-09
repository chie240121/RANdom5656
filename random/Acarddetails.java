import java.util.Scanner;
class Acarddetails
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("``````ADHAR CARD DETAILA ``````");
		System.out.println("Do u what to enter details");
		String details = sc.nextLine();
	while(details.equals("yes"))	
{
			System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter date of birth");
		String DOB = sc.nextLine();
		System.out.println("enter gender");
		String gender = sc.nextLine();
		System.out.println("enter adhar card number");
		String num = sc.nextLine();
		System.out.println("aam aadmi ka adhikaar");  
		System.out.println("Do u what to enter details of another card??");
		String yes = sc.nextLine();
		details=yes;

}
		System.out.println("its ok");
}
}