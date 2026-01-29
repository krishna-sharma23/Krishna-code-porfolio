//Find the First Index of an Element in an Array 
public class recursion06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 3, 7, 3, 9, 3};
		int target = 9;
		int index = search(arr, target, 0);	
		System.out.println(index);
	}

	private static int search(int[] arr, int target, int i) {
		// TODO Auto-generated method stub
		if(i == arr.length) {
			i = -1;
		}
		else if(arr[i] == target) {
			return i;
		}
		else {
			i = search(arr, target, ++i);
		}
		return i;
	}
}
