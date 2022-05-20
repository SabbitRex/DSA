class RemoveDuplicateLetter {

    public String removeDuplicateLetters(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        int[] frequency = new int[26];
        
        boolean[] presentInStack = new boolean[26];
        
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
        	
            frequency[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < len; i++) {
        	
            char ch = s.charAt(i);
            
            frequency[ch - 'a']--;
            
            if (presentInStack[ch - 'a']) {
            	
                continue;
            }
            
            while (!stack.empty() && stack.peek() > ch) {
            	
                if (frequency[stack.peek() - 'a'] <= 0) {
                	
                    break;
                }

                presentInStack[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            presentInStack[ch - 'a'] = true;
        }

        StringBuilder builder = new StringBuilder(stack.size());
        
        while (!stack.empty()) {
        	
        	builder.append(stack.pop());
        }

        return builder.reverse().toString();
    }
}
