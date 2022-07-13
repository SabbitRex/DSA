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

# https://leetcode.com/problems/search-in-a-binary-search-tree/

class Search_In_A_Binary_Search_Tree {
    
    TreeNode result;
    
    public TreeNode searchBST(TreeNode root, int val) {
        
        search(root, val);
        
        return result;
    }
    
    private void search(TreeNode node, int val) {
        
        if (node == null) {
            
            return;
        }
        
        search(node.left, val);
        
        if (node.val == val) {
            
            result = node;
            return;
        }
        
        search(node.right, val);
    }
}
