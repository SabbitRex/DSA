class LongestHappyString {

    public String longestDiverseString(int a, int b, int c) {
        
        int strLength = a + b + c;
        
        StringBuilder builder = new StringBuilder();
        
        int countA = 0;
        int countB = 0;
        int countC = 0;
        
        for (int i=0; i<strLength; i++) {
            
            if (a >= b && a >= c && countA < 2 || a > 0 && (countB == 2 || countC == 2)) {
                
                builder.append("a");
                countA++;
                countB = 0;
                countC = 0;
                a--;
                
            } else if (b >= a && b >= c && countB < 2 || b > 0 && (countA == 2 || countC == 2)) {
                
                builder.append("b");
                countB++;
                countA = 0;
                countC = 0;
                b--;
                
            } else if (c >= a && c >= b && countC < 2 || c > 0 && (countA == 2 || countB == 2)) {
                
                builder.append("c");
                countC++;
                countA = 0;
                countB = 0;
                c--;
            }
        }
        
        return builder.toString();
    }
}
