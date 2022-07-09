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

# https://leetcode.com/problems/binary-tree-inorder-traversal/

class Binary_Tree_Inorder_Traversal_Iterative {
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        
        if (root == null) {
            
            return result;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        
        while (true) {
            
            if (root != null) {
                
                stack.push(root);
                root = root.left;
                
            } else {
                
                if (stack.isEmpty()) {
                    
                    break;
                }
                
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }
        }
        
        return result;
    }
}
