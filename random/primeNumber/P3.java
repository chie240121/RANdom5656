package primeNumber;
import java.util.*;
public class P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st number");
		int x = sc.nextInt();
		System.out.println("enter the 2nd number");
		int y = sc.nextInt();
        
        for (x=x;x<=y;x++) 
        {
        	int count =0;
		for (int i = 2; i<=x/2; i++) {
			if(x%i==0) {
				count++;
			}
		}	
		if(count==0) {
			System.out.println(x);
		}
		}
}
}