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
 
class Postorder_Of_Binary_Tree {
    
    List<Integer> result = new ArrayList<>();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        postOrder(root);
        
        return result;
    }
    
        private void postOrder(TreeNode root) {
        
        if (root == null) {
            
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        result.add(root.val);
    }
}
