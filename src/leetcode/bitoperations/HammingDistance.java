package src.leetcode.bitoperations;

public class HammingDistance {

	public static void main(String[] args) {
		
		System.out.println("Hamming Distance between 1 and 4 is "+hammingDistance(1,4));
		
	}
	
	 public static int hammingDistance(int x, int y) {
	        return Integer.bitCount(x ^ y);
	  }

}
