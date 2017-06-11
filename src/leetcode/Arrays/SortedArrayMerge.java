package src.leetcode.Arrays;

public class SortedArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {-1,0,0,3,3,3,0,0,0};
		int[] nums2 = {1,2,2};
		merge(nums1, nums1.length, nums2, nums2.length);
		for(int val : nums1){
			System.out.print(val+" ");
		}
	}
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        int[] res = new int[m];
	        for(int x = 0; x< m; x++)
	        	res[x] = nums1[x];
	        int i=0, j=0, k=0, numc = 0, temp =0;
	        while(m!=0 && temp+1 < m && nums1[temp+1] >= nums1[temp])
	            temp++;
	        System.out.println("temp is "+temp);
	        while(i < temp && j< n){
	            if(res[i] <= nums2[j]){
	                nums1[k] = res[i];
	                i++;
	            }else if(res[i] > nums2[j]){
	                nums1[k] = nums2[j];
	                j++;
	            }
	            k++;
	        }
	        while(m!=0 && i<=temp){
	            nums1[k] = res[i];
	            i++; k++;
	        }
	        while(n!=0 && j<=n-1){
	            nums1[k] = nums2[j];
	            j++; k++;
	        }
	    }

}
