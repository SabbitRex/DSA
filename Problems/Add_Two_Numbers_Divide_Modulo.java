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
class Add_Two_Numbers_Divide_Modulo {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;
        
        ListNode resultHead = new ListNode();
        
        ListNode current = resultHead;
        
        while (l1 != null || l2 != null || carry != 0) {
            
            int d1 = 0;
            
            if (l1 != null) {
                
                d1 = l1.val;
            }
            
            int d2 = 0;
            
            if (l2 != null) {
                
                d2 = l2.val;
            }
            
            int sum = d1 + d2 + carry;
            
            carry = sum / 10;
            
            int onesPlace = sum % 10;
            
            current.next = new ListNode(onesPlace);
            
            current = current.next;
            
            if (l1 != null) {
                
                l1 = l1.next;
                
            } else {
                    
                l1 = null;
            }
            
            if (l2 != null) {
                
                l2 = l2.next;
                
            } else {
                    
                l2 = null;
            }
        }
        
        return resultHead.next;
    }
}
