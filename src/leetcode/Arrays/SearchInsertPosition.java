package src.leetcode.Arrays;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = {2,3,4,9,10,15};
		System.out.println("Position to insert a new number is "+returnSearchPosition(nums, 5));
	}

	public static int returnSearchPosition(int[] nums, int target) {
		int start = 0, end = nums.length - 1, targetIndex = 0, middle = 0;
		while (start <= end) {
			middle = (start + end) / 2;
			if (nums[middle] > target) {
				end = middle - 1;
			} else if (nums[middle] < target) {
				start = middle + 1;
			} else {
				return middle;
			}

		}
		targetIndex = start;
		return targetIndex;
	}

}
