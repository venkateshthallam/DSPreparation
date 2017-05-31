package src.leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4};
		System.out.println(twoSum(arr,6));
	}
	
	
	 public static int[] twoSum(int[] numbers, int target) {
	        Map<Integer,Integer> map = new HashMap<>();
	        int[] res = new int[2];
	        for(int i=0;i<numbers.length;i++){
	            if(map.containsKey(target - numbers[i])){
	                 res[0] = i;
	                 res[1] = map.get(target - numbers[i]);
	                 return res;
	            }
	            else{
	                map.put(numbers[i],i);
	            }
	        }
	         return res;
	    }

}
