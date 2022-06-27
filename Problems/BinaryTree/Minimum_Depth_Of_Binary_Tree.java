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

# https://leetcode.com/problems/minimum-depth-of-binary-tree/

class Minimum_Depth_Of_Binary_Tree {
    
    public int minDepth(TreeNode root) {
        
        if (root == null) {
            
            return 0;
        }
        
        int result = 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        result++;
        
        while (true) {
            
            int queueSize = queue.size();
            
            if (queueSize == 0) {
                
                break;
            }
            
            while (queueSize > 0) {
                
                TreeNode current = queue.poll();
                
                if (current.left == null && current.right == null) {
                    
                    return result;
                } 
                
                if (current.left != null) {
                    
                    queue.add(current.left);
                }
                
                if (current.right != null) {
                    
                    queue.add(current.right);
                }
                
                queueSize--;
            }
             
            result++;
        }
        
        return result;
    }
}
