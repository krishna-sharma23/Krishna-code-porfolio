
public class prg20 {
	
	public static int[] searchRange(int[] nums, int target) {
        int first = 0, last = nums.length - 1;
        int[] output = {-1, -1};
        while(first <= last) {
        	int mid = first + (last - first) / 2;
        	if(nums[mid] < target) {
        		first = mid + 1;
        	}
        	else if(nums[mid] > target){
        		last = mid - 1;
        	}
        	else{
        		output[0] = mid;
        		last = mid - 1;
        	}
        }
        first = 0; 
        last = nums.length - 1;
        while(first <= last) {
        	int mid = first + (last - first) / 2;
        	if(nums[mid] < target) {
        		first = mid + 1;
        	}
        	else if(nums[mid] > target){
        		last = mid - 1;
        	}
        	else{
        		output[1] = mid;
        		first = mid + 1;
        	}
        }
        return output;
    }

	public static void main(String[] args) {
		int[] arr = {8, 8, 8, 8, 8, 8};
		int target = 0;
		int[] result = searchRange(arr, target);
		for(int i:result) System.out.println(i + " ");
	}

}
