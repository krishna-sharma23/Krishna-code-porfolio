package recursion;

//Implementing Binary Search using recursion

public class prg01 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int loc = Binary(arr, 0, arr.length - 1, 50);
		System.out.println(loc);
	}

	private static int Binary(int[] arr, int start, int end, int target) {
		if(start > end) {
			return -1;
		}
		
		int mid =  start + (end - start)/2;
		if(arr[mid] == target) {
			return mid;
		}
		else if(arr[mid] > target) {
			return Binary(arr, start, mid - 1, target);
		}
		else {
			return Binary(arr, mid + 1, end, target);
		}
	}

}
