package algorithms;

//Insertion Sort

public class prg05 {

	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 4, 2, 5, 9, 8, 7, 6, 1, 3};
		insertionSort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

}
