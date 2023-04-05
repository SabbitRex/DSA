# https://www.interviewbit.com/problems/repeat-and-missing-number-array/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        
        long n = A.size();
        
        // Summation of 1+2+3...n
        long S = (n * (n+1))/2;
        // Summation of 1^2 + 2^2 + 3^2...n^2 (Square)
        long P = (n * (n+1) * (2*n+1))/6;
        
        for (int i=0; i<n; i++) {
            S = S - (long) A.get(i);
            P = P - ((long) A.get(i) * (long) A.get(i));
        }
        
        long missing = (S+P/S)/2;
        long repeat = missing - S;
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add((int)repeat);
        result.add((int)missing);
        
        return result;
    }
}
