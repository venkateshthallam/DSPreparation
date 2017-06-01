package src.leetcode.math;

/*
1. Create a boolean array of n.
2. Start marking all multiples of values less than sqrt(n) as not prime.
3. Count the primes by looping through the boolean array and return it,=.
*/
public class CountPrimes {

	public static void main(String[] args) {
		System.out.println("No of primes below 100 is "+countPrimes(100));
	}
	
	private static int countPrimes(int n){
		int pcount = 0;
		if(n < 3) return 0;
		boolean[] isNotPrime = new boolean[n];
		for(int i=2;i<Math.sqrt(n);i++){
			if(!isNotPrime[i]){
				for(int j=2;i*j<n;j++){
					isNotPrime[i*j] = true;
				}
			}
		}
		for(int i=2;i<isNotPrime.length;i++){
			if(!isNotPrime[i])
				pcount++;
		}
		return pcount;
	
    }
}
