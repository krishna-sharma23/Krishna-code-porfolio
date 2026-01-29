package algorithms;

import java.util.Arrays;

//Merge Sort

public class prg07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 5, 4, 3, 2, 1};
		arr = mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] mergeSort(int[] arr, int first, int last) {
		if(last == first) {
			return new int[] {arr[first]};
		}
		int mid = first + (last - first)/2;
		int[] left = mergeSort(arr, first, mid);
		int[] right = mergeSort(arr, mid + 1, last);
		
		return merge(left, right);
	}

	private static int[] merge(int[] first, int[] second) {
		int i = 0, j = 0, k = 0;
		int[] out = new int[first.length + second.length];
		while(i < first.length && j < second.length) {
			if(first[i] < second[j]) {
				out[k] = first[i];
				i++;
			}
			else {
				out[k] = second[j];
				j++;
			}
			k++;
		}
		while(i < first.length) {
			out[k++] = first[i++];
		}
		while(j < second.length) out[k++] = second[j++];
		
		return out;
	}

}
