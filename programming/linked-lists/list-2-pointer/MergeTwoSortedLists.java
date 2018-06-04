// https://www.interviewbit.com/problems/merge-two-sorted-lists/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        
        if (A == null) return B;
        if (B == null) return A;
        
        ListNode headA  = A;
        ListNode headB  = B;
        ListNode C      = null;
        ListNode cur    = null;
        ListNode prev   = null;
        
        if (headA.val < headB.val) {
            C = headA;
            headA = headA.next;
        } else {
            C = headB;
            headB = headB.next;
        }
        
        prev = C;
        
        while (headA != null && headB != null) {
            
            if (headA.val < headB.val) {
                cur = headA;
                headA = headA.next;
            } else {
                cur = headB;
                headB = headB.next;
            }
            
            prev.next = cur;
            prev = cur;
        }
        
        if (headA != null) {
            prev.next = headA;
        }
        
        if (headB != null) {
            prev.next = headB;
        }
        
        return C;
    }
}
