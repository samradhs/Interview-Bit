// https://www.interviewbit.com/problems/inorder-traversal/

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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        
        ArrayList<Integer> list = new ArrayList<>();
        if (A == null) return list;
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = A;
        
        while (temp != null || !stack.isEmpty()) {
            
            if (temp == null) {       
                list.add(stack.pop().val);
                temp = stack.pop();
                list.add(temp.val);
                temp = temp.right;
                
            } else {
                if (temp.right != null) stack.push(temp.right);
                stack.push(temp);
                temp = temp.left;
            }
        }
        
        return list;
    }
}
