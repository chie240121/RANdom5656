package STAR_PATTERN;
//* * * * *
//*
//*
//*
//*
public class P12 {
public static void main(String[] args) {
	int n = 5;
	for(int i = 0;i<=n-1;i++)
	{
		for (int j = 0;j<=n-1;j++)
		{
			if(j==0 || i==0) 
			{
				System.out.print("*"+ " ");
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
