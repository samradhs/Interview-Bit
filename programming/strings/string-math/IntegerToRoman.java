//  https://www.interviewbit.com/problems/integer-to-roman/

public class Solution {
    public String intToRoman(int A) {
        
        StringBuilder sb = new StringBuilder();
        
        if (A >= 1000) {
            
            for (int j = 1; j <= A / 1000; j++) {
                sb.append('M');
            }
            
            A %= 1000;
        }
        
        if (A >= 900) {
            
            sb.append("CM");
            A -= 900;
        }
        
        if (A >= 500) {
            sb.append('D');
            A -= 500;
        }
        
        if (A >= 400) {
            sb.append("CD");
            A -= 400;
        }
        
        if (A >= 100) {
            
            for (int j = 1; j <= A / 100; j++) {
                sb.append('C');
            }
            
            A %= 100;
        }
        
        if (A >= 90) {
            sb.append("XC");
            A -= 90;
        }
        
        if (A >= 50) {
            sb.append('L');
            A -= 50;
        }
        
        if (A >= 40) {
            sb.append("XL");
            A -= 40;
        }
        
        if (A >= 10) {
            
            for (int j = 1; j <= A / 10; j++) {
                sb.append('X');
            }
            
            A %= 10;
        }
        
        if (A == 9) {
            sb.append("IX");
            return sb.toString();
        }
        
        if (A >= 5) {
            sb.append('V');
            A -= 5;
        }
        
        if (A == 4) {
            sb.append("IV");
            return sb.toString();
        }
        
        if (A >= 1) {
            for (int j = 1; j <= A; j++) {
                sb.append('I');
            }
        }
        
        return sb.toString();
    }
}
