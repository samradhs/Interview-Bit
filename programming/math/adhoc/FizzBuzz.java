// https://www.interviewbit.com/problems/fizzbuzz/

public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        
        ArrayList<String> b = new ArrayList<String>();
        
        for (Integer i = 1; i <= A; i++) {
            
            if (i % 15 == 0) {
                b.add("FizzBuzz");
            } else if (i % 3 == 0) {
                b.add("Fizz");
            } else if (i % 5 == 0) {
                b.add("Buzz"); 
            } else {
                b.add(i.toString());
            }
        }
        
        return b;
    }
}
