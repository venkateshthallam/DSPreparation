package Random;

public class IntegertoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		System.out.println(Integer.toBinaryString(x));
		char c='c';
		int asciiofC=(int)c;
		long y=10;
		//System.out.println(grayEncode(Long.parseLong((Integer.toBinaryString(asciiofC)))));
		System.out.println(Long.toBinaryString(grayEncode(y)));
		
	}

	public static long grayEncode(long n){
		return n ^ (n >>> 1);
	}
	public static long grayDecode(long n) {
		long p = n;
		while ((n >>>= 1) != 0)
			p ^= n;
		return p;
	}
 
}
