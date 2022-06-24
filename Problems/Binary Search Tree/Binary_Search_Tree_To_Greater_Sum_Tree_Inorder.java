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

# https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

class Binary_Search_Tree_To_Greater_Sum_Tree_Inorder {
    
    List<Integer> list = new ArrayList<>();
    
    public TreeNode bstToGst(TreeNode root) {
        
        if (root == null) {
            
            return null;    
        }
        
        inOrder(root);
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while (true) {
            
            int queueSize = queue.size();
            
            if (queueSize == 0) {
                
                break;
            }
            
            while (queueSize > 0) {
                
                TreeNode current = queue.poll();
                
                current.val = getSum(current.val);
                
                if (current.left != null) {
                    
                    queue.add(current.left);
                }
                
                if (current.right != null) {
                    
                    queue.add(current.right);
                }
                
                queueSize--;
            }
        }
        
        return root;
    }
    
    private int getSum(int nodeVal) {
        
        int sum = 0;
        
        for (int i=0; i<list.size(); i++) {
            
            if (list.get(i) < nodeVal) {
                
                continue;
            }
            
            sum = sum + list.get(i);
        }
        
        return sum;
    }
    
    private void inOrder(TreeNode root) {
        
        if (root == null) {
            
            return;
        }
        
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}
