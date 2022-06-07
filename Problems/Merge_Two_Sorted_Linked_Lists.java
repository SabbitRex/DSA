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

class Merge_Two_Sorted_Linked_Lists {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if (list1 == null) {
            
            return list2;
        }
        
        if (list2 == null) {
            
            return list1;
        }
        
        if (list1 == null && list2 == null) {
            
            return null;
        }
        
        ListNode result = new ListNode(0);
        
        ListNode temp = result;
        
        while (list1 != null && list2 != null) {
            
            if (list1.val <= list2.val) {
                
                result.next = new ListNode(list1.val, null);
                
                list1 = list1.next;
                
            } else {
                
                result.next = new ListNode(list2.val, null);
                
                list2 = list2.next;
            }
            
            result = result.next;
        }
        
        if (list1 == null) {
            
            result.next = list2;
        }
        
        if (list2 == null) {
            
            result.next = list1;
        }
        
        return temp.next;
    }
}
