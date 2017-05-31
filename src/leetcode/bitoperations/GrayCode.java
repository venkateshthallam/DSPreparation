package src.leetcode.bitoperations;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public static void main(String[] args) {
		
		System.out.println(grayCode(4));
	}
	
    public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0; i< 1<<n; i++)
            res.add(i ^ i>>1);
        return res;
    }
    
    
    private static int binaryToGray(int num){
    	return (num>>1 ^ num);
    }
    
    private static int grayToBinary(int num){
    	 int mask = 0;
    	for(mask = num >>1 ; mask!=0 ; mask = mask >> 1)
    		num = num ^ mask;
    	 
    	 return num;
    }
}