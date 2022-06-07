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

class Middle_Of_Linked_List {
    
    public ListNode middleNode(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null) {
            
            slow = slow.next;
            
            if (fast.next.next == null) {
                
                return slow;
                
            } else {
                
                fast = fast.next.next;
            }
            
        }
        
        return slow;
    }
}
