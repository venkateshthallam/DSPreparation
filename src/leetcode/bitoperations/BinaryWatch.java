package src.leetcode.bitoperations;

import java.util.ArrayList;
import java.util.List;

/*
1. Loop through total no of hours, minutes
2. See if the hour+minute bit count matches with the given number
3. if it matches, add the time as a formatted string using the hours and minutes from the loop.
*/
public class BinaryWatch {
	
	public static void main(String[] args) {
		System.out.println(readBinaryWatch(2));
	}
	
    public static List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<String>();
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                if(Integer.bitCount(h) + Integer.bitCount(m) == num)
                    res.add(new String(h+":"+m));
            }
        }
        
        return res;
    }
}