/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
# https://leetcode.com/problems/linked-list-cycle/

public class Linked_List_Cycle_Floyd_Algo {
    
    public boolean hasCycle(ListNode head) {
        
        ListNode slow = head;
        
        ListNode fast = head;
        
        boolean isLoop = false;
        
        while (fast != null && fast.next != null) {
            
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                
                isLoop = true;
                break;
            }
        }
        
        return isLoop;
    }
}
