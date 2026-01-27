

//Magic Number: The numbers whose recursive sum is 1
/** How are we going to solve this question.
 *  We will have a recursive function that will call the function till we have 1 or a number repeats itself or is less than 10 
 * */
public class prg01{
	public static void main(String[] args) {
		int num = 1919;
		Boolean isMagic = false;
		isMagic = Magic(num);
		System.out.println(isMagic);
	}

	private static Boolean Magic(int num) {
		int sum = 0;
		boolean result = false;
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		if(sum == 1) {
			result = true;
		}
		else if(sum < 10 && sum != 1) {
			result = false;
		}
		else {
			result = Magic(sum);
		}
		return result;
	}
}
