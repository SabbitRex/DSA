/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

# https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

class Delete_The_Middle_Node_Of_A_Linked_List {
    
    public ListNode deleteMiddle(ListNode head) {
        
        if (head == null || head.next == null) {
            
            return null;
        }
        
        ListNode slow = head;
        
        ListNode fast = head;
        
        ListNode previous = null;
        
        while (fast.next != null) {
            
            previous = slow;
            slow = slow.next;
            
            if (fast.next.next == null) {
                
                break;
                
            } else {
                
                fast = fast.next.next;
            }
        }
        
        previous.next = slow.next;
        
        return head;
    }
}
