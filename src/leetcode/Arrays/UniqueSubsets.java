package src.leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSubsets {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(returnUniqueSubsets(arr));

	}
	
	public static List<List<Integer>> returnUniqueSubsets(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> temp = new ArrayList<Integer>();
		Arrays.sort(nums);
		backtrack(res, temp, nums, 0);
		
		return res;
	}
	
	public static void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start){
		res.add(new ArrayList<>(temp));
		System.out.println("Result is "+res);
		System.out.println("Temp is "+temp);
		for(int i=start;i<nums.length;i++){
			temp.add(nums[i]);
			backtrack(res, temp, nums, i+1);
			temp.remove(temp.size()-1);
		}
	}

}
