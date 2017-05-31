package src.leetcode.String;

public class ReverseWordsString {

	public static void main(String[] args) {
		String s = "   this has spaces at the beginning and at the end      ";
		String str = "   a   b  c d   e  ";
	    String result = s.trim();
	    System.out.println(result);
	    String s1 = cleanString(str);
	    s1 = revereseWords(s1);
	    System.out.println(s1);
	    System.out.println(s1.replace("\u0000", ""));
	}
	
	
	private static String cleanString(String str){
		char[] carr = str.toCharArray();
		for(int i=0;i<carr.length;i++){
			if(carr[i]==' ' && i+1 < carr.length && carr[i+1]==' ')
				carr[i] = '\u0000';
		}
		System.out.println(String.valueOf(carr).trim());
		return String.valueOf(carr).trim();
	}
	
	private static String revereseWords(String s){
		 String[] words = s.split(" ");
	        int len = words.length-1;
	        String temp = null;
	        StringBuilder res = new StringBuilder();
	        if(s.length()==0) return res.toString();
	        for(int i=0;i<=len/2;i++){
	            temp = words[i];
	            words[i] = words[len-i];
	            words[len-i] = temp;
	        }
	        for(String str : words){
	            res.append(str+" ");
	        }
	        
	        return res.toString().trim();
	}
}
