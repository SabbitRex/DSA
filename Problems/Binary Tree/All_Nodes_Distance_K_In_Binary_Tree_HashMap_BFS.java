/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

# https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/

class All_Nodes_Distance_K_In_Binary_Tree_HashMap_BFS {
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        if (root == null) {
            
            return null;
        }
        
        List<Integer> result = new ArrayList<>();
        
        Map<TreeNode, TreeNode> nodeParentMap = mapParents(root);
        
        Map<TreeNode, Boolean> visitedMap = new HashMap<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(target);
        
        visitedMap.put(target, true);
        
        int distance = 0;
        
        while (true) {
            
            int queueSize = queue.size();
            
            if (queueSize == 0 || distance == k) {
                
                break;
            }
            
            distance++;
            
            while (queueSize > 0) {
                
                TreeNode current = queue.poll();
                
                if (current.left != null && !visitedMap.containsKey(current.left)) {
                    
                    visitedMap.put(current.left, true);
                    queue.add(current.left);
                }
                
                if (current.right != null && !visitedMap.containsKey(current.right)) {
                    
                    visitedMap.put(current.right, true);
                    queue.add(current.right);
                }
                
                if (nodeParentMap.containsKey(current) && !visitedMap.containsKey(nodeParentMap.get(current))) {
                    
                    visitedMap.put(nodeParentMap.get(current), true);
                    queue.add(nodeParentMap.get(current));
                }
                
                queueSize--;
            }
        }
        
        while (!queue.isEmpty()) {
            
            result.add(queue.poll().val);
        }
        
        return result;
    }
    
    private Map<TreeNode, TreeNode> mapParents(TreeNode root) {
        
        Map<TreeNode, TreeNode> nodeParentMap = new HashMap<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while (true) {
            
            int queueSize = queue.size();
            
            if (queueSize == 0) {
                
                break;
            }
            
            while (queueSize > 0) {
                
                TreeNode current = queue.poll();
                
                if (current.left != null) {
                    
                    nodeParentMap.put(current.left, current);
                    queue.add(current.left);
                }
                
                if (current.right != null) {
                    
                    nodeParentMap.put(current.right, current);
                    queue.add(current.right);
                }
                
                queueSize--;
            }
        }
        
        return nodeParentMap;
    }
}
