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
 
 # https://leetcode.com/problems/rotate-list/
 
class Rotate_List_Find_BreakPoint {
    
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null || head.next == null || k == 0) {
            
            return head;
        }
        
        ListNode current = head;
        
        int size = 1;
        
        // Walk to second last node (till current.next != null) and get size of list
        while (current.next != null) {
            
            size++;
            current = current.next;
        }
        
        // once you are at last node, point next of last node to head
        current.next = head;
        
        // find the break point of list and break the link
        int breakPoint = size - (k % size);
        
        // walk to reach break point
        while (breakPoint > 0) {
        
            current = current.next;
            breakPoint--;
        }
        
        // break the link and return new head 
        head = current.next;
        current.next = null;
        
        return head;
    }
}
