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

# https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

class Binary_Tree_Zigzag_Level_Order_Traversal {
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if (root == null) {
            
            return new ArrayList<>();
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while (true) {
            
            int queueSize = queue.size();
            
            if (queueSize == 0) {
                
                break;
            }
            
            List<Integer> inner = new ArrayList<>();
            
            while (queueSize > 0) {
                
                TreeNode current = queue.poll();
                
                inner.add(current.val);
                
                if (current.left != null) {
                    
                    queue.add(current.left);
                }
                
                if (current.right != null) {
                    
                    queue.add(current.right);
                }
                
                queueSize--;
            }
            
            result.add(new ArrayList<>(inner));
        }
        
        for (int i=0; i<result.size(); i++) {
            
            if (i % 2 != 0) {
                
                Collections.reverse(result.get(i));
            }
        }
    
        return result;
    }
}
