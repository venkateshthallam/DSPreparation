package src.leetcode.String;

import java.util.LinkedList;
import java.util.List;

/*
1. Use a queue to push first digit's chars.
2. for conesecutive digit's, pop the first char values from queue, append it to the current chars and push back to queue
3. Repeat and return the list of final strings.
*/
public class PhoneNumberStringCombs {
	


	public static void main(String[] args) {
		String digits = "9345";
		System.out.println(letterCombinations(digits));
	
	}
    public static List<String> letterCombinations(String digits) {
    	LinkedList<String> list = new LinkedList<>();
        String[] dcm  = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        list.add("");
        for(int i=0;i<digits.length();i++){
            int digit = Integer.parseInt(digits.charAt(i)+"");
            while(list.peek().length()==i){
                String t = list.remove();
                for(char c : dcm[digit].toCharArray()){
                    list.add(t+c);
                }
            }
        }
        
        return list;
    }
}