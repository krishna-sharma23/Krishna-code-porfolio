//Check if Array has Pair with Given Sum
public class prg08 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = 5;
		boolean found = false;
		int start = 0, end = arr.length - 1;
		while(start <  end) {
			if(arr[start] + arr[end] == sum) {
				System.out.println("found");
				found = true;
				break;
			}
			else if(arr[start] + arr[end] < sum) {
				start++;
			}
			if(arr[start] + arr[end] > sum) {
				end--;
			}
		}
		if(!found) {
			System.out.println("Not Found");
		}
	}

}
