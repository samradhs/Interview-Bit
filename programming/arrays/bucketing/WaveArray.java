// https://www.interviewbit.com/problems/wave-array/

public class Solution {
    public int[] wave(int[] A) {
        
        int size = A.length;
        Arrays.sort(A);
        
        for (int i = 0; i < size - 1; i += 2) {
            
            int temp = A[i];
            A[i] = A[i + 1];
            A[i + 1] = temp;
        }
        
        return A;
    }
}
