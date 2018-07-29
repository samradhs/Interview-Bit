// https://www.interviewbit.com/problems/sorted-array-to-balanced-bst/

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
    public TreeNode sortedArrayToBST(final List<Integer> a) {
        
        if (a == null || a.isEmpty()) return null;
        return createBalancedBST(a, 0, a.size() - 1);
    }
    
    private TreeNode createBalancedBST(List<Integer> a, int left, int right) {
        
        if (left > right) return null;
        
        int mid = (left + right) / 2;
        
        TreeNode node   = new TreeNode(a.get(mid));
        node.left       = createBalancedBST(a, left, mid - 1);
        node.right      = createBalancedBST(a, mid + 1, right);
        
        return node;
    }
}
