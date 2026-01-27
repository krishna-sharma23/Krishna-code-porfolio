
public class prg12 {

	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int left = 0, right = 0;
		for(int i = 0; i < height.length; i++) {
			if(height[i] > height[right]) {
				left = right;
				right = i;
			}
		}
	}

}
