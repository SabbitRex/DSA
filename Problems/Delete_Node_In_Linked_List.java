/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// You are only given the node to delete and not the head.
// It is guaranteed that the node to be deleted is not a tail node in the list.

class Delete_Node_In_Linked_List {
    
    public void deleteNode(ListNode node) {
        
        if (node != null && node.next != null) {
            
            node.val = node.next.val;
            
            node.next = node.next.next;
        }
    }
}
