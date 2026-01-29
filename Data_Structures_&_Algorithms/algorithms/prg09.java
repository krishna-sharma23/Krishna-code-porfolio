package algorithms;

//Backtracking

public class prg09 {
	
	static void permutations(String str, String per, int idx) {
		if(str.isEmpty()) {
			System.out.println(per);
			return;
		}
		for(int i = 0; i < str.length(); i++) {
			char currchar = str.charAt(i);
			String newstr = str.substring(0, i) + str.substring(i+1);
			permutations(newstr, per + currchar, idx);
		}
	}

	public static void main(String[] args) {
		permutations("ABC", "", 0);
	}

}
