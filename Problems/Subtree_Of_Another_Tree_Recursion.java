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
    
    boolean result = false;
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        inOrder(root, subRoot);
        
        return result;
    }
    
    private void inOrder(TreeNode root, TreeNode subRoot) {
        
        if (root != null) {
            
            inOrder(root.left, subRoot);
            
            boolean isMatch = match(root, subRoot);
            
            if (isMatch) {
                
                result =  true;
            }
            
            inOrder(root.right, subRoot);
        }
    }
    
    private boolean match(TreeNode root, TreeNode subRoot) {
        
        if  (root != null && subRoot != null) {
            
            boolean hasLeftChild = match(root.left, subRoot.left);
            boolean hasRightChild = match(root.right, subRoot.right);
            
            if (root.val == subRoot.val && hasLeftChild && hasRightChild) {
                
                return true;
                
            } else {
                
                return false;
            }
            
        } else if (root == null && subRoot == null) {
            
            return true;
            
        } else {
            
            return false;
        }
    }
}
