package src.leetcode.String;

public class StringCompression {

	public static void main(String[] args) {
		String s="aabbbcccdddzff";
		String s1="a";
		System.out.println("Compressed String is "+compressStr(s1));

		//System.out.println("Compressed String is "+compressString(s));
	}
	
	private static String compressString(String s){
		int i= 0, j=1, count=1, len=s.length();
		StringBuilder res = new StringBuilder();
		while(i<len && j<len){
			while(j<len && s.charAt(i)==s.charAt(j)){
				j++;
				count++;
			}
			res = res.append(s.charAt(i)+""+count);	
			i = j;
			count = 1;
			j++;
		}
		return res.toString();
	}
	
	private static String compressStr(String s){
		if(s.length()==0)
		{
			return s;
		}
		StringBuilder res = new StringBuilder();
		
		int count = 1;
		for(int i=0;i<s.length();i++){
			if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
				count++;
			else{
				res.append(s.charAt(i)+""+count);
				count = 1;
			}
		}
		
		
		
		return res.toString();
	}

}
