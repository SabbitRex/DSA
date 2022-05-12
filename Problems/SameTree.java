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
class SameTree {
  
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        boolean isSameTree = isOverlapping(p, q);
        
        return isSameTree;
    }
    
    public boolean isOverlapping(TreeNode root1, TreeNode root2) {
        
        if (root1 == null && root2 == null) {
            
            return true;
        }
        
        if (root1 == null && root2 != null || root1 != null && root2 == null) {
            
            return false;
        }
        
        return root1.val == root2.val && isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }
}
