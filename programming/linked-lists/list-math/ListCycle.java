// https://www.interviewbit.com/problems/list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
	    
	    ListNode tor  = a;
	    ListNode hare = a;
	    ListNode cycleStart = null;
	    
	    while (tor != null && hare != null && hare.next != null) {
	        
	        tor  = tor.next;
	        hare = hare.next.next;
	        
	        if (tor == hare) {
	            
	            tor = a;
	            while (tor != hare) {
	                
	                tor  = tor.next;
	                hare = hare.next;
	            }
	            
	            cycleStart = tor;
	            break;
	        }
	    }
	    
	    return cycleStart;
	}
}
