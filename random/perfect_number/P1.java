package perfect_number;

import java.util.Iterator;

public class P1 {
public static void main(String[] args) {
	int n =20;
	for (int i = 1; i<=n/2 ; i++)
	{
		if(n%i==0)
		{
			System.out.print(i + ",");
		}
	}
}
}
