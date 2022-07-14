/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

# https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

class Lowest_Common_Ancestor_Of_A_Binary_Search_Tree {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root == null) {
            
            return null;
        }
        
        if (root.val == p.val || root.val == q.val) {
            
            return root;
        }
        
        TreeNode leftSubTree = lowestCommonAncestor(root.left, p, q);
        
        TreeNode rightSubTree = lowestCommonAncestor(root.right, p, q);
        
        if (leftSubTree == null) {
            
            return rightSubTree;
        }
        
        if (rightSubTree == null) {
            
            return leftSubTree;
        }
        
        return root;
    }
}
