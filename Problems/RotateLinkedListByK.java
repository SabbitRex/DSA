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
 
class RotateLinkedListByK {
    
    public ListNode rotateRight(ListNode head, int k) {
        
		if (head == null || head.next == null) {
			
			return head;
		}
		
		ListNode current = head;
		int size = 2;
		
		while (current.next.next != null) {
			
			current = current.next;
			size++;
		}
		
		k = k % size;
		
		if ( k == 0) {
			
			return head;
		}
		
		ListNode root = current.next;
		root.next = head;
		current.next = null;
		
		return rotateRight(root, --k);
    }
}
