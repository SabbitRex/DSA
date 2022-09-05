/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

# https://leetcode.com/problems/n-ary-tree-level-order-traversal/

class N-ary_Tree_Level_Order_Traversal {
    
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            
            return result;
        }
        
        Queue<Node> queue = new LinkedList<>();
        
        queue.add(root);
        
        while (true) {
            
            int queueSize = queue.size();
            
            if (queueSize == 0) {
                
                break;
            }
            
            List<Integer> local = new ArrayList<>();
            
            while (queueSize > 0) {
                
                Node current = queue.poll();
                    
                local.add(current.val);
                
                for (Node child : current.children) {
                    
                    queue.add(child);
                }
                
                queueSize--;
            }
            
            result.add(local);
        }
        
        return result;
    }
}
