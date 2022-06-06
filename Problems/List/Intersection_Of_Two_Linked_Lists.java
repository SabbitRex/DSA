/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
# https://leetcode.com/problems/intersection-of-two-linked-lists/

public class Intersection_Of_Two_Linked_Lists {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode a = headA;
        
        ListNode b = headB;
        
        while (a != b) {
            
            if (a == null) {
                
                a = headB;
                
            } else {
                
                a = a.next;
            }
            
            if (b == null) {
                
                b = headA;
                
            } else {
                
                b = b.next;
            }
        }
        
        return a;
    }
}
