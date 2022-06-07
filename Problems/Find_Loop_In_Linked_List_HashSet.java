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
public class Find_Loop_In_Linked_List_HashSet {

    public ListNode detectCycle(ListNode head) {
        
        ListNode node = null;
        
        Set<ListNode> set = new HashSet<ListNode>();
        
        if (head == null) {
            
            return null;
        }
        
        while (head.next != null) {
                
            if (set.add(head)) {
                
                head = head.next;
                
            } else {
                
                node = head; 
                break;
            }
        }
        
        return node;
    }
}
