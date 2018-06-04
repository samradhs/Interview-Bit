// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        
        if (A == null) return null;
        
        ListNode prev = A;
        while (prev.next != null) {
            
            ListNode cur = prev.next;
            if (prev.val == cur.val) {
                prev.next = cur.next;
                
            } else {
                prev = cur;
            }
        }
        
        return A;
    }
}
