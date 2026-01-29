import java.util.Scanner;

public class recursion04 {
	static void ispall(String st, int left, int right) {
		if(left >= right) {
			System.out.println("Yes");
			return;
		}
		else if(st.charAt(right) == st.charAt(left)) {
			ispall(st, ++left, --right);
		}
		else {
			System.out.println("no");
			return;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		ispall(str, 0, str.length() - 1);
		sc.close();
	}

}
