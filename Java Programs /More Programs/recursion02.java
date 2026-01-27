
public class recursion02 {
	static void print(int num) {
		if(num == 0) {
			return;
		}
		print(num - 1);
		System.out.println(num);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);
	}

}
