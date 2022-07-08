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

# https://leetcode.com/problems/palindrome-linked-list/

class Palindrome_Linked_List {
    
    public boolean isPalindrome(ListNode head) {
        
        if (head == null || head.next == null) {
            
            return true;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = reverse(slow.next);
        
        slow = slow.next;
        
        while (slow != null) {
            
            if (head.val != slow.val) {
                
                return false;
            }
            
            slow = slow.next;
            head = head.next;
        }
        
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        
        ListNode dummy = null;
        
        while (head != null) {
            
            ListNode temp = head.next;
            head.next = dummy;
            dummy = head;
            head = temp;
        }
        
        return dummy;
    }
}
