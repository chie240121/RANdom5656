package STAR_PATTERN;
//Y
public class Y {
	public static void main(String[] args) {
		int n =5;
		for(int i = 0;i<=n-1;i++)
		{
			for(int j =0;j<=n-1;j++)
			{
				if(i==j&&j<=n/2||i+j==n-1)//if(j==n/2||(i==j&&i<=n/2))
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