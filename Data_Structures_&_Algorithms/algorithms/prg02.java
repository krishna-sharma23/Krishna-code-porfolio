package algorithms;

//Binary Search

public class prg02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(BinarySearch(arr, 3));
	}

	private static int BinarySearch(int[] arr, int i) {
		int first = 0;
		int last = arr.length - 1;
		while(last >= first) {
			int mid = first + (last - first)/2;
			if(arr[mid] < i) first = mid + 1;
			else if(arr[mid] > i) last = mid - 1;
			else return mid;
		}
		return -1;
	}

}
