package src.leetcode.String;

public class StringToInteger {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="+-2";
		System.out.println(myAtoi(s));
	}
	
    public static int myAtoi(String str) {
        /*
        *   1. remove spaces 2. take care of sign 3. check for overflow or underflow or char type 4. convert to int.
        */
        if(str.length()==0) return 0;
        int sign = 1,total=0;
        char[] carr = str.toCharArray();
        for(int i=0;i<carr.length;i++){
            if(carr[i]==' ') continue;
            if(carr[i]=='-' || carr[i]=='+'){
                sign = carr[i]=='-'?-1:sign;
                continue;
            }
            int val  = carr[i] - '0';
            if(val<0 || val>9) break;
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE%10 < val)
                return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            total = total * 10 + val;
        }
        return total * sign;
    }
}
