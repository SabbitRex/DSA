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
class BinaryTreeFromPreIn {
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<inorder.length; i++) {
            
            map.put(inorder[i], i);
        }
        
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
        
        return root;
    }
    
    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        
        if (preStart > preEnd || inStart > inEnd) {
            
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[preStart]);
        
        int inRootIndex = map.get(preorder[preStart]);
        
        int countLeftNumFromRootIndex = inRootIndex - inStart;
        
        node.left = buildTree(preorder, preStart + 1, preStart + countLeftNumFromRootIndex, inorder, inStart, inRootIndex - 1, map);
            
        node.right = buildTree(preorder, preStart + countLeftNumFromRootIndex + 1, preEnd, inorder, inRootIndex + 1, inEnd, map);
        
        return node;
    }
}
