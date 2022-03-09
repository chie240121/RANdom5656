package self_prctice;
// Reverse String Without Using Length method
public class ReverseStringWithoutUsingLengthMethod {

	public static void main(String[] args) {
		String s = "kajalSharma";
	char[] str = s.toCharArray();
	for (int i = str.length-1; i>=0; i--) {
	System.out.println(str[i]);
}
	}

}
