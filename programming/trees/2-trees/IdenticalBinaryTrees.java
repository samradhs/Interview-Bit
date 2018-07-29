// https://www.interviewbit.com/problems/identical-binary-trees/

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
    public int isSameTree(TreeNode A, TreeNode B) {
        
        if (A == null && B == null) return 1;
        if (A == null || B == null) return 0;
        
        if (A.val != B.val) return 0;
        if (isSameTree(A.left, B.left) == 0) return 0;
        return isSameTree(A.right, B.right);
    }
}
