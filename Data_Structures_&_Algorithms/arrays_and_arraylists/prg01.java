package arrays_and_arraylists;

/*This is LeetCode 27: Remove Element.
 * The Setup: You are given a fixed array nums and a value val. You need 
 * to remove all instances of val in-place (without creating a new ArrayList) 
 * and return the new length.
 * */

import java.util.*;

public class prg01 {
	
	static int solution(int[] nums, int val) {
		int first = 0, last = nums.length - 1;
		int temp;
		while(first < last) {
			while(nums[last] == val && last > 0) last--;
			if(nums[first] == val) {
				temp = nums[first];
				nums[first] = nums[last];
				nums[last] = temp;
				last--;
			}
			first++;
		}
		return last+1;
	}
	
	static int removeDuplicates(int[] nums) {
	    // Edge case: Empty array
	    if (nums.length == 0) return 0;

	    int k = 1; // Writer pointer (start at 1 because the first element is always unique)

	    // Reader pointer starts at 1
	    for (int i = 1; i < nums.length; i++) {
	        // LOGIC: How do we know if nums[i] is a NEW unique number?
	        // Hint: Compare nums[i] with the previous number.
	        
	        if (nums[i] != nums[k-1] ) {
	            nums[k] = nums[i];
	            k++;
	        }
	    }
	    return k;
	}
	
	public static void moveZeroes(int[] nums) {
	    int k = 0; // Writer

	    // STEP 1: Move all non-zeros to the front
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] != 0) {
	            nums[k] = nums[i];
	            k++;
	        }
	    }

	    while(k < nums.length) nums[k++] = 0;
	}
	
	static void display(int[] nums) {
		for(int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 3, 2, 3, 4, 3, 3, 5};
		int val = 3;
		int len = solution(nums, val);
		//moveZeroes(nums);
		display(nums);
		System.out.println(len);
	}

}
