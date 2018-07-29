// https://www.interviewbit.com/problems/sum-root-to-leaf-numbers/

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
    public int sumNumbers(TreeNode A) {
        
        if (A == null) return 0;
        return rootToLeafSum(A, 0, 0);
    }
    
    private int rootToLeafSum(TreeNode node, int num, int sum) {
        
        if (node == null) return sum;
        
        num = (num * 10 + node.val) % 1003;
        if (node.left == null && node.right == null) return num;
        
        int sumLeft  = rootToLeafSum(node.left, num, sum);
        int sumRight = rootToLeafSum(node.right, num, sum);
        
        return (sumLeft + sumRight) % 1003;
    }
}
