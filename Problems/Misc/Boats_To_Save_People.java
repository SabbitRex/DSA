# https://leetcode.com/problems/boats-to-save-people/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        
        int minBoatReq = 0;
        int firstIdx = 0;
        int lastIdx = people.length - 1;
        
        while (firstIdx <= lastIdx) {
            
            if (people[firstIdx] + people[lastIdx] <= limit) {
                
                minBoatReq++;
                firstIdx++;
                lastIdx--;
                
            } else {
                
                minBoatReq++;
                lastIdx--;
            }
        }
        
        return minBoatReq;
    }
}
