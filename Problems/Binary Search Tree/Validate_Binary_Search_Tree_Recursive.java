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
 
# https://leetcode.com/problems/validate-binary-search-tree/

class Validate_Binary_Search_Tree_Recursive {
    
    public boolean isValidBST(TreeNode root) {
        
        if (root == null) {
            
            return true;
        }
        
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean valid(TreeNode node, long minVal, long maxVal) {
        
        if (node == null) {
            
            return true;
        }
        
        if (minVal >= node.val || maxVal <= node.val) {
            
            return false;
        }
        
        return valid(node.left, minVal, node.val) && valid(node.right, node.val, maxVal);  
    }
}
