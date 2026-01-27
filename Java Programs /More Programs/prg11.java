//Container With Most Water
public class prg11 {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		int i = 0, j = height.length - 1;
		int max = 0;
		while(i != j) {
			max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
			if(height[i] < height[j]) {
				i++;
			}
			else {
				j--;
			}
		}
		System.out.println(max);
	}

}
