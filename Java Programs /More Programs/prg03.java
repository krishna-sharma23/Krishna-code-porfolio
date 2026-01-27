import java.util.ArrayList;

public class prg03 {
	public static int removeElement(int[] nums, int val) {
		int i = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int j = 0; j < nums.length; j++) {
			if(nums[j] != val) {
				list.add(nums[j]);
				nums[i++] = nums[j];
			}
		}
		return list.size();
        
    }
	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		int k = removeElement(nums, val);
		System.out.println(k);
	}

}
