//Print All Subsequences of a String
public class recursion07 {
	public static void printSubseq(String str, int index, String curr) {
		if(index == str.length()) {
			System.out.println(curr);
			return;
		}
		char ch = str.charAt(index);
		printSubseq(str, index + 1, curr + ch);
		printSubseq(str, index + 1, curr);
	}
	public static void main(String[] args) {
		String st = "abc";
		printSubseq(st, 0, "");
	}

}
