package STAR_PATTERN;
//WAJP TO PRINT   *
			 //  **
			//  ***
			// ****
			//  ***
			//   **
			//    *
public class K6 {
	public static void main(String[] args) {
		for (int i = 0; i<=12; i++) {
			for (int j = 12; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i = 0; i<=12; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 12; k >=i; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
