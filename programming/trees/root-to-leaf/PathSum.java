// https://www.interviewbit.com/problems/path-sum/

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
    public int hasPathSum(TreeNode A, int B) {
        
        if (A == null) return 0;
        
        return pathSum(A, 0, B);
    }
    
    private int pathSum(TreeNode node, int sum, int B) {
        
        if (node == null) return 0;
        
        int sumTillNow = sum + node.val;
        if (node.left == null && node.right == null && sumTillNow == B) return 1;
        
        int isPathSumInLeft = pathSum(node.left, sumTillNow, B);
        if (isPathSumInLeft == 1) return 1;
        
        return pathSum(node.right, sumTillNow, B);
    }
}
