/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
public class Linked_List_Cycle_HashSet_Boolean {
    
    public boolean hasCycle(ListNode head) {
        
        boolean isLoop = false;
        
        Set<ListNode> set = new HashSet<ListNode>();
        
        if (head == null) {
            
            return false;
        }
        
        while (head.next != null) {
                
            if (set.add(head)) {
                
                head = head.next;
                
            } else {
                
                isLoop = true; 
                break;
            }
        }
        
        return isLoop;
    }
}
