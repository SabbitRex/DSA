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

# https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

class Construct_Binary_Search_Tree_From_Preorder_Traversal {
    
    int idx = 0;
    
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode tree = construct(preorder, Integer.MAX_VALUE);
        
        return tree;
    }
    
    private TreeNode construct(int[] preorder, int upperBound) {
        
        if (this.idx == preorder.length || preorder[idx] > upperBound) {
            
            return null;
        }
        
        TreeNode tree = new TreeNode(preorder[this.idx]);
        
        this.idx++;
        
        tree.left = construct(preorder, tree.val);
        
        tree.right = construct(preorder, upperBound);
        
        return tree;
    }
}
