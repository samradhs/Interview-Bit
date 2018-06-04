// https://www.interviewbit.com/problems/remove-nth-node-from-list-end/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode removeNthFromEnd(ListNode a, int b) {
	    
	    if (a == null) return null;
	    
	    int temp       = 1;
	    ListNode head  = a;
	    ListNode ans   = head;
	    ListNode start = a;
	    int size       = 0;
	    
	    while (start != null) {
	        start = start.next;
	        size++;
	    }
	    
	    if (size == 1) return null;
	    
	    if (b > size){
	        a = a.next;
	        ans.next = null;
	        return a;
	        
	    } else {
	        
	        b = size - b + 1;
	        if (b == 1) {
	            a = a.next;
	            ans.next = null;
	            return a;
	        }
	        
	        while(temp != b-1){
	            head = head.next;
	            temp++;
	        }
	        
	        head.next = head.next.next;
	        return ans;
	    }
	}
}

