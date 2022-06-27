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
        
        return buildTree(nums, 0, nums.length);
    }
    
    private TreeNode buildTree(int[] nums, int left, int right) {
        
        if (left == right) {
            
            return null;
        }
        
        int middle = (left + right)/2;
        
        TreeNode tree = new TreeNode(nums[middle], buildTree(nums, left, middle), buildTree(nums, middle + 1, right));
        
        return tree;
    }
}