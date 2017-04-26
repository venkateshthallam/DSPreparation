package src.leetcode.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 2, 3, 4, 4 };
		System.out.println(removeDuplicates(nums));

	}

	public static int removeDuplicates(int[] nums) {
		int dup = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[dup++] = nums[i];
			}
		}

		return dup;
	}

}
