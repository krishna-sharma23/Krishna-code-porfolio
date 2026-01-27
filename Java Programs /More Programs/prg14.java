//Given an array of integers, a window size k, and a target value,
//count how many subarrays of size k have an average greater than or equal to the target.
public class prg14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 4, 5, 2, 6, 7, 1, 8};
		int k = 3, target = 3, count = 0, sum = 0;
		for(int i = 0; i < k; i++) {
			sum += arr[i];
		}
		if(sum/k >= target) count++;
		for(int i = k; i < arr.length; i++) {
			sum = sum - arr[i - k] + arr[i];
			if(sum/k >= target) count++;
		}
		System.out.println(count);
	}
}
