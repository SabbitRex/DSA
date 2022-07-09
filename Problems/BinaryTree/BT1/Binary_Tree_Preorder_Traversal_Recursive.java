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
 
 # https://leetcode.com/problems/binary-tree-preorder-traversal/
 
class Binary_Tree_Preorder_Traversal_Recursive {
    
    List<Integer> result = new ArrayList<>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
         
        preOrder(root);
        
        return result;
    }
    
    private void preOrder(TreeNode root) {
        
        if (root == null) {
            
            return;
        }
        
        result.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
