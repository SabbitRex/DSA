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

# https://leetcode.com/problems/balance-a-binary-search-tree/

class Balance_A_Binary_Search_Tree {
    
    List<TreeNode> inorderList = new ArrayList<>();
    
    public TreeNode balanceBST(TreeNode root) {
        
        inorder(root);
        
        return buildTree(0, this.inorderList.size());
    }
    
    private TreeNode buildTree(int startIndex, int endIndex) {
        
        if (startIndex == endIndex) {
            
            return null;
        }
        
        int midIndex = (startIndex + endIndex)/2;

        TreeNode tree = new TreeNode(inorderList.get(midIndex).val);

        tree.left = buildTree(startIndex, midIndex);

        tree.right = buildTree(midIndex + 1, endIndex);

        return tree;
    }
    
    private void inorder(TreeNode root) {
        
        if (root == null) {
            
            return;
        }
        
        inorder(root.left);
        inorderList.add(root);
        inorder(root.right);
    }
}
