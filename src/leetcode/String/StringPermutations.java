package src.leetcode.String;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StringPermutations {

	public static void main(String[] args) {
		Set<String> resultset = new TreeSet<String>();
		permutation("hefg", resultset);
		Iterator<String> iterator = resultset.iterator();
		while(iterator.hasNext()){
			String temp = iterator.next();
			if(temp.equals("hefg")){
				System.out.println("final result is "+iterator.next());
			}
		}
		System.out.println(resultset);
	}
	
	public static void permutation(String str, Set<String> resultset) { 
	    permutation("", str, resultset); 
	}

	private static void permutation(String prefix, String str, Set<String> resultset ) {
	    int n = str.length();
	    if (n == 0) {//System.out.println(prefix);
	    resultset.add(prefix);
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), resultset);
	    }
	}

}
