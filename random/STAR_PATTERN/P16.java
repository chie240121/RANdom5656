package STAR_PATTERN;
// A B C
//D E F H
//I L N O T
//P X Z
public class P16 {
public static void main(String[] args) {
	int n = 5;
	for(int i = 0;i<=n-1;i++)
	{
		for (int j = 0;j<=n-1;j++)
		{
			if(i==0 || j==0 || i==n-1 )
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
