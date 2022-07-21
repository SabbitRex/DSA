/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

# https://leetcode.com/problems/copy-list-with-random-pointer/

class Copy_List_With_Random_Pointer_Hashmap {
    
    public Node copyRandomList(Node head) {
        
        if (head == null) {
            
            return null;
        }
        
        Map<Node, Node> map = new HashMap<>();
        
        Node temp = head;
        
        while (temp != null) {
            
            map.put(temp, new Node(temp.val));
            
            temp = temp.next;
        }
        
        Node result = head;
        
        while (head != null) {
            
            map.get(head).next = map.get(head.next);
            
            map.get(head).random = map.get(head.random);
            
            head = head.next;
        }
        
        return map.get(result);
    }
}
