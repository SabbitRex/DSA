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

# https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

class Binary_Tree_From_PostOrder_InOrder_Recursion {
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<inorder.length; i++) {
            
            map.put(inorder[i], i);
        }
        
        TreeNode root = buildTree(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1, map);
        
        return root;
    }
    
    private TreeNode buildTree(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        
        if (postStart > postEnd || inStart > inEnd) {
            
            return null;
        }
        
        int inRootIndex = map.get(postorder[postEnd]);
        
        int elementsOnLeftOfInRootIndex = inRootIndex - inStart;
        
        TreeNode node = new TreeNode(postorder[postEnd]);
        
        node.left = buildTree(postorder, postStart, postStart + elementsOnLeftOfInRootIndex - 1, inorder, inStart, inRootIndex - 1, map);
        
        node.right = buildTree(postorder, postStart + elementsOnLeftOfInRootIndex, postEnd - 1, inorder, inRootIndex + 1, inEnd, map);
        
        return node;
    }
}
