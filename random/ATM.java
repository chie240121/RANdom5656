import java.util.Scanner;
class ATM
{
	public static void main(String[] args)
	{
	int balance = 100000, withdraw, deposit; 
	System.out.println("~~~ATM~~~");
	System.out.println("choose 1. to withdraw");
	System.out.println("choose 2. to deposit");
	System.out.println("choose 3. to check balance");
	System.out.println("choose 4. exit");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the operation you would like to operate:");
	   int n =sc.nextInt();
	
	switch(n)
	{
	case 1:
	
		System.out.println("enter the amount to be withdrawn");
		int withdrawn = sc.nextInt();
	if(balance>=withdrawn)
	{
	balance = balance-withdrawn;
		System.out.println("collect your money !!!");
		System.out.println("your remaining balance is:" +balance);
	}
	else
	{
		System.out.println("insufficient balance :( " );
	}
		break;
	case 2:
		System.out.println("enter the amount to deposit");
		 deposit = sc.nextInt();
		balance = deposit + balance;
		System.out.println("amount has been successfully deposit");
		System.out.println("your updated balance is:" +balance);
		break;
	case 3:
		System.out.println("balance:" + balance);
		break;
	case 4:
		System.out.println("EXit");
	default:
		System.out.println("HAVE A NICE DAY");
}	
}
}