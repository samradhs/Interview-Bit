// https://www.interviewbit.com/problems/reverse-link-list-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        
        if (B == C) return A;
        
        int i = 1;
        ListNode prev = null;
        ListNode current = A;
        
        while (i < B) {
            
            prev = current;
            current = current.next;
            i++;
        }
        
        ListNode startPrev = prev;
        ListNode startCur = current;
        
        ListNode next = null;
        
        while (i <= C && current != null) {
            
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i++;
        }
        
        if (B > 1) {
            startPrev.next = prev;
        } else {
            A = prev;
        }
        
        startCur.next = next;
        return A;
    }
}
