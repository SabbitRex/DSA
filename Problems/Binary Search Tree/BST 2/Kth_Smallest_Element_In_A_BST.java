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

# https://leetcode.com/problems/kth-smallest-element-in-a-bst/

class Kth_Smallest_Element_In_A_BST {
    
    List<Integer> result = new ArrayList<>();
    
    public int kthSmallest(TreeNode root, int k) {
        
        inorder(root);
        
        return result.get(k-1);
    }
    
    private void inorder(TreeNode node) {
        
        if (node == null) {
            
            return;
        }
        
        inorder(node.left);
        
        this.result.add(node.val);
        
        inorder(node.right);
    }
}
