package algorithms;

//Interpolation Search

public class prg03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(InterpolationSearch(arr, 5));
	}

	private static int InterpolationSearch(int[] arr, int i) {
		int low = 0, high = arr.length - 1;
		while(i >= arr[low] && i <= arr[high] && low <= high) {
			int probe = low + (high + low) * (i - arr[low])/(arr[high] - arr[low]);
			if(arr[probe] == i) return probe;
			else if(arr[probe] < i) low = probe + 1;
			else high = probe - 1;
		}
		return -1;
	}

}
