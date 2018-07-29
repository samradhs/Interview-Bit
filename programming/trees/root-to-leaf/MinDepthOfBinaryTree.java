// https://www.interviewbit.com/problems/min-depth-of-binary-tree/

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
    public int minDepth(TreeNode A) {
        
        if (A == null) return 0;
        
        int depthLeft   = 1 + minDepth(A.left);
        int depthRight  = 1 + minDepth(A.right);
        
        if (depthLeft == 1)     return depthRight;
        if (depthRight == 1)    return depthLeft;
        
        return Math.min(depthLeft, depthRight);
    }
}
