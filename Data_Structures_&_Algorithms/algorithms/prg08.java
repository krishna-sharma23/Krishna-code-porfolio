package algorithms;

import java.util.Arrays;

//Quick Sorting 

public class prg08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 5, 4, 3, 8, 9, 7, 2, 1};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(end <= start) return;
		int pivot = partition(arr, start, end);
		quickSort(arr, 0, pivot - 1);
		quickSort(arr, pivot + 1, end);
		
	}

	private static int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int i = start - 1;
		int pivot = arr[end];
		for(int j = start; j < end; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		return i;
	}

}
