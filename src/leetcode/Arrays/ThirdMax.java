package src.leetcode.Arrays;

public class ThirdMax {

	public static void main(String[] args) {
		int nums[] = { 1, 2 };
		int[] nums1 = { 1, 2, 3, 3 };
		System.out.println("Third Max is " + thirdMax(nums));
	}

	public static int thirdMax(int[] nums) {

		Integer firstMax = null, secondMax = null, thirdMax = null;
		System.out.println(firstMax);
		for (Integer n : nums) {
			if (n.equals(firstMax) || n.equals(secondMax) || n.equals(thirdMax))
				continue;
			if (firstMax == null || n > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = n;
			} else if (secondMax == null || n > secondMax) {
				thirdMax = secondMax;
				secondMax = n;
			} else if (thirdMax == null || n > thirdMax) {
				thirdMax = n;
			}
		}

		return thirdMax != null ? thirdMax : firstMax;

	}

}
