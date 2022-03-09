package STAR_PATTERN;
public class K5
{
	public static void main(String[] args) 
	{
		for (int i = 0; i<=11; i++) 
		{
			for (int j = 0; j <=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i = 0; i<=11; i++)
		{
			for (int j = 11; j >=i; j--) 
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}