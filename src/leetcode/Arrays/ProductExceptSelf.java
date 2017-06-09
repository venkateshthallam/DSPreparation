package src.leetcode.Arrays;

/*
 * 1. Form a resultant array
 * 
 * */
public class ProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		int[] res = productExceptSelf(nums);
		for(int val : res){
			System.out.println(val);
		}
	}
	
	//In O(n)
	public static int[] productExceptSelf(int[] nums) {
	  if(nums==null || nums.length==0) return nums;
	  int len = nums.length;
	  int[] res = new int[len];
	  res[0] = 1;
	  for(int i=1;i<nums.length;i++){
		  res[i] = res[i-1] * nums[i-1];
	  }
	  int t = 1;
	  for(int i=len-1;i>=0;i--){
		 res[i] = res[i]*t;
		 t = t*nums[i];
	  }
	  return res;
	}

}
