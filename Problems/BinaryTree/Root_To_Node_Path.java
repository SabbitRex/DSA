# https://www.interviewbit.com/problems/path-to-given-node/

class Root_To_Node_Path {
    
    public List<Integer> rootToNodePath(TreeNode root, TreeNode node) {
        
        if (root == null) {
            
            return null;
        }
        
        List<Integer> path = new ArrayList<>();
        
        getPath(root, path, node.val);
        
        return path;
    }
    
    private boolean getPath(TreeNode current, List<Integer> path, int value) {
             
        if (current == null) {
            
            return false;
        }
        
        path.add(current.val);
        
        if (current.val == value) {
            
            return true;
        }
        
        boolean isValueOnLeftSubTree = getPath(current.left, path, value);
        boolean isValueOnRightSubTree = getPath(current.right, path, value);
        
        if (isValueOnLeftSubTree || isValueOnRightSubTree) {
            
            return true;
        }
        
        path.remove(path.size() - 1);
        return false;
    }
}
