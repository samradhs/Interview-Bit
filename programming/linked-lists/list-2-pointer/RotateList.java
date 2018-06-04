// https://www.interviewbit.com/problems/rotate-list/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        
        if (B == 0 || A == null) return A;
        
        ListNode itr = A;
        int size = 0;
        
        while (itr != null) {
            
            itr = itr.next;
            size++;
        }
        
        if (B >= size) B %= size;
        if (B == 0) return A;
        
        ListNode prev = null;
        ListNode cur  = A;
        
        for (int i = 1; i <= (size - B); i++) {
            
            prev = cur;
            cur = cur.next;
        }
        
        prev.next = null;
        ListNode savedCur = cur;
        
        while (cur.next != null) {
            cur = cur.next;
        }
        
        cur.next = A;
        return savedCur;
    }
}
