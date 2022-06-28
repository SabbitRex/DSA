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

# https://leetcode.com/problems/diameter-of-binary-tree/

class Diameter_Of_Binary_Tree {
    
    public int diameterOfBinaryTree(TreeNode root) {
    
        int[] diameter = new int[1];
        
        recurseForDiameter(root, diameter);
        
        return diameter[0];
    }
    
    private int recurseForDiameter(TreeNode current, int[] diameter) {
        
        if (current == null) {
            
            return 0;
        }
        
        int leftHeight = recurseForDiameter(current.left, diameter);
        int rightHeight = recurseForDiameter(current.right, diameter);
        
        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
