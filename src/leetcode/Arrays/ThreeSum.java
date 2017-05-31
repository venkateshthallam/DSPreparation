package src.leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class ThreeSum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tarr = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(tarr));
		
	}
	
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        int sum = 0, temp = 0;
        for(int i=0;i<nums.length-2;i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
            sum = 0 - nums[i];
             int x = i+1 , y = nums.length-1;
            while(x < y){
                if(nums[x]+nums[y]==sum){
                    result.add(Arrays.asList(nums[x],nums[y],nums[i]));
                    while(x<y && nums[x] == nums[x+1]) x++;
                    while(x<y && nums[y] == nums[y-1]) y--;
                    x++; y--;
                }
                else if(nums[x]+nums[y]<sum){
                    x++;
                }else
                    y--;
                
            }
        }
        }
        
        return result;
        
    }
}