# https://leetcode.com/problems/recover-binary-search-tree/ 
    
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

class Recover_Binary_Search_Tree_Inorder_Three_Variable {
    
    TreeNode voilation1 = null;
    TreeNode voilation2 = null;
    TreeNode voilation3 = null;
    TreeNode previous = null;
    
    public void recoverTree(TreeNode root) {
        
        inorder(root);
        
        if (voilation1 !=null && voilation3 != null) {
            
            int temp = voilation1.val;
            voilation1.val = voilation3.val;
            voilation3.val = temp;
            
        } else if (voilation1 != null && voilation2 != null) {
            
            int temp = voilation1.val;
            voilation1.val = voilation2.val;
            voilation2.val = temp;      
        } 
    }
    
    private void inorder(TreeNode current) {
        
        if (current == null) {
            
            return;
        }
        
        inorder(current.left);
        
        if (previous != null && previous.val > current.val) {
            
            if (voilation1 == null) {
                
                voilation1 = previous;
                voilation2 = current;
                
            } else {
                
                voilation3 = current;
            }
        }
        
        previous = current;
        
        inorder(current.right);
    }
}
