package perfect_number;
public class P3 {
public static void main(String[] args) 
{	
	int sum = 0;
	for (int i = 1; i<50000; i++) 
    {
		sum=0;
		for(int k=1; k<=i/2;k++)
		{
		if(i%k==0)
			sum=sum+k;
        }
		if(sum==i)
		{
		
			System.out.print(i + " , ");
		}
}
}
}