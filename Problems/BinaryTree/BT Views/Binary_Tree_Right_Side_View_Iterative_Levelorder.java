/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

# https://leetcode.com/problems/binary-tree-right-side-view/

class Binary_Tree_Right_Side_View_Iterative_Levelorder {
    
    static class Pair {
        
        TreeNode node;
        int level;
        
        public Pair(TreeNode node, int level) {
            
            this.node = node;
            this.level = level;
        }
    }
    
    public List<Integer> rightSideView(TreeNode root) {
            
        List<Integer> result = new ArrayList<>();
        
        if (root == null) {
            
            return result;
        }
        
        Queue<Pair> queue = new LinkedList<>();
        
        queue.add(new Pair(root, 0));
        
        Set<Integer> set = new HashSet<>();
        
        while (!queue.isEmpty()) {
            
            int queueSize = queue.size();
            
            while (queueSize > 0) {
                
                Pair currentPair = queue.poll();
                
                TreeNode currentNode = currentPair.node;
                
                int currentLevel = currentPair.level;
                
                if (set.add(currentLevel)) {
                    
                    result.add(currentNode.val);
                }
                
                if (currentNode.right != null) {
                    
                    queue.add(new Pair(currentNode.right, currentLevel + 1));
                }
                
                if (currentNode.left != null) {
                    
                    queue.add(new Pair(currentNode.left, currentLevel + 1));
                }
                
                queueSize--;
            }
        }
        
        return result;
    }
}
