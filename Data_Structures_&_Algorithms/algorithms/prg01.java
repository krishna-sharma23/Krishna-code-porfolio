package algorithms;

//Linear Search

public class prg01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};
		System.out.println(linearSearch(arr, 0));

	}

	private static int linearSearch(int[] arr, int val) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == val) return i;
		}
		return -1;
	}

}
