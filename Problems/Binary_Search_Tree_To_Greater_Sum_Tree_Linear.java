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

# https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/  

class Binary_Search_Tree_To_Greater_Sum_Tree_Linear {
    
    int sum = 0;
    
    public TreeNode bstToGst(TreeNode root) {
        
        if (root == null) {
            
            return null;
        }
        
        bstToGst(root.right);
        
        sum = sum + root.val;
        root.val = sum;
        
        bstToGst(root.left);
        
        return root;
    }
}
