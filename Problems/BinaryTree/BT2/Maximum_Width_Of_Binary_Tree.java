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

class Maximum_Width_Of_Binary_Tree {
    
    static class Pair {
        
        int level;
        
        TreeNode node;
        
        public Pair(TreeNode node, int level) {
            
            this.node = node;
            this.level = level;
        }
    }
    
    public int widthOfBinaryTree(TreeNode root) {
        
        int result = 0;
        
        if (root == null) {
            
            return result;
        }
        
        Queue<Pair> queue = new LinkedList<>();
        
        queue.add(new Pair(root, 0));
        
        while (true) {
            
            int queueSize = queue.size();
            
            if (queueSize == 0) {
                
                break;
            }
            
            int levelFirstIdx = 0;
            int levelLastIdx = 0;
            
            for (int i=0; i<queueSize; i++) {
                
                Pair currentPair = queue.poll();
                
                TreeNode currentNode = currentPair.node;
                
                int currentLevel = currentPair.level;
                
                if (i == 0) {
                    
                    levelFirstIdx = currentLevel;
                }
                
                if (i == queueSize - 1) {
                    
                    levelLastIdx = currentLevel;
                }
                
                if (currentNode.left != null) {
                    
                    queue.add(new Pair(currentNode.left, 2 * currentLevel + 1));
                }
                
                if (currentNode.right != null) {
                    
                    queue.add(new Pair(currentNode.right, 2 * currentLevel + 2));
                }
            }
            
            result = Math.max(result, levelLastIdx - levelFirstIdx + 1);
        }
        
        return result;
    }
}
