package STAR_PATTERN;
//D
public class P19 {
	public static void main(String[] args) {
		int n =5;
		for(int i = 0;i<=n-1;i++)
		{
			for(int j =0;j<=n-1;j++)
			{
				if(j==0 || i==0 || j==n-1 ||i==n-1)
				{
					System.out.print("*"+ " ");
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