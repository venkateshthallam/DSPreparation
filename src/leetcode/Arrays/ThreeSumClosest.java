package src.leetcode.Arrays;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
			
		int[] nums = {1,2,4,8,16,32,64,128};
		System.out.println(threeSumClosest(nums,82));
		

	}
	
	
	public static int threeSumClosest(int[] nums, int target) {
        if(nums.length < 3) return 0;
        int res = nums[0] + nums[1] + nums[2], mindiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=2;i<nums.length;i++){
            int l=0, r=i-1;
            while(l < r){
                int sum = nums[l]+nums[r]+nums[i];
                 if(sum > target){
                    r--;
                }
                else{
                    l++;
                }
                if(Math.abs(sum-target) < Math.abs(res - target)){
                    res = sum;
                }
            }
        }
        return res;
    }

}
