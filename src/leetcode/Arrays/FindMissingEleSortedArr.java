package src.leetcode.Arrays;

public class FindMissingEleSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0, 1, 3};
		System.out.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
        
		int sum=0,len = nums.length;
		for(int i=0;i<nums.length;i++)
			sum += nums[i];
				
		return (len) * (len+1)/2 - sum;
    }

}
