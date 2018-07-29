// https://www.interviewbit.com/problems/flatten-binary-tree-to-linked-list/

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public TreeNode flatten(TreeNode a) {
        
        try {
            if (a == null || a.left == null) return null;
            
            if (a.left.left == null) {
                
                TreeNode temp = a.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                
                temp.right = a.right;
                a.right = a.left;
                a.left = null;
                
                return a;
            }
            
            flatten(a.left);
            // flatten(a);
            flatten(a.right);
        } catch (Exception e) {
            System.out.println(e);
        }
        return a;
    }
}
