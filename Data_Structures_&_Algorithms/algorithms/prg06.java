package algorithms;

//Selection Sort

public class prg06 {

	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 4, 2, 5, 9, 8, 7, 6, 1, 3};
		selectionSort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min_index = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			if(min_index != i) {
				int temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
