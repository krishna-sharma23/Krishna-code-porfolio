package stack;

import java.util.*;

public class prg02 {
	
	public static boolean isValid(String s) {
		Deque<Character> st = new ArrayDeque<>();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			}
			else if(ch == ')' || ch == '}' || ch == ']') {
				if(st.isEmpty()) return false;
				if(ch == ')' && st.peek() == '(' || ch == '}' && st.peek() == '{' || ch == ']' && st.peek() == '[' ) {
					st.pop();
				}
				else return false;
			}
		}
		return st.isEmpty();
    }
	
	public static void main(String[] args) {
		String str = "(){}[]";
		boolean check = isValid(str);
		System.out.println(check);
	}
}


//
//public static boolean isValid(String s) {
//	char[] map = new char[128];
//	char[] stack = new char[s.length()];
//	int top = -1;
//	map[')'] = '(';
//	map[']'] = '[';
//	map['}'] = '{';
//	for(int i = 0; i < s.length(); i++) {
//		if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
//			stack[++top] = s.charAt(i);
//		}
//		else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
//			if(top == -1) return false;
//			if(stack[top] == map[s.charAt(i)]) top--;
//			else return false;
//		}
//	}
//	return top == -1;
//	
//}
