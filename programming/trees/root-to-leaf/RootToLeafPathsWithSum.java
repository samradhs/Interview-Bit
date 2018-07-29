// https://www.interviewbit.com/problems/root-to-leaf-paths-with-sum/

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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A == null) return result;
        
        pathSumRec(result, new ArrayList<>(), A, B);
        return result;
    }
    
    private void pathSumRec(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> curList, TreeNode node, int B) {
        
        if (node == null) return;
        curList.add(node.val);
        
        if (node.left == null && node.right == null && node.val == B) {
            
            result.add(new ArrayList<>(curList));
            curList.remove(curList.size() - 1);
            return;
        }
        
        pathSumRec(result, curList, node.left, B - node.val);
        pathSumRec(result, curList, node.right, B - node.val);
        curList.remove(curList.size() - 1);
    }
}