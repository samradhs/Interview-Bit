// https://www.interviewbit.com/problems/least-common-ancestor/

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
    
    private boolean v1 = false;
    private boolean v2 = false;
    
    public int lca(TreeNode A, int B, int C) {
        
        TreeNode res = findLCAUtil(A, B, C);
        
        if (v1 && v2 || v1 && find(res, C) || v2 && find(res, B))
            return res.val;
        
        return -1;
    }
    
    private TreeNode findLCAUtil(TreeNode root, int n1, int n2) {
        if (root == null) return null;
 
        if (root.val == n1) {
            v1 = true;
            return root;
        }
        
        if (root.val == n2) {
            v2 = true;
            return root;
        }
 
        TreeNode leftLCA = findLCAUtil(root.left, n1, n2);
        TreeNode rightLCA = findLCAUtil(root.right, n1, n2);
 
        if (leftLCA != null && rightLCA != null) return root;
        return (leftLCA != null) ? leftLCA : rightLCA;
    }
     
    private boolean find(TreeNode root, int k) {
       
        if (root == null) return false;
        return (root.val == k || find(root.left, k) ||  find(root.right, k));
    }
}
