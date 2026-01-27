
public class prg04 {
	public static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "mississippi";
		String needle = "issip";
		int k = strStr(haystack, needle);
		System.out.println(k);
	}

}
