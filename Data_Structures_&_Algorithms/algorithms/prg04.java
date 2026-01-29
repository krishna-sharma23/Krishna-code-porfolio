package algorithms;

//Bubble Sort

public class prg04 {
	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 4, 5, 7, 6, 9, 8};
		BubbleSort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void BubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i++) {
			boolean swapped = false;
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) break;
		}
	}
}
