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
 
public class IntersectionOfTwoLinkedLists {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode p1 = headA;
        
        ListNode p2 = headB;
        
        Set<ListNode> set = new HashSet<ListNode>();
        
        while (p1 != null) {
            
            set.add(p1);
            
            p1 = p1.next;
        }
        
        while (p2 != null) {
            
            if (set.contains(p2)) {
                
                return p2;
            }
            
            p2 = p2.next;
        }
        
        return null;
    }
}
