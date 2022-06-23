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

# https://leetcode.com/problems/reverse-linked-list-ii/

class Reverse_Linked_List_II {
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if (head == null) {
            
            return null;
        }
        
        if (left == right) {
            
            return head;    
        }
        
        ListNode dummy = new ListNode(0, head);
        
        ListNode prevLeft = dummy;
        ListNode leftB = head;
        
        int idx = 1;
        
        while (idx < left) {
            
            prevLeft = leftB;
            leftB = leftB.next;
            idx++;
        }
        
        ListNode temp = null;
        
        while (idx <= right) {
            
            ListNode nextLeft = leftB.next;
            leftB.next = temp;
            temp = leftB;
            leftB = nextLeft;
            idx++;
        }
        
        prevLeft.next.next = leftB;
        prevLeft.next = temp; 
        
        return dummy.next;
    }
}
