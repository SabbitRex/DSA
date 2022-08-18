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

# https://leetcode.com/problems/maximum-depth-of-binary-tree/

class Maximum_Depth_Of_Binary_Tree_Recursion {
    
    public int maxDepth(TreeNode root) {
        
        return recurseForDepth(root);
    }
    
    private int recurseForDepth(TreeNode current) {
        
        if (current == null) {
            
            return 0;
        }
        
        int leftHeight = recurseForDepth(current.left);
        int rightHeight = recurseForDepth(current.right);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
