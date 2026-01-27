//Given an array of integers and an integer k, return the maximum sum of a subarray of size k.
public class prg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int k = 3, max = 0, sum = 0;
		for(int i = 0; i < k; i++) {
			sum += arr[i];
		}
		max = sum;
		for(int i = k; i < arr.length; i++) {
			sum = sum - arr[i - k] + arr[i];
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}

}
