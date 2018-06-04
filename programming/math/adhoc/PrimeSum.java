// https://www.interviewbit.com/problems/prime-sum/

public class Solution {
    public ArrayList<Integer> primesum(int a) {
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        for (int i = 2; i <= a / 2; i++) {
            
            if (!isPrime(i)) continue;
            int j = a - i;
            
            if (isPrime(j)) {
                
                num.add(i);
                num.add(j);
                return num;
            }
        }
        
        return num;
    }
    
    private boolean isPrime(int x) {
        
        if (x == 0 || x == 1) return false;
        
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        
        return true;
    }
}
