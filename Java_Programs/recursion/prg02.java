package recursion;

public class prg02 {

	public static void main(String[] args) {
		String str = "baccad";
		System.out.println(recurse(str, 'a'));
	}

	private static String recurse(String str, char ch) {
		if(str.isEmpty()) return "";
		else if(str.charAt(0) == ch) return recurse(str.substring(1, str.length()), ch);
		else return "" + Character.toString(str.charAt(0)) + recurse(str.substring(1, str.length()), ch);
	}

}
