package armstrong;
public class P4 {
public static void main(String[] args) {
	int i = 20;
	while(i<=1000)
	{
		int sum =0;
		int n= i;
	int c =digitCount(i);
	while(n>0) {
		int rem=n%10;
		sum=sum+power(rem,c);
		n=n/10;
	}
	if(i==sum) 
		System.out.println(i);
		i++;
	}
}
public static int power(int b, int e) {
	int power=1;
	while(e>0) {
		power=power*b;
		e--;
	}
	return power;
}
public static int digitCount(int number_to_be_counted) {
	int count=0;
	while(number_to_be_counted>0)
	{
		number_to_be_counted=number_to_be_counted/10;
		count++;
	}
	return count;
}
}