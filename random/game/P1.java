package game;
import java.util.*;
public class P1 {
public static void main(String[] args) {
	Random r = new Random();
	int rn= r.nextInt(10);
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int un = sc.nextInt();
	if(rn==un)
	{
		System.out.println("yeyy..!! you won the game..!!");
	}
	else
	{
		System.out.println("ohh..better luck next time "  +   rn);
	}
}
}
