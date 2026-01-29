//Longest Substring Without Repeating Characters
public class prg06 {
		public static int lengthOfLongestSubstring(String s) {
			int[] fre = new int[226];
			int first = 0, last = 0, max = 0;
			while(last < s.length()) {
				char ch = s.charAt(last);
				fre[ch]++;
				while(fre[ch] > 1) {
					fre[s.charAt(first)]--;
					first++;
				}
				max = Math.max(max, last - first + 1);
				last++;
			}
			return max;		
    }
	public static void main(String[] args) {
		String str = "abcabcbb";
		int len = lengthOfLongestSubstring(str);
		System.out.println(len);
	}
}
