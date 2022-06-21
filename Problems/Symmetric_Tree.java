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

# https://leetcode.com/problems/symmetric-tree/

class Symmetric_Tree {
    
    public boolean isSymmetric(TreeNode root) {
        
        TreeNode node1 = root;
        TreeNode node2 = root;
        
        return check(node1, node2);

    }
    
    private boolean check(TreeNode node1, TreeNode node2) {
        
        if (node1 == null && node2 == null) {
            
            return true;
        }
        
        if (node1 != null && node2 == null || node1 == null && node2 != null) {
            
            return false;
        }
        
        return node1.val == node2.val && check(node1.left, node2.right) && check(node1.right, node2.left);
        
    }
}
