# https://www.interviewbit.com/problems/path-to-given-node/

public class Root_To_Node_Path_Recursive {
    
    public ArrayList<Integer> solve(TreeNode A, int B) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        if (A == null) {
            
            return result;
        }
        
        getPath(A, result, B);
        
        return result;
    }
    
    private boolean getPath(TreeNode node, ArrayList<Integer> result, int target) {
        
        if (node == null) {
            
            return false;
        }
        
        result.add(node.val);
        
        if (node.val == target) {
            
            return true;
        }
        
        boolean isTargetOnLeft = getPath(node.left, result, target);
        boolean isTargetOnRight = getPath(node.right, result, target);
        
        if (isTargetOnLeft || isTargetOnRight) {
            
            return true;   
        }
        
        result.remove(result.size() - 1);
        
        return false;
    }
}
