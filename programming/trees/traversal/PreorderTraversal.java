// https://www.interviewbit.com/problems/preorder-traversal/

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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        
        ArrayList<Integer> list = new ArrayList<>();
        if (A == null) return list;
        
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode temp = A;
        while (temp != null || !stack.isEmpty()) {
            
            if (temp == null) {
                temp = stack.pop();
                
            } else {
                list.add(temp.val);
                if (temp.right != null) stack.push(temp.right);
                temp = temp.left;
            }
        } 
        
        return list;
    }
}
