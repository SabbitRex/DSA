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
    
    List<Integer> list = new ArrayList<>();
    
    TreeNode previous;
    TreeNode first;
    TreeNode middle;
    TreeNode last;
    
    public void recoverTree(TreeNode root) {
        
        previous = new TreeNode(Integer.MIN_VALUE);
        
        inOrder(root);
        
        if (first != null && last != null) {
            
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
            
        } else if (first !=null && middle != null) {
            
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }
    }
    
    private void inOrder(TreeNode current) {
        
        if (current == null) {
            
            return;
        }
        
        inOrder(current.left);
        
        if (previous !=null && (current.val < previous.val)) {
            
            if (first == null) {
                
                first = previous;
                middle = current;
                
            } else {
                
                last = current;
            }
        }
        
        previous = current;
        inOrder(current.right);
    }
}
