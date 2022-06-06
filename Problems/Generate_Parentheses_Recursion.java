class Generate_Parentheses_Recursion {
    
    List<String> result = new ArrayList<String>();
	
	Stack<String> stack = new Stack<>();
    
    public List<String> generateParenthesis(int n) {
        
		generate(0, 0, n);
		
		return result;
    }
    
    private void generate(int countOpen, int countClose, int freq) {
		
		if (countOpen ==  freq && countOpen == countClose && countClose == freq) {
			
			result.add(stack.toString()
                .replace(",", "")
                .replace(" ", "")
                .replace("[", "")
                .replace("]", ""));
            
			return;
		}
		
		if (countOpen < freq) {
			
			stack.add("(");
			generate(countOpen + 1, countClose, freq);
			stack.pop();
		}
		
		if (countClose < countOpen) {
			
			stack.add(")");
			generate(countOpen, countClose + 1, freq);
			stack.pop();
		}
	}
}
