package stack;

import java.util.*;

/*The next greater element of some element x in an array is the first 
 * greater element that is to the right of x in the same array.
 * 
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, 
 * where nums1 is a subset of nums2.
 * For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] 
 * and determine the next greater element of nums2[j] in nums2. If there is no next 
 * greater element, then the answer for this query is -1.
 * Return an array ans of length nums1.length such that ans[i] is the 
 * next greater element as described above.
 * */


public class prg04 {
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = nums2.length - 1; i >= 0; i--) {
        	while(!stack.isEmpty() && stack.peek() <= nums2[i]) stack.pop();
        	
        	if(stack.isEmpty()) map.put(nums2[i], -1);
        	else map.put(nums2[i], stack.peek());
        	stack.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
        	ans[i] = map.get(nums1[i]);
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4, 1, 2};
		int[] nums2 = {1, 3, 4, 2};
		for(int i : nextGreaterElement(nums1, nums2)) {
			System.out.println(i); 
		}
	}

}

//
//public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//    int[] ans = new int[nums1.length];
//    for(int i = 0; i < nums1.length; i++) {
//    	int temp = 0;
//    	for(int j = 0; j < nums2.length; j++) {
//    		if(nums2[j]  == nums1[i]) temp = 1;
//    		if(nums2[j] > nums1[i] && temp == 1) {
//    			ans[i] = nums2[j];
//    			break;
//    		}
//    		else ans[i] = -1;
//    	}
//    }
//    return ans;
//}
