import java.util.ArrayList;

/** Remove Duplicates from Sorted Array
 * 1.array nums sorted in non-decreasing order
 * 2.
 * */


public class prg02 {
	static void display(int[] array) {
		for(int num : array) {
			System.out.print(num + " ");
		}
	}
	public static int removeDuplicates(int[] nums) {
		ArrayList<Integer> list = new ArrayList<>();
		int x = 0;
		for(int num : nums) {
			if(!list.contains(num)) {
				list.add(num);
				nums[x++] = num; 
			}
		}
		return list.size();
        
    }

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int k = removeDuplicates(nums);
		System.out.println(k);
	}

}
/**efficient ways
 * class Solution {
    public int removeDuplicates(int[] nums) {
        //int nums.length=n;
       int i=0;
       for(int j=1; j<nums.length; j++){
        if(nums[j]!= nums[i]){
            nums[i+1] = nums[j];
            i++;
        }
       }
       return i+1; 
    }
}

*class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;

        while(fast < nums.length){
            if(fast > 0 && nums[fast] == nums[fast - 1]){
                fast++;
                // while(fast < nums.length && nums[fast] == nums[fast - 1]){
                //     fast++;
                // }
            }else{
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
        }
        return slow;
    }
}
*/
