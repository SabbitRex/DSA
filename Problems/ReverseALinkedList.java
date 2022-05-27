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
 
class ReverseALinkedList {
    
    public ListNode reverseList(ListNode head) {
        
        if (head == null || head.next == null) {
            
            return head;
        }
        
        ListNode front = head;
        ListNode current = head;
        ListNode root = head;
        
        ListNode rear = head;
        
        int start = 0;
        int end = 0;
        
        while (rear.next != null) {
            
            rear = rear.next;
            end++;
        }
        
        int step = 0;
        
        while (start <= end) {
            
            while (step < end) {
                
                current = current.next;
                step++;
            }
            
            int temp = front.val;
            front.val = current.val;
            current.val = temp;
            
            start++;
            end--;
            step = start;
            
            current = front.next;
            front = front.next;
        }
        
        return root;
    }
}
