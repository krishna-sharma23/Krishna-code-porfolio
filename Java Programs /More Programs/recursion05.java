//Check if an Array is Sorted using Recursion
public class recursion05 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 10, 9};
		is_sorted(arr, 0);
	}

	private static void is_sorted(int[] arr, int x) {
		if(x == arr.length - 1) {
			System.out.println("The array is sorted");
			return;
		}
		else if(arr[x] > arr[x + 1]) {
			System.out.println("The array is not sorted");
			return;
		}
		is_sorted(arr, x + 1);
	}

}
