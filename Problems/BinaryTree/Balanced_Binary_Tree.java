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

# https://leetcode.com/problems/balanced-binary-tree/

class Balanced_Binary_Tree {
    
    public boolean isBalanced(TreeNode root) {
        
        int result = recurseForBalance(root);
        
        if (result == -1) {
            
            return false;
            
        } else {
            
            return true;
        }
    }
    
    private int recurseForBalance(TreeNode current) {
        
        if (current == null) {
            
            return 0;
        }
        
        int leftHeight = recurseForBalance(current.left);
        int rightHeight = recurseForBalance(current.right);
        
        if (leftHeight == -1 || rightHeight == -1) {
            
            return -1;
        }
        
        if (Math.abs(leftHeight - rightHeight) > 1) {
            
            return -1;
        }
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
