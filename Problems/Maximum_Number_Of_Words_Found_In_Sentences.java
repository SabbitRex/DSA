# https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

class Maximum_Number_Of_Words_Found_In_Sentences {
    
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;
        
        for (String sentence : sentences) {
                
            if (max < sentence.split(" ").length) {
                
                max = sentence.split(" ").length;
            }
        }
        
        return max;
    }
}
