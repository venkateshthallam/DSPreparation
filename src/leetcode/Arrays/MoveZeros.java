package src.leetcode.Arrays;


public class MoveZeros {

	public static void main(String[] args) {
		int[] nums ={0, 1, 0, 3, 12};
		//moveZeroes(nums);
		betterMoveZeros(nums);
	}

	public static void moveZeroes(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				temp = findNextNonZeroIndex(nums, i);
				if(temp<0) break;
				nums[i] = nums[temp];
				nums[temp] = 0;
			}
		}	
		for(int x : nums){
			System.out.print(x+" ,");
		}
	}

	public static int findNextNonZeroIndex(int[] nums, int currentIndex) {
		int nextNonZeroIndex = -1;
		for (int i = currentIndex; i < nums.length; i++) {

			if (nums[i] != 0)
				return i;

		}

		return nextNonZeroIndex;
	}
	
	public static void betterMoveZeros(int[] nums){
		
		for(int lastZeroIndex=0, cur=0;cur<nums.length;cur++){
			if(nums[cur]!=0){
				nums[lastZeroIndex++] = nums[cur];
				nums[cur] = 0;
			}
		}
		
		for(int x : nums){
			System.out.print(x+" ,");
		}
		
		
	}
	
}
