package src.leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 1, 5, 4 };
		System.out.println(findPairs(numbers, 2));
	}

	public static int findPairs(int[] numbers, int k) {
		if(numbers == null || numbers.length == 0 || k < 0) return 0;
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		int totalKDiffPairs = 0;
		for (int x : numbers) {
			numMap.put(x, numMap.getOrDefault(x, 0) + 1);
		}

		for (int x : numMap.keySet()) {
			if (k == 0) {
				if (numMap.get(x) > 1)
					totalKDiffPairs++;
			} else {
				if (numMap.containsKey(x -k))
					totalKDiffPairs++;
			}
		}

		return totalKDiffPairs;

	}

}
