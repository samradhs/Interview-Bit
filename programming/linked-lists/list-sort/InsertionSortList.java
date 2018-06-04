// https://www.interviewbit.com/problems/insertion-sort-list/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    
    ListNode sorted;
    
    public ListNode insertionSortList(ListNode A) {
        
        sorted = null;
        ListNode current = A;
        
        while (current != null) {
            
            ListNode next = current.next;
            sortedInsert(current);
            current = next;
        }
        
        return sorted;
    }
    
    private void sortedInsert(ListNode newnode) {
    
        if (sorted == null || sorted.val >= newnode.val) {
            newnode.next = sorted;
            sorted = newnode;
            
        } else {
            
            ListNode current = sorted;
            while (current.next != null && current.next.val < newnode.val) {
                current = current.next;
            }
            
            newnode.next = current.next;
            current.next = newnode;
        }
    }
}
