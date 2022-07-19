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
 
 # https://leetcode.com/problems/path-sum/
 
class Path_Sum_Recursion {
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if (root == null) {
            
            return false;
        }
        
        return checkSum(root, targetSum);
    }
    
    private boolean checkSum(TreeNode root, int target) {
     
        if (root == null) {

            return false;
        }
        
        if (root.val == target && root.left == null && root.right == null) {
            
            return true;
        }
        
        target = target - root.val;
        
        boolean isSumOnLeft = checkSum(root.left, target);
        
        boolean isSumOnRight = checkSum(root.right, target);
        
        return isSumOnLeft || isSumOnRight;
    }
}
