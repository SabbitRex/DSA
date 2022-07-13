# https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1

class Boundary_Traversal_Of_Binary_Tree {
    
	ArrayList <Integer> boundary(Node node) {
	    
	    ArrayList<Integer> result = new ArrayList<>();
	    
	    if (node == null) {
	        
	        return result;
	    }
	    
	    if (!isLeafNode(node)) {
	        
	        result.add(node.data);
	    }
	    
	    getLeftBoundaryNodes(node, result);
	    
	    getLeafBoundaryNodes(node, result);
	    
	    getRightBoundaryNodes(node, result);
	    
	    return result;
	}
	
	private boolean isLeafNode(Node node) {
	    
	    if (node.left == null && node.right == null) {
	        
	        return true;
	    }
	    
	    return false;
	}
	
	private void getLeftBoundaryNodes(Node node, ArrayList<Integer> result) {
	    
	    Node current = node.left;
	    
	    if (current == null) {
	        
	        return;
	    }
	    
	    while (current != null) {
	        
	        if (!isLeafNode(current)) {
	            
	            result.add(current.data);
	        }
	        
	        if (current.left != null) {
	            
	            current = current.left;
	            
	        } else {
	            
	            current = current.right;
	        }
	    }
	}
	
	public void getLeafBoundaryNodes(Node node, ArrayList<Integer> result) {
 
        if (isLeafNode(node)) {
            
            result.add(node.data);
            return;
        }
        
        if (node.left != null) {
            
            getLeafBoundaryNodes(node.left, result);
        }
        
        if (node.right != null) {
            
            getLeafBoundaryNodes(node.right, result);
        }
    }
    
    private void getRightBoundaryNodes(Node node, ArrayList<Integer> result) {
            
        Node current = node.right;
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        while (current != null) {
            
            if (!isLeafNode(current)) {
                
                temp.add(current.data);
            }
            
            if (current.right != null) {
                
                current = current.right;
                
            } else {
                
                current = current.left;
            }
        }
        
        for (int i=temp.size()-1; i>=0; i--) {
            
            result.add(temp.get(i));
        }
    }
}
