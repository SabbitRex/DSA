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

class Binary_Tree_Preorder_Traversal_Iterative {
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        
        if (root == null) {
            
            return result;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        
        stack.push(root);
        
        while (true) {
            
            int stackSize = stack.size();
            
            if (stackSize == 0) {
                
                break;
            }
            
            while (stackSize > 0) {
                
                TreeNode current = stack.pop();
                
                result.add(current.val);
                
                if (current.right != null) {
                    
                    stack.push(current.right);
                }
                
                if (current.left != null) {
                    
                    stack.push(current.left);
                }
                
                stackSize--;
            }
        }
        
        return result;
    }
}
