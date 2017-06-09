package src.leetcode.String;

import java.util.ArrayList;
import java.util.List;
/*
1. Make 3 arrays with each line of characters
2. Check if each of the string is part of only any of the char arrays, if yes, add them to the result.
*/
public class KeyboardRow {

	public static void main(String[] args) {
		String [] input = {"Hello","Alaska","Dad","Peace"};
		String[] res = new KeyboardRow().findWords(input);
		for(String s : res)
		System.out.println(s);
		

	}
	
	 public String[] findWords(String[] words) {
	        int[] row1 = prepareCharMap("qwertyuiop");
	        int[] row2 = prepareCharMap("asdfghjkl");
	        int[] row3 = prepareCharMap("zxcvbnm");
	        List<String> res = new ArrayList<String>();
	        for(String word : words){
	        	if(isStringPartOfRow(word.toLowerCase(), row1) || isStringPartOfRow(word.toLowerCase(), row2) || isStringPartOfRow(word.toLowerCase(), row3))
	        		res.add(word.toLowerCase());
	        		
	        }
	     return res.toArray(new String[res.size()]);
	    		 
	 }
	    
	    private int[] prepareCharMap(String s){
	        int[] arr = new int[26];
	        for(int i=0;i<s.length();i++){
	            arr[s.charAt(i)-'a'] = 1;
	        }
	        return arr;
	    }
	    
	    private boolean isStringPartOfRow(String s, int[] arr){
	        for(int i=0;i<s.length();i++){
	            if(arr[s.charAt(i)-'a']!=1)
	                return false;
	        }
	        return true;
	    }

}
