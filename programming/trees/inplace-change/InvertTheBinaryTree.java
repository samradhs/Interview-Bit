// https://www.interviewbit.com/problems/invert-the-binary-tree/

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
    public TreeNode invertTree(TreeNode A) {
        
        if (A == null) return A;
        if (A.left == null && A.right == null) return A;
        
        TreeNode temp   = A.left;
        A.left          = A.right;
        A.right         = temp;
        
        invertTree(A.left);
        invertTree(A.right);
        return A;
    }
}
