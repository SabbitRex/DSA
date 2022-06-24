# https://leetcode.com/problems/reach-a-number/

class Reach_A_Number_AP_Maths {
    
    public int reachNumber(int target) {
		
		// Convert target to a positive integer as for -ve and +ve target step taken will be same
        target = Math.abs(target);
        
        int sum = 0;
        int step = 0;
        
		// Sum all the step unless you reach beyond target
        while (sum < target) {
            
            step++;
            sum = sum + step;
        }
        
		// If (sum - target) is even, return step as is, else check if step is even, if even return step + 1 else step + 2
        return ((sum - target) % 2 == 0) ? step : (step % 2 == 0) ? step + 1 : step + 2;
    }
}
