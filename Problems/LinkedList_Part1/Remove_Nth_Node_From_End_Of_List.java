# https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class Remove_Nth_Node_From_End_Of_List {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0, head);
        
        ListNode left = dummy;
        
        ListNode right = head;
        
        while (n > 0 && right != null) {
            
            right = right.next;
            n--;
        }
        
        while (right != null) {
            
            left = left.next;
            right = right.next;
        }
        
        left.next = left.next.next;
        
        return dummy.next;
    }
}
