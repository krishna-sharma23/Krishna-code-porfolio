package arrays_and_arraylists;


/* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where 
 * the first m elements denote the elements that should be merged, and the last n elements are set 
 * to 0 and should be ignored. nums2 has a length of n.*/

public class prg02 {
	
	static void merge(int[] nums1, int m, int[] nums2, int n) {
		int first = m - 1, second = n - 1, third = m + n - 1;
		while(first >= 0 && second >= 0) {
			if(nums1[first] >= nums2[second]) {
				nums1[third] = nums1[first];
				third--;
				first--;
			}
			else if(nums1[first] < nums2[second]) {
				nums1[third] = nums2[second];
				third--;
				second--;
			}
		}
		if(nums1.length == 1 && nums1[0] == 0) {
			nums1[0] = nums2[0];
		}
		else if(second < 0 && first >= 0) {
			while(first >= 0)nums1[third--] = nums1[first--];
		}
		else if(first < 0 && second >= 0) {
			while(second >= 0)nums1[third--] = nums2[second--];
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {2, 0};
		int[] nums2 = {1};
		merge(nums1, 1, nums2, nums2.length);
		
		for(int i : nums1) {
			System.out.print(i + " ");
		}
	}

}
