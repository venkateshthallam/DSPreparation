package src.leetcode.bitoperations;

public class BitOperationsTest {

	public static void main(String[] args) {
		int val = 6;
		System.out.println("6 after 1 left shift "+(val << 1));
		System.out.println("6 after 1 right shift "+(val >> 1));
		System.out.println("6 after ^(XOR) with 1 "+(6 ^ 1));
		System.out.println("6 after ^(XOR) with 6/2 "+(6 ^ 6/2));
	}
}
 