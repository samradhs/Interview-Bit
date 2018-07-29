// https://www.interviewbit.com/problems/zigzag-level-order-traversal-bt/

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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A == null) return result;
        
        zigzagRec(result, A, false, 0);
        return result;
    }
    
    private void zigzagRec(ArrayList<ArrayList<Integer>> result, TreeNode node,
                            boolean isRight, int level) {
                              
        if (node == null) return;
                                
        ArrayList<Integer> list;
        if (level < result.size()) {
            list = result.get(level);
            
        } else {
            list = new ArrayList<>();
            result.add(level, list);
        }
        
        if (isRight) {
            list.add(0, node.val);
        } else {
            list.add(node.val);
        }
        
        zigzagRec(result, node.left, !isRight, level + 1);
        zigzagRec(result, node.right, !isRight, level + 1);
    }
}
