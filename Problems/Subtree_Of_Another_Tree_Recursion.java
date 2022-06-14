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

# https://leetcode.com/problems/subtree-of-another-tree/

class Subtree_Of_Another_Tree_Recursion {
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if (root == null || subRoot == null) {
            
            return root == null && subRoot == null;
            
        } else if (isIdentical(root, subRoot)) {
            
            return true;
            
        } else {
            
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }
    
    private boolean isIdentical(TreeNode root, TreeNode subRoot) {
        
        if (root == null || subRoot == null) {
            
            return root == null && subRoot == null;
            
        } else if (root.val == subRoot.val) {
            
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            
        } else {
            
            return false;
        }
    }
}
