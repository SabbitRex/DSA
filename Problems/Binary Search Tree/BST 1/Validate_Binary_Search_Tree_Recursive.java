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
        
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean validate(TreeNode root, long minVal, long maxVal) {
        
        if (root == null) {
            
            return true; 
        }
        
        if (root.val <= minVal || root.val >= maxVal) {
            
            return false;      
        }
        
        return validate(root.left, minVal, root.val) && validate(root.right, root.val, maxVal);
    }
}
