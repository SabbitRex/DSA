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
 
 # https://leetcode.com/problems/maximum-depth-of-binary-tree/
 
class Maximum_Depth_Of_Binary_Tree_Levelorder {

    public int maxDepth(TreeNode root) {
        
        if (root == null) {
            
            return 0;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        int height = 0;
        
        while (true) {
            
            int queueSize = queue.size();
            
            if (queueSize == 0) {
                
                break;
            }
            
            while (queueSize > 0) {
                
                TreeNode temp = queue.poll();
                
                if (temp.left != null) {
                    
                    queue.add(temp.left);
                }
                
                if (temp.right != null) {
                    
                    queue.add(temp.right);
                }
                
                queueSize--;
            }
            
            height++;
        }
        
        return height;
    }
}
