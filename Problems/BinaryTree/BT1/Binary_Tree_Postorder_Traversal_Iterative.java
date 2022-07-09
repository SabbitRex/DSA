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

# https://leetcode.com/problems/binary-tree-postorder-traversal/

class Binary_Tree_Postorder_Traversal_Iterative {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        
        if (root == null) {
            
            return result;
        }
        
        Stack<TreeNode> s1 = new Stack<>();
        
        Stack<TreeNode> s2 = new Stack<>();
        
        s1.push(root);
        
        while (true) {
            
            if (s1.isEmpty()) {
                
                break;
            }
            
            TreeNode current = s1.pop();
            
            s2.push(current);
            
            if (current.left != null) {
                
                s1.push(current.left);
            }
            
            if (current.right != null) {
                
                s1.push(current.right);
            }
        }
        
        while (!s2.isEmpty()) {
            
            result.add(s2.pop().val);
        }
        
        return result;
    }
}
