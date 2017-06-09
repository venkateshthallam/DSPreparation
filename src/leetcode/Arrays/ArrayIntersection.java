package src.leetcode.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> uset = new HashSet<Integer>();
		Set<Integer> iset = new HashSet<Integer>();
		int[] result = null;
		int i = 0;
		for (int val : nums1) {
			uset.add(val);
		}

		for (int val : nums2) {
			if (uset.contains(val)) {
				iset.add(val);
			}
		}
		
		result = new int[iset.size()];

		for (int val : iset) {
			result[i++] = val;
		}

		return result;
	}

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,2,3,4};
		int[] arr2 = {2,4};
		new ArrayIntersection().intersection(arr1, arr2);
	}
}
