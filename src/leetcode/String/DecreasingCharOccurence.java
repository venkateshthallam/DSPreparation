package src.leetcode.String;

import java.util.HashSet;
import java.util.Set;

public class DecreasingCharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int lengthOfLongestSubstring(String s) {
	        Set<Character> resSet = new HashSet<>();
	        int max = 0;
	        Set<Character> temp = new HashSet<>();
	        for(int i=0;i<s.length();i++){
	            
	            System.out.println("char is "+s.charAt(i));
	            if(!temp.contains(s.charAt(i))){
	                temp.add(s.charAt(i));
	            }
	            else{
	                if(temp.size()>max){
	                    System.out.println(temp);
	                    max = temp.size();
	                    resSet = temp;
	                    temp = new HashSet<>();
	                }
	            }
	        }
	        
	        return max;
	        
	    }

}
