package self_prctice;

public class CheckTheSentenceIsPalindromeOrNot {

	public static void main(String[] args) {
		String s = "do geese see god";
		String rev = ""; //no space bcz empty is variable //s,ss,ssy,ssyt
		for (int i = s.length()-1; i>=0; i--) 
		{		//i=3,2,1,0
			//System.out.println(s.charAt(i));
			rev=rev+s.charAt(i);//0+s,s+s,ss+y,ssy+t	
		}
		System.out.println(rev);
		
		if(s.equals(rev)) {
			System.out.println("the given sentence is palindrome " + s);
		}
		else {
			System.out.println("the given sentence is not palindrome " + s);
		}
	}

}
