package STAR_PATTERN;
//WAJP TO PRINT  *
			 //* * *
           //* * * * *
         //* * * * * * *
	public class K8 {
	public static void main(String[] args) {
	for (int i = 0; i<=10; i++) {
	for (int j = 10; j >= i; j--) {
	System.out.print(" ");
	}
	for (int k = 0; k<=i; k++) {
	System.out.print(" * ");
	}    
	for (int l = 2; l <=i; l++) {
		System.out.print(" * ");
	}
	System.out.println(" ");
	}
	}
	}

