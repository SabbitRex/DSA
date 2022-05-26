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
class RemoveDuplicateFromSortedLinkedList {
    
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode result = head;
        
        while (head != null && head.next != null) {
            
            if (head.val ==  head.next.val) {
                
                head.next = head.next.next;
                
            } else {
                
                head = head.next;
            }
        }
        
        return result;
    }
}
