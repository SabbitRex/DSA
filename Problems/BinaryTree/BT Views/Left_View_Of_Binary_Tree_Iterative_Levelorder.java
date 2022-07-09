# https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1#

class Left_View_Of_Binary_Tree_Iterative_Levelorder {
    
    static class Pair {
        
        Node node;
        int index;
        
        public Pair(Node node, int index) {
            
            this.node = node;
            this.index = index;
        }
    }
    
    public ArrayList<Integer> leftView(Node root) {
      
        ArrayList<Integer> result = new ArrayList<>();
      
        if (root == null) {
          
            return result;
        } 
      
        Set<Integer> set = new HashSet<>();
        
        Queue<Pair> queue = new LinkedList<>();
        
        Pair rootPair = new Pair(root, 0);
        
        queue.add(rootPair);
        
        while (true) {
            
            int queueSize = queue.size();
            
            if (queueSize == 0) {
                
                break;
            }
            
            while (queueSize > 0) {
                
                Pair currentPair = queue.poll();
                
                Node current = currentPair.node;
                
                int currentIndex = currentPair.index;
                
                if (set.add(currentIndex)) {
                    
                    result.add(current.data);
                }
                
                if (current.left != null) {
                    
                    Pair pair = new Pair(current.left, currentIndex + 1);
                    
                    queue.add(pair);
                }
                
                if (current.right != null) {
                    
                    Pair pair = new Pair(current.right, currentIndex + 1);
                    
                    queue.add(pair);
                }
                
                queueSize--;
            }
        }
        
        return result;
    }
}
