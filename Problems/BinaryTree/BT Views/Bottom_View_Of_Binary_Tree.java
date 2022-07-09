# https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

class Bottom_View_Of_Binary_Tree {
    
    static class Pair {
        
        int level;
        Node node;
        
        public Pair(Node node, int level) {
            
            this.level = level;
            this.node = node;
        }
    }
    
    public ArrayList<Integer> bottomView(Node root) {
        
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
                
                Node currentNode = currentPair.node;
                
                int currentLevel = currentPair.level;
                
                map.put(currentLevel, currentNode);
                
                if (currentNode.left != null) {
                    
                    Pair pair = new Pair(currentNode.left, currentLevel - 1);
                    
                    queue.add(pair);
                }
                
                if (currentNode.right != null) {
                    
                    Pair pair = new Pair(currentNode.right, currentLevel + 1);
                    
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
