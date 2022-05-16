class ReverseString {

    public void reverseString(char[] s) {
        
        int end = s.length - 1;
        
        for (int i=0; i<s.length/2; i++) {
            
            char temp = s[end];
            s[end] = s[i];
            s[i] = temp;
            
            end--;
        }
    }
}
