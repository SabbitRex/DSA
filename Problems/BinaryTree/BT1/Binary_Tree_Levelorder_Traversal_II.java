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

# https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

class Binary_Tree_Levelorder_Traversal_II {
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        if (root == null) {
            
            return new ArrayList<>();
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while (!queue.isEmpty()) {
            
            int queueSize = queue.size();
            
            List<Integer> local = new ArrayList<>();
            
            while (queueSize > 0) {
                
                TreeNode current = queue.poll();
                
                local.add(current.val);
                
                if (current.left != null) {
                    
                    queue.add(current.left);
                }
                
                if (current.right != null) {
                    
                    queue.add(current.right);
                }
                
                queueSize--;
            }
            
            result.add(local);
        }
        
        Collections.reverse(result);
        
        return result;
    }
}
