package STAR_PATTERN;
//* * * * 
public class P15 {
public static void main(String[] args) {
	int n = 5;
	for(int i = 0;i<=n-1;i++)
	{
		for (int j = 0;j<=n-1;j++)
		{
			if(i==2) // or (j==n/2)
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println(" ");
	}
}
}