package src.leetcode.Arrays;

import java.util.Arrays;

public class ArrayTripletTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,3,4};
		System.out.println(triangleNumber(arr));
	}
	
	public static int triangleNumber(int[] nums) {

        int result = 0;
        if (nums.length < 3) return result;
        Arrays.sort(nums);
        for(int i=2;i<nums.length;i++){
            int l = 0, r = i-1;
            while(l < r){
            if(nums[l] + nums[r] > nums[i]){
                r--;
                result += (r - l);
            }else{
                l++;
            }
            }
        }
        
        return result;
    
	}


}
