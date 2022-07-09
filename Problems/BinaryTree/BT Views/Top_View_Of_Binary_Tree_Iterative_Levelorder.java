# https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1

class Top_View_Of_Binary_Tree_Iterative_Levelorder {
    
    static class Pair {
        
        Node node;
        int index;
        
        public Pair(Node node, int index) {
            
            this.node = node;
            this.index = index;
        }
    }
    
    public ArrayList<Integer> topView(Node root) {
        
        ArrayList<Integer> result = new ArrayList<>();
      
        if (root == null) {
          
            return result;
        }
        
        Queue<Pair> queue = new LinkedList<>();
        
        Pair rootPair = new Pair(root, 0);
        
        queue.add(rootPair);
        
        Map<Integer, Node> map = new TreeMap<>();
        
        while (true) {
            
            int queueSize = queue.size();
            
            if (queueSize == 0) {
                
                break;
            }
            
            while (queueSize > 0) {
                
                Pair currentPair = queue.poll();
                
                Node current = currentPair.node;
                
                int currentIndex = currentPair.index;
                
                if (!map.containsKey(currentIndex)) {
                    
                    map.put(currentIndex, current);
                }
                
                if (current.left != null) {
                    
                    Pair pair = new Pair(current.left, currentIndex - 1);
                    
                    queue.add(pair);
                }
                
                if (current.right != null) {
                    
                    Pair pair = new Pair(current.right, currentIndex + 1);
                    
                    queue.add(pair);
                }
                
                queueSize--;
            }
        }
        
        for (Map.Entry<Integer, Node> block : map.entrySet()) {
            
            result.add(block.getValue().data);
        }
        
        return result;
    }
}
