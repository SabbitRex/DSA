/*

i = 0;
j = 0;

int lcs(i, j) {
    
    if (s1[i] == s2[j] == '\0') {
        
        return 0;
        
    } else if (s1[i] == s2[i]) {
        
        return 1 + lcs(i+1, j+1);
        
    } else {
        
        return max(lcs(i+1, j), lcs(i, j+1));
    }
}

*/

class LongestCommonSubsquenceSlow {

    public int longestCommonSubsequence(String text1, String text2) {

        text1 = text1 + "\0";
        text2 = text2 + "\0";

        String[] t1 = text1.split("");
        String[] t2 = text2.split("");

        int i = 0;
        int j = 0;

        return lcs(0, 0, t1, t2);
    }

    private int lcs(int i, int j, String[] t1, String[] t2) {

        if (t1[i].equals("\0") || t2[j].equals("\0")) {

            return 0;

        } else if (t1[i].equals(t2[j])) {

            return 1 + lcs(i + 1, j + 1, t1, t2);

        } else {

            return max(lcs(i, j + 1, t1, t2), lcs(i + 1, j, t1, t2));
        }
    }


    private int max(int n1, int n2) {

        if (n1 > n2) {

            return n1;
        }

        return n2;
    }
}
