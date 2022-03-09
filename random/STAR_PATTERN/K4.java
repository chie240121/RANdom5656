package STAR_PATTERN;
public class K4 {
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("");
			}
			for (int k = 9; k >=i; k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
