//Move Zeroes
public class prg10 {

	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 0, 3};
		int fast = 0;
		for(int slow = 0; slow < arr.length; slow++) {
			if(arr[slow] != 0) {
				arr[fast] = arr[slow];
				fast++;
			}
		}
		while (fast < arr.length) {
		    arr[fast] = 0;
		    fast++;
		}
		prg02.display(arr);
	}

}
