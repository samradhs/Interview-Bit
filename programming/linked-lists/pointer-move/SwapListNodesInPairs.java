// https://www.interviewbit.com/problems/swap-list-nodes-in-pairs/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        
        if (A == null || A.next == null) return A;
        
        ListNode prev = A;
        ListNode cur = A.next;
        A = cur;
        
        while (true) {
            
            ListNode next = cur.next;
            cur.next = prev;
            
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }
            
            prev.next = next.next;
            prev = next;
            cur = prev.next;
        }
        
        return A;
    }
}
