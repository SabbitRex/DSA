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

# https://leetcode.com/problems/reverse-linked-list/

class Reverse_Linked_List_DummyNode {
    
    public ListNode reverseList(ListNode head) {
        
        ListNode dummy = null;
        
        while (head != null) {
            
            ListNode next = head.next;
            
            head.next = dummy;
            
            dummy = head;
            
            head = next;
        }
        
        return dummy;
    }
}
