package src.leetcode.String;

import java.util.HashMap;
import java.util.Stack;

/*
1. Create a map of opening and close brace of all 3 types.
2. For each character in the string, 
    a) if the char is a opening parentheses, push to stack.
    b) if the char is a closing parentheses, check if the stack's top value is mapped value in the stack is the current char, if yes, pop the character.
    c) if it doesn't match above two conditions, it's a rouge brace,so, return false.

*/
public class ValidParentheses {
	public static void main(String[] args) {
		String s="(()[])";
		System.out.println(isValid(s));
	}
	
    public static boolean isValid(String s) { 
        Stack<Character> ps = new Stack<Character>();
        HashMap<Character,Character> hm = new HashMap<Character,Character>();
        hm.put('{','}');
        hm.put('[',']');
        hm.put('(',')');
        for(char c : s.toCharArray()){
            if(hm.containsKey(c)){
                ps.push(c);
            }
            else if(!ps.empty() && c == hm.get(ps.peek())){
                ps.pop();
            }
            else{
                return false;
            }
        }
        
        return ps.empty() ;
        
    }
}