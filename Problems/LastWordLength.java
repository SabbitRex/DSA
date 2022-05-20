class LastWordLength {

    public int lengthOfLastWord(String s) {
        
        String[] result = s.split(" ");
        
        return result[result.length-1].length();
    }
}
