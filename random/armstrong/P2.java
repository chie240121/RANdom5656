package armstrong;
public class P2 {
public static void main(String[] args) {
	int pr = power(2,4);
	System.out.println(pr);
}

public static int power(int b, int e) 
{
	int power = 1;
	while(e>0) {
		power = power*b;
		e--;
	}
	return power;
}
}
