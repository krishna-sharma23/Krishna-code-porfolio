//Find the first negative number in every window of size k in the given array.
import java.util.*;
public class prg17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
		int k = 3, start = 0;
		Queue<Integer> index = new LinkedList<>();
		for(int end = 0; end < arr.length; end++) {
			if(arr[end] < 0) {
				index.offer(end);
			}
			if(end - start + 1 == k) {
				while (!index.isEmpty() && index.peek() < start) {
                    index.poll();
                }
				if(!index.isEmpty() && index.peek() >= start) {
					System.out.print(arr[index.peek()] + " ");
				}
				else {
					System.out.print(0 + " ");
				}
				start++;
			}
		}
	}

}
