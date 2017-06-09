package src.leetcode.Arrays;

public class SearchRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {10,9,1,2,3};
		System.out.println(findMin(arr));

	}
	
	
	public static int findMin(int[] num) {
		  int start=0,end=num.length-1;
	        
	        while (start<end) {
	            if (num[start]<num[end])
	                return num[start];
	            
	            int mid = (start+end)/2;
	            
	            if (num[mid]>=num[start]) {
	                start = mid+1;
	            } else {
	                end = mid;
	            }
	        }
	        
	        return num[start];
	    }

}
