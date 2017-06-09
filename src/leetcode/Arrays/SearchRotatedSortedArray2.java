package src.leetcode.Arrays;

public class SearchRotatedSortedArray2 {

	public static void main(String[] args) {
		int[] nums = { 3,1 };
		System.out.println(search(nums, 1));

	}


	public static int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
		int start = 0, end = nums.length - 1;
		int orig = findMinIndex(nums);
		System.out.println("orig is "+orig);
		if(nums[orig]==target) return orig;
		if(target <= nums[end]) start =  orig;
		else if(target >  nums[end]) end =  orig;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target)
				return mid;
			if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		
		return -1;
	}

	private static int findMinIndex(int[] nums) {
		int start = 0, end = nums.length - 1;
		while (start < end) {
			if (nums[start] < nums[end])
				return start;
		    int	mid = (start + end) / 2;
		    if (nums[mid] > nums[end]) start = mid + 1;
	        else end = mid;
		}
		return start;
	}

}
