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

# https://leetcode.com/problems/swap-nodes-in-pairs/

class Swap_Nodes_In_Pairs_Recursion {
    
    public ListNode swapPairs(ListNode head) {
        
        swap(head);
        
        return head;
    }
    
    private ListNode swap(ListNode node) {
        
        if (node == null || node.next == null) {
            
            return null;
        }
        
        int temp = node.val;
        node.val = node.next.val;
        node.next.val = temp;
        
        return swap(node.next.next);
    }
}
