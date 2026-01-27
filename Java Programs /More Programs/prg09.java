//Remove Duplicates from Sorted Array
public class prg09 {

	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 3, 3, 3, 4, 5, 6};
		int end = 0;
		for(int start = 0; start < arr.length; start++) {
			if(arr[end] != arr[start]) {
				arr[end + 1] = arr[start];
				end++;
			}
		}
		for(int i = 0; i < end; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
