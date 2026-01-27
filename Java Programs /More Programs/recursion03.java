
public class recursion03 {
	static int sum(int num) {
		if(num == 0) {
			return 0;
		}
		int sum = num + sum(num-1);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum(5);
		System.out.println(result);
	}

}
