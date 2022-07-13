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

# https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

class Flatten_Binary_Tree_To_Linked_List {
    
    public void flatten(TreeNode root) {
        
        if (root == null) {
            
            return;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        recurseToFlatten(root, queue);
        
        TreeNode current = queue.poll();
        
        current.left = null;
        
        while (!queue.isEmpty()) {
            
            current = queue.poll();
            
            current.left = null;
            
            root.right = current;
            
            root = root.right;
        }
    }
    
    private void recurseToFlatten(TreeNode node, Queue<TreeNode> queue) {
        
        if (node == null) {
            
            return;
        }
        
        queue.add(node);
        
        recurseToFlatten(node.left, queue);
        
        recurseToFlatten(node.right, queue);
    }
}
