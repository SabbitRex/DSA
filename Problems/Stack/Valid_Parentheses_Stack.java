# https://leetcode.com/problems/valid-parentheses/

class Valid_Parentheses_Stack {
    
    public boolean isValid(String s) {
        
        Stack<String> stack = new Stack<String>();
        
        String[] strArray = s.split("");
        
        for (int i=0; i<strArray.length; i++) {
               
            if (strArray[i].equals("(") || strArray[i].equals("[") || strArray[i].equals("{")) {
                
                stack.push(strArray[i]);
                
                continue;
            }
            
            if (stack.isEmpty()) {
            	
            	return false;
            }
            
            String top = stack.pop();
            
            if (strArray[i].equals(")") && top.equals("(") ||
                strArray[i].equals("]") && top.equals("[") ||
                strArray[i].equals("}") && top.equals("{")) {
                
                continue;
                
            } else {
            	
            	return false;
            }
        }
		
        if (stack.isEmpty()) {
            
            return true;
        }
        
        return false;
    } 
}
