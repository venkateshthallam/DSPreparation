package src.leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

	public static void main(String[] args) {
		int[] nums  = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]) - 1;
			if (nums[val] > 0) {
				nums[val] = -nums[val];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				result.add(i + 1);
		}

		return result;
	}

}
