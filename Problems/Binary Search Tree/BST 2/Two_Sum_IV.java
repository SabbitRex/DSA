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

# https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

class Two_Sum_IV {
    
    List<Integer> cache = new ArrayList<>();
    
    boolean result = false;
    
    public boolean findTarget(TreeNode root, int k) {
        
        inorder(root, k); 
        
        return this.result;
    }
    
    private void inorder(TreeNode node, int k) {
        
        if (node == null) {
            
            return;
        }
        
        inorder(node.left, k);
        
        if (this.cache.contains(k - node.val)) {
            
            this.result = true;
            
        } else {
            
            this.cache.add(node.val);
        }
        
        inorder(node.right, k);
    }
}
