package src.leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {
		
		System.out.println(longestSubString("pwwkew"));
	}
	
	public static int longestSubString(String s){
		
		Map<Character,Integer> map = new HashMap<>();
		int max=0;
		for(int i=0, j=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				//Calculating the current occurence +1, because the last occurence has a repeated character and spoiled the current sequence.
				j = Math.max(j, map.get(s.charAt(i))+1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i-j+1);
		}
		
		return max;
	}

}
