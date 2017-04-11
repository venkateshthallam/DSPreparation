package src.Arrays;

import java.util.HashMap;

class PermutationCheck{
    public static void main(String[] args){
        if(new PermutationCheck().isPermutation("ssss ","mmmm "))
        	System.out.println("Given Strings are Permutations");
        else
        	System.out.println("Given Strings are not permutations");
        
    }
    
public boolean isPermutation(String s1,String s2)
{
    if(s1.length()!=s2.length())
        return false;
    Integer tempvalue;
        
    HashMap<Character,Integer> charCountTracker = new HashMap<Character,Integer>();
    for(int i=0;i<s1.length();i++){
         tempvalue=charCountTracker.get(s1.charAt(i));
         if(tempvalue==null)
         charCountTracker.put(s1.charAt(i),1);
         else
        	 charCountTracker.put(s1.charAt(i),++tempvalue);
    }
      for(int i=0;i<s2.length();i++){
         tempvalue=charCountTracker.get(s2.charAt(i));
         if(tempvalue==null || tempvalue==0)
            return false;
         charCountTracker.put(s2.charAt(i),--tempvalue);
    }
    return true;
}    
    
}