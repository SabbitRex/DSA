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

# https://leetcode.com/problems/binary-tree-paths/

class Binary_Tree_Paths {
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> result = new ArrayList<>();
        
        if (root == null) {
            
            return result;
        }
        
        String path = "";
        
        dfs(root, "", result);
        
        return result;
    }
    
    private void dfs(TreeNode root, String path, List<String> result) {
        
        path = path + root.val;
        
        if (root.left == null & root.right == null) {
            
            result.add(path);
            return;
        }
        
        if (root.left != null) {
            
            dfs(root.left, path + "->", result);
        }
        
         if (root.right != null) {
            
            dfs(root.right, path + "->", result);
        }
    }
}
