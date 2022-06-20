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

# https://leetcode.com/problems/invert-binary-tree/

class Invert_Binary_Tree_BFS_LOT {
    
    public TreeNode invertTree(TreeNode root) {
        
        if (root == null) {
            
            return null;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while (true) {
            
            int queueSize = queue.size();
            
            if (queueSize == 0) {
                
                break;
            }
            
            while (queueSize > 0) {
                
                TreeNode current = queue.poll();
                
                TreeNode temp = current.left;
                current.left = current.right;
                current.right = temp;
                
                if (current.left != null) {
                    queue.add(current.left);
                }
                
                if (current.right != null) {
                    queue.add(current.right);
                }
                
                queueSize--;
            }
        }
        
        return root;
    }
}
