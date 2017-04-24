package src.leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2, 4, 7, 9, 10, 12};
		int[] res = twoSum(nums, 22);
		for(int val : res)
		System.out.println("Target Indices are "+val);
		
	}
	
	 public static int[] twoSum(int[] nums, int target) {
		 int[] sumIndices = new int[2];
		 Map<Integer, Integer> targetIndicesMap = new HashMap<Integer, Integer>();
		 for(int i=0;i<nums.length;i++){
			 if(targetIndicesMap.containsKey(target - nums[i])){
				 sumIndices[0] = targetIndicesMap.get(target - nums[i]);
				 sumIndices[1] = i;
				 return sumIndices;
			 }
			 targetIndicesMap.put(nums[i], i);
		 }
		 return sumIndices;
	    }
}
