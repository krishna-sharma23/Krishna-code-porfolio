//Count the number of subarrays whose sum is exactly equal to a given target.


public class prg16 {
	public static void main(String[] args) {
		int[] arr = {1, 1, 1};
		int target = 2, start = 0, count = 0, sum = 0;
		for(int end = 0; end < arr.length; end++) {
			sum += arr[end];
			while(sum > target) {
				sum -= arr[start];
				start++;
			}
			if(sum == target) {
				count++;
			}
		}
		System.out.println(count);
	}
}
