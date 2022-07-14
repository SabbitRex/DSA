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

# https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

class Convert_Sorted_Array_To_Binary_Search_Tree_Recursion {
    
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if (nums.length == 0) {
            
            return null;
        }
        
        TreeNode tree = buildTree(nums, 0, nums.length);
        
        return tree;
    }
    
    private TreeNode buildTree(int[] nums, int startIdx, int endIdx) {
        
        if (startIdx ==  endIdx) {
            
            return null;
        }
        
        int middle = (startIdx + endIdx)/2;
        
        TreeNode tree = new TreeNode(nums[middle]);
        
        tree.left = buildTree(nums, startIdx, middle);
        
        tree.right = buildTree(nums, middle + 1, endIdx);
        
        return tree;
    }
}
