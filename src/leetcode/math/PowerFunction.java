package src.leetcode.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PowerFunction {

	public static void main(String[] args) {
		//System.out.println(myPow(12,2));
		System.out.println(myPow(3.89707,2));
	}
	
	public static double myPow(double x, int n) {
        if(n==0) return 1.0;
        double res = 0.0;
        int t=n;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        while(n>1){
        	res += x*x;
        	n=n/2;
        }
        
        return t%2==0?res:res*x;
    }

}
