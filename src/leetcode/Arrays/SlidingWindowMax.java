package src.leetcode.Arrays;

import java.util.ArrayList;

public class SlidingWindowMax {

	static ArrayList<Integer> finalList = new ArrayList<>();

	public static void main(String[] args) {
		int[] arr = {1,3,-1,-3,5,3,6,7};
		int[] res = maxSlidingWindow(arr, 3);
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (i + k <= len) {
				finalList.add(returnMax(nums, i, i + k));
			}
		}
		int[] array = finalList.stream().mapToInt(i -> i).toArray();
		return array;
	}

	public static int returnMax(int[] nums, int start, int end) {
		int max = Integer.MIN_VALUE;
		if (finalList.size() > 0)
			return finalList.get(finalList.size() - 1) > nums[end] ? finalList.get(finalList.size() - 1) : nums[end];
		for (int i = start; i < end; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

}
