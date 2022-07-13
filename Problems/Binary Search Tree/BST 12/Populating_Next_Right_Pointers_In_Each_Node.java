# https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

class Populating_Next_Right_Pointers_In_Each_Node {
    
    public Node connect(Node root) {
        
        if (root == null) {
            
            return null;
        }    
        
        Queue<Node> queue = new LinkedList<>();
        
        queue.add(root);
        
        while (true) {
            
            int queueSize = queue.size();
            
            if (queueSize == 0) {
                
                break;
            }
            
            while (queueSize > 0) {
                
                Node current = queue.poll();
                
                current.next = queue.peek();
                
                if (current.left != null) {
                    
                    queue.add(current.left);
                }
                
                if (current.right != null) {
                    
                    queue.add(current.right);
                }
                
                queueSize--;
                
                if (queueSize == 0) {
                    
                    current.next = null;
                }
            }
        }
        
        return root;
    }
}
