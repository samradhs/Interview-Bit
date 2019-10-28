public class Solution {
    public int solve(String A) {
        int l=A.length();
        int L[][]=new int[A.length()][A.length()];
       for(int i=0;i<l;i++){
           L[i][i]=1;
       }
       int j;
       for(int k=2;k<=l;k++){
           for(int i=0;i<l-k+1;i++){
             j=i+k-1;
             if(A.charAt(i)==A.charAt(j)&&k==2){
                 L[i][j]=2;
             }
             else if(A.charAt(i)==A.charAt(j)){
                 L[i][j]=L[i+1][j-1]+2;
             }
             else
             L[i][j]=Math.max(L[i][j-1],L[i+1][j])
               ;
           }
           
       }
       return L[0][l-1];
        
        
    }
}
