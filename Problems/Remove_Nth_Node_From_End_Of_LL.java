class Remove_Nth_Node_From_End_Of_LL {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int movement = 0;
        
        ListNode temp = head;
        ListNode current = head;
        ListNode prev = null;
        
        while (current != null && movement < n) {
            
            current = current.next;
            movement++;
        }
        
        
        if (current == null) {
            
            return head.next;
        }
        
        while (current != null) {
            
            current = current.next;
            prev = temp;
            temp = temp.next;
        }
        
        prev.next = temp.next;
        
        return head;
    }
}
