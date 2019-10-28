public class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        int min[][]=new int[n][m];
        if(a[0][0]==0)min[0][0]=1;
        for(int i=1;i<n;i++){
            if(a[i][0]==0)
            min[i][0]=min[i-1][0];
        }
        for(int i=1;i<m;i++){
            if(a[0][i]==0)
            min[0][i]=min[0][i-1];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(a[i][j]==0){
                    min[i][j]=min[i-1][j]+min[i][j-1];
                }
        }
        }
        return min[n-1][m-1];
        
    }
}
