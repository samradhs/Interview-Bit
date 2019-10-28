public class Solution {
    public int minPathSum(int[][] A) {
       
        int n=A.length;
        int m=A[0].length;
         int a[][]=new int[n][m];
         a[0][0]=A[0][0];
        for(int i=1;i<m;i++){
            A[0][i]+=A[0][i-1];
        }
         for(int i=1;i<n;i++){
            A[i][0]+=A[i-1][0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                A[i][j]=Math.min(A[i][j]+A[i-1][j],A[i][j]+A[i][j-1]);
            }
        }
        return A[n-1][m-1];
    }
}
