
public class prg15 {

	public static void main(String[] args) {
		int[] arr = {2, 3, 1, 2, 4, 3};
		int target = 7, start = 0, sum = 0, min_len = Integer.MAX_VALUE;
		for(int end = 0; end < arr.length; end++) {
			sum += arr[end];
			while(sum >= target) {
				min_len = Math.min(min_len, end - start + 1);
				sum -= arr[start];
				start++;
			}
		}
		if(min_len == Integer.MAX_VALUE) {
			System.out.println("No sub array is found");
		}
		else {
			System.out.println("Sub array found of size = "+ min_len);
		}
	}

}
