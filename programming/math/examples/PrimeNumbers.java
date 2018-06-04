// https://www.interviewbit.com/problems/prime-numbers/

public class Solution {
	public ArrayList<Integer> sieve(int a) {
	    
	    ArrayList<Integer> primes = new ArrayList<>();
	    for (int i = 0; i <= a; i++) {
	        primes.add(1);
	    }
	    
	    primes.set(0, 0);
	    primes.set(1, 0);
	    
	    for (int i = 2; i <= (int) Math.sqrt(a); i++) {
	        
	        if (primes.get(i) == 1) {
	            for (int j = 2; i * j <= a; j++) {
	                primes.set(i * j, 0);
	            }
	        }
	    }
	    
	    ArrayList<Integer> finalPrime = new ArrayList<>();
	    for (int i = 2; i <= a; i++) {
	        if (primes.get(i) == 1) finalPrime.add(i);
	    }
	    
	    return finalPrime;
	}
}
