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
 
# https://leetcode.com/problems/remove-linked-list-elements/
 
class Remove_Elements_From_Linked_List {

    public ListNode removeElements(ListNode head, int val) {
        
        ListNode result = new ListNode();
        ListNode current = result;
        
        while (head != null) {
            
            if (head.val != val) {
                
                current.next = new ListNode(head.val);
                current = current.next;
            }
            
            head = head.next;
        }
        
        return result.next;
    }
}
