// https://www.interviewbit.com/problems/kth-smallest-element-in-tree/

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    
    private int i = 0;
    
    public int kthsmallest(TreeNode A, int B) {
        
        if (A == null) return -1;
            
        int left = kthsmallest(A.left, B);
        if (left != -1) return left;
        
        i++;
        if (B == i) return A.val;
        
        return kthsmallest(A.right, B);
    }
}
