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

# https://leetcode.com/problems/maximum-width-of-binary-tree/

class Max_Width_Of_Binary_Tree_Pair_Levelorder {
    
    static class Pair {
        
        TreeNode node;
        
        int levelIndex;
        
        public Pair(TreeNode node, int levelIndex) {
            
            this.node = node;
            this.levelIndex = levelIndex;
        }
    }
    
    public int widthOfBinaryTree(TreeNode root) {
        
        if (root == null) {
            
            return 0;
        }
        
        Queue<Pair> queue = new LinkedList<>();
        
        queue.add(new Pair(root, 0));
        
        int result = 0;
        
        while (true) {
            
            // Every iteration in this while is a new level
            int queueSize = queue.size();
            
            if (queueSize == 0) {
                
                break;
            }
            
            // Get the min index of current level
            int minLevelIndex = queue.peek().levelIndex;
            
            int startLevelIndex = 0;
            
            int endLevelIndex = 0;
            
            for (int i=0; i<queueSize; i++) {
                
                // This is iteration of all elements in a level
                Pair pair = queue.poll();
                
                TreeNode current = pair.node;
                
                // To avoid overflow exception (current index - min index of each level)
                int currentlevelIndex = pair.levelIndex - minLevelIndex;
                
                // Maintain start element index of current level
                if (i == 0) {
                    
                    startLevelIndex = currentlevelIndex;
                } 
                
                // Maintain end element index of current level
                if (i == queueSize-1) {
                    
                    endLevelIndex = currentlevelIndex;
                }
                
                // Next level is always 2*i + 1 for left child
                if (current.left != null) {
                    
                    queue.add(new Pair(current.left, (2 * currentlevelIndex + 1)));
                }
                
                // Next level is always 2*i + 2 for right child
                if (current.right != null) {
                    
                    queue.add(new Pair(current.right, (2 * currentlevelIndex + 2)));
                }
            }
            
            // Max width is end-start+1
            result = Math.max(result, endLevelIndex - startLevelIndex + 1);
        }
        
        return result;
    }
}
