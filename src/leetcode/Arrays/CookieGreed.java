package src.leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class CookieGreed {
	
	public static void main(String[] args){
		int[] g = {1,2,3};
		int[] s = {1,2};
		System.out.println(new CookieGreed().findContentChildren(g, s));
	}
    public int findContentChildren(int[] g, int[] s) {
        if(g.length==0 || s.length==0 ) return 0;
        int res = 0;
        List<Integer> cs = new ArrayList<Integer>();
        for(int i=0;i<s.length;i++)
        	cs.add(s[i]);
        System.out.println("CS is "+cs);
        for(int cgreed : cs){
            int match = binarySearch(s, cgreed);
            if(g[match]>=cgreed){ 
                res++;
                cs.remove(match);
            };
        }
    
        return res;
    }
    
    private int binarySearch(int[] arr, int target){
    	System.out.println("target is "+target);
        int start = 0, end = arr.length-1;
        while(start < end){
            int mid = (start +end)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target) end = mid;
            else start = mid+1;
        }
        System.out.println("start is "+start);
        return start;
    }
}
