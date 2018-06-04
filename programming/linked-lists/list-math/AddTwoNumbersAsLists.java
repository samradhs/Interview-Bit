// https://www.interviewbit.com/problems/add-two-numbers-as-lists/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        
        if (A == null) return B;
        if (B == null) return A;
        
        int carry = 0;
        ListNode prev = null;
        ListNode start = null;
        
        while (A != null || B != null) {
            
            int addVal = (A != null ? A.val : 0) + (B != null ? B.val : 0) + carry;
            if (addVal > 9) {
                addVal %= 10;
                carry = 1;
                
            } else {
                carry = 0;
            }
            
            ListNode cur = new ListNode(addVal);
            if (start == null) start = cur;
            else prev.next = cur;
            prev = cur;
            
            if (A != null) A = A.next;
            if (B != null) B = B.next;
        }
        
        if (carry == 1) {
            ListNode cur = new ListNode(1);
            prev.next = cur;
        }
        
        return start;
    }
}
