// https://www.interviewbit.com/problems/balanced-binary-tree/

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
    public int isBalanced(TreeNode A) {
        
        if (A == null) return 1;
        
        if (A.left == null) return (depth(A.right) <= 1) ? 1 : 0;
        if (A.right == null) return (depth(A.left) <= 1) ? 1 : 0;
        
        return ((isBalanced(A.left) == 1) && (isBalanced(A.right) == 1)) ? 1 : 0;
    }
    
    private int depth(TreeNode node) {
        
        if (node == null) return 0;
        
        int depthLeft   = 1 + depth(node.left);
        int depthRight  = 1 + depth(node.right);
        
        return Math.max(depthLeft, depthRight);
    }
}
