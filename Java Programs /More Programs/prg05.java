
public class prg05 {
	public static int searchInsert(int[] nums, int target) {
        int first = 0, last = nums.length - 1, mid = 0;
        while(first <= last) {
        	mid = (first + last)/2;
        	if(target == nums[mid]) {
        		return mid;
        	}
        	else if(target > nums[mid]) {
        		first = mid + 1;
        	}
        	else {
        		last = mid - 1;
        	}
        }
		if(target > nums[mid]) {
			return mid + 1;
		}
		else {
			return mid;
		}
    }
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int val = 2;
		int index = searchInsert(nums, val);
		System.out.println(index);
	}
}
