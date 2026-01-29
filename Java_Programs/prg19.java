
public class prg19 {
	
	public static TreeNode sortedArrayToBST(int[] nums) {
	       return helper(nums, 0, nums.length - 1);
	}

	private static TreeNode helper(int[] nums, int first, int last) {
		if(first > last) return null;
		int mid = first + (last - first)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = helper(nums, first, mid - 1);
		root.right = helper(nums, mid + 1, last);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-10, -3, 0, 5, 9};
		sortedArrayToBST(arr);
	}

}